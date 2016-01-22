<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Test.jsp' starting page</title>


</head>

<body>

	<form action="addSchool" method="post">
		<table>

			<tr>
				<td>School Name:</td>
				<td><input type="text" name="schName"></td>
			</tr>
			<tr>
				<td>School WebSite:</td>
				<td><input type="text" name="schWebsite"></td>
			</tr>
			<tr>
				<td>Action:</td>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
	<form action="getSchool">
	Search By:<select name="select">
    <option value="name">School Name</option>
    <option value="id">School ID</option>
    <option value="state">School State</option>
     <option value="zip">School ZipCode</option>
  </select>
  <input type="text" name="input" >
  <input type="submit" value="submit">
	</form>
	
	<h1>Add School Test</h1>
	<form action="addSchool" method="post">
		DeadLine <input type="month"  name="time_deadline">
		School Name:<input type="text" name="schName"  >
	  <input type="submit" value="submit">
		</form>
		
		<h1>update Test</h1>
		<!-- <form action="updateSchool" method="post">
		School Name:<input type="text" name="schName">
	  <input type="submit" value="submit">
		</form> -->
		
	 <h1>TIME TEST</h1>
	<form action="testTime" >
	time:<input type="date"  name="IOdeadLine"   >
	<input type="submit" value="submit"  >
	</form>
	
	<!-- <a style="text-decoration: none;" href="school/123"><li class="school_management_li">
					<label class="school_management_label">URL</label> -->
	
	<form action="school/get">
		INPUT:<input type="text" name="id">
		<input type="submit" value="submit">
	</form>
	
</body>
</html>
