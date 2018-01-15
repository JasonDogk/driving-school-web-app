package driving.school.web.app.exceptions;

public class DriverNotFoundException extends Exception {
	public DriverNotFoundException() {
	}

	// Constructor that accepts a message
	public DriverNotFoundException(String message) {
		super(message);
	}
}
