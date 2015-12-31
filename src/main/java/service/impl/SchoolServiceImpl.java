package service.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SchoolDao;
import bean.School;
import service.adapt.SchoolServiceAdapter;

@Service
public class SchoolServiceImpl extends SchoolServiceAdapter{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private SchoolDao schoolDao;
	
	@Override
	public void addSchool(School school) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		schoolDao.addSchool(school);
		session.getTransaction().commit();
	}

	@Override
	public void updateSchool(School school) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		schoolDao.updateSchool(school);
		session.getTransaction().commit();
	}

	@Override
	public void deleteSchool(int sch_id) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		schoolDao.deleteSchool(sch_id);
		session.getTransaction().commit();
	}

	@Override
	public School getSchoolbyId(int sch_id) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		School school = schoolDao.getSchoolbyId(sch_id);
		session.getTransaction().commit();
		
		return school;
	}
	
	
	
	/**
	 @param String sch_name
	 * @return list
	 */
	public List<School> getSchoolbyName(String sch_name) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		List<School> list=schoolDao.getSchoolbyName(sch_name);
		
		session.getTransaction().commit();
		return list;
	}
	
	
	/**
	 * @param String sch_state
	 * @return list
	 */
	public List<School> getSchoolbyState(String sch_state) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		List<School> list=schoolDao.getSchoolbyState(sch_state);
		
		session.getTransaction().commit();
		return list;
	}
	
	
	/**
	 * @param String sch_zip
	 * @return list
	 */
	public List<School> getSchoolbyZipCode(String sch_zip) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		List<School> list=schoolDao.getSchoolbyZipCode(sch_zip);
		
		session.getTransaction().commit();
		return list;	
		}

	/** list all school
	 * 
	 * @return List list
	 * 
	 */
	public List<School> getAllSchool() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<School> list = schoolDao.getAllSchool();
		session.getTransaction().commit();
		return list;
	}
	
	/**
	 *  custom search 
	 * 	search condition: schId, schName(like), schState(like), schZip
	 *  @param School school
	 *  @return List
	 */ 
	public List<School> DynamicSearch(School school) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<School> list = schoolDao.DynamicSearch(school);
		session.getTransaction().commit();
		return list;
	}

	
	

}
