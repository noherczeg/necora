package hu.noherczeg.necora.exception;

public class EntityDeletionException extends Exception {

	private static final long serialVersionUID = 5980691613772600154L;

	public EntityDeletionException() {
	}

	public EntityDeletionException(String message) {
		super(message);
	}

	public EntityDeletionException(Throwable cause) {
		super(cause);
	}

	public EntityDeletionException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
