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
	    <title>查询出错页面</title>
	    <link rel="stylesheet" href="css/reset.css">
	    <link rel="stylesheet" href="css/style.css">
	    <script src="js/prefixfree.min.js"></script>
  	</head>

	<!--  body  -->
  	<body>
		<%@include file="/header.jsp" %>
		<div class="container">
			<div>
				<span style="padding-left: 30%;">Ops! 出错啦，请核实您输入的信息是否有误，返回上一步继续操作。</span>
			</div>
			<br />
			<br />
			<div>
				<button type="submit" style="margin: 0px 41%;width: 15%;" onclick="location.href='school_management.jsp';""><span>返回上一步</span></button>
			</div>
		</div>
    	<%@include file="/footer.jsp" %>
    	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	</body>
	<!--  body  -->

</html>
