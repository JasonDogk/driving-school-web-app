package driving.school.web.app.utilLib;

import driving.school.web.app.entity.Driver;
import driving.school.web.app.exceptions.EmptyObjectException;

public class UtilLib {

	public static boolean containsId(Object object) throws EmptyObjectException {
		if (object != null) {
			if (object instanceof Driver) {
				Driver driver = (Driver) object;
				if ((driver.getId() != null) && (!"".equals(driver.getId().trim()))) {
					return true;
				}
			}
			return false;
		} else {
			throw new EmptyObjectException("Provided object is empty");
		}
	}

	public static void isEmptyAndThrowsException(Object object) throws EmptyObjectException {
		if (object == null) {
			throw new EmptyObjectException("Provided object is empty");
		}
	}

	public static boolean isEmpty(Object object) {
		if (object != null) {
			if (object instanceof String) {
				String string = (String) object;
				if ("".equals(string.trim())) {
					return true;
				}
			}
			return false;
		}
		return true;
	}

	public static boolean hasAllTheMandatoryFields(Object object) {
		if (!isEmpty(object)) {
			if (object instanceof Driver) {
				Driver driver = (Driver) object;
				if ((isEmpty(driver.getFistrName())) || (isEmpty(driver.getLastName()))
						|| (isEmpty(driver.getPhoneNumber()))) {
					return false;
				} else {
					return true;
				}

			}
		}
		return false;
	}
}
