<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
		<table id="sortable">
			<thead>
	    		<tr>
					<th class="school_search_list">ID:</th>
					<th class="school_search_list" style="width:24%;">School Name:</th>
					<th class="school_search_list"style="width:15%;">申请截止</th>
					<th class="school_search_list">SSAT:</th>
					<th class="school_search_list">School State:</th>
					<th class="school_search_list">Min TOEFL Score:</th>
					<th class="school_search_list">Application Season</th>
					<th class="school_search_list">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${schoolList }" var="school">
					<tr>
						<td>${school.schId }</td>
						<td>${school.schName }</td>
						<td><fmt:formatDate value="${school.deadLine }" pattern="MMM-dd"/></td>
						<td>
							<c:choose>
								<c:when test="${school.schSsat == 1}">
	       							有
	   		 					</c:when>
	   		 					<c:otherwise>
	        						无
	    						</c:otherwise>
							</c:choose>
						</td>
						<%-- <td>${school.schSsat}</td> --%>
						<td>${school.schState }</td>
						<td>${school.schTf }</td>
						<td>${school.schSeason }</td>
						<td><a href="getSchoolDetail?schId=${school.schId }">More</a></td>
					</tr>
		    	</c:forEach>
	    	</tbody>
	    </table>
    </div>
    <%@include file="/footer.jsp" %>
    
	<script type="text/javascript">
		var TSort_Data = new Array ('sortable', 'i', 's', 'd','s','s','i','','');
		tsRegister();
	</script>
    <script type="text/javascript" src="js/gs_sortable.js"></script>
  </body>
  <!--  body  -->
  
</html>
