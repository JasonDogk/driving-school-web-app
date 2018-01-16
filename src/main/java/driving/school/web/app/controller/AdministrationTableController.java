package driving.school.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import driving.school.web.app.entity.AdministrationTable;
import driving.school.web.app.service.AdministrationTableService;

@RestController
public class AdministrationTableController {
	@Autowired
	private AdministrationTableService administrationTableService;

	// @RequestMapping(value = "/administrationTables", method = RequestMethod.GET,
	// headers = "Accept=application/json")
	// public List<AdministrationTable> getAdministrationTables() {
	// List<AdministrationTable> administrationTables =
	// administrationTableService.listAdministrationTables();
	// return administrationTables;
	// }

	@RequestMapping(value = "/administrationTable/username/{username}/password/{password}", method = RequestMethod.GET, headers = "Accept=application/json")
	public AdministrationTable getAdministrationTable(@PathVariable("username") String username,
			@PathVariable("password") String password) {
		AdministrationTable administrationTable = administrationTableService.getAdministrationTable(username, password);
		return administrationTable;
	}

	@RequestMapping(value = "/administrationTable", method = RequestMethod.POST, headers = "Accept=application/json")
	public AdministrationTable createAdministrationTable(@RequestBody AdministrationTable administrationTable) {
		administrationTable = administrationTableService.createAdministrationTable(administrationTable);
		return administrationTable;

	}

	@RequestMapping(value = "/administrationTable", method = RequestMethod.PUT, headers = "Accept=application/json")
	public AdministrationTable updateAdministrationTable(@RequestBody AdministrationTable administrationTable) {
		administrationTable = administrationTableService.updateAdministrationTable(administrationTable);
		return administrationTable;

	}

	@RequestMapping(value = "/administrationTable/{administrationTableId}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public Void updateAdministrationTable(@PathVariable String administrationTableId) {
		administrationTableService.deleteAdministrationTable(administrationTableId);
		return null;
	}
}
