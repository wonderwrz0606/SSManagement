package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="login")
public class LoginController {
	
	@RequestMapping(value="testLogin")
	public String testLogin(){
		return "testPage/ListSchool";
	}
}
