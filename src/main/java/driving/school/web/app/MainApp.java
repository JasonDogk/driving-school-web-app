package driving.school.web.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import driving.school.web.app.config.AppConfig;
import driving.school.web.app.entity.AdministrationTable;
import driving.school.web.app.service.DriverService;
import driving.school.web.app.service.LicenseService;

/**
 * @author imssbora
 *
 */
public class MainApp {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		LicenseService userService = context.getBean(LicenseService.class);
		DriverService driverService = context.getBean(DriverService.class);

		// Add Users
		// userService.add(new User("Sunil", "Bora", "suni.bora@example.com"));
		// userService.add(new User("David", "Miller", "david.miller@example.com"));
		// userService.add(new User("Sameer", "Singh", "sameer.singh@example.com"));
		// userService.add(new User("Paul", "Smith", "paul.smith@example.com"));
		//
		// // Get Users
		// List<User> users = userService.listUsers();
		// for (User user : users) {
		// System.out.println("Id = " + user.getId());
		// System.out.println("First Name = " + user.getFirstName());
		// System.out.println("Last Name = " + user.getLastName());
		// System.out.println("Email = " + user.getEmail());
		// System.out.println();
		// }

		driverService.deleteDriver("id1234k4324");

		// Driver driver1 = new
		// Driver.Builder().id("id1234k4324").firstName("iasonas").lastName("dogkas")
		// .afm("AK$&$a234sdi&$&").phoneNumber("6973636636").build();
		// driverService.createDriver(driver1);
		//
		// Driver driver2 = new
		// Driver.Builder().id("id1234k4").firstName("iasonasUpdated2").lastName("dogkasUpdated2")
		// .afm("AK$&$asdi&$&").phoneNumber("6973636636").build();
		// driverService.updateDriver(driver2);
		//
		// List<Driver> drivers = driverService.listDrivers();
		//
		// for (Driver driver : drivers) {
		// System.out.println("Id = " + driver.getId());
		// driverService.getDriverById(driver.getId());
		// System.out.println("Last Name = " + driver.getLastName());
		// System.out.println("Email = " + driver.getEmail());
		// System.out.println();
		// }

		context.close();

		AdministrationTable adminTable = new AdministrationTable.Builder().id("id").username("username")
				.password("password").build();
		System.err.println(adminTable.toString());
	}
}