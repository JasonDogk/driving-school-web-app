package driving.school.web.app.service;

import java.util.List;

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
	public List<AdministrationTable> listAdministrationTables() {
		return administrationTableDao.listAdministrationTables();
	}

	@Override
	public AdministrationTable getAdministrationTableById(String administrationTableId) {
		return administrationTableDao.getAdministrationTableById(administrationTableId);
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
