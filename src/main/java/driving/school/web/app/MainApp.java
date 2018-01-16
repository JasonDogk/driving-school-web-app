package driving.school.web.app;

import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import driving.school.web.app.config.AppConfig;
import driving.school.web.app.entity.AdministrationTable;
import driving.school.web.app.entity.Driver;
import driving.school.web.app.exceptions.DataNotFoundException;
import driving.school.web.app.exceptions.EmptyObjectException;
import driving.school.web.app.exceptions.MissingRequiredParamsException;
import driving.school.web.app.service.AdministrationTableService;
import driving.school.web.app.service.DriverService;

/**
 * @author imssbora
 *
 */
public class MainApp {
	public static void main(String[] args)
			throws EmptyObjectException, DataNotFoundException, MissingRequiredParamsException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		DriverService driverService = context.getBean(DriverService.class);
		AdministrationTableService administrationService = context.getBean(AdministrationTableService.class);

		Driver driver1 = new Driver.Builder().firstName("iasonas").lastName("dogkas").afm("afm-" + UUID.randomUUID())
				.phoneNumber("6973636636").build();
		Driver insertedDriver = driverService.createDriver(driver1);

		Driver driver2 = new Driver.Builder().id(insertedDriver.getId()).firstName("iasonasUpdated2")
				.lastName("dogkasUpdated2").afm("NEWafm-" + UUID.randomUUID()).phoneNumber("6973636636").build();
		driverService.updateDriver(driver2);

		driverService.getDriverById(insertedDriver.getId());
		driverService.getDrivers();

		driverService.deleteDriver(insertedDriver.getId());

		AdministrationTable administrationTable = administrationService.getAdministrationTable("admin", "admin");
		System.err.println(administrationTable);

		context.close();

	}
}