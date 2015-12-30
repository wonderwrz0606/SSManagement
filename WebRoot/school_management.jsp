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
	    <title>学校管理</title>
	    <link rel="stylesheet" href="css/reset.css">
	    <link rel="stylesheet" href="css/style.css">
	    <script src="js/prefixfree.min.js"></script>
  	</head>

<!--  body  -->
  	<body>
		<%@include file="/header.jsp" %>
		<div class="container">
			<ul class="school_management">
				<a style="text-decoration: none;" href="school_search.jsp"><li class="school_management_li">
					<label class="school_management_label">查询学校</label>
				</li></a>
				<!-- 控制用户访问权限 -->
				<sec:authorize access="hasRole('Admin')">
				<a style="text-decoration: none;" href="school_add.jsp"><li class="school_management_li">
					<label class="school_management_label">增加学校</label>
				</li></a>
				<a style="text-decoration: none;" href="school_update.jsp"><li class="school_management_li">
					<label class="school_management_label">修改学校</label>
				</li></a>
				<a style="text-decoration: none;" href="school_delete.jsp"><li class="school_management_li">
					<label class="school_management_label">删除学校</label>
				</li></a>	
				</sec:authorize>
			</ul>	
		</div>
    
    <%@include file="/footer.jsp" %>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    
	</body>
<!--  body  -->

</html>
