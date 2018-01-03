package driving.school.web.app.dao;

import java.util.List;

import driving.school.web.app.entity.User;

public interface UserDao {
	void add(User user);

	List<User> listUsers();
}