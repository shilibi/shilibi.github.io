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

        </nav>		<!-- /. NAV SIDE  -->
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h1 class="page-head-line">员工管理</h1>
						<div class="row ">
						<%-- 	<form action="${pageContext.request.contextPath}/search.action"
								method="post"> --%>
								<div class="form-group input-group col-md-6 col-md-offset-3">
									<input type="text" class="form-control" placeholder="输入关键字" name="info"  id="info"/> <span class="input-group-btn"> 
									 <a class="btn btn-primary"  href="javascript:jump()"> 
										<i class="fa fa-gear fa-spin"></i>&nbsp;&nbsp;搜索
									</a>	
									<button class="btn btn-inverse" name="addEmp" id="addEmp" onclick="{location.href='addEmp.jsp'}">
											<i class="glyphicon glyphicon-plus" ></i>添加员工</button>
									</span>
								</div>
<!-- 							</form>
 -->							<br />

						</div>

					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="panel panel-primary">
							<!-- Default panel contents -->
							<div class="panel-heading">员工信息</div>
							<!-- Table -->
							<form>
								<table class="table">
									<thead>
										<tr>
											<th>编号</th>
											<th>姓名</th>
											<th>性别</th>
											<th>联系方式</th>
											<th>所属部门</th>
											<th>职位</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<s:iterator value="list" var="emp">
											<tr class="list-group-item-success">

												<td><s:property value="#emp.empId" /></td>
												<td><s:property value="#emp.empName" /></td>
												<td><s:property value="#emp.empSex" /></td>
												<td><s:property value="#emp.empPhone" /></td>
												<td><s:property value="#emp.empDepart" /></td>
												<td><s:property value="#emp.empJob" /></td>
												<td>
													<%--  											<s:a href="update.action?empId=%{#emp.empId}"  class="btn btn-danger" >修改</s:a>
 --%> <a
													href="<s:url action="/Page/Console/update_get.action">  
                   								 <s:param name="empId" value="#emp.empId"/>  
               									  </s:url>"
													class="btn btn-info ">更新 </a> &nbsp;&nbsp;&nbsp;&nbsp; 
													 <a
													href="<s:url action="delete.action">  
                   								 <s:param name="empId" value="#emp.empId"/>  
               									  </s:url>"
													class="btn btn-danger" onclick="return confirm('确认删除?')">删除 </a>
												</td>
											</tr>
										</s:iterator>
									</tbody>
								</table>
								 
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
	<script type="text/javascript">  
		    function jump(){  
		    var1 = document.getElementById ("info").value;//获取该text对象  
		        location.href='search.action?info='+var1;  
		    }  
</script>  

</body>
</html>
