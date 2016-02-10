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
    <title>Blue Ivy Education Group Inc.</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <link rel="stylesheet" href="css/normalize.css">

    <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>
	<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Montez'>
	<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Lato:400,100,300,700'>
	<link rel='stylesheet prefetch' href='https://storage.googleapis.com/code.getmdl.io/1.0.4/material.light_green-green.min.css'>
	<link rel='stylesheet prefetch' href='http://cdnjs.cloudflare.com/ajax/libs/animate.css/3.2.3/animate.min.css'>
	
	<link rel='stylesheet' href="css/base.css">
    <link rel="stylesheet" href="css/home_page.css">

    
  </head>

  <body>
<!--     <body data-spy="scroll" data-target=".navbar-default"> -->
	  <!-- Post a JOB Modal Start -->
	 <div class="modal fade" id="postJobModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	    <div class="modal-dialog" role="document">
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	          <h4 class="modal-title text-center" id="myModalLabel">Multiplier.in - Your Feedback</h4>
	        </div>
	        <div class="modal-body">
	          <h3 class="h3 text-center">Thank You! for your Precious Feedback.</h3>
	        </div>
	        <div class="modal-footer">
	          <button type="button" class="btn btn-success" data-dismiss="modal">Close</button>
	        </div>
	      </div>
	    </div>
	  </div>
	  <!-- Post a JOB Modal End -->
	  <div class="page wow fadeInUp" id="section-1">
	    <nav class="navbar navbar-default navbar-fixed-top">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="/">
	            <div class="logo">Blue Ivy Education Group Inc.</div>
	          </a>
	        </div>
	        <div id="navbar" class="navbar-collapse collapse">
	          <ul class="nav navbar-nav">
	            <li class="active hidden-xs"><a href="#section-1">首页</a></li>
	            <li><a href="#section-2" class="hidden-xs">我们的宗旨</a></li>
	           <!-- <li><a href="#section-3" class="hidden-xs">Features</a></li>  --> 
	          </ul>
	          <ul class="nav navbar-nav navbar-right">
	            <!-- <li name="search" style="padding: 10px 0;">
	              <i class="glyphicon glyphicon-search"></i>
	              <form action="" style="display: inline-block;">
	                <input type="text" id="nav_search" name="nav_search" />
	              </form>
	            </li> -->
	            <li>
	              <a href="school_management.jsp" class="mainLinks">
	                <button class="mdl-button mdl-js-button mdl-js-ripple-effect">登陆</button>
	              </a>
	            </li>
	
	            <!-- <li>
	              <a href="/Register" class="mainLinks">
	                <button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent">Sign Up</button>
	              </a>
	            </li> -->
	          </ul>
	        </div>
	      </div>
	    </nav>
	    <div class="container headerContent">
	      <div id="loginbox" class="mainbox col-md-6 col-sm-12 wow bounceInDown">
	        <div class="row">
	          <div class="col-md-12 heading">
	            <div class="logo">此处放Logo</div>
	            <div class="main">
	              <p><span class="sub-head-logo">Blue Ivy留学中介您身边的好伙伴！</span></p>
	            </div>
	          </div>
	        </div>
	      </div>
	      <div class="col-md-4 col-md-offset-2 col-sm-12 ">
	        <ul class="nav nav-pills nav-stacked animated bounceInDown">
	          <li role="presentation"><a href="#">合作院校<i class="glyphicon glyphicon-menu-right"></i></a></li>
	          <li role="presentation" data-toggle="modal" data-target="#postJobModal"><a href="#">成功案例<i class="glyphicon glyphicon-menu-right"></i></a></li>
	          <li role="presentation"><a href="#">学员反馈<i class="glyphicon glyphicon-menu-right"></i></a></li>
	          <li role="presentation"><a href="">7X24小时服务<i class="glyphicon glyphicon-menu-right"></i>
	  </a></li>
	        </ul>
	      </div>
	    </div>
	
	    <div id="particles"></div>
	  </div>
	  <div class="page wow fadeInLeft" id="section-2">
	    <h1 class="h2 text-center">我们的宗旨</h1>
	    <div class="container">
	      <div class="col-lg-offset-2 col-lg-8 col-md-offset-1 col-md-10 col-xs-12">
	        <p>Blue Ivy Education Group Inc. 自成立至今，用数以万计的成功案例，奠定了深厚的专业基础，同时也沉淀了宝贵的第一手经验资源。
	          <br>
<!-- 	          <br><strong>An Idea Never Stops, It Multiplies.</strong> -->
	          <br> 我们已经帮助数万位国内的在职人士，大学生，高中生申请人成功地进入自己梦寐以求的欧美名校，包括哈佛、耶鲁、斯坦佛、麻省理工、哥伦比亚、牛津、剑桥等世界超一流名校。
	          <br>
	          <br> 而通过分析和应用这些案例数据，我们的申请结果仍在不断提升。
	          <br>
	          <br><strong>Blue Ivy团队欢迎你</strong></p>
	        <!-- <a href="Register" class="registerLink" style="text-align: center; display: block; margin: 0 auto;">
	              Join Now
	            </a> -->
	      </div>
	    </div>
	  </div>
	  
	  <!-- TODO : Add a Page width Slider of all the previews of features -->
	  
	  <div class="page wow fadeInRight" id="section-3">
	    <h1 class="h2 text-center">金牌导师</h1>
	    <div class="container">
	      <div class="row">
	        <div class="col-md-3 col-sm-6 col-xs-12">
	          <div class="demo-card-square mdl-card mdl-shadow--2dp">
	            <div class="mdl-card__title mdl-card--expand">
	              <h2 class="mdl-card__title-text">Mr. Wang</h2>
	            </div>
	            <div class="mdl-card__supporting-text">
	              成功案例无数，曾帮助多名学生申请到梦想中的学校。
	            </div>
	            <div class="mdl-card__actions mdl-card--border">
	              <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
	      Email: xxx.gmail.com
	    </a>
	            </div>
	          </div>
	        </div>
	        <div class="col-md-3 col-sm-6 col-xs-12">
	          <div class="demo-card-square mdl-card mdl-shadow--2dp">
	            <div class="mdl-card__title mdl-card--expand">
	              <h2 class="mdl-card__title-text">Mrs. Zhang</h2>
	            </div>
	            <div class="mdl-card__supporting-text">
	              用心对待每一位学生，是我一贯的宗旨。
	            </div>
	            <div class="mdl-card__actions mdl-card--border">
	              <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
	      Email: xxx.gmail.com
	    </a>
	            </div>
	          </div>
	        </div>
	        <div class="col-md-3 col-sm-6 col-xs-12">
	          <div class="demo-card-square mdl-card mdl-shadow--2dp">
	            <div class="mdl-card__title mdl-card--expand">
	              <h2 class="mdl-card__title-text">Mr. Su</h2>
	            </div>
	            <div class="mdl-card__supporting-text">
	              望与您成为生活中的挚友。
	           	</div>
	            <div class="mdl-card__actions mdl-card--border">
	              <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
	      Email: xxx.gmail.com
	    </a>
	            </div>
	          </div>
	        </div>
	        <div class="col-md-3 col-sm-6 col-xs-12">
	          <div class="demo-card-square mdl-card mdl-shadow--2dp">
	            <div class="mdl-card__title mdl-card--expand">
	              <h2 class="mdl-card__title-text">Joyin</h2>
	            </div>
	            <div class="mdl-card__supporting-text">
	            	爱，是持久永恒。  
	            </div>
	            <div class="mdl-card__actions mdl-card--border">
	              <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
	      Email: xxx.gmail.com
	    </a>
	            </div>
	          </div>
	        </div>
	      </div>
	    </div>
	  </div>
	  <footer class="dark-div wow fadeIn">
	    <div id="bottom">
	      <div class="container">
	        <div class="row">
	          <div id="text-13" class=" 1 widget col-md-4 col-sm-4 widget_text">
	            <h2 class="widget-title maincolor1">关于我们</h2>
	            <div class="textwidget">
	              <p><a href="#section-2">Blue Ivy留学中介公司</a>
	              </p>
	              <p><a href="/blog/">公司地址</a>
	              </p>
	            </div>
	          </div>
	          <div id="text-17" class=" 1 widget col-md-4 col-sm-4 widget_text">
	            <h2 class="widget-title maincolor1">7X24小时服务</h2>
	            <div class="textwidget">
	              <p><a href="/Contact" target="_blank">联系方式</a></p>
	            </div>
	          </div>
	          <div id="text-14" class=" 1 widget col-md-4 col-sm-4 widget_text">
	            <h2 class="widget-title maincolor1">关注我们</h2>
	            <div class="textwidget">
	              <p><a href="https://www.facebook.com/multiplier.in" target="_blank">QQ</a>
	              </p>
	              <p><a href="https://twitter.com/InMultiplier" target="_blank">Wechat</a>
	              </p>
	            </div>
	          </div>
	        </div>
	      </div>
	    </div>
	    <div id="bottom-nav">
	      <div class="container">
	        <div class="row">
	          <div class="copyright col-xs-12">Copyright © 2015 Blue Ivy留学中介. All rights reserved.</div>
	          <!-- <nav class="col-md-6 col-xs-12">
	            <ul class="bottom-menu list-inline pull-right">
	              <li><a href="#">Terms</a>
	              </li>
	              <li><a href="#">Privacy Policy</a>
	              </li>
	              <li><a href="#">Copyright</a>
	              </li>
	            </ul>
	          </nav> -->
	        </div>
	      </div>
	    </div>
	  </footer>
<!-- 	</body> -->
	
	
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js'></script>
	<script src='https://storage.googleapis.com/code.getmdl.io/1.0.4/material.min.js'></script>
	<script src='https://cdnjs.cloudflare.com/ajax/libs/wow/1.1.2/wow.min.js'></script>

    <script src="js/home_page.js"></script>

    
  </body>
</html>

