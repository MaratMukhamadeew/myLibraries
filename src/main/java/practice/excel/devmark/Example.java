package practice.excel.devmark;

import java.io.IOException;

public class Example {
    private static final String PATH = "C:\\Users\\marat\\myLibraries\\src\\main\\resources\\excel\\devmark\\testExcel.xlsx";
    public static void main(String[] args) throws IOException {
        ExcelReader reader = new ExcelReader();
        try {
            reader.read(PATH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        ExcelWriter writer = new ExcelWriter();
//        writer.write(PATH);
    }
}
