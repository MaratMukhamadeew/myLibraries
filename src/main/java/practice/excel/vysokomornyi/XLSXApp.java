package practice.excel.vysokomornyi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class XLSXApp {
    private static final String PATH = "C:\\Users\\marat\\myLibraries\\src\\main\\resources\\excel\\vysokomornyi\\XLSX.xlsx";

    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream(PATH); XSSFWorkbook wb = new XSSFWorkbook()) {

            Sheet sheet = wb.createSheet("Издатели");
            Row row = sheet.createRow(3);
            Cell cell = row.createCell(4);
            cell.setCellValue("O'Reilly");

            wb.write(fos);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
