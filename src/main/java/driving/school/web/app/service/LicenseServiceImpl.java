package driving.school.web.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import driving.school.web.app.dao.LicenseDao;
import driving.school.web.app.entity.License;

@Service
public class LicenseServiceImpl implements LicenseService {

	@Autowired
	private LicenseDao licenseDao;

	@Override
	public License getLicense(String licenseId) {
		return licenseDao.getLicense(licenseId);
	}

	@Override
	public License createLicense(License license) {
		return licenseDao.createLicense(license);
	}

	@Override
	public License updateLicense(License license) {
		return licenseDao.updateLicense(license);
	}

	@Override
	public Void deleteLicense(String licenseId) {
		licenseDao.deleteLicense(licenseId);
		return null;
	}

}
