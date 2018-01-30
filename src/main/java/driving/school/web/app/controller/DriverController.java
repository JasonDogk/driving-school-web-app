package driving.school.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import driving.school.web.app.entity.Driver;
import driving.school.web.app.entity.LoginDriver;
import driving.school.web.app.exceptions.DataNotFoundException;
import driving.school.web.app.exceptions.DriverNotFoundException;
import driving.school.web.app.exceptions.EmptyObjectException;
import driving.school.web.app.exceptions.MissingRequiredParamsException;
import driving.school.web.app.service.DriverService;

@RestController
public class DriverController {

	@Autowired
	private DriverService driverService;

	@RequestMapping(value = "/drivers", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Driver> getDrivers() {
		List<Driver> drivers = null;
		try {
			drivers = driverService.getDrivers();
		} catch (DataNotFoundException e) {
			e.printStackTrace();

		}
		return drivers;
	}

	@RequestMapping(value = "/loginDrivers", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<LoginDriver> getLoginDrivers() {
		List<LoginDriver> drivers = null;
		try {
			drivers = driverService.getLoginDrivers();
		} catch (DataNotFoundException e) {
			e.printStackTrace();

		}
		return drivers;
	}

	@RequestMapping(value = "/driver/{driverId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Driver getDriverById(@PathVariable String driverId) {

		Driver driver = null;
		try {
			driver = driverService.getDriverById(driverId);
		} catch (EmptyObjectException e) {
			e.printStackTrace();
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}
		return driver;
	}

	@RequestMapping(value = "/driver", method = RequestMethod.POST, headers = "Accept=application/json")
	public Driver updateDriver(@RequestBody Driver driver) {
		try {
			driver = driverService.updateDriver(driver);
			return driver;
		} catch (MissingRequiredParamsException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/driver", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Driver createDriver(@RequestBody Driver driver) {
		try {
			driver = driverService.createDriver(driver);
			return driver;
		} catch (MissingRequiredParamsException e) {
			e.printStackTrace();
		}
		return null;

	}

	@RequestMapping(value = "/driver/{driverId}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public String deleteDriver(@PathVariable String driverId) {
		try {
			return driverService.deleteDriver(driverId);
		} catch (EmptyObjectException e) {
			e.printStackTrace();
		} catch (DriverNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
