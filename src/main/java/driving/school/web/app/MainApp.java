package driving.school.web.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import driving.school.web.app.config.AppConfig;
import driving.school.web.app.exceptions.DataNotFoundException;
import driving.school.web.app.exceptions.DriverNotFoundException;
import driving.school.web.app.exceptions.EmptyObjectException;
import driving.school.web.app.exceptions.MissingRequiredParamsException;
import driving.school.web.app.service.AdministrationTableService;
import driving.school.web.app.service.DriverService;
import driving.school.web.app.service.LicenseService;
import driving.school.web.app.service.MapDetailsService;
import driving.school.web.app.service.StatisticsService;

/**
 * @author imssbora
 *
 */
public class MainApp {
	public static void main(String[] args) throws EmptyObjectException, DataNotFoundException,
			MissingRequiredParamsException, DriverNotFoundException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		DriverService driverService = context.getBean(DriverService.class);
		AdministrationTableService administrationService = context.getBean(AdministrationTableService.class);
		LicenseService LicenseService = context.getBean(LicenseService.class);
		MapDetailsService mapDetailsService = context.getBean(MapDetailsService.class);
		StatisticsService statisticsService = context.getBean(StatisticsService.class);

		// Statistics skato = statisticsService.getMaleFemaleLast3Years();
		// System.out.println("skato: " + skato.toString());
		//
		// statisticsService.getMaleFemaleThisYear();
		//
		// statisticsService.getLicensesThisYear();

		System.out.println(" polla skata " + statisticsService.getStartingEndingLessonsPerMonthThisYear());

		// statisticsService.getStartingEndingLessonsPerMonthThisYear();
		//
		// Driver driver1 = new
		// Driver.Builder().firstName("iasonas").lastName("dogkas").afm("afm-" +
		// UUID.randomUUID())
		// .phoneNumber("6973636636").build();
		// Driver insertedDriver = driverService.createDriver(driver1);
		//
		// Driver driver2 = new
		// Driver.Builder().id(insertedDriver.getId()).firstName("iasonasUpdated2")
		// .lastName("dogkasUpdated2").afm("NEWafm-" +
		// UUID.randomUUID()).phoneNumber("6973636636").build();
		// driverService.updateDriver(driver2);
		//
		// driverService.getDriverById(insertedDriver.getId());
		// driverService.getDrivers();
		//
		// driverService.deleteDriver(insertedDriver.getId());
		//
		// AdministrationTable administrationTable =
		// administrationService.getAdministrationTable("admin", "admin");
		// System.err.println(administrationTable);
		//
		// List<LoginDriver> loginDrivers = driverService.getLoginDrivers();
		// System.err.println("Login drivers size: " + loginDrivers.size());
		// for (LoginDriver loginDriver : loginDrivers) {
		// System.out.println(loginDriver.toString());
		// }
		//
		// // License license =
		// // LicenseService.getLicense("f596c9e9-4518-43e7-bf40-978afe4fbe6c");
		// // System.out.println(license.toString());
		//
		// List<MapDetails> listOfMapDetails = mapDetailsService.getMapDetails();
		// System.err.println("MapDetailsSize:" + listOfMapDetails.size());
		// for (MapDetails mapDetails : listOfMapDetails) {
		// System.out.println("Map details id: " + mapDetails.getId());
		// }

		context.close();

	}
}