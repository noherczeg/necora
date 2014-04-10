package hu.noherczeg.necora.exception;

public class PasswordMissmatchException extends Exception {

    private static final long serialVersionUID = 7634783622671581916L;

    public PasswordMissmatchException() {
    }

    public PasswordMissmatchException(String message) {
        super(message);
    }

    public PasswordMissmatchException(Throwable cause) {
        super(cause);
    }

    public PasswordMissmatchException(String message, Throwable cause) {
        super(message, cause);
    }

}
