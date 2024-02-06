package learn.JavaGuru.exception;

public class LengthException extends Exception {
    private String message;

    public LengthException(String message) {
        super(message);
        this.message = message;
    }
}
