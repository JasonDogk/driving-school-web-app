package driving.school.web.app.service;

import driving.school.web.app.entity.License;
import driving.school.web.app.exceptions.EmptyObjectException;
import driving.school.web.app.exceptions.LicenseNotFoundException;
import driving.school.web.app.exceptions.MissingRequiredParamsException;

public interface LicenseService {

	License getLicense(String licenseId) throws EmptyObjectException;

	License createLicense(License license) throws EmptyObjectException;

	License updateLicense(License license) throws MissingRequiredParamsException, EmptyObjectException;

	String deleteLicense(String licenseId) throws EmptyObjectException, LicenseNotFoundException;

}
