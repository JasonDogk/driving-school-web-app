package driving.school.web.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import driving.school.web.app.dao.LicenseDao;
import driving.school.web.app.entity.License;
import driving.school.web.app.exceptions.EmptyObjectException;
import driving.school.web.app.exceptions.LicenseNotFoundException;
import driving.school.web.app.exceptions.MissingRequiredParamsException;
import driving.school.web.app.utilLib.UtilLib;

@Service
public class LicenseServiceImpl implements LicenseService {

	@Autowired
	private LicenseDao licenseDao;

	@Override
	public License getLicense(String licenseId) throws EmptyObjectException {

		if (!UtilLib.isEmpty(licenseId)) {
			return licenseDao.getLicense(licenseId);
		} else {
			throw new EmptyObjectException("Provided license id is empty/null");
		}

	}

	@Override
	public License createLicense(License license) throws EmptyObjectException {

		UtilLib.containsId(license);
		String id = license.getId();

		return licenseDao.createLicense(license);
	}

	@Override
	public License updateLicense(License license) throws MissingRequiredParamsException, EmptyObjectException {

		if (UtilLib.containsId(license)) {
			if (UtilLib.hasAllTheMandatoryFields(license)) {
				return licenseDao.updateLicense(license);
			} else {
				throw new MissingRequiredParamsException("Not All mandatory fields completed to create a license");
			}

		} else {
			throw new MissingRequiredParamsException("Missing mandatory id for license in order to be updated");
		}

	}

	@Override
	public String deleteLicense(String licenseId) throws EmptyObjectException, LicenseNotFoundException {
		if (!UtilLib.isEmpty(licenseId)) {
			String deletedLicenseId = licenseDao.deleteLicense(licenseId);
			if (!UtilLib.isEmpty(deletedLicenseId)) {
				return deletedLicenseId;
			} else {
				throw new LicenseNotFoundException("Requested license id to be deleted was not found");
			}
		} else {
			throw new EmptyObjectException("No license id provided in order to be deleted");
		}

	}

}
