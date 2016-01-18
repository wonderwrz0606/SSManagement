<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
    + request.getServerName() + ":" + request.getServerPort()
    + path + "/";
%>

<!DOCTYPE html>
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
			
			<form  action="addSchool" method="post"> 
			<table class="school_search_table_multi">
				<tbody>
					<tr>
						<td><input type="text" name="schName" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">名称</span></div></td>
						<td><input type="text" name="schShort" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">简称</span></div></td>
					</tr>
					<tr>
						<td><input type="date" name="IOdeadLine" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">Application DeadLine</span></div></td>
						<td><input type="text" name="schWebsite" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">网址</span></div></td>
					</tr>
					<tr>
						<td><select name="schSeason"  class="school_search_li"/">
								<option></option>
								<option value=0>Spring</option>
								<option value=1>Fall</option>
								<option value=2>Rolling</option>
						    </select></td>
						<td><div class="table_column_div"><span class="table_column_span">Season</span></div></td>
						<td>
						<select name="schSsat"  class="school_search_li">
								<option></option>
								<option value=0>不需要</option>
								<option value=1>需要</option>
						    </select></td>    <!-- data bug -->
						<td><div class="table_column_div"><span class="table_column_span">SSAT </span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schCity"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">城市</span></div></td>
						<td><input type="text" name="schState" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">州</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schZip"class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">Zip Code</span></div></td>
						<td><input type="text" name="schEst" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">建校年份</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schCap" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">学生人数</span></div></td>
						<td><input type="text" name="schGrade" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">招生年级</span></div></td>
					</tr>
					<tr>
					                                <!-- 加入百分号 -->
						<td><input type="text" name="schPtRatio" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">师生比</span></div></td>
						<td><input type="text" name="schType" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">性质</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schReligon" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">宗教</span></div></td>
						<td><input type="text" name="schEsl" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">ESL</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schChnPop" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">中国学生人数</span></div></td>
						<td><input type="text" name="schSat" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">SAT</span></div></td>
					</tr>
					<tr>
						<td><input type="text" name="schTf" class="school_search_li"/></td>
						<td><div class="table_column_div"><span class="table_column_span">TOEFL</span></div></td>
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
				<button type="submit"  style="margin: 0px 41%;width: 15%;"><span>确认添加</span></button>
			</div>
			 </form>
		</div>
		
    	<%@include file="/footer.jsp" %>
    	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	</body>
<!--  body  -->

</html>
