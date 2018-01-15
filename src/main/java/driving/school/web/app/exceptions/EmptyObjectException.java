package driving.school.web.app.exceptions;

public class EmptyObjectException extends Exception {

	public EmptyObjectException() {
	}

	// Constructor that accepts a message
	public EmptyObjectException(String message) {
		super(message);
	}

}
