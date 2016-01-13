<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page import="java.io.*,java.util.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
    + request.getServerName() + ":" + request.getServerPort()
    + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
	<head>
	    <title>用户管理</title>
	    <link rel="stylesheet" href="css/reset.css">
	    <link rel="stylesheet" href="css/style.css">
	    <script src="js/prefixfree.min.js"></script>
  	</head>

<!--  body  -->
  	<body>
		<%@include file="/header.jsp" %>
		<div class="container">
			<ul class="school_management">
				<a style="text-decoration: none;" href="user_search.jsp"><li class="school_management_li">
					<label class="school_management_label">查询用户</label>
				</li></a>
				<a style="text-decoration: none;" href="user_add.jsp"><li class="school_management_li">
					<label class="school_management_label">增加用户</label>
				</li></a>
				<a style="text-decoration: none;" href="user_update.jsp"><li class="school_management_li">
					<label class="school_management_label">修改用户</label>
				</li></a>
				<a style="text-decoration: none;" href="user_delete.jsp"><li class="school_management_li">
					<label class="school_management_label">删除用户</label>
				</li></a>	
			</ul>	
		</div>
    <%@include file="/footer.jsp" %>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    
	</body>
<!--  body  -->

</html>
