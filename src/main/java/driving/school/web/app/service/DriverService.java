package driving.school.web.app.service;

import java.util.List;

import driving.school.web.app.entity.Driver;

public interface DriverService {

	List<Driver> listDrivers();

	Driver getDriverById(String driverId);
}
