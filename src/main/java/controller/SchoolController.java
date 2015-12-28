package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.SchoolService;
import bean.School;

@Controller
@RequestMapping(value="school")
public class SchoolController {
	
	
	@Autowired
	private SchoolService schoolService;
	
	/**
	 * 
	 * @param school
	 * @return  url: index.jsp
	 */
	@RequestMapping(value="addSchool",method= RequestMethod.POST)
	public ModelAndView saveSchool(
			@ModelAttribute School school){
		ModelAndView mv=new ModelAndView("index");
		
		schoolService.addSchool(school);
		return mv;
	}
	
	/**
	 * 
	 * @param school
	 * @return testPage/ListSchool.jsp
	 */
	@RequestMapping(value="getSchoolById",method=RequestMethod.GET)
	public ModelAndView getSchoolById(
			@ModelAttribute School school){
		ModelAndView mv=new ModelAndView("testPage/ListSchool");
		
		school=schoolService.getSchoolbyId(15);
		
		System.out.println("school Name: "+school.getSchName());
		
		return mv;
	}
}
