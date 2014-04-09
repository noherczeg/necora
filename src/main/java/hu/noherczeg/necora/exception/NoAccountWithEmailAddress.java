package hu.noherczeg.necora.exception;

public class NoAccountWithEmailAddress extends Exception {

	private static final long serialVersionUID = -3231001680114390910L;

	public NoAccountWithEmailAddress() {
	}

	public NoAccountWithEmailAddress(String message) {
		super(message);
	}

	public NoAccountWithEmailAddress(Throwable cause) {
		super(cause);
	}

	public NoAccountWithEmailAddress(String message, Throwable cause) {
		super(message, cause);
	}
	
}
