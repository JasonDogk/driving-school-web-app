package driving.school.web.app.dao;

import driving.school.web.app.entity.License;

public interface LicenseDao {
	License getLicense(String licenseId);

	License createLicense(License license);

	License updateLicense(License license);

	String deleteLicense(String licenseId);
}
