<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>home</title>

    <!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
       <!--CUSTOM BASIC STYLES-->
    <link href="assets/css/basic.css" rel="stylesheet" />
    <!--CUSTOM MAIN STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <a class="navbar-brand" href="index_admin.jsp">XX酒店后台管理</a>
            </div>

            <div class="header-right">

                <a href="list.action" class="btn btn-info" title="New Message"><b>30 </b><i class="fa fa-envelope-o fa-2x"></i></a>
                <a href="list.action" class="btn btn-primary" title="New Task"><b>40 </b><i class="fa fa-bars fa-2x"></i></a>
                <a href="login.html" class="btn btn-danger" title="Logout"><i class="fa fa-exclamation-circle fa-2x"></i></a>

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
                        <a class="active-menu" href="index_guest.jsp"><i class="fa fa-dashboard "></i>住房概述</a>
                    </li>
                     <li>
                        <a href="selectOrder.action"><i class="fa fa-yelp "></i>预订管理 <span class="fa arrow"></span></a>
                    </li>
                    <li>
                        <a href="roomList_emp.action"><i class="fa fa-anchor "></i>房间情况</a>
                    </li>
                     <li>
                        <a href="changePwd.jsp"><i class="fa fa-anchor "></i>密码修改</a>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper">
            <!-- /. PAGE INNER  -->
         <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-head-line">今日概况</h1>
                    </div>
                </div>
                <!-- /. ROW  -->
                <div class="row">
                    <div class="col-md-4">
                        <div class="main-box mb-dull">
                            <a href="#">
                              <h3>${roomSaleNo}/${ roomNo}</h3>
                                <h6>今日客房入住</h6>
                            </a>
                        </div>
                    </div>
 					<div class="col-md-4">
                        <div class="main-box mb-pink">
                            <a href="#">                               
     								<h3>${roomSale }</h3>
                                <h6>今日房间收入</h6>
                            </a>
                        </div>
                    </div>
                </div>
                <hr>
                <hr>
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
    


</body>
</html>
