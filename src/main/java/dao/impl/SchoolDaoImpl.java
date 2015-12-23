package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bean.School;
import dao.adapt.SchoolDaoAdapter;

@Repository
public class SchoolDaoImpl extends SchoolDaoAdapter{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addSchool(School school) {
		sessionFactory.getCurrentSession().save(school);
	}

	@Override
	public void updateSchool(School school) {
		sessionFactory.getCurrentSession().update(school);
	}

	@Override
	public void deleteSchool(int sch_id) {
		sessionFactory.getCurrentSession().delete(getSchoolbyId(sch_id));
	}

	@Override
	public School getSchoolbyId(int sch_id) {
		return (School) sessionFactory.getCurrentSession().get(School.class, sch_id);
	}	
	
	public List<School> getAllRoom() {
		return sessionFactory.getCurrentSession().createQuery("from School").list();
	}
}
