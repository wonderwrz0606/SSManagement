package schoolTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Application;
import bean.School;
import dao.impl.SchoolDaoImpl;

public class DaoTest {
	
	static Session session;
	
	
	@Test
	public void testSave() {

		

		SchoolDaoImpl daoimpl = new SchoolDaoImpl();

		School school = new School();
		school.setSchId(1);

		session.save(school);

		// daoimpl.addSchool(school);;
		// daoimpl.getAllSchool();
		//session.getTransaction().commit();
	}
	
	@BeforeClass
	public static void beforeClass() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		SessionFactory sessionFactory = (SessionFactory) context
				.getBean("sessionFactory");
		session = sessionFactory.getCurrentSession();

		session.beginTransaction();
	}
	
	@AfterClass
	public static void afterClass() {
		session.getTransaction().commit();
	}
}
