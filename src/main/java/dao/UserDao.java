package dao;

import java.util.List;

import bean.User;

public interface UserDao {
	 void addUser(User	user);
	 void updateUser(User user);
	 void deleteUser(int id);
	 
	 User getUser(int id);
	 List<User> getUserbyName(String username);
	 
	 List<User> getAllUser();
}
