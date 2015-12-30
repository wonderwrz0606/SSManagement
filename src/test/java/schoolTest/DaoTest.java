package schoolTest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.SchoolService;
import bean.Application;
import bean.School;
import dao.SchoolDao;
import dao.impl.SchoolDaoImpl;

public class DaoTest {
	
	
	static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	static SchoolService schoolService=(SchoolService) context.getBean("schoolService");
	@Test
	public void testSave() {

		Session session;

		SchoolDaoImpl daoimpl = new SchoolDaoImpl();

		School school = new School();
		school.setSchId(1);

		//session.save(school);

		// daoimpl.addSchool(school);;
		// daoimpl.getAllSchool();
		//session.getTransaction().commit();
	}
	
	/**
	 *   service layer
	 *   get school by id
	 */
	@Test
	public void testGetSchoolByID(){
		
	    
		
	      School s=schoolService.getSchoolbyId(15);
	      System.out.println(s.getSchName());
	      System.out.println(s.getSchWebsite());
	}
	
	@Test
	public void testListSchool(){
		
		List<School> list=schoolService.getAllSchool();
		
		for(int i=0;i<list.size();i++){
			School s =list.get(i);
			System.out.println("full name: "+s.getSchName());
			System.out.println("short name: "+s.getSchShort());
		}
	}
	
	/**
	 * 
	 *  update by id
	 */
	@Test
	public void testUpdateSchool(){
		School s=new School();
		
		s.setSchId(20);
		s.setSchName("GuangXi University");
		s.setSchWebsite("www.gxu.edu");
		//s.setSchCity("Nan Ning");
		
		schoolService.updateSchool(s);
		
	}
	
	
	@Test
	public void testDeleteSchool(){
		schoolService.deleteSchool(27);
	}
	
	@Test
	public void testGetSchoolByState(){
		List list=schoolService.getSchoolbyState("NJ");
		for(int i=0;i<list.size();i++){
			School s=(School) list.get(i);
			System.out.println(s.getSchName());
		}
	}
	
	
	
	@Test
	public void testGetSchoolByZip(){
		List list=schoolService.getSchoolbyZipCode("07029");
		for(int i=0;i<list.size();i++){
			School s=(School) list.get(i);
			System.out.println(s.getSchName());
		}
	}
	
	@Test
	public void testGetSchoolByName(){
		List list=schoolService.getSchoolbyName("new jersey");
		for(int i=0;i<list.size();i++){
			School s=(School) list.get(i);
			System.out.println(s.getSchName());
		}
	}
	
//	@BeforeClass
//	public static void beforeClass() {
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"beans.xml");
//
//		SessionFactory sessionFactory = (SessionFactory) context
//				.getBean("sessionFactory");
//		session = sessionFactory.getCurrentSession();
//
//		session.beginTransaction();
//	}
//	
//	@AfterClass
//	public static void afterClass() {
//		session.getTransaction().commit();
//	}
}
