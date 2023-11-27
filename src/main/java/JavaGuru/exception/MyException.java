package JavaGuru.exception;

public class MyException extends Exception {
    String message;
    String fileName;

    public MyException(String message, String fileName) {
        super(message);
        this.message = message;
        this.fileName = fileName;
    }
}
