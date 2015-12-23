package schoolTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.School;
import dao.impl.SchoolDaoImpl;

public class DaoTest {

	@Test
	public void testSave() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		SessionFactory sf = (SessionFactory) context.getBean("sessionFactory");
		Session session = sf.getCurrentSession();

		session.beginTransaction();

		SchoolDaoImpl daoimpl = new SchoolDaoImpl();

		School school = new School();

		daoimpl.addSchool(school);

		session.getTransaction().commit();
	}
}
