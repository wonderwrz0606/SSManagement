package userTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.userdetails.User;

import service.UserService;

public class UserTest {
	static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	static UserService userService=(UserService) context.getBean("userService");
	
	@Test
	public void testGetUserbyId(){
		
		bean.User user=userService.getUser(2);
		
		System.out.println(user.getUsername());
	}
	
	
	
}
