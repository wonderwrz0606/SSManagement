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
	    <meta charset="UTF-8">
	    <title>school management</title>
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
			<table class="school_search_table">
				<tbody>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit" onclick="window.location.href='school_detail.jsp'"><span>按ID查询</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>按名称查询</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>按Zip Code查询</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>按州查询</span></button></td>
					</tr>
				</tbody>
			</table>
			
		</div>
    
    <%@include file="/footer.jsp" %>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    
	</body>
<!--  body  -->

</html>
