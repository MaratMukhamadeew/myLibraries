package JavaGuru.exception;

public class EmptyLoginException extends Exception {
    private String message;

    public EmptyLoginException(String message) {
        super(message);
        this.message = message;
    }
}
