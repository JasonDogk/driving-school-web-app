package driving.school.web.app.service;

import driving.school.web.app.entity.License;

public interface LicenseService {

	License getLicense(String licenseId);

	License createLicense(License license);

	License updateLicense(License license);

	Void deleteLicense(String licenseId);

}
