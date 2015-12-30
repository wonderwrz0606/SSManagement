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
	    <title>查询学校</title>
	    <link rel="stylesheet" href="css/reset.css">
	    <link rel="stylesheet" href="css/style.css">
	    <script src="js/prefixfree.min.js"></script>
  	</head>

<!--  body  -->
  	<body>
		<%@include file="/header.jsp" %>
		<div class="container">
			<div>
				<span style="padding-left: 45%;">学校查询界面</span>
			</div>
			<form action="getSchool">
			<table class="school_search_table">
				<tbody>
					<tr>
						<td><input type="text" name="inputId" value="" class="school_search_li"/></td>
						<td><button type="submit" name="select" value="id"><span>ID</span></button></td>
						<td><input type="text" name="inputName" value="" class="school_search_li"/></td>
						<td><button type="submit" name="select" value="name"><span>名称</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="inputZip" value="" class="school_search_li"/></td>
						<td><button type="submit" name="select" value="zip"><span>Zip Code</span></button></td>
						<td><input type="text" name="inputState" value="" class="school_search_li"/></td>
						<td><button type="submit" name="select" value="state"><span>州</span></button></td>
					</tr>
				</tbody>
			</table>
			</form>
			<div>
				<button type="submit" onclick="window.location.href='school_detail.jsp'"  style="margin: 0px 41%;width: 15%;"><span>查询</span></button>
			</div>
		</div>
    
    	<%@include file="/footer.jsp" %>
    	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	</body>
<!--  body  -->

</html>
