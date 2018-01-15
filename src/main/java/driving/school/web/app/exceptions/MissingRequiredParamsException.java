package driving.school.web.app.exceptions;

public class MissingRequiredParamsException extends Exception {
	public MissingRequiredParamsException() {
	}

	// Constructor that accepts a message
	public MissingRequiredParamsException(String message) {
		super(message);
	}
}
