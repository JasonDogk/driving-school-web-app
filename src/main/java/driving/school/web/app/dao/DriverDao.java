package driving.school.web.app.dao;

import java.util.List;

import driving.school.web.app.entity.Driver;
import driving.school.web.app.entity.LoginDriver;

public interface DriverDao {
	List<Driver> getDrivers();

	List<LoginDriver> getLoginDrivers();

	Driver getDriverById(String driverId);

	Driver getDriverByAfm(String afm);

	Driver createDriver(Driver driver);

	Driver updateDriver(Driver driver);

	String deleteDriver(String driverId);
}
