package practice.excel.devmark;

import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
//        ExcelReader reader = new ExcelReader();
//        try {
//            reader.read("C:\\Users\\marat\\myLibraries\\src\\main\\resources\\test1.xlsx");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        ExcelWriter writer = new ExcelWriter();
        writer.write("testExcel.xlsx");
    }
}
