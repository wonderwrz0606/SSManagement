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
	    <meta charset="UTF-8">
	    <title>school detail page</title>
	    <link rel="stylesheet" href="css/reset.css">
	    <link rel="stylesheet" href="css/style.css">
	    <script src="js/prefixfree.min.js"></script>
  	</head>

<!--  body  -->
  	<body>
		<%@include file="/header.jsp" %>
		<div class="container">
	    	<table>
	  			<thead>
	    			<tr>
			     		<th>School Info</th>
			      		<th>Details</th>
	    			</tr>
	 			</thead>
				<tbody>
				    <tr>
				      	<td><strong>showSpeed</strong></td>
				      	<td>The speed of the show/reveal</td>
				    </tr>
				    <tr>
				      	<td><strong>showEasing</strong></td>
				      	<td>The easing of the show/reveal</td>
				    </tr>
				    <tr>
				      	<td><strong>hideSpeed</strong></td>
				      	<td>The speed of the hide/conceal</td>
				    </tr>
				    <tr>
				      	<td><strong>hideEasing</strong></td>
				      	<td>The easing of the hide/conceal</td>
				    </tr>					
				    <tr>
				      	<td><strong>width</strong></td>
				      	<td>The width that the data will be truncated to - <em>('auto' or px amount)</em></td>
				    </tr>
				    <tr>
				      	<td><strong>ellipsis</strong></td>
				      	<td>Set to true to enable the ellipsis</td>
				    </tr>
				    <tr>
				      	<td><strong>title</strong></td>
				      	<td>Set to true to show the full data on hover</td>
				    </tr>
				    <tr>
				      <td><strong>afterShow</strong></td>
				      <td>The callback fired after the show/reveal</td>
				    </tr>
				    <tr>
				      	<td><strong>afterHide</strong></td>
				      	<td>The callback fired after the hide/conceal</td>
				    </tr>
				    <tr>
				     	 <td><strong>afterHide</strong></td>
				      	<td>The callback fired after the hide/conceal</td>
				    </tr>
				    <tr>
				      	<td><strong>afterHide</strong></td>
				      	<td>The callback fired after the hide/conceal</td>
				    </tr>
				    <tr>
				      <td><strong>afterHide</strong></td>
				      <td>The callback fired after the hide/conceal</td>
				    </tr>
				    <tr>
				      	<td><strong>afterHide</strong></td>
				      	<td>The callback fired after the hide/conceal</td>
				    </tr>
				    <tr>
				      	<td><strong>afterHide</strong></td>
				      	<td>The callback fired after the hide/conceal</td>
				    </tr>
				    <tr>
				      	<td><strong>afterHide</strong></td>
				      	<td>The callback fired after the hide/conceal</td>
				    </tr>
				    <tr>
				      	<td><strong>afterHide</strong></td>
				      	<td>The callback fired after the hide/conceal</td>
				    </tr>
				    <tr>
				      	<td><strong>afterHide</strong></td>
				      	<td>The callback fired after the hide/conceal</td>
				    </tr>
				    <tr>
				      	<td><strong>afterHide</strong></td>
				      	<td>The callback fired after the hide/conceal</td>
				    </tr>
				    <tr>
				      	<td><strong>afterHide</strong></td>
				      	<td>The callback fired after the hide/conceal</td>
				    </tr>
		  		</tbody>
			</table>
		</div>
		<div class="school_pdf">
			<a href="#">
				<button value="点击显示图文信息">点击显示图文信息</button>
			</a>
		</div>
		<%-- <div>
		<%
		   out.clear();
		   out = pageContext.pushBody();
		   response.setContentType("application/pdf");
		
		   try {
		    String strPdfPath = new String("/洛约拉学校.pdf");
		    //判断该路径下的文件是否存在
		    File file = new File(strPdfPath);
		    if (file.exists()) {
		     DataOutputStream temps = new DataOutputStream(response
		       .getOutputStream());
		     DataInputStream in = new DataInputStream(
		       new FileInputStream(strPdfPath));
		
		     byte[] b = new byte[2048];
		     while ((in.read(b)) != -1) {
		      temps.write(b);
		      temps.flush();
		     }
		
		     in.close();
		     temps.close();
		    } else {
		     out.print(strPdfPath + " 文件不存在!");
		    }
		
		   } catch (Exception e) {
		    out.println(e.getMessage());
		   }
		%>
		</div> --%>
    
    <%@include file="/footer.jsp" %>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    
	</body>
<!--  body  -->

</html>
