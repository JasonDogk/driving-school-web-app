package driving.school.web.app.service;

import driving.school.web.app.entity.AdministrationTable;

public interface AdministrationTableService {

	AdministrationTable getAdministrationTable(String username, String password);

	AdministrationTable createAdministrationTable(AdministrationTable administrationTable);

	AdministrationTable updateAdministrationTable(AdministrationTable administrationTable);

	Void deleteAdministrationTable(String administrationTableId);
}
