<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
  
<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
	<head>  
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
	<title>登陆界面</title>
		<link rel="stylesheet" href="css/reset.css">
	    <link rel="stylesheet" href="css/style.css">
	      
	</head>  
	<body>  
	  	<%@include file="/header.jsp" %>
	  	
<%-- 	    <form action="../j_spring_security_check" method="post">  
	  
	        <p>  
	            <label for="j_username">Username</label> <input id="j_username"  
	                name="j_username" type="text" />  
	        </p>  
	  
	        <p>  
	            <label for="j_password">Password</label> <input id="j_password"  
	                name="j_password" type="password" />  
	        </p>  
	  
	        <input type="submit" value="Login" />  
	    </form>  
 --%>	  	
	  	<div class="container">
			<div>
				<span style="padding-left: 45%;">欢迎登陆管理系统</span>
				<div id="login-error">${error}</div>  
			</div>
			<form action="../j_spring_security_check" method="post">
			<table class="login">
				<tbody>
					<tr>
						<td><label for="j_username"><span>用户名：</span></label></td>
						<td><input type="text" name="j_username" id="j_username" class="school_search_li"/></td>
					</tr>
					<tr>
						<td><label for="j_password"><span>密码：</span></label></td>
						<td><input type="text" name="j_password" id="j_password" class="school_search_li"/></td>
					</tr>
				</tbody>
			</table>
			
			<button type="submit" style="margin: 0px 41%;width: 15%;"><span>登陆</span></button>
				<div style="margin:3% 40%;">
					<p>备注</p>
	  				<p>Role1: admin PW: admin</p>
	  				<p>Role2: user PW: user</p>
				</div>
			</form>
		</div>
	  	<%@include file="/footer.jsp" %>
	  	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	</body>  
</html>  