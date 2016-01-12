package dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
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
		sessionFactory.getCurrentSession().delete(getSchoolbyId(sch_id).get(0));
	}
	
	@Override
	public List<School> getSchoolbyId(int sch_id) {
		Query query=sessionFactory.getCurrentSession().createQuery("from School  where sch_id =:sch_id");
		query.setInteger("sch_id", sch_id);
		return query.list();
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
	
	/**
	 *  custom search 
	 * 	search condition: schId, schName(like), schState(like), schZip
	 *  @param School school
	 *  @return List
	 */  
	public List<School> DynamicSearch(School school) {
		DetachedCriteria dc=DetachedCriteria.forClass(School.class);
		
		System.out.println("=============");
		System.out.println("school ID:"+school.getSchId());
		System.out.println("school name:"+school.getSchName());
		System.out.println("zip: "+school.getSchZip());
		System.out.println("State: "+school.getSchState());
		System.out.println("=============");
		
		if(school.getSchId()!=null){
			dc.add(Restrictions.eq("schId", school.getSchId()));
		}
		
		if(!school.getSchName().equals("")){
			dc.add(Restrictions.like("schName", school.getSchName()+"%"));
		}
		
		if(!school.getSchZip().equals("")){
			dc.add(Restrictions.like("schZip", school.getSchZip()+"%"));
		}
		
		if(!school.getSchState().equals("")){
			dc.add(Restrictions.like("schState", school.getSchState()+"%"));
		}
		
		Criteria criteria=dc.getExecutableCriteria(sessionFactory.getCurrentSession());
		System.out.println("dao empty?"+criteria.list().isEmpty());
		
		return criteria.list();
		//return null;
	
	}
	
}
