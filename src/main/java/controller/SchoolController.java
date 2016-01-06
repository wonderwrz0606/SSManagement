package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.SchoolService;
import bean.School;

@Controller
//@RequestMapping(value="school")
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
	 *  prepare school information to addSchool(school_detail.jsp), final check before save.
	 * @param school
	 * @return 
	 */
	@RequestMapping(value="preSaveSchool",method= RequestMethod.POST)
	public ModelAndView preSaveSchool(
			@RequestParam String action,
			@RequestParam String input,
			@ModelAttribute School school){
		System.out.println(action+" "+input);
		ModelAndView mv=new ModelAndView("school_detail");
		mv.addObject("school", school);
		return mv;
	}
	
	/**
	 * 
	 * @param school
	 * @return testPage/ListSchool.jsp
	 */
	@RequestMapping(value="getSchool",method=RequestMethod.GET)
	public ModelAndView getSchoolById(
			@RequestParam String select,
			@RequestParam String input,
//			@RequestParam String inputId,
//			@RequestParam String inputName,
//			@RequestParam String inputZip,
//			@RequestParam String inputState,
			@ModelAttribute School school){
		//ModelAndView mv=new ModelAndView("testPage/ListSchool");//for testing
		ModelAndView mv=new ModelAndView("school_detail");
		
		switch(select.toLowerCase()){
		// Search By Id
		case "id":
			
			List<School> schoolList=schoolService.getSchoolbyId(Integer.parseInt(input));
			
			// return to xxx page if result is null.
			if(schoolList.isEmpty()){
				mv=new ModelAndView("index");
				break;
			}
			mv.addObject("schoolList", schoolList);
			break;
			
		// Search by school name	
		case "name":
			//List<School> schoolList=schoolService.getSchoolbyName(inputName);
			schoolList=schoolService.getSchoolbyName(input);
			mv.addObject("schoolList", schoolList);
			break;
			
		// Search by school state	
		case "state":
			//schoolList=schoolService.getSchoolbyState(inputState);
			schoolList=schoolService.getSchoolbyState(input);
			mv.addObject("schoolList", schoolList);
			break;
			
		//Seach by school zipcode
		case "zip":
			
			//schoolList=schoolService.getSchoolbyZipCode(inputZip);
			schoolList=schoolService.getSchoolbyZipCode(input);
			mv.addObject("schoolList", schoolList);
			break;
		
		}
		
		return mv;
	}
	
	@RequestMapping(value="searchSchool" ,method=RequestMethod.GET)
	public ModelAndView searchSchool(
			@ModelAttribute School school
			){
		ModelAndView mv=new ModelAndView("school_detail");
		
		List<School> schoolList=schoolService.DynamicSearch(school);
		
		mv.addObject("schoolList", schoolList);		
		for(int i=0;i<schoolList.size();i++){
			School s=(School) schoolList.get(i);
			System.out.println("id: "+s.getSchId());
			System.out.println("name: "+s.getSchName());
			System.out.println("zip: "+s.getSchZip());
			System.out.println("state: "+s.getSchState());
		}
		
		return mv;
		
		
	}
	
	
	
}
