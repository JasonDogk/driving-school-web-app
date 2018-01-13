package driving.school.web.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import driving.school.web.app.dao.DriverDao;
import driving.school.web.app.entity.Driver;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverDao driverDao;

	@Transactional(readOnly = true)
	@Override
	public List<Driver> listDrivers() {
		return driverDao.listDrivers();
	}

	@Override
	public Driver getDriverById(String driverId) {
		return driverDao.getDriverById(driverId);
	}

	@Override
	public Driver createDriver(Driver driver) {
		return driverDao.createDriver(driver);
	}

	@Override
	public Driver updateDriver(Driver driver) {
		return driverDao.updateDriver(driver);
	}

	@Override
	public Void deleteDriver(String driverId) {
		driverDao.deleteDriver(driverId);
		return null;
	}

}
