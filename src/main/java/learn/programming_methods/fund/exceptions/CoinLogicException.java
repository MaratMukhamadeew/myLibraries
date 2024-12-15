package learn.programming_methods.fund.exceptions;

public class CoinLogicException extends Exception {
    public CoinLogicException() {
    }

    public CoinLogicException(String message) {
        super(message);
    }

    public CoinLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoinLogicException(Throwable cause) {
        super(cause);
    }
}
