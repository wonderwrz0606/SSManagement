package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.SchoolService;
import bean.School;

@Controller
@RequestMapping(value="school")
public class LoginController {
	
	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping(value="testLogin")
	public String testLogin(){
		return "testPage/ListSchool";
	}
	
	
	@RequestMapping(value="{id}",  method = RequestMethod.GET)
	public @ResponseBody List getSchoolInJSON(
			@PathVariable Integer id
			){
		String s="hello world";
		
		
		
		return schoolService.getAllSchool();
	}
	
	
	@RequestMapping(value="get",  method = RequestMethod.GET)
	public @ResponseBody List getSchoolByIdInJSON(
			@PathVariable Integer id
			){
		
		schoolService.getSchoolbyId(id);
		
		
		return schoolService.getSchoolbyId(id);
	}
}
