package hu.noherczeg.necora.exception;

public class FileUploadException extends Exception {

    private static final long serialVersionUID = -1600584790838322260L;

    public FileUploadException() {
    }

    public FileUploadException(String message) {
        super(message);
    }

    public FileUploadException(Throwable cause) {
        super(cause);
    }

    public FileUploadException(String message, Throwable cause) {
        super(message, cause);
    }

}
