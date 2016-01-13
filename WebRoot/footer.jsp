<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="css/footer.css">
<footer>
	<div class="footer_container">
	 	<h1><a href="index.jsp">此处放Logo</a></h1>
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
</footer>