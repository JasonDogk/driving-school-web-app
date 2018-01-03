package driving.school.web.app.service;

import java.util.List;

import driving.school.web.app.entity.User;

public interface UserService {
	void add(User user);

	List<User> listUsers();
}