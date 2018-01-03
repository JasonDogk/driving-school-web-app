package driving.school.web.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import driving.school.web.app.dao.UserDao;
import driving.school.web.app.entity.User;

/**
 * @author imssbora
 *
 */
@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Transactional(readOnly = true)
	@Override
	public List<User> listUsers() {
		return userDao.listUsers();
	}

}