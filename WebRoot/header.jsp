<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="css/header.css">
<header>
	<div class="header_container">
	 	<h1><a href="index.jsp">此处放Logo</a></h1>
	 	<sec:authorize access="isAuthenticated()">
    		<sec:authentication var="user" property="name" />
		</sec:authorize>
 		<sec:authentication var="level" property="authorities" />
		<span class="login_name">
			<c:if test="${user ne null}">
      				Welcome : ${user}
   			</c:if>
   			
		</span>
		<nav>
			<!-- 管理员权限 -->
			<sec:authorize access="hasRole('Admin')">
			<a href="user_management.jsp">权限管理</a>
			</sec:authorize>
	  		<a href="application_management.jsp">申请管理</a>
  	 		<a href="student_management.jsp">学生管理</a>
  	 		<a href="school_management.jsp">学校管理</a>
  	 		<!-- logout路径在security-context.xml里配置 -->
  	 		<a href="logout">退出</a>
 	 	</nav>
 	</div>
</header>