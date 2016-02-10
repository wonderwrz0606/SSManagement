package dao;

import java.util.List;

import bean.School;
import bean.Student;

public interface StudentDao {
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
	
	public List<Student> CriteriaSearch(Student student);
	public Student getStudentById(int id);
	
		
}
