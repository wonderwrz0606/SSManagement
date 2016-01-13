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
	    <title>修改用户</title>
	    <link rel="stylesheet" href="css/reset.css">
	    <link rel="stylesheet" href="css/style.css">
	    <script src="js/prefixfree.min.js"></script>
  	</head>

<!--  body  -->
  	<body>
		<%@include file="/header.jsp" %>
		<div class="container">
			<div>
				<span style="padding-left: 45%;">用户修改界面</span>
			</div>
			<form action="XXX" method="post">
			<table class="school_search_table_multi">
				<tbody>
					<tr>
						<td colspan="4">
							<span style="padding-left: 36%;">请输入您要查询的用户ID</span>
						</td>
					</tr>
					<tr>
						<td><input type="text" name="schId" class="school_search_li"/></td>
						<td><input type="submit" name="submit" value="查询ID" class="school_search_li"></td>
					</tr>
				</tbody>
			</table>
			</form>
			<div>
			<br>
			</div>
			
			
			<form action="school/addSchool" items="${school }">
			<table class="school_search_table_multi">
				<tbody>
					<tr>
						<td><input type="text" name=schName class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">名称</span></div></td>
						<td><input type="text" name="schShort" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">权限</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name=input class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">性别</span></div></td>
						<td><input type="text" name="schWebsite" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">生日</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schCity"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">街道</span></div></td>
						<td><input type="text" name="schState" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">城市</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schZip"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">州</span></div></td>
						<td><input type="text" name="schEst" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">国籍</span></div></td>
					</tr>
				</tbody>
			</table>
			</form>
			<div>
				<button type="submit" onclick="window.location.href='school_management.jsp'"  style="margin: 0px 41%;width: 15%;"><span>确认修改</span></button>
			</div>
			<!-- </form> -->
		</div>
    
   	 	<%@include file="/footer.jsp" %>
    	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	</body>
<!--  body  -->

</html>
