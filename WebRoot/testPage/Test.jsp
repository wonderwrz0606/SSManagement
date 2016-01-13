<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Test.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

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
	School Name:<input type="text" name="schName"  >
  <input type="submit" value="submit">
	</form>
	
	<h1>update Test</h1>
	<!-- <form action="updateSchool" method="post">
	School Name:<input type="text" name="schName">
  <input type="submit" value="submit"> -->
	</form>

</body>
</html>
