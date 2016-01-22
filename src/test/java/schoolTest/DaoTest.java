package schoolTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.SchoolService;
import util.SchoolTimeHelper;
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
		
	      List<School> list=schoolService.getSchoolbyId(2);
			for(int i=0;i<list.size();i++){
				School s=(School) list.get(i);
				System.out.println("id: "+s.getSchId());
				System.out.println("name: "+s.getSchName());
				System.out.println("zip: "+s.getSchZip());
				System.out.println("state: "+s.getSchState());
			}
	}
	
	@Test
	public void testListSchool(){
		
		List<School> list=schoolService.getAllSchool();
		
		for(int i=0;i<list.size();i++){
			School s =list.get(i);
			System.out.println("full name: "+s.getSchName());
			System.out.println("short name: "+s.getSchShort());
			System.out.println(s.getApplications());
		}
	}
	
	/**
	 * 
	 *  update by id
	 */
	@Test
	public void testUpdateSchool(){
		School s=new School();
		
		s.setSchId(22);
		s.setSchName("Rutgers University");
		
		//s.setSchCity("Nan Ning");
		
		schoolService.updateSchool(s);
		
	}
	
	
	@Test
	public void testDeleteSchool(){
		schoolService.deleteSchool(8);
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
	
	
	
	@Test
	public void dynamicQuery(){
		SessionFactory sessionFactory =(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		DetachedCriteria dc=DetachedCriteria.forClass(School.class);
		
		int schId=18;
		String schName="Guangxi";
		
		if(schId!=0){
			dc.add(Restrictions.eq("schId", schId));
		}
		if(schName!=null){
			dc.add(Restrictions.like("schName", schName+"%"));
			
		}
		
		Criteria c=dc.getExecutableCriteria(session);
		
		List<School> list=c.list();
		
		for(School s:list){
			System.out.println(s.getSchName());
		}
		
		
		session.getTransaction().commit();
	}
	
	@Test
	public void testDynamicSearch() throws ParseException{
		
		School school =new School();
		
//		school.setSchId(null);
	    school.setSchName(null);
//		school.setSchZip(null);
		//school.setSchState("c");
		school.setSchTf(null);
		school.setSchSsat(null);
		school.setSchSeason(null);
		//school.setIOdeadLine("2010-10-22");
		
		SchoolTimeHelper sth=new SchoolTimeHelper();
		sth.String2Date(school);
		
//		List list=schoolService.DynamicSearch(school);
//		for(int i=0;i<list.size();i++){
//			School s=(School) list.get(i);
//			System.out.println("id: "+s.getSchId());
//			System.out.println("name: "+s.getSchName());
//			System.out.println("Toefl:"+s.getSchTf());
//			System.out.println("state: "+s.getSchState());
//			System.out.println("ssat:"+s.getSchSsat());
//			System.out.println("Season:"+s.getSchSeason());
//		}
	}
	
	
	@Test
	public void testConvert() throws ParseException{
		
		SchoolTimeHelper sth=new SchoolTimeHelper();
		
		School school=new School();
		school.setSchId(2);
		
		List<School> schoolList=schoolService.getSchoolbyId(school.getSchId());
		
		school=schoolList.get(0);
		
		Date date=school.getDeadLine();
		
		
		System.out.println(date);
		
		
		
		
				
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
