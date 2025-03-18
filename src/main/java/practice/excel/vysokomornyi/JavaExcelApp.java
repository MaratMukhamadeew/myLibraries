package practice.excel.vysokomornyi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;

import java.io.FileOutputStream;
import java.io.IOException;

public class JavaExcelApp {
    private static final String PATH = "C:\\Users\\marat\\myLibraries\\src\\main\\resources\\excel\\vysokomornyi\\my2.xls";
    public static void main(String[] args) throws IOException {
        Workbook wb = new HSSFWorkbook();
        Sheet sheet0 = wb.createSheet("Издатели");
        Row row0 = sheet0.createRow(1);
        Cell cell0 = row0.createCell(1);
        cell0.setCellValue("O'Reilly");

        Sheet sheet1 = wb.createSheet("Произведения");
        Row row1 = sheet1.createRow(2);
        Cell cell2 = row1.createCell(2);
        cell2.setCellValue("Война и мир");

        Row row11 = sheet1.createRow(3);
        Cell cell22 = row11.createCell(2);
        cell22.setCellValue("Евгений Онегин");

        Sheet sheet2 = wb.createSheet("Авторы");
        Sheet sheet3 = wb.createSheet(WorkbookUtil.createSafeSheetName("dqww!@$%^&*"));



        FileOutputStream fos = new FileOutputStream(PATH);

        wb.write(fos);
        fos.close();
    }
}
