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
                            		欢迎！${empName } 
                            <br />
                                <small>上次登录：${empLastLoginTime } </small>
                            </div>
                        </div>

                    </li>


                    <li>
                        <a  href="index_admin.jsp"><i class="fa fa-dashboard "></i>收入</a>
                    </li>
                     <li>
                        <a href="addFood.action"><i class="fa fa-yelp "></i>菜品管理 <span class="fa arrow"></span></a>
                         <ul class="nav nav-second-level">
                            <li>
                                <a href="passFood.action"><i class="fa fa-coffee"></i>审核菜品</a>
                            </li> 
                            <li>
                                <a href="foodList.action"><i class="fa fa-key "></i>查看菜品</a>
                            </li>
                            <li>
                                <a class="active-menu" href="pricing.html"><i class="fa fa-flash "></i>更改/删除菜品</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="list.action"  class="active-menu"><i class="fa fa-anchor "></i>员工管理</a>
                    </li>
                     <li>
                        <a href="roomList.action"><i class="fa fa-anchor "></i>房间管理</a>
                    </li>
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
								<form role="form" action="${pageContext.request.contextPath}/update.action" method="post">
									<div class="form-group">
									<label>编号</label> <input class="form-control"
											id="disabledTextInput" type="text"  value="${emp.empId}" name="empId"  readonly >
									</div>
									<div class="form-group">
										<label>姓名</label> <input class="form-control" type="text" value="${emp.empName}" name="empName">
									</div>
									<div class="form-group">
										<label>性别</label> <input class="form-control" type="text" value="${emp.empSex}" name="empSex">
									</div>
									<div class="form-group">
										<label>联系方式</label> <input class="form-control" type="text" value="${emp.empPhone}" name="empPhone">
									</div>
									<div class="form-group">
										<label>所属部门</label> <input class="form-control" type="text" value="${emp.empDepart}" name="empDepart">
									</div>
									<div class="form-group">
										<label>职位</label> <input class="form-control" type="text" value="${emp.empJob}" name="empJob">
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
