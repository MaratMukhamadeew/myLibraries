package JavaGuru.exception;

public class PasswordConfirmationException extends Exception {
    private String message;

    public PasswordConfirmationException(String message) {
        super(message);
        this.message = message;
    }
}
