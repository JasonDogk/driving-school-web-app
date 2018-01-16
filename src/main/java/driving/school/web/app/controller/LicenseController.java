package driving.school.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import driving.school.web.app.entity.License;
import driving.school.web.app.exceptions.EmptyObjectException;
import driving.school.web.app.exceptions.LicenseNotFoundException;
import driving.school.web.app.exceptions.MissingRequiredParamsException;
import driving.school.web.app.service.LicenseService;

@RestController
public class LicenseController {

	@Autowired
	private LicenseService licenseService;

	@RequestMapping(value = "/license/{licenseId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public License getLicense(@PathVariable String licenseId) {

		try {
			License license = licenseService.getLicense(licenseId);
			return license;
		} catch (EmptyObjectException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/license", method = RequestMethod.POST, headers = "Accept=application/json")
	public License createLicense(@RequestBody License license) {
		try {
			license = licenseService.createLicense(license);
			return license;
		} catch (EmptyObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@RequestMapping(value = "/license", method = RequestMethod.PUT, headers = "Accept=application/json")
	public License updateLicense(@RequestBody License license) {
		try {
			license = licenseService.updateLicense(license);
		} catch (EmptyObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MissingRequiredParamsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return license;

	}

	@RequestMapping(value = "/license/{licenseId}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public Void deleteLicense(@PathVariable String licenseId) {
		try {
			licenseService.deleteLicense(licenseId);
		} catch (EmptyObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LicenseNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
