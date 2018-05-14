<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title> XXXX酒店</title>

<!-- BOOTSTRAP STYLES-->
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<!-- FONTAWESOME STYLES-->
<link href="assets/css/font-awesome.css" rel="stylesheet" />
<!--CUSTOM BASIC STYLES-->
<link href="assets/css/basic.css" rel="stylesheet" />
<!--CUSTOM MAIN STYLES-->
<link href="assets/css/custom.css" rel="stylesheet" />
<!-- GOOGLE FONTS-->
<link href='https://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />

</head>
<body>
	<div id="wrapper">
		<nav class="navbar navbar-default navbar-cls-top " role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".sidebar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">XXXX酒店</a>
			</div>
			<div class="header-right">
				<a href="message-task.html" class="btn btn-info" title="New Message"><b>30
				</b><i class="fa fa-envelope-o fa-2x"></i></a> <a href="message-task.html"
					class="btn btn-primary" title="New Task"><b>40 </b><i
					class="fa fa-bars fa-2x"></i></a> <a href="login.html"
					class="btn btn-danger" title="Logout"><i
					class="fa fa-exclamation-circle fa-2x"></i></a>


			</div>
		</nav>
		<!-- /. NAV TOP  -->
		<nav class="navbar-default navbar-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav" id="main-menu">
					<li>
						<div class="user-img-div">
							<img src="assets/img/user.png" class="img-thumbnail" />

							<div class="inner-text">
								Jhon Deo Alex <br /> <small>Last Login : 2 Weeks Ago </small>
							</div>
						</div>

					</li>


					<li><a href="index.html"><i class="fa fa-dashboard "></i>Dashboard</a>
					</li>
					<li><a href="#"><i class="fa fa-desktop "></i>UI Elements
							<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="panel-tabs.html"><i class="fa fa-toggle-on"></i>Tabs
									& Panels</a></li>
							<li><a href="notification.html"><i class="fa fa-bell "></i>Notifications</a>
							</li>
							<li><a href="progress.html"><i class="fa fa-circle-o "></i>Progressbars</a>
							</li>
							<li><a href="buttons.html"><i class="fa fa-code "></i>Buttons</a>
							</li>
							<li><a href="icons.html"><i class="fa fa-bug "></i>Icons</a>
							</li>
							<li><a href="wizard.html"><i class="fa fa-bug "></i>Wizard</a>
							</li>
							<li><a href="typography.html"><i class="fa fa-edit "></i>Typography</a>
							</li>
							<li><a href="grid.html"><i class="fa fa-eyedropper "></i>Grid</a>
							</li>


						</ul></li>
					<li><a href="#"><i class="fa fa-yelp "></i>Extra Pages <span
							class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="invoice.html"><i class="fa fa-coffee"></i>Invoice</a>
							</li>
							<li><a href="pricing.html"><i class="fa fa-flash "></i>Pricing</a>
							</li>
							<li><a href="component.html"><i class="fa fa-key "></i>Components</a>
							</li>
							<li><a href="social.html"><i class="fa fa-send "></i>Social</a>
							</li>

							<li><a href="message-task.html"><i
									class="fa fa-recycle "></i>Messages & Tasks</a></li>


						</ul></li>
					<li><a href="table.html"><i class="fa fa-flash "></i>Data
							Tables </a></li>
					<li><a class="active-menu-top" href="#"><i
							class="fa fa-bicycle "></i>Forms <span class="fa arrow"></span></a>
						<ul class="nav nav-second-level collapse in">

							<li><a class="active-menu" href="form.html"><i
									class="fa fa-desktop "></i>Basic </a></li>
							<li><a href="form-advance.html"><i class="fa fa-code "></i>Advance</a>
							</li>


						</ul></li>
					<li><a href="gallery.html"><i class="fa fa-anchor "></i>Gallery</a>
					</li>
					<li><a href="error.html"><i class="fa fa-bug "></i>Error
							Page</a></li>
					<li><a href="login.html"><i class="fa fa-sign-in "></i>Login
							Page</a></li>
					<li><a href="#"><i class="fa fa-sitemap "></i>Multilevel
							Link <span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="#"><i class="fa fa-bicycle "></i>Second
									Level Link</a></li>
							<li><a href="#"><i class="fa fa-flask "></i>Second Level
									Link</a></li>
							<li><a href="#">Second Level Link<span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
									<li><a href="#"><i class="fa fa-plus "></i>Third Level
											Link</a></li>
									<li><a href="#"><i class="fa fa-comments-o "></i>Third
											Level Link</a></li>

								</ul></li>
						</ul></li>

					<li><a href="blank.html"><i class="fa fa-square-o "></i>Blank
							Page</a></li>
				</ul>
			</div>

		</nav>
		<!-- /. NAV SIDE  -->
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h1 class="page-head-line">Basic Forms</h1>
						<h1 class="page-subhead-line">This is dummy text , you can
							replace it with your original text.</h1>

					</div>
				</div>
				<!-- /. ROW  -->
				<div class="row">
					<div class="col-md-6 col-sm-6 col-xs-12">
						<div class="panel panel-info">
							<div class="panel-heading">BASIC FORM</div>
							<div class="panel-body">
								<form role="form" action="${pageContext.request.contextPath}/updateRoom.action" method="post">
									<div class="form-group">
									<label>编号</label> <input class="form-control"
											id="disabledTextInput" type="text"  value="${room.roomId}" name="roomId"  readonly >
									</div>
									<div class="form-group">
										<label>名称</label> <input class="form-control" type="text" value="${room.roomName}" name="roomName">
									</div>
									<div class="form-group">
										<label>价格</label> <input class="form-control" type="text" value="${room.roomPrice}" name="roomPrice">
									</div>
									<div class="form-group">
										<label>类型</label> <input class="form-control" type="text" value="${room.roomType}" name="roomType">
									</div>
									<div class="form-group">
										<label>电视</label> <input class="form-control" type="text" value="${room.roomTv}" name="roomTv">
									</div>
									<div class="form-group">
										<label>电脑</label> <input class="form-control" type="text" value="${room.roomPc}" name="roomPc">
									</div>
									<div class="form-group">
										<label>位置</label> <input class="form-control" type="text" value="${room.roomLct}" name="roomLct">
									</div>
									<div class="form-group">
										<label>状态</label> <input class="form-control" type="text" value="${room.roomStatus}" name="roomStatus">
									</div>
									<div class="form-group">
										<label>面积</label> <input class="form-control" type="text" value="${room.roomArea}" name="roomArea">
									</div>
									<button type="submit" class="btn btn-info">提交</button>
								</form>
							</div>
						</div>
					</div>
				</div>


			</div>
			<!-- /. PAGE INNER  -->
		</div>
		<!-- /. PAGE WRAPPER  -->
	</div>
	<!-- /. WRAPPER  -->
	<div id="footer-sec">
		Copyright &copy; 2018.XXXX酒店 All rights reserved.More Templates
		<a href="http://www.cssmoban.com/" target="_blank" title=" XXXX酒店"> XXXX酒店</a>
		- Collect from <a href="http://www.cssmoban.com/" title="网页模板"
			target="_blank">网页模板</a>
	</div>
	<!-- /. FOOTER  -->
	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
	<!-- JQUERY SCRIPTS -->
	<script src="assets/js/jquery-1.10.2.js"></script>
	<!-- BOOTSTRAP SCRIPTS -->
	<script src="assets/js/bootstrap.js"></script>
	<!-- METISMENU SCRIPTS -->
	<script src="assets/js/jquery.metisMenu.js"></script>
	<!-- CUSTOM SCRIPTS -->
	<script src="assets/js/custom.js"></script>
</body>
</html>
