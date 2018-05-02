<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>模板之家</title>

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
				<a class="navbar-brand" href="index.html">COMPANY NAME</a>
			</div>

			<div class="header-right">

				<a href="message-task.jsp" class="btn btn-info" title="New Message"><b>30
				</b><i class="fa fa-envelope-o fa-2x"></i></a> <a href="message-task.jsp"
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
					<li><a class="active-menu-top" href="#"><i
							class="fa fa-yelp "></i>Extra Pages <span class="fa arrow"></span></a>
						<ul class="nav nav-second-level collapse in">
							<li><a href="invoice.html"><i class="fa fa-coffee"></i>Invoice</a>
							</li>
							<li><a href="pricing.html"><i class="fa fa-flash "></i>Pricing</a>
							</li>
							<li><a href="component.html"><i class="fa fa-key "></i>Components</a>
							</li>
							<li><a href="social.html"><i class="fa fa-send "></i>Social</a>
							</li>

							<li><a class="active-menu" href="message-task.jsp"><i
									class="fa fa-recycle "></i>Messages & Tasks</a></li>


						</ul></li>
					<li><a href="table.html"><i class="fa fa-flash "></i>Data
							Tables </a></li>
					<li><a href="#"><i class="fa fa-bicycle "></i>Forms <span
							class="fa arrow"></span></a>
						<ul class="nav nav-second-level">

							<li><a href="form.html"><i class="fa fa-desktop "></i>Basic
							</a></li>
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
						<h1 class="page-head-line">员工管理</h1>
						<div class="row ">
								<div class="form-group input-group col-md-6 col-md-offset-3">
									<input type="text" class="form-control" placeholder="输入关键字" name="info"  id="info"/> <span class="input-group-btn"> 
									 <a class="btn btn-primary"  href="javascript:jump()"> 
										<i class="fa fa-gear fa-spin"></i>&nbsp;&nbsp;搜索
									</a>
									</span>
								</div>
							<br />
						</div>
					</div>
				</div>
				<!-- /. ROW  -->
				<div class="row">
					<div class="col-md-12">
						<div class="panel panel-primary">
							<!-- Default panel contents -->
							<div class="panel-heading">员工信息</div>
							<!-- Table -->
							<form action="${pageContext.request.contextPath}/list.action"
								method="post">
								<table class="table">
									<thead>
										<tr>
											<th>编号</th>
											<th>名称</th>
											<th>价格</th>
											<th>类型</th>
											<th>电视</th>
											<th>电脑</th>
											<th>位置</th>
											<th>状态</th>
											<th>面积</th>
										</tr>
									</thead>
									<tbody>
										<s:iterator value="roomList" var="room">
											<tr class="list-group-item-success">
												<td><s:property value="#room.roomId" /></td>
												<td><s:property value="#room.roomName" /></td>
												<td><s:property value="#room.roomPrice" /></td>
												<td><s:property value="#room.roomType" /></td>
												<td><s:property value="#room.roomTv" /></td>
												<td><s:property value="#room.roomPc" /></td>
												<td><s:property value="#room.roomLct" /></td>
												<td><s:property value="#room.roomStatus" /></td>
												<td><s:property value="#room.roomArea" /></td>
												<td>
													<a
													href="<s:url action="/Page/Console/update_getRoom.action">  
                   								 <s:param name="roomId" value="#room.roomId"/>  
               									  </s:url>"
													class="btn btn-info ">修改</a> &nbsp;&nbsp;&nbsp;&nbsp; 
													 <a
													href="<s:url action="/Page/Console/deleteRoom.action">  
                   								 <s:param name="roomId" value="#room.roomId"/>  
               									  </s:url>"
													class="btn btn-danger" onclick="return confirm('确认删除?')">删除 </a>
												</td>
											</tr>
										</s:iterator>
									</tbody>
								</table>
								<nav aria-label="Page navigation">
									  <ul class="pagination">
									    <li>
									      <a href="#" aria-label="Previous">
									        <span aria-hidden="true">&laquo;</span>
									      </a>
									    </li>
									    <li><a href="#">1</a></li>
									    <li><a href="#">2</a></li>
									    <li><a href="#">3</a></li>
									    <li><a href="#">4</a></li>
									    <li><a href="#">5</a></li>
									    <li>
									      <a href="#" aria-label="Next">
									        <span aria-hidden="true">&raquo;</span>
									      </a>
									    </li>
									  </ul>
										</nav>
							</form>
						</div>
					</div>
				</div>
			</div>
			<!-- /. PAGE INNER  -->
		</div>
		<!-- /. PAGE WRAPPER  -->
	</div>
	<s:debug>debug</s:debug>
	<!-- /. WRAPPER  -->
	<div id="footer-sec">
		Copyright &copy; 2016.Company name All rights reserved.More Templates
		<a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a>
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
	<script type="text/javascript">  
		    function jump(){  
		    var1 = document.getElementById ("info").value;//获取该text对象  
		        location.href='search.action?info='+var1;  
		    }  
</script>  

</body>
</html>
