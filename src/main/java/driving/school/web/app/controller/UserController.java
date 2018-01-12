package driving.school.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import driving.school.web.app.entity.User;
import driving.school.web.app.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// @RequestMapping(method = RequestMethod.GET)
	// public List<User> getDrivers() {
	// List<User> drivers = userService.listUsers();
	// return drivers;
	// }

	@GetMapping("/persons")
	public ResponseEntity getPersons() {
		List<User> persons = new ArrayList<User>();

		User person = new User();
		person.setFirstName("iasonas");
		person.setId(234L);
		person.setEmail("arxidia@gmail.com");
		person.setLastName("Dogkas");

		persons.add(person);

		return new ResponseEntity(persons, HttpStatus.OK);
	}

	// @GetMapping("/drivers")
	// public ResponseEntity getDriver() {
	//
	// List<User> users = userService.listUsers();
	//
	// return new ResponseEntity(users, HttpStatus.OK);
	// }

}