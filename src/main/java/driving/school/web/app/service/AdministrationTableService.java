package driving.school.web.app.service;

import java.util.List;

import driving.school.web.app.entity.AdministrationTable;

public interface AdministrationTableService {
	List<AdministrationTable> listAdministrationTables();

	AdministrationTable getAdministrationTableById(String administrationTableId);

	AdministrationTable createAdministrationTable(AdministrationTable administrationTable);

	AdministrationTable updateAdministrationTable(AdministrationTable administrationTable);

	Void deleteAdministrationTable(String administrationTableId);
}
