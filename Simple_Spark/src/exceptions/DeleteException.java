package exceptions;

public class DeleteException extends RuntimeException {
	public DeleteException(String message) {
		super(message);
	}

	public DeleteException(String message, Throwable cause) {
		super(message, cause);
	}

	public DeleteException() {
		super("Error deleting item.");
	}
}