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
	    <title>修改学校</title>
	    <link rel="stylesheet" href="css/reset.css">
	    <link rel="stylesheet" href="css/style.css">
	    <script src="js/prefixfree.min.js"></script>
  	</head>

<!--  body  -->
  	<body>
		<%@include file="/header.jsp" %>
		<div class="container">
			<div>
				<span style="padding-left: 45%;">学校修改界面</span>
			</div>
			<table class="school_search_table">
				<tbody>
					<tr>
						<td colspan="4">
							<span style="padding-left: 36%;">请输入您要查询的学校ID或者名称</span>
						</td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit" onclick="window.location.href='school_detail.jsp'"><span>按ID查询</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button type="submit"><span>按名称查询</span></button></td>
					</tr>
				</tbody>
			</table>
			
			<div>
			<br>
			</div>
			
			
			<!-- <form action="school/addSchool" method="post"> -->
			<table class="school_search_table">
				<tbody>
					<tr>
						<td><input type="text" name="schName" class="school_search_li"/></td>
						<td><button><span>名称</span></button></td>
						<td><input type="text" name="schWebsite" class="school_search_li"/></td>
						<td><button><span>网址</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="schCity"class="school_search_li"/></td>
						<td><button ><span>城市</span></button></td>
						<td><input type="text" name="schState" class="school_search_li"/></td>
						<td><button ><span>州</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="schZip"class="school_search_li"/></td>
						<td><button ><span>Zip Code</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>建校年份</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>学生人数</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>招生年级</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>师生比</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>性质</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>宗教</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>ESL</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>中国学生人数</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>SAT</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>Toefl</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>申请期限</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>AP</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>运动</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>社团</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>住宿安排</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>押金</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>学费</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>总计</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>特点</span></button></td>
					</tr>
					<tr>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>备注</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>备注2</span></button></td>
					</tr>
				</tbody>
			</table>
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
