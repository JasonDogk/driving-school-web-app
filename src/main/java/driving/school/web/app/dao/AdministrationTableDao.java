package driving.school.web.app.dao;

import java.util.List;

import driving.school.web.app.entity.AdministrationTable;

public interface AdministrationTableDao {
	List<AdministrationTable> listAdministrationTables();

	AdministrationTable getAdministrationTableById(String administrationTableId);

	AdministrationTable createAdministrationTable(AdministrationTable administrationTable);

	AdministrationTable updateAdministrationTable(AdministrationTable administrationTable);

	Void deleteAdministrationTable(String administrationTableId);
}
