package service;

import java.util.Date;
import java.util.List;

import bean.School;

public interface SchoolService {
	public void addSchool(School school);
	public void updateSchool(School school);
	public void deleteSchool(int sch_id);
	public School getSchoolbyId(int sch_id);
	
	public List<School> getSchoolbyName(String sch_name);  
	public List<School> getSchoolbyState(String sch_state); 
	public List<School> getSchoolbyZipCode(String sch_zip);
	public List<School> getAllSchool();
	
	
	public School getSchoolbyReligon(String sch_religon);
	public School getSchoolbyDealLine(Date deadline);
	public School getSchoolbySat(int sch_Sat);
	public School getSchoolbyTuitionFee(int sch_fee);}
