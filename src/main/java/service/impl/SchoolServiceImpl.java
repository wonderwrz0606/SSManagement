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
	
	
	

	@Override
	public School getSchoolbyName(String sch_name) {
		// TODO Auto-generated method stub
		return null;
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
	
	@Override
	public School getSchoolbyReligon(String sch_religon) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public School getSchoolbyDealLine(Date deadline) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School getSchoolbySat(int sch_Sat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School getSchoolbyTuitionFee(int sch_fee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<School> getAllSchool() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<School> list = schoolDao.getAllSchool();
		session.getTransaction().commit();
		
		
		return list;
	}

}
