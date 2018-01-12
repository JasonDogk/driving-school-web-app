package driving.school.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import driving.school.web.app.entity.Driver;
import driving.school.web.app.service.DriverService;

@RestController
public class DriverController {

	@Autowired
	private DriverService driverService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Driver> getDrivers() {
		List<Driver> drivers = driverService.listDrivers();
		return drivers;
	}

	@RequestMapping(value = "/driver/{driverId}", method = RequestMethod.POST, headers = "Accept=application/json")
	public Driver getDriverById(@PathVariable String driverId) {

		Driver driver = driverService.getDriverById(driverId);
		return driver;
	}

}
