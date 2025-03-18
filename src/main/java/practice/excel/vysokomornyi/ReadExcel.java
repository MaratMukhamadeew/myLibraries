package practice.excel.vysokomornyi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class ReadExcel {
    private static final String PATH = "C:\\Users\\marat\\myLibraries\\src\\main\\resources\\excel\\vysokomornyi\\my.xls";
    public static void main(String[] args) {
//        try (FileInputStream fis = new FileInputStream("C:\\Users\\marat\\Desktop\\Шабашка\\test2.xls")) {
//            Workbook wb = new HSSFWorkbook(fis);
//            printCells(wb.getSheetAt(0));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (FileInputStream stream = new FileInputStream(PATH)) {
            Workbook workbook = new HSSFWorkbook(stream);
            printAllCells(workbook.getSheetAt(0));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printAllCells(Sheet sheet) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        for (Row row : sheet) {
            for (Cell cell : row) {

                printNumberCell(row,cell);

                switch (cell.getCellType()) {
                    case STRING ->
                            System.out.println(cell.getRichStringCellValue().getString() + " " + cell.getCellType());
                    case NUMERIC -> {
                        if (DateUtil.isCellDateFormatted(cell)) {
                            System.out.println(sdf.format(cell.getDateCellValue()) + " " + cell.getCellType());
                        } else {
                            System.out.print(cell.getNumericCellValue());
                            System.out.println(" " + cell.getCellType());
                        }
                    }
                    case BOOLEAN -> {
                        System.out.print(cell.getBooleanCellValue());
                        System.out.println(" " + cell.getCellType());
                    }
                    case FORMULA -> System.out.println(cell.getCellFormula() + " " + cell.getCellType());
                    default -> System.out.println();
                }
            }
        }
    }

    private static void printCells(Sheet sheet) {
        for (Row row : sheet) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING -> {
                        if (cell.getRichStringCellValue().getString().equals("")) continue;
                        printNumberCell(row, cell);
                        System.out.println(cell.getRichStringCellValue().getString());
                    }
                    case NUMERIC -> {
                        if (DateUtil.isCellDateFormatted(cell)) {
                            printNumberCell(row, cell);
                            printDataCell(new SimpleDateFormat("dd-MM-yyyy"), cell);
                        } else {
                            printNumberCell(row, cell);
                            System.out.println(cell.getNumericCellValue());
                        }
                    }
                    case BOOLEAN -> {
                        printNumberCell(row, cell);
                        System.out.println(cell.getBooleanCellValue());
                    }
                    case FORMULA -> {
                        printNumberCell(row, cell);
                        System.out.println(cell.getCellFormula());
                    }
                }
            }
        }
    }

    private static void printDataCell(SimpleDateFormat sdf, Cell cell) {
        System.out.println(sdf.format(cell.getDateCellValue()));
    }

    private static void printNumberCell(Row row, Cell cell) {
        CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
        System.out.print(cellRef.formatAsString());
        System.out.print(" - ");
    }
}


