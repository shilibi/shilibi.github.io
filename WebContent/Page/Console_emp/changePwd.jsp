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
                        <a  href="index_guest.jsp"><i class="fa fa-dashboard "></i>现在预定</a>
                    </li>
                    <li>
                        <a  href="listOrder.action"><i class="fa fa-dashboard "></i>历史订单</a>
                    </li>
                    <li>
                        <a  href="changePwd.jsp" class="active-menu"><i class="fa fa-dashboard "></i>修改密码</a>
                    </li>
                </ul>
            </div>

        </nav>
		<!-- /. NAV SIDE  -->
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h1 class="page-head-line">修改密码</h1>
						<h1 class="page-subhead-line">修改成功后将自动跳转到网站首页，请重新登录</h1>

					</div>
				</div>
				<!-- /. ROW  -->
				<div class="row">
					<div class="col-md-6 col-sm-6 col-xs-12">
						<div class="panel panel-info">
							<div class="panel-heading">BASIC FORM</div>
							<div class="panel-body">
								<form role="form" action="${pageContext.request.contextPath}/changePwd.action" method="post">
									<div class="form-group">
										<label>原密码</label> <input class="form-control" type="text" name="empPwd">
									</div>
									<div class="form-group">
										<label>新密码</label> <input class="form-control" type="text" name="newPwd">
									</div>
									<div class="form-group">
										<label>确认密码</label> <input class="form-control" type="text" name="confirmNewPwd">
									</div>
									<button type="submit" class="btn btn-info" onclick="checkPasswords">提交</button>
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
		Copyright &copy; 2018.XXXX酒店 All rights reserved.
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
	<script>
		function checkPasswords() {
			var pass1 = document.getElementById("newPwd");
			var pass2 = document.getElementById("confirmNewPwd");
			if (pass1.value != pass2.value) {
				alert("两次输入的密码不匹配");
				guestPwd.value = "";
				guestPwd_confirm.value = "";
			}
		}
	</script>
</body>
</html>
