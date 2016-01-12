package service.adapt;

import java.util.List;

import bean.User;
import service.UserService;

public class UserServiceAdapter implements UserService {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserbyName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
