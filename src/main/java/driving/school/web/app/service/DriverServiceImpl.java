package driving.school.web.app.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import driving.school.web.app.dao.DriverDao;
import driving.school.web.app.entity.Driver;
import driving.school.web.app.exceptions.DataNotFoundException;
import driving.school.web.app.exceptions.EmptyObjectException;
import driving.school.web.app.exceptions.MissingRequiredParamsException;
import driving.school.web.app.utilLib.UtilLib;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverDao driverDao;

	@Transactional(readOnly = true)
	@Override
	public List<Driver> getDrivers() throws DataNotFoundException {

		List<Driver> drivers = driverDao.getDrivers();

		if (UtilLib.isEmpty(drivers)) {
			throw new DataNotFoundException("No Drivers exist in Database");
		}
		return drivers;
	}

	@Override
	public Driver getDriverById(String driverId) throws EmptyObjectException, DataNotFoundException {

		if (UtilLib.isEmpty(driverId)) {
			throw new EmptyObjectException("Provided Driver id is empty/null");
		}

		Driver driver = driverDao.getDriverById(driverId);

		if (UtilLib.isEmpty(driver)) {
			throw new DataNotFoundException("No Drivers exist in Database");
		} else
			return driver;
	}

	@Override
	public Driver createDriver(Driver driver) throws MissingRequiredParamsException {

		String driverId = UUID.randomUUID().toString();
		Driver newDriver = driver.toBuilder().id(driverId).build();

		if (UtilLib.hasAllTheMandatoryFields(newDriver)) {
			return driverDao.createDriver(newDriver);
		} else {
			throw new MissingRequiredParamsException(
					"Not All mandatory fields completed to create a driver: " + newDriver.toString());
		}

	}

	@Override
	public Driver updateDriver(Driver driver) throws MissingRequiredParamsException {

		if (UtilLib.hasAllTheMandatoryFields(driver)) {
			return driverDao.updateDriver(driver);
		} else {
			throw new MissingRequiredParamsException("Not All mandatory fields completed to create a driver");
		}
	}

	@Override
	public String deleteDriver(String driverId) throws EmptyObjectException {

		if (!UtilLib.isEmpty(driverId)) {
			String deletedDriverId = driverDao.deleteDriver(driverId);
			return deletedDriverId;
		} else {
			throw new EmptyObjectException("Provided driver id is empty/null");
		}

	}

}
