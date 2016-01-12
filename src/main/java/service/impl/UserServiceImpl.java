package service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import dao.UserDao;
import bean.User;
import service.UserService;
import service.adapt.UserServiceAdapter;

public class UserServiceImpl extends UserServiceAdapter {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private UserDao userDao;
	
	public void addUser(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		userDao.addUser(user);
		session.getTransaction().commit();

	}

	public void updateUser(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		userDao.updateUser(user);
		session.getTransaction().commit();
	}

	public void deleteUser(int id) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		userDao.deleteUser(id);
		session.getTransaction().commit();
	}

	public User getUser(int id) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		User user=userDao.getUser(id);
		
		session.getTransaction().commit();
		return user;
	}

	public List<User> getUserbyName(String username) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		List<User> list=userDao.getUserbyName(username);
		
		session.getTransaction().commit();
		return list;
	}

	public List<User> getAllUser() {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();

		List<User> list=userDao.getAllUser();
		
		session.getTransaction().commit();
		return list;
	}

}
