package driving.school.web.app.exceptions;

public class MapDetailsNotFoundException extends Exception {
	public MapDetailsNotFoundException() {
	}

	// Constructor that accepts a message
	public MapDetailsNotFoundException(String message) {
		super(message);
	}
}
