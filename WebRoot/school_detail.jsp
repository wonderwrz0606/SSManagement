<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
    + request.getServerName() + ":" + request.getServerPort()
    + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
	<head>
	    <title>删除学校</title>
	    <link rel="stylesheet" href="css/reset.css">
	    <link rel="stylesheet" href="css/style.css">
	    <script src="js/prefixfree.min.js"></script>
  	</head>

<!--  body  -->
  	<body>
		<%@include file="/header.jsp" %>
		<div class="container">
			<div>
				<span style="padding-left: 45%;">学校详细信息</span>
			</div>
			
			<table>
			<thead>
				<tr>
					<th>项目</th>
					<th>详细信息</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${schoolList}" var="school">
				<tr>
					<td><strong>ID</strong></td>
					<td>${school.schId }</td>
				</tr>
				<tr>
					<td><strong>申请截止</strong></td>
					<td><fmt:formatDate value="${school.deadLine}" pattern="MMM-dd"/></td>
				</tr>
				<tr>
					<td><strong>名称</strong></td>
					<td>${school.schName }</td>
				</tr>
				<tr>
					<td><strong>网址</strong></td>
					<td>${school.schWebsite }</td>
				</tr>
				<tr>
					<td><strong>城市</strong></td>
					<td>${school.schCity }</td>
				</tr>
				<tr>
					<td><strong>州</strong></td>
					<td>${school.schState }</td>
				</tr>
				<tr>
					<td><strong>Zip Code</strong></td>
					<td>${school.schZip }</td>
				</tr>
				<tr>
					<td><strong>建校年份</strong></td>
					<td>${school.schEst }</td>
				</tr>
				<tr>
					<td><strong>学生人数</strong></td>
					<td>${school.schCap }</td>
				</tr>
				<tr>
					<td><strong>招生年级</strong></td>
					<td>${school.schGrade }</td>
				</tr>
				<tr>
					<td><strong>师生比</strong></td>
					<td>${school.schPtRatio }</td>
				</tr>
				<tr>
					<td><strong>性质</strong></td>
					<td>${school.schType }</td>
				</tr>
				<tr>
					<td><strong>宗教</strong></td>
					<td>${school.schReligon }</td>
				</tr>
				<tr>
					<td><strong>中国学生人数</strong></td>
					<td>${school.schChnPop }</td>
				</tr>
				<tr>
					<td><strong>Toefl</strong></td>
					<td>${school.schTf }</td>
				</tr>
				<tr>
					<td><strong>申请期限</strong></td>
					<td><fmt:formatDate value="${school.deadLine }" pattern="MMM-dd"/></td>
				</tr>
				<tr>
					<td><strong>申请期限String</strong></td>
					<td>${school.IOdeadLine }</td>
				</tr>
				<%-- <tr>
				      	<td><strong>AP</strong></td>
				      	<td>${school. }</td>
				    </tr>
				    <tr>
				      	<td><strong>运动</strong></td>
				      	<td>${school. }</td>
				    </tr> --%>
				<tr>
					<td><strong>社团</strong></td>
					<td>${school.schGroup }</td>
				</tr>
				<tr>
					<td><strong>住宿</strong></td>
					<td>${school.schResFee }</td>
				</tr>
				<tr>
					<td><strong>押金</strong></td>
					<td>${school.schDeps }</td>
				</tr>
				<tr>
					<td><strong>学费</strong></td>
					<td>${school.schFee }</td>
				</tr>
				<tr>
					<td><strong>总计</strong></td>
					<td>${school.totalFee }</td>
				</tr>
				<tr>
					<td><strong>特点</strong></td>
					<td>${school.schDes }</td>
				</tr>
				<tr>
					<td><strong>备注</strong></td>
					<td>${school.comment }</td>
				</tr>							
			</tbody>
			
		</table>
		
			<div>
				<sec:authorize access="hasRole('Admin')">
				<button type="submit"
						onclick="window.location.href='getSchoolById?schId=${school.schId }'"
						style="margin: 0px 41%;width: 15%;">
						<span>修改学校</span>
				</button>
				 </sec:authorize>
			</div>
		</div>
		</c:forEach>
    
   
    	<%@include file="/footer.jsp" %>
    	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	</body>
<!--  body  -->

</html>
