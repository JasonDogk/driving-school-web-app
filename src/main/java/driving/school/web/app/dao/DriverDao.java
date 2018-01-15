package driving.school.web.app.dao;

import java.util.List;

import driving.school.web.app.entity.Driver;

public interface DriverDao {
	List<Driver> getDrivers();

	Driver getDriverById(String driverId);

	Driver createDriver(Driver driver);

	Driver updateDriver(Driver driver);

	String deleteDriver(String driverId);
}
