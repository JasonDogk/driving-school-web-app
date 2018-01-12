package driving.school.web.app;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import driving.school.web.app.config.AppConfig;
import driving.school.web.app.entity.AdministrationTable;
import driving.school.web.app.entity.Driver;
import driving.school.web.app.service.DriverService;

/**
 * @author imssbora
 *
 */
public class MainApp {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// UserService userService = context.getBean(UserService.class);
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

		List<Driver> drivers = driverService.listDrivers();
		for (Driver driver : drivers) {
			System.out.println("Id = " + driver.getId());
			driverService.getDriverById(driver.getId());
			System.out.println("Last Name = " + driver.getLastName());
			System.out.println("Email = " + driver.getEmail());
			System.out.println();
		}

		context.close();

		AdministrationTable adminTable = new AdministrationTable.Builder("id", "username", "password").build();
		System.err.println(adminTable.toString());
	}
}