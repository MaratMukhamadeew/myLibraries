package practice.excel.devmark;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExcelReader {
    public void read(String filename) throws IOException {
        Workbook workbook = loadWorkbook(filename);
        var sheetIterator = workbook.sheetIterator();
        while (sheetIterator.hasNext()) {
            Sheet sheet = sheetIterator.next();
            processSheet(sheet);
            System.out.println();
        }
    }

    private Workbook loadWorkbook(String filename) throws IOException {
        var extension = filename.substring(filename.lastIndexOf(".") + 1).toLowerCase();
        var file = new FileInputStream(filename);
        switch (extension) {
            case "xls" -> {
                return new HSSFWorkbook(file);
            }
            case "xlsx" -> {
                return new XSSFWorkbook(file);
            }
            default -> throw new RuntimeException("Unknown Excel file extension: " + extension);
        }
    }

    private void processSheet(Sheet sheet) {
        System.out.println("Sheet: " + sheet.getSheetName());
        var data = new HashMap<Integer, List<Object>>();
        var iterator = sheet.rowIterator();
        for (var rowIndex = 0; iterator.hasNext(); rowIndex++) {
            var row = iterator.next();
            processRow(data, rowIndex, row);
        }
        System.out.println("Sheet data:");
        System.out.println(data);
    }

    private void processRow(HashMap<Integer, List<Object>> data, int rowIndex, Row row) {
        data.put(rowIndex, new ArrayList<>());
        for (var cell : row) {
            processCell(cell, data.get(rowIndex));
        }
    }

    private void processCell(Cell cell, List<Object> dataRow) {
        switch (cell.getCellType()) {
            case STRING -> dataRow.add(cell.getStringCellValue());
            case NUMERIC -> {
                if (DateUtil.isCellDateFormatted(cell)) {
                    dataRow.add(cell.getLocalDateTimeCellValue());
                } else {
                    dataRow.add(NumberToTextConverter.toText(cell.getNumericCellValue()));
                }
            }
            case BOOLEAN -> dataRow.add(cell.getBooleanCellValue());
            case FORMULA -> dataRow.add(cell.getCellFormula());
            default -> dataRow.add(" ");
        }
    }
}
