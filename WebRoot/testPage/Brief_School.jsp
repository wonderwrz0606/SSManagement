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
    <%-- <base href="<%=basePath%>"> --%>
    
    <title>School List</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="css/reset.css">
	<link rel="stylesheet" href="css/style.css">

  </head>
  
	<!--  body  -->  
	<body>
	<%@include file="/header.jsp" %>
	<div class="container">
		<table>
			<thead>
	    		<tr>
					<th class="school_search_list">ID:</th>
					<th class="school_search_list" style="width:35%;">School Name:</th>
					<th class="school_search_list">School Web:</th>
					<th class="school_search_list">School State:</th>
					<th class="school_search_list">School ZipCode:</th>
					<th class="school_search_list"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${schoolList }" var="school">
					<tr>
						<td>${school.schId }</td>
						<td>${school.schName }</td>
						<td>${school.schWebsite }</td>
						<td>${school.schState }</td>
						<td>${school.schZip }</td>
						<td><a href="getSchoolDetail?schId=${school.schId }">More</a></td>
					</tr>
		    	</c:forEach>
	    	</tbody>
	    </table>
    </div>
    <%@include file="/footer.jsp" %>
  </body>
  <!--  body  -->
  
</html>
