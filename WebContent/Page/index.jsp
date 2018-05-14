<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>  
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>XXXX酒店</title>

<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet">
<link href="css/flexslider.css" rel="stylesheet">
<link href="css/templatemo-style.css" rel="stylesheet">
<link rel="stylesheet" href="assets/css/form-elements.css">
</head>
<body class="tm-gray-bg">
	<!-- Header -->
	<div class="tm-header">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-4 col-sm-3 tm-site-name-container">
					<a href="#" class="tm-site-name">XXXX酒店</a>
				</div>
				<div class="col-lg-6 col-md-8 col-sm-9">
					<div class="mobile-menu-icon">
						<i class="fa fa-bars"></i>
					</div>
					<nav class="tm-nav">
					<ul>
						<li><a href="index.jsp" class="active">首页</a></li>
						<li><a href="#"  class="btn btn-link-1 launch-modal" href="#"
							data-modal-id="about">关于</a></li>
						<li><a class="btn btn-link-1 launch-modal" href="#"
							data-modal-id="modal-register">注册</a></li>
						<li><a class="btn btn-link-1 launch-modal" href="#"
							data-modal-id="modal-login">登录</a></li>
					</nav>
				</div>
			</div>
		</div>
	</div>

	<!-- Banner -->
	<section class="tm-banner"> <!-- Flexslider -->
	<div class="flexslider flexslider-banner">
		<ul class="slides">
			<li>
				<div class="tm-banner-inner">
					<h1 class="tm-banner-title">
						找到&nbsp;<span class="tm-yellow-text">最好的</span> 地方
					</h1>
					<p class="tm-banner-subtitle">针对您的假期</p>
					<a href="#more" class="tm-banner-link">了解更多 </a>
				</div> <img src="img/banner-1.jpg" alt="Image" />
			</li>
			<li>
				<div class="tm-banner-inner">
					<h1 class="tm-banner-title">
						实现&nbsp; <span class="tm-yellow-text">灵魂的</span> 旅行
					</h1>
					<p class="tm-banner-subtitle">美妙的地方</p>
					<a href="#more" class="tm-banner-link">了解更多</a>
				</div> <img src="img/banner-2.jpg" alt="Image" />
			</li>
			<li>
				<div class="tm-banner-inner">
					<h1 class="tm-banner-title">
						实现 <span class="tm-yellow-text">身心的&nbsp;</span>放松
					</h1>
					<p class="tm-banner-subtitle">就趁现在</p>
					<a href="#more" class="tm-banner-link">了解更多</a>
				</div> <img src="img/banner-3.jpg" alt="Image" />
			</li>
		</ul>
	</div>
	</section>

	<!-- gray bg -->
	<section class="container tm-home-section-1" id="more">
	<div class="row">

		<div class="col-lg-4 col-md-4 col-sm-6">
			<div class="tm-home-box-1 tm-home-box-1-2 tm-home-box-1-center">
				<img src="img/index-01.jpg" alt="image" class="img-responsive">
				<a href="#">
					<div class="tm-green-gradient-bg tm-city-price-container">
						<span>纽约</span> 
					</div>
				</a>
			</div>
		</div>
			<div class="col-lg-4 col-md-4 col-sm-6">
			<div class="tm-home-box-1 tm-home-box-1-2 tm-home-box-1-right">
				<img src="img/index-02.jpg" alt="image" class="img-responsive">
				<a href="#">
					<div class="tm-red-gradient-bg tm-city-price-container">
						<span>巴黎</span>
					</div>
				</a>
			</div>
		</div>
		<div class="col-lg-4 col-md-4 col-sm-6">
			<div class="tm-home-box-1 tm-home-box-1-2 tm-home-box-1-center">
				<img src="img/index00.jpg" alt="image" class="img-responsive">
				<a href="#">
					<div class="tm-green-gradient-bg tm-city-price-container">
						<span>柏林</span>  
					</div>
				</a>
			</div>
		</div>
	</div>
	<div class="section-margin-top">
		<div class="row">
			<div class="tm-section-header">
				<div class="col-lg-3 col-md-3 col-sm-3">
					<hr>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6">
					<h2 class="tm-section-title">灵魂的旅行</h2>
				</div>
				<div class="col-lg-3 col-md-3 col-sm-3">
					<hr>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-3 col-md-3 col-sm-6 col-xs-6 col-xxs-12">
				<div class="tm-home-box-2">
					<img src="img/index-03.jpg" alt="image" class="img-responsive">
					<h3>周围环境</h3>
					<p class="tm-date">28 March 2018</p>
					<div class="tm-home-box-2-container">
						<a href="#" class="tm-home-box-2-link"><i
							class="fa fa-heart tm-home-box-2-icon border-right"></i></a> <a
							href="#" class="tm-home-box-2-link"><span
							class="tm-home-box-2-description">就现在！</span></a> <a href="#"
							class="tm-home-box-2-link"><i
							class="fa fa-edit tm-home-box-2-icon border-left"></i></a>
					</div>
				</div>
			</div>
			<div class="col-lg-3 col-md-3 col-sm-6 col-xs-6 col-xxs-12">
				<div class="tm-home-box-2">
					<img src="img/index-04.jpg" alt="image" class="img-responsive">
					<h3>周围环境</h3>
					<p class="tm-date">26 March 2018</p>
					<div class="tm-home-box-2-container">
						<a href="#" class="tm-home-box-2-link"><i
							class="fa fa-heart tm-home-box-2-icon border-right"></i></a> <a
							href="#" class="tm-home-box-2-link"><span
							class="tm-home-box-2-description">就现在！</span></a> <a href="#"
							class="tm-home-box-2-link"><i
							class="fa fa-edit tm-home-box-2-icon border-left"></i></a>
					</div>
				</div>
			</div>
			<div class="col-lg-3 col-md-3 col-sm-6 col-xs-6 col-xxs-12">
				<div class="tm-home-box-2">
					<img src="img/index-05.jpg" alt="image" class="img-responsive">
					<h3>周围环境</h3>
					<p class="tm-date">24 March 2018</p>
					<div class="tm-home-box-2-container">
						<a href="#" class="tm-home-box-2-link"><i
							class="fa fa-heart tm-home-box-2-icon border-right"></i></a> <a
							href="#" class="tm-home-box-2-link"><span
							class="tm-home-box-2-description">就现在！</span></a> <a href="#"
							class="tm-home-box-2-link"><i
							class="fa fa-edit tm-home-box-2-icon border-left"></i></a>
					</div>
				</div>
			</div>
			<div class="col-lg-3 col-md-3 col-sm-6 col-xs-6 col-xxs-12">
				<div class="tm-home-box-2 tm-home-box-2-right">
					<img src="img/index-06.jpg" alt="image" class="img-responsive">
					<h3>周围环境</h3>
					<p class="tm-date">22 March 2018</p>
					<div class="tm-home-box-2-container">
						<a href="#" class="tm-home-box-2-link"><i
							class="fa fa-heart tm-home-box-2-icon border-right"></i></a> <a
							href="#" class="tm-home-box-2-link"><span
							class="tm-home-box-2-description">就现在！</span></a> <a href="#"
							class="tm-home-box-2-link"><i
							class="fa fa-edit tm-home-box-2-icon border-left"></i></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>

	<!-- white bg -->
	<section class="tm-white-bg section-padding-bottom">
	<div class="container">
		<div class="row">
			<div class="tm-section-header section-margin-top">
				<div class="col-lg-4 col-md-3 col-sm-3">
					<hr>
				</div>
				<div class="col-lg-4 col-md-6 col-sm-6">
					<h2 class="tm-section-title">身心的放松</h2>
				</div>
				<div class="col-lg-4 col-md-3 col-sm-3">
					<hr>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="tm-home-box-3">
					<div class="tm-home-box-3-img-container">
						<img src="img/index-07.jpg" alt="image" class="img-responsive">
					</div>
					<div class="tm-home-box-3-info">
						<p class="tm-home-box-3-description">世界各地的分店</p>
						<div class="tm-home-box-2-container">
							<a href="#" class="tm-home-box-2-link"><i
								class="fa fa-heart tm-home-box-2-icon border-right"></i></a> <a
								href="#" class="tm-home-box-2-link"><span
								class="tm-home-box-2-description box-3">了解更多</span></a> <a
								href="#" class="tm-home-box-2-link"><i
								class="fa fa-edit tm-home-box-2-icon border-left"></i></a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="tm-home-box-3">
					<div class="tm-home-box-3-img-container">
						<img src="img/index-08.jpg" alt="image" class="img-responsive">
					</div>
					<div class="tm-home-box-3-info">
						<p class="tm-home-box-3-description">世界各地的分店</p>
						<div class="tm-home-box-2-container">
							<a href="#" class="tm-home-box-2-link"><i
								class="fa fa-heart tm-home-box-2-icon border-right"></i></a> <a
								href="#" class="tm-home-box-2-link"><span
								class="tm-home-box-2-description box-3">了解更多</span></a> <a
								href="#" class="tm-home-box-2-link"><i
								class="fa fa-edit tm-home-box-2-icon border-left"></i></a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="tm-home-box-3">
					<div class="tm-home-box-3-img-container">
						<img src="img/index-09.jpg" alt="image" class="img-responsive">
					</div>
					<div class="tm-home-box-3-info">
						<p class="tm-home-box-3-description">世界各地的分店</p>
						<div class="tm-home-box-2-container">
							<a href="#" class="tm-home-box-2-link"><i
								class="fa fa-heart tm-home-box-2-icon border-right"></i></a> <a
								href="#" class="tm-home-box-2-link"><span
								class="tm-home-box-2-description box-3">了解更多</span></a> <a
								href="#" class="tm-home-box-2-link"><i
								class="fa fa-edit tm-home-box-2-icon border-left"></i></a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="tm-home-box-3">
					<div class="tm-home-box-3-img-container">
						<img src="img/index-10.jpg" alt="image" class="img-responsive">
					</div>
					<div class="tm-home-box-3-info">
						<p class="tm-home-box-3-description">世界各地的分店</p>
						<div class="tm-home-box-2-container">
							<a href="#" class="tm-home-box-2-link"><i
								class="fa fa-heart tm-home-box-2-icon border-right"></i></a> <a
								href="#" class="tm-home-box-2-link"><span
								class="tm-home-box-2-description box-3">了解更多</span></a> <a
								href="#" class="tm-home-box-2-link"><i
								class="fa fa-edit tm-home-box-2-icon border-left"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="modal-register" tabindex="-1" role="dialog"
		aria-labelledby="modal-register-label" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">关闭</span>
					</button>
					<h3 class="modal-title" id="modal-register-label">注册</h3>
					<p>请填写一下表格内容:</p>
				</div>

				<div class="modal-body">

					<form role="form"
						action="${pageContext.request.contextPath}/guestRegister.action"
						method="post" class="registration-form">
						<div class="form-group">
							<label class="sr-only" for="form-first-name">请输入您的手机号...</label>
							<input type="text" id="guestPhone" name="guestPhone"
								placeholder="请输入您的手机号..." class="form-first-name form-control"
								id="form-first-name">
						</div>
						<div class="form-group">
							<label class="sr-only" for="form-last-name">请输入密码...</label> <input
								type="text" id="guestPwd" name="guestPwd" placeholder="请输入密码..."
								class="form-last-name form-control" id="form-last-name">
						</div>
						<div class="form-group">
							<label class="sr-only" for="form-email">再次输入密码...</label> <input
								type="text" id="guestPwd_confirm" name="guestPwd_confirm"
								placeholder="再次输入密码..." class="form-email form-control"
								id="form-email">
						</div>
						<button onclick="checkPasswords()" type="submit" class="btn">现&nbsp;在&nbsp;注&nbsp;册!</button>
					</form>

				</div>

			</div>
		</div>
	</div>
	<div class="modal fade" id="modal-login" tabindex="-1" role="dialog"
		aria-labelledby="modal-register-label" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">关闭</span>
					</button>
					<h3 class="modal-title" id="modal-register-label">登录</h3>
					<p>请填写一下表格内容:</p>
				</div>

				<div class="modal-body">
					<form role="form"
						action="${pageContext.request.contextPath}/guestLogin.action"
						method="post" class="registration-form">
						<div class="form-group">
							<label class="sr-only" for="form-first-name">请输入您的手机号或编号...</label>
							<input type="text" id="guestPhone" name="guestPhone"
								placeholder="请输入您的手机号..." class="form-first-name form-control"
								id="form-first-name">
						</div>
						<div class="form-group">
							<label class="sr-only" for="form-last-name">请输入密码...</label> <input
								type="text" id="guestPwd" name="guestPwd" placeholder="请输入密码..."
								class="form-last-name form-control" id="form-last-name">
						</div>
						<br/>
						<s:radio list="#{'Customer':'顾客','Depart':'客房','Food':'前台','Admin':'管理员'}"  theme="simple" name="loginType" id="loginType" value="1"/>
						<br/>
						<br/>
						<button onclick="checkPasswords()" type="submit" class="btn">登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</button>
					</form>
				</div>
			</div>
		</div>
	</div>
<div class="modal fade" id="about" tabindex="-1" role="dialog"
		aria-labelledby="modal-register-label" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">关闭</span>
					</button>
					<h3 class="modal-title" id="modal-register-label">关于</h3>
				</div>
				<div class="modal-body">
					<form>
						<div class="form-group">
							<label class="sr-only" for="form-first-name">请输入您的手机号或编号...</label>
						</div>
						<div class="form-group">
						前台:Jquery，JSP，Html<br/>
						后台：Java <br/>
						框架：Hibernate&&Struts2<br/>
						数据库:mysql<br/>
						其他：C3P0<br/>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</section>
	<footer class="tm-black-bg">
	<div class="container">
		<div class="row">
			<p class="tm-copyright-text">
				Copyright &copy; 2018 Your XXXX酒店 
			</p>
		</div>
	</div>
	</footer>
	<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
	<!-- jQuery -->
	<script type="text/javascript" src="js/moment.js"></script>
	<!-- moment.js -->
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<!-- bootstrap js -->
	<script type="text/javascript" src="js/bootstrap-datetimepicker.min.js"></script>
	<!-- bootstrap date time picker js, http://eonasdan.github.io/bootstrap-datetimepicker/ -->
	<script src="assets/js/jquery.backstretch.min.js"></script>
	<script src="assets/js/scripts.js"></script>
	<script type="text/javascript" src="js/jquery.flexslider-min.js"></script>
	<script src="assets/js/scripts.js"></script>
	<script type="text/javascript" src="js/templatemo-script.js"></script>
	<!-- Templatemo Script -->
	<script>
		// HTML document is loaded. DOM is ready.
		$(function() {

			$('#hotelCarTabs a').click(function(e) {
				e.preventDefault()
				$(this).tab('show')
			})

			$('.date').datetimepicker({
				format : 'MM/DD/YYYY'
			});
			$('.date-time').datetimepicker();

			// https://css-tricks.com/snippets/jquery/smooth-scrolling/
			$('a[href*=#]:not([href=#])')
					.click(
							function() {
								if (location.pathname.replace(/^\//, '') == this.pathname
										.replace(/^\//, '')
										&& location.hostname == this.hostname) {
									var target = $(this.hash);
									target = target.length ? target
											: $('[name=' + this.hash.slice(1)
													+ ']');
									if (target.length) {
										$('html,body').animate({
											scrollTop : target.offset().top
										}, 1000);
										return false;
									}
								}
							});
		});
		// Load Flexslider when everything is loaded.
		$(window).load(function() {
			// Vimeo API nonsense

			/*
			 var player = document.getElementById('player_1');
			 $f(player).addEvent('ready', ready);
			
			 function addEvent(element, eventName, callback) {
			 if (element.addEventListener) {
			 element.addEventListener(eventName, callback, false)
			 } else {
			 element.attachEvent(eventName, callback, false);
			 }
			 }
			
			 function ready(player_id) {
			 var froogaloop = $f(player_id);
			 froogaloop.addEvent('play', function(data) {
			 $('.flexslider').flexslider("pause");
			 });
			 froogaloop.addEvent('pause', function(data) {
			 $('.flexslider').flexslider("play");
			 });
			 }
			 */

			// Call fitVid before FlexSlider initializes, so the proper initial height can be retrieved.
			/*

			 $(".flexslider")
			 .fitVids()
			 .flexslider({
			 animation: "slide",
			 useCSS: false,
			 animationLoop: false,
			 smoothHeight: true,
			 controlNav: false,
			 before: function(slider){
			 $f(player).api('pause');
			 }
			 });
			 */

			//	For images only
			$('.flexslider').flexslider({
				controlNav : false
			});

		});
	</script>
	<script>
		function checkPasswords() {
			var pass1 = document.getElementById("guestPwd");
			var pass2 = document.getElementById("guestPwd_confirm");
			if (pass1.value != pass2.value) {
				alert("两次输入的密码不匹配");
				guestPwd.value = "";
				guestPwd_confirm.value = "";
			}
		}
	</script>
</body>
</html>