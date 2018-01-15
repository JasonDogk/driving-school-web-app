package driving.school.web.app.exceptions;

public class DataNotFoundException extends Exception {
	public DataNotFoundException() {
	}

	// Constructor that accepts a message
	public DataNotFoundException(String message) {
		super(message);
	}
}
