package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bean.School;
import dao.adapt.SchoolDaoAdapter;

@Repository
public class SchoolDaoImpl extends SchoolDaoAdapter{
	
	@Autowired
	private SessionFactory sessionFactory;
	
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
	
	
	/**
	 *  @param String sch_name
	 *  @return List
	 */ 
	public List<School> getSchoolbyName(String sch_name) {
		// name like: name  
		Query query=sessionFactory.getCurrentSession().createQuery("from School  where sch_name like:sch_name");
		query.setString("sch_name", sch_name+"%");
		return query.list();
	}
	
	
	/**	@param String sch_state
	 *  @return List
	 */
	public List<School> getSchoolbyState(String sch_state) {
		Query query=sessionFactory.getCurrentSession().createQuery("from School  where sch_state=:sch_state");
		query.setString("sch_state", sch_state);
		return query.list();
	}
	
	/**
	 * @param String sch_Zip
	 * @return List
	 * 
	 */
	public List<School> getSchoolbyZipCode(String sch_zip) {
			Query query=sessionFactory.getCurrentSession().createQuery("from School  where sch_zip=:sch_zip");
			query.setString("sch_zip", sch_zip);
			return query.list();
	}
	
	

	
	
	public List<School> getAllSchool() {
		return sessionFactory.getCurrentSession().createQuery("from School").list();
	}
}
