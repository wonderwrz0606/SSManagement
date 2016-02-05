<%@ page language="java" contentType="text/html; charset=UTF-8"%>
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
	    <title>成功</title>
	    <link rel="stylesheet" href="css/reset.css">
	    <link rel="stylesheet" href="css/style.css">
	    <script src="js/prefixfree.min.js"></script>
  	</head>

	<!--  body  -->
  	<body>
		<%@include file="/header.jsp" %>
		<div class="container">
			<div>
				<span style="padding-left: 30%;">添加成功！</span>
			</div>
			<br />
			<br />
			<div>
				<button type="submit" style="margin: 0px 41%;width: 15%;" onclick="location.href='school_management.jsp';""><span>返回主页面</span></button>
			</div>
			<div>
				<button type="submit" style="margin: 0px 41%;width: 15%;" onclick="goBack()"><span>返回上一步</span></button>
			</div>
		</div>
    	<%@include file="/footer.jsp" %>
    	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	</body>
	<!--  body  -->
	
	<script>
		function goBack() {
   			window.history.back();
		}
	</script>

</html>
