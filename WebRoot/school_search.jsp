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
			<form action="searchSchool">
			<!-- <table class="school_search_table_multi">
				<tbody>
					<tr>
						<td><input type="text" name="inputId" value="" class="school_search_li"/></td>
						<td><button type="submit" name="select" value="id"><span>ID</span></button></td>
						<td><input type="text" name="inputName" value="" class="school_search_li"/></td>
						<td><button type="submit" name="select" value="name"><span>名称</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="inputZip" value="" class="school_search_li"/></td>
						<td><button type="submit" name="select" value="zip"><span>Toefl</span></button></td>
						<td><input type="text" name="inputState" value="" class="school_search_li"/></td>
						<td><button type="submit" name="select" value="state"><span>州</span></button></td>
					</tr>
				</tbody>
			</table> -->
			
			<table class="school_search_table_multi">
				<tbody>
					<tr>
						<td><input type="text" name="schId"  class="school_search_li"/></td>
						<td><button type="submit" ><span>ID</span></button></td>
						<td><input type="text" name="schName"  class="school_search_li"/></td>
						<td><button type="submit" ><span>名称</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="schZip"  class="school_search_li"/></td>
						<td><button type="submit" ><span>Toefl</span></button></td>
						<td><input type="text" name="schState"  class="school_search_li"/></td>
						<td><button type="submit" ><span>州</span></button></td>
					</tr>
				</tbody>
			</table>
			
			<!-- <table class="school_search_table_single">
				<tbody>     
					<tr>
						<td><input type="text" name="input" class="school_search_li"/></td>
						<td>
							<select name="select" class="select_drop_down">	
	  							<option value="id">ID</option>
	  							<option value="name">名字</option>
	  							<option value="state">State</option>
	  							<option value="zip">Zip code</option>
							</select>
						</td>
					</tr>
				</tbody>
			</table> -->
			
			<div>
				<button type="submit" style="margin: 0px 41%;width: 15%;" onclick=""><span>查询</span></button>
			</div>
			</form>
		</div>
             <table>
				<tr>
				<form action="listSchool">
					<button>List All School</button>
				</form>
			</tr>
			</table>
    	<%@include file="/footer.jsp" %>
    	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	</body>
<!--  body  -->

</html>
