<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
    + request.getServerName() + ":" + request.getServerPort()
    + path + "/";
%>

<!DOCTYPE html>
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
			<form action="getSchoolById" method="post">
			<table class="school_search_table_multi">
				<tbody>
					<tr>
						<td colspan="4">
							<span style="padding-left: 36%;">请输入您要查询的学校ID或者名称</span>
						</td>
					</tr>
					<tr>
						<td><input type="text" name="schId" class="school_search_li"/></td>
						<td><input type="submit" name="submit" value="请输入学校ID" class="school_search_li"></td>
					</tr>
				</tbody>
			</table>
			</form>
			<div>
			<br>
			</div>
			
			
			<form action="updateSchool" items="${school }" method="post">
			<table class="school_search_table_multi">
				<tbody>
					<tr><input type="hidden" name=schId value="${school.schId }">
					
						<td><input type="text" name=schName value="${school.schName }" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">名称</span></div></td>
						<td><input type="text" name="IOdeadLine" value="${school.deadLine }"  class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">DealLine</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schTf" value="${school.schTf }" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">TOEFL</span></div></td>
						<td><input type="text" name="schWebsite" value="${school.schWebsite }"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">网址</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schCity"value="${school.schCity }" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">城市</span></div></td>
						<td><input type="text" name="schState" value="${school.schState }" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">州</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schZip"value="${school.schZip }"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">Zip Code</span></div></td>
						<td><input type="text" name="schEst" value="${school.schEst }"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">建校年份</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schCap" value="${school.schCap }"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">学生人数</span></div></td>
						<td><input type="text" name="schGrade" value="${school.schGrade }"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">招生年级</span></div></td>
					</tr>
					<tr>
					                                <!-- 加入百分号 -->
						<td><input type="text" name="schPtRatio" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">师生比</span></div></td>
						<td><input type="text" name="schType" value="${school.schType }"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">性质</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schReligon"value="${school.schReligon }" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">宗教</span></div></td>
						<td><input type="text" name="schEsl" value="${school.schEsl }"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">ESL</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schChnPop" value="${school.schChnPop }"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">中国学生人数</span></div></td>
						<td><input type="text" name="schSat" value="${school.schSat }"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">SAT</span></div></td>
					</tr>
					<tr>
						
						<td><input type="text" name="" class="school_search_li"/></td>     <!-- data bug -->
						<td><div class="table_column_div"><span class="table_column_span">申请期限</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="" class="school_search_li"/></td>		<!-- data bug -->
						<td><div class="table_column_div"><span class="table_column_span">开学时间</span></div></td>
						<td><input type="text" name="schGroup" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">社团</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schResType" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">住宿安排</span></div></td>
						<td><input type="text" name="schResFee" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">住宿费用</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schDeps" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">押金</span></div></td>
						<td><input type="text" name="schFee" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">学费</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="totalFee" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">总计</span></div></td>
						<td><input type="text" name="schDes" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">特点</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="comment"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">备注</span></div></td>
						<td><input type="text" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">备注2</span></div></td>
					</tr>
				</tbody>
			</table>
			<div>
				<button type="submit" onclick="window.location.href='school_management.jsp'"  style="margin: 0px 41%;width: 15%;"><span>确认修改</span></button>
			</div>
			</form>
			
			<!-- </form> -->
		</div>
    
   	 	<%@include file="/footer.jsp" %>
    	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	</body>
<!--  body  -->

</html>
