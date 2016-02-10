package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.SchoolService;
import bean.School;

@Controller
@RequestMapping(value="school")
public class RESTfulController {
	
	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping(value="testLogin")
	public String testLogin(){
		return "testPage/ListSchool";
	}
	
	
	@RequestMapping(value="all",  method = RequestMethod.GET)
	public @ResponseBody List getAllSchool(
			
			){
		String s="hello world";
		
		
		
		return schoolService.getAllSchool();
	}
	
	
	@RequestMapping(value="get/{id}",  method = RequestMethod.GET)
	public ResponseEntity<List<School>> getSchoolById(
			@PathVariable Integer id
			){
		
		//School school=schoolService.getSchoolbyId(id).get(0);
		
		List list=schoolService.getSchoolbyId(id);
		
		//if (school==null) {
		if (list.isEmpty()) {	
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<List<School>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<School>>(list,HttpStatus.OK);
		//return schoolService.getSchoolbyId(id);
	}
	
	
	
	@RequestMapping(value="create",method=RequestMethod.POST)
	public @ResponseBody void saveSchool(
			@RequestBody School school
			){
		
		schoolService.addSchool(school);
		
		
	}
	
	
	@RequestMapping(value="delete/{id}" ,method=RequestMethod.DELETE)
	public ResponseEntity<List> deleteSchoolById(
			@PathVariable Integer id
			){
		
		List list=schoolService.getSchoolbyId(id);
		
		if(list.isEmpty()){
			System.out.println("Unable to delete. User with id " + id + " not found");
			
			return new ResponseEntity<List>(list,HttpStatus.NOT_FOUND);
		}
		
		schoolService.deleteSchool(id);
		
		return new ResponseEntity<List>(HttpStatus.NO_CONTENT);
	}
}
