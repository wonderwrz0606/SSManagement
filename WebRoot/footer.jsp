<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
    + request.getServerName() + ":" + request.getServerPort()
    + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="css/footer.css">
<footer>
	<div class="container">
	 	<h1><a href="index.jsp">Logo</a></h1>
		<nav>
		  	<a href="#">首页</a>
	  	 	<a href="#">登录系统</a>
	  	 	<a href="#">联系我们</a>
 	 	</nav>
 	</div>
</footer>