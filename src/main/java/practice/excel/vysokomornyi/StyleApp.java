package practice.excel.vysokomornyi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.FileOutputStream;
import java.io.IOException;

public class StyleApp {
    private static final String PATH = "C:\\Users\\marat\\myLibraries\\src\\main\\resources\\excel\\vysokomornyi\\Стили.xls";
    public static void main(String[] args) {
        try(Workbook wb = new HSSFWorkbook(); FileOutputStream fos = new FileOutputStream(PATH)) {
            Sheet sheet0 = wb.createSheet("Лист_01");
            Row row = sheet0.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("Привет!");
            sheet0.setColumnWidth(0, 10000);                          // Ширина столбца
//            sheet0.autoSizeColumn(0);                                    // Автоподбор ширины столбца.   Не работает!!!
            row.setHeightInPoints(30);                                      // Высота строки

            sheet0.addMergedRegion(new CellRangeAddress(0,5,0,2));  // Объединение ячеек

            CellStyle style = wb.createCellStyle();                         // Создание стиля ячейки
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);         // Заполнение ячейки
            style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());  // Фон ячейки
//            style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
            style.setAlignment(HorizontalAlignment.CENTER_SELECTION);       // выравнивание по горизонтали в ячейке
            style.setVerticalAlignment(VerticalAlignment.CENTER);              // выравнивание по вертикали в ячейке
            style.setBorderBottom(BorderStyle.DASH_DOT_DOT);                // стиль нижней линии ячейки
            style.setBottomBorderColor(IndexedColors.GREEN.getIndex());     // цвет нижней линии ячейки

            Font font = wb.createFont();                                    // Создание шрифта
            font.setFontName("Courier New");                                // Название шрифта
            font.setFontHeightInPoints((short) 15);                         // Размер шрифта
            font.setBold(true);                                             // Жирный шрифт
            font.setStrikeout(true);                                        // Зачёркивание
            font.setUnderline(Font.U_DOUBLE);                               // Нижнее подчёркивание
            font.setItalic(true);                                           // Курсив
            font.setColor(IndexedColors.RED.getIndex());                    // Цвет текста

            style.setFont(font);                                            // Применение шрифта к стилю ячейки

            cell.setCellStyle(style);                                       // Применение стиля ячейки к ячейке

            wb.write(fos);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
