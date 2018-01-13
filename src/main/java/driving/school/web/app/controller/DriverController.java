package driving.school.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import driving.school.web.app.entity.Driver;
import driving.school.web.app.service.DriverService;

@RestController
public class DriverController {

	@Autowired
	private DriverService driverService;

	@RequestMapping(value = "/drivers", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Driver> getDrivers() {
		List<Driver> drivers = driverService.listDrivers();
		return drivers;
	}

	@RequestMapping(value = "/driver/{driverId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Driver getDriverById(@PathVariable String driverId) {

		Driver driver = driverService.getDriverById(driverId);
		return driver;
	}

	@RequestMapping(value = "/driver", method = RequestMethod.POST, headers = "Accept=application/json")
	public Driver createDriver(@RequestBody Driver driver) {
		driver = driverService.createDriver(driver);
		return driver;

	}

	@RequestMapping(value = "/driver", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Driver updateDriver(@RequestBody Driver driver) {
		driver = driverService.updateDriver(driver);
		return driver;

	}

	@RequestMapping(value = "/driver/{driverId}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public Void updateDriver(@PathVariable String driverId) {
		driverService.deleteDriver(driverId);
		return null;
	}

}
