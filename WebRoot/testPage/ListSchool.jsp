<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ListSchool.jsp' starting page</title>
    
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
    <table>
    	<tr>
    		<td>School Name:</td>
    		<td>${school.schName }</td>
    		
    	<tr>
    	<tr>
    		<td>School WebSite:</td>
    		<td>${school.schWebsite }</td>
    	<tr>
    	<tr>
    	<td>ID</td>
    	<td>Name:</td>
    	<td>WebSite:</td>
    	<td>ZipCode</td>
    	<td>State</td>
    </tr>
    <c:forEach items="${schoolList }" var="school">
    	<tr>
    		<td>${school.schId }</td>
    		<td>${school.schName }</td>
    		<td>${school.schWebsite }</td>
    		<td>${school.schState }</td>
    		<td>${school.schZip }</td>
    	</tr>
    </c:forEach>
    </table>
  </body>
</html>
