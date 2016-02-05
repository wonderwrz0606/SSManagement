package controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.SchoolService;
import util.SchoolTimeHelper;
import bean.School;

@Controller
// @RequestMapping(value="school")
public class SchoolController {

	@Autowired
	private SchoolService schoolService;

	@Autowired
	private SchoolTimeHelper schoolTimeHelper;

	/**
	 * @param time_deadline
	 *            it's only use for time associate.
	 * @param school
	 * @return url: index.jsp
	 * @throws ParseException
	 */
	@RequestMapping(value = "addSchool", method = RequestMethod.POST)
	public ModelAndView saveSchool(@ModelAttribute School school)
			throws ParseException {
		ModelAndView mv = new ModelAndView("success");

		schoolTimeHelper.String2Date(school);
		
		System.out.println("SchoolController " + school.getSchName());
		schoolService.addSchool(school);

		return mv;
	}	

	/**
	 * prepare school information to addSchool(school_detail.jsp), final check
	 * before save.
	 * 
	 * @param school
	 * @return
	 */
	@RequestMapping(value = "preSaveSchool", method = RequestMethod.POST)
	public ModelAndView preSaveSchool(@RequestParam String action,
			@RequestParam String input, @ModelAttribute School school) {
		System.out.println(action + " " + input);
		ModelAndView mv = new ModelAndView("school_detail");
		mv.addObject("school", school);
		return mv;
	}

	// //@RequestMapping(value="getSchool",method=RequestMethod.GET)
	// public ModelAndView getSchoolById(
	// @RequestParam String select,
	// @RequestParam String input,
	// // @RequestParam String inputId,
	// // @RequestParam String inputName,
	// // @RequestParam String inputZip,
	// // @RequestParam String inputState,
	// @ModelAttribute School school){
	// //ModelAndView mv=new ModelAndView("testPage/ListSchool");//for testing
	// ModelAndView mv=new ModelAndView("school_detail");
	//
	// switch(select.toLowerCase()){
	// // Search By Id
	// case "id":
	//
	// List<School>
	// schoolList=schoolService.getSchoolbyId(Integer.parseInt(input));
	//
	// // return to xxx page if result is null.
	// if(schoolList.isEmpty()){
	// mv=new ModelAndView("index");
	// break;
	// }
	// mv.addObject("schoolList", schoolList);
	// break;
	//
	// // Search by school name
	// case "name":
	// //List<School> schoolList=schoolService.getSchoolbyName(inputName);
	// schoolList=schoolService.getSchoolbyName(input);
	// mv.addObject("schoolList", schoolList);
	// break;
	//
	// // Search by school state
	// case "state":
	// //schoolList=schoolService.getSchoolbyState(inputState);
	// schoolList=schoolService.getSchoolbyState(input);
	// mv.addObject("schoolList", schoolList);
	// break;
	//
	// //Seach by school zipcode
	// case "zip":
	//
	// //schoolList=schoolService.getSchoolbyZipCode(inputZip);
	// schoolList=schoolService.getSchoolbyZipCode(input);
	// mv.addObject("schoolList", schoolList);
	// break;
	// }
	//
	// return mv;
	// }

	/**
		 * input from school_brief.jsp get school detail by school id.
		 * 
		 * @param schId
		 * @return school_detail.jsp
		 */
		@RequestMapping(value = "getSchoolDetail")
		public ModelAndView getSchoolDetail(@RequestParam int schId) {
			ModelAndView mv = new ModelAndView("school_detail");
			System.out.println("SchId:" + schId);
	
			School school = new School();
			school.setSchId(schId);
	//		school.setSchName("");
	//		school.setSchZip("");
	//		school.setSchState("");
	//		school.setIOdeadLine("");
			List<School> schoolList = schoolService.DynamicSearch(school);
	
			mv.addObject("schoolList", schoolList);
	
			return mv;
		}

	/**
	 * 
	 * input schId, return schoolList to school_update.jsp ,to display the
	 * update information.
	 * 
	 * @param schId
	 * 
	 * @return school object , school_update.jsp
	 * 
	 */
	@RequestMapping(value = "getSchoolById", method = RequestMethod.GET)
	public ModelAndView getSchoolById(@RequestParam int schId) {
		ModelAndView mv = new ModelAndView("school_update");

		// 因为id查询的结果只有一个，于是直接返回school对象
		List<School> schoolList = schoolService.getSchoolbyId(schId);
		if (!schoolList.isEmpty()) {
			School school = schoolList.get(0);

			// schoolTimeHelper.Date2String_School(school);

			// System.out.println(school.getIOdeadLine());

			mv.addObject("school", school);
		} else {
			return new ModelAndView("error");
		}

		return mv;
	}

	/**
	 * 
	 * powerful dynamic search , multip input, custom criteria
	 * 
	 * @param school
	 * @return school_brief.jsp
	 * @throws ParseException
	 */
	@RequestMapping(value = "searchSchool", method = RequestMethod.POST)
	public ModelAndView searchSchool(@ModelAttribute School school)
			throws ParseException {
		
		//error page
		ModelAndView mv = new ModelAndView("error");

		schoolTimeHelper.String2Date(school);
		
		System.out.println("IO:"+school.getIOdeadLine());
		System.out.println("deadLine"+school.getDeadLine());
	
		List<School> schoolList = schoolService.DynamicSearch(school);

		if (!schoolList.isEmpty()) {

			mv = new ModelAndView("school_brief");

			mv.addObject("schoolList", schoolList);
		}

		return mv;

	}

	/**
	 * List all School.
	 * 
	 * @return
	 */
	@RequestMapping("listSchool")
	public ModelAndView listSchool() {

		ModelAndView mv = new ModelAndView("school_brief");

		List<School> schoolList = schoolService.getAllSchool();

		mv.addObject("schoolList", schoolList);

		return mv;
	}

	/**
	 * update school
	 * 
	 * 更新成功后返回当前页面
	 * 
	 * @throws ParseException
	 * 
	 */
	@RequestMapping(value = "updateSchool", method = RequestMethod.POST)
	public ModelAndView updateSchool(@ModelAttribute School school)
			throws ParseException {
		ModelAndView mv = new ModelAndView("school_update");
	
		schoolTimeHelper.String2Date(school);
	
		schoolService.updateSchool(school);
	
		mv.addObject("update_notice", "update success");
	
		return mv;
	}
}
