package driving.school.web.app.dao;

import driving.school.web.app.entity.AdministrationTable;

public interface AdministrationTableDao {

	AdministrationTable getAdministrationTable(String username, String password);

	AdministrationTable createAdministrationTable(AdministrationTable administrationTable);

	AdministrationTable updateAdministrationTable(AdministrationTable administrationTable);

	Void deleteAdministrationTable(String administrationTableId);
}
