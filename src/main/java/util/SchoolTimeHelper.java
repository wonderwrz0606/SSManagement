package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import bean.School;

@Component
public class SchoolTimeHelper {
	
	
	/**
	 * yyyy-MM-dd
	 * 
	 * @param school 
	 * @return 
	 * @throws ParseException 
	 */
	public  void String2Date(School school) throws ParseException{
		
		// 构造器必须为yyyy-MM-dd 这样保存到数据库的Date格式才能正确显示
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		// 把string 日期，转为 Date日期，并且格式为 yyyy-MM ，后面的日和时间都以0 代替
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
		
		//先判断IOdeadLine是否有数值 ， 
		//再判断IOdeadLine 是否为（""）
		if(school.getIOdeadLine()!=null){
			if(!school.getIOdeadLine().equals("")){
				Date deadLine = formatter.parse(school.getIOdeadLine());
				System.out.println("deadLine:" +deadLine);
				school.setDeadLine(deadLine);
			}
		}
			
	}


/**
 *  输出格式为  MM-dd
 * 
 * 
 * @param school
 */
	public void Date2String_School(School school){
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd");
		
		String IOdeadLine=formatter.format(school.getDeadLine());
		
		school.setIOdeadLine(IOdeadLine);
		
	}

}
