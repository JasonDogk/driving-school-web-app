package driving.school.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import driving.school.web.app.entity.User;
import driving.school.web.app.service.UserService;

@Controller
@RequestMapping("/giveMe")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public List<User> getDrivers() {
		List<User> drivers = userService.listUsers();
		return drivers;
	}

}