package practice.excel.begin;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        writeIntoExcel("excel.xls");
        readFromExcel("excel.xls");
    }

    public static void writeIntoExcel(String file) {
        try(OutputStream os = new FileOutputStream(file); HSSFWorkbook book = new HSSFWorkbook()) {
            Sheet sheet = book.createSheet("Start");

            // Нумерация начинается с нуля
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("John");
            Cell second = row.createCell(1);
            DataFormat format = book.createDataFormat();
            CellStyle style = book.createCellStyle();
            style.setDataFormat(format.getFormat("dd.mm.yyyy"));
            second.setCellStyle(style);

            // Нумерация лет начинается с 1900 года
            second.setCellValue(new Date(110,10, 10));

            // Меняем размер столбца
            sheet.autoSizeColumn(1);
            book.write(os);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void readFromExcel(String file) {
        try(HSSFWorkbook book = new HSSFWorkbook(new FileInputStream(file))) {
            Sheet sheet = book.getSheet("Start");
            Row row = sheet.getRow(0);

            if (row.getCell(0).getCellType() == CellType.STRING) {
                String name = row.getCell(0).getStringCellValue();
                System.out.println("Name: " + name);
            }

            if (row.getCell(1).getCellType() == CellType.NUMERIC) {
                Date birthdate = row.getCell(1).getDateCellValue();
                System.out.println("Birthdate : " + birthdate);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
