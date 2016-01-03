<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
    + request.getServerName() + ":" + request.getServerPort()
    + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <title>添加学校</title>
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
			
			<form name="test" action="addSchool" method="post"> 
			<table class="school_search_table_multi">
				<tbody>
					<tr>
						<td><input type="text" name=schName class="school_search_li"/></td>
						<td><button><span>名称</span></button></td>
						<td><input type="text" name="schShort" class="school_search_li"/></td>
						<td><button><span>简称</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name=input class="school_search_li"/></td>
						<td><button  name="action"  value="xx"><span>xx</span></button></td>
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
						<td><input type="text" name="schEst" class="school_search_li"/></td>
						<td><button ><span>建校年份</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="schCap" class="school_search_li"/></td>
						<td><button ><span>学生人数</span></button></td>
						<td><input type="text" name="schGrade" class="school_search_li"/></td>
						<td><button ><span>招生年级</span></button></td>
					</tr>
					<tr>
					                                <!-- 加入百分号 -->
						<td><input type="text" name="schPtRatio" class="school_search_li"/></td>
						<td><button ><span>师生比</span></button></td>
						<td><input type="text" name="schType" class="school_search_li"/></td>
						<td><button ><span>性质</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="schReligon" class="school_search_li"/></td>
						<td><button ><span>宗教</span></button></td>
						<td><input type="text" name="schEsl" class="school_search_li"/></td>
						<td><button ><span>ESL</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="schChnPop" class="school_search_li"/></td>
						<td><button ><span>中国学生人数</span></button></td>
						<td><input type="text" name="schSat" class="school_search_li"/></td>
						<td><button ><span>SAT</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="schTf" class="school_search_li"/></td>
						<td><button ><span>Toefl</span></button></td>
						<td><input type="text" name="" class="school_search_li"/></td>     <!-- data bug -->
						<td><button ><span>申请期限</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="" class="school_search_li"/></td>		<!-- data bug -->
						<td><button ><span>开学时间</span></button></td>
						<td><input type="text" name="schGroup" class="school_search_li"/></td>
						<td><button ><span>社团</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="schResType" class="school_search_li"/></td>
						<td><button ><span>住宿安排</span></button></td>
						<td><input type="text" name="schResFee" class="school_search_li"/></td>
						<td><button ><span>住宿费用</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="schDeps" class="school_search_li"/></td>
						<td><button ><span>押金</span></button></td>
						<td><input type="text" name="schFee" class="school_search_li"/></td>
						<td><button ><span>学费</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="totalFee" class="school_search_li"/></td>
						<td><button ><span>总计</span></button></td>
						<td><input type="text" name="schDes" class="school_search_li"/></td>
						<td><button ><span>特点</span></button></td>
					</tr>
					<tr>
						<td><input type="text" name="comment"class="school_search_li"/></td>
						<td><button ><span>备注</span></button></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><button ><span>备注2</span></button></td>
					</tr>
				</tbody>
			</table>
			<div>
				<button type="submit"  style="margin: 0px 41%;width: 15%;"><span>确认添加</span></button>
			</div>
			 </form>
		</div>
		
    	<%@include file="/footer.jsp" %>
    	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	</body>
<!--  body  -->

</html>
