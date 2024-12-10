package learn.programming_methods.glava1.task.exceptions;

public class MatrixException extends Exception {
    public MatrixException() {
    }

    public MatrixException(String message) {
        super(message);
    }

    public MatrixException(String message, Throwable cause) {
        super(message, cause);
    }
}
