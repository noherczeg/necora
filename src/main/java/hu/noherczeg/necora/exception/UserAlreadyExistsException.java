package hu.noherczeg.necora.exception;

public class UserAlreadyExistsException extends Exception {

	private static final long serialVersionUID = -6008062122910746165L;

	public UserAlreadyExistsException() {
	}

	public UserAlreadyExistsException(String message) {
		super(message);
	}

	public UserAlreadyExistsException(Throwable cause) {
		super(cause);
	}

	public UserAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
	}

}
