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
	    <title>school add</title>
	    <link rel="stylesheet" href="css/reset.css">
	    <link rel="stylesheet" href="css/style.css">
	    <script src="js/prefixfree.min.js"></script>
  	</head>

<!--  body  -->
  	<body>
		<%@include file="/header.jsp" %>
		<div class="container">
			<div>
				<span style="padding-left: 45%;">学校添加界面</span>
			</div>
			
			<form action="school/addSchool" method="post">
			<table class="school_search_table">
				<tbody>
					<tr>
						<td><input type="text"  class="school_search_li"/></td>
						<td><button type="submit"><span>名称缩写</span></button></td>
						<td><input type="text" name="schName" class="school_search_li"/></td>
						<td><button type="submit"><span>名称全拼</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="schWebsite" class="school_search_li"/></td>
						<td><button type="submit"><span>WebSite</span></button></td>
						<td><input type="text" name="schCity"class="school_search_li"/></td>
						<td><button type="submit"><span>City</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="schState" class="school_search_li"/></td>
						<td><button type="submit"><span>State</span></button></td>
						<td><input type="text" name="schZip"class="school_search_li"/></td>
						<td><button type="submit"><span>Zip</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>Zip Code</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>州</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>Zip Code</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>州</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>Zip Code</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>州</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>Zip Code</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>州</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>Zip Code</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>州</span></button></td>
					</tr>
					
					
				</tbody>
			</table>
			<div>
				<button  type="submit" style="margin: 0px 41%;width: 15%;"></button><span>添加学校</span>
			</div>
				</form>
			
			
		</div>
    
    <%@include file="/footer.jsp" %>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    
	</body>
<!--  body  -->

</html>
