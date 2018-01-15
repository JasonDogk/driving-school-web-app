package driving.school.web.app.exceptions;

public class LicenseNotFoundException extends Exception {
	public LicenseNotFoundException() {
	}

	// Constructor that accepts a message
	public LicenseNotFoundException(String message) {
		super(message);
	}
}
