package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import bean.User;
import dao.UserDao;
import dao.adapt.UserDaoAdapter;

@Repository
public class UserDaoImpl extends UserDaoAdapter {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	public void updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	public void deleteUser(int id) {
		sessionFactory.getCurrentSession().delete(getUser(id));
	}

	public User getUser(int id) {
		
		Query query=sessionFactory.getCurrentSession().createQuery("from User  where id =:id");
		query.setInteger("id", id);
		return (User) query.uniqueResult();
	}

	public List<User> getUserbyName(String username) {
		Query query=sessionFactory.getCurrentSession().createQuery("from User  where username =:username");
		query.setString("username", username);
		return query.list();
	}

	public List<User> getAllUser() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

}
