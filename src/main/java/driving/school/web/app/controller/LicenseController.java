package driving.school.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import driving.school.web.app.entity.License;
import driving.school.web.app.service.LicenseService;

@RestController
public class LicenseController {

	@Autowired
	private LicenseService licenseService;

	@RequestMapping(value = "/driver/{licenseId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public License getLicense(@PathVariable String licenseId) {

		License license = licenseService.getLicense(licenseId);
		return license;
	}

	@RequestMapping(value = "/license", method = RequestMethod.POST, headers = "Accept=application/json")
	public License createLicense(@RequestBody License license) {
		license = licenseService.createLicense(license);
		return license;

	}

	@RequestMapping(value = "/license", method = RequestMethod.PUT, headers = "Accept=application/json")
	public License updateLicense(@RequestBody License license) {
		license = licenseService.updateLicense(license);
		return license;

	}

	@RequestMapping(value = "/license/{licenseId}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public Void updateLicense(@PathVariable String licenseId) {
		licenseService.deleteLicense(licenseId);
		return null;
	}

}
