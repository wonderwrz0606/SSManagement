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
	    <title>删除用户</title>
	    <link rel="stylesheet" href="css/reset.css">
	    <link rel="stylesheet" href="css/style.css">
	    <script src="js/prefixfree.min.js"></script>
  	</head>

<!--  body  -->
  	<body>
		<%@include file="/header.jsp" %>
		<div class="container">
			<div>
				<span style="padding-left: 45%;">用户删除界面</span>
			</div>
			<table class="school_search_table_multi">
				<tbody>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">ID</span></div></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">名称</span></div></td>
					</tr>
				</tbody>
			</table>
			<div>
				<button type="submit" onclick="window.location.href='school_management.jsp'"  style="margin: 0px 41%;width: 15%;background-color:red;color:white;"><span>确认删除</span></button>
			</div>
		</div>
    
    	<%@include file="/footer.jsp" %>
    	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	</body>
<!--  body  -->

</html>
