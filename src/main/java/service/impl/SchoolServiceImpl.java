package service.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SchoolDao;
import bean.School;
import service.SchoolService;
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
		
	}

	@Override
	public void deleteSchool(int sch_id) {
		
	}

	@Override
	public School getSchoolbyId(int sch_id) {
		return null;
	}

	@Override
	public School getSchoolbyName(String sch_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School getSchoolbyReligon(String sch_religon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School getSchoolbyState(String sch_state) {
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
		// TODO Auto-generated method stub
		return null;
	}

}
