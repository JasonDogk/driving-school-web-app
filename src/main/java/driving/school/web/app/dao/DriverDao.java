package driving.school.web.app.dao;

import java.util.List;

import driving.school.web.app.entity.Driver;

public interface DriverDao {
	List<Driver> listDrivers();

	Driver getDriverById(String driverId);
}
