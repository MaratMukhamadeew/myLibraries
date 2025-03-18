package practice.excel.vysokomornyi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class FormulaApp {
    private static final String PATH = "C:\\Users\\marat\\myLibraries\\src\\main\\resources\\excel\\vysokomornyi\\Формулы.xls";
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(PATH); Workbook book = new HSSFWorkbook()) {
            Sheet sheet = book.createSheet("Формулы");
            Row row = sheet.createRow(0);

            Cell cell0 = row.createCell(0);
            cell0.setCellValue(2);

            Cell cell1 = row.createCell(1);
            cell1.setCellValue(7);

            Cell cell2 = row.createCell(2);
            cell2.setCellFormula("A1+B1");

            for (int i = 3; i < 7; i++) {
                Row rowI = sheet.createRow(i);
                Cell cellI = rowI.createCell(0);
                cellI.setCellValue(i - 1);
            }
            Row row7 = sheet.createRow(7);
            Cell cell7 = row7.createCell(0);
            cell7.setCellFormula("SUM(A4:A7)");

            book.write(fos);
        }
    }
}
