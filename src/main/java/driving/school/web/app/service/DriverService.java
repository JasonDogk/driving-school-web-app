package driving.school.web.app.service;

import java.util.List;

import driving.school.web.app.entity.Driver;
import driving.school.web.app.entity.LoginDriver;
import driving.school.web.app.exceptions.DataNotFoundException;
import driving.school.web.app.exceptions.DriverNotFoundException;
import driving.school.web.app.exceptions.EmptyObjectException;
import driving.school.web.app.exceptions.MissingRequiredParamsException;

public interface DriverService {

	List<Driver> getDrivers() throws DataNotFoundException;

	List<LoginDriver> getLoginDrivers() throws DataNotFoundException;

	Driver getDriverById(String driverId) throws EmptyObjectException, DataNotFoundException;

	Driver createDriver(Driver driver) throws MissingRequiredParamsException;

	Driver updateDriver(Driver driver) throws MissingRequiredParamsException;

	String deleteDriver(String driverId) throws EmptyObjectException, DriverNotFoundException;
}
