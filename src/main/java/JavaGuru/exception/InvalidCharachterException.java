package JavaGuru.exception;

public class InvalidCharachterException extends Exception {
    private String message;

    public InvalidCharachterException(String message) {
        super(message);
        this.message = message;
    }
}
