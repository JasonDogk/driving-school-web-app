package driving.school.web.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import driving.school.web.app.dao.AdministrationTableDao;
import driving.school.web.app.entity.AdministrationTable;

@Service
public class AdministrationTableServiceImpl implements AdministrationTableService {
	@Autowired
	private AdministrationTableDao administrationTableDao;

	@Transactional(readOnly = true)
	@Override
	public AdministrationTable getAdministrationTable(String username, String password) {
		return administrationTableDao.getAdministrationTable(username, password);
	}

	@Override
	public AdministrationTable createAdministrationTable(AdministrationTable administrationTable) {
		return administrationTableDao.createAdministrationTable(administrationTable);
	}

	@Override
	public AdministrationTable updateAdministrationTable(AdministrationTable administrationTable) {
		return administrationTableDao.updateAdministrationTable(administrationTable);
	}

	@Override
	public Void deleteAdministrationTable(String administrationTableId) {
		administrationTableDao.deleteAdministrationTable(administrationTableId);
		return null;
	}
}
