<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>个人中心</title>

    <!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- PAGE LEVEL STYLES -->
    <link href="assets/css/prettyPhoto.css" rel="stylesheet" />
    <!--CUSTOM BASIC STYLES-->
    <link href="assets/css/basic.css" rel="stylesheet" />
    <!--CUSTOM MAIN STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href="../css/bootstrap-datetimepicker.min.css" rel="stylesheet">
    <link href="../css/font-awesome.min.css" rel="stylesheet">
	<link href="../css/bootstrap.min.css" rel="stylesheet">
	<link href="../css/flexslider.css" rel="stylesheet">
	<link href="../css/templatemo-style.css" rel="stylesheet">
	<link rel="stylesheet" href="assets/css/form-elements.css">
	    
</head>
<body>
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index_guest.jsp">XXXX酒店</a>
            </div>

            <div class="header-right">

              <a href="message-task.html" class="btn btn-info" title="New Message"><b>30 </b><i class="fa fa-envelope-o fa-2x"></i></a>
                <a href="message-task.html" class="btn btn-primary" title="New Task"><b>40 </b><i class="fa fa-bars fa-2x"></i></a>
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
                        <a  href="index_guest.jsp" class="active-menu"><i class="fa fa-dashboard "></i>预约房间</a>
                    </li>
                    <li>
                        <a  href="listOrder.action" ><i class="fa fa-dashboard "></i>历史订单</a>
                    </li>
                    <li>
                        <a  href="changePwd.jsp"><i class="fa fa-dashboard "></i>修改密码</a>
                    </li>
                </ul>
            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper">
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-head-line">现在预约</h1>
                        <h1 class="page-subhead-line">您可以通过点击房间下预约按钮进行预约 </h1>

                    </div>
                </div>
                <!-- /. ROW  -->
                <div id="port-folio">
                      <div class="row " >
                          <ul id="filters" >
						<li><span class="filter active" data-filter="double big awesome">全部</span></li>
						<li><span class="filter active">/</span></li>
						<li><span class="filter" data-filter="big">大床</span></li>
						<li><span class="filter">/</span></li>
						<li><span class="filter" data-filter="double">标间</span></li>
						<li><span class="filter">/</span></li>
						<li><span class="filter" data-filter="awesome">套房</span></li>
					</ul>
                <div class="col-md-4 ">

                    <div class="portfolio-item big mix_all" data-cat="big" >


                        <img src="assets/img/portfolio/f.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                               	面积：200
                                </span>
                               	巴黎
                            </p>
					<a class="preview btn btn-info btn-xs" title="Image Title Here" href="assets/img/portfolio/f.jpg"><i class="fa fa-plus fa-2x"></i></a>
 						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary btn-lg" name="roomId" id="roomId1"    onclick="javascript:getValue1()" data-toggle="modal" data-target="#myModal">
 				现在预约
						</button>                        </div>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div class="portfolio-item double mix_all" data-cat="double" >
                        <img src="assets/img/portfolio/a.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                               面积：199
                                </span>
                            	 新加坡
                            </p>
 						<a class="preview btn btn-info btn-xs" title="Image Title Here" href="assets/img/portfolio/a.jpg"><i class="fa fa-plus fa-2x"></i></a>
 						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 					<button type="button" class="btn btn-primary btn-lg" name="roomId" id="roomId1"    onclick="javascript:getValue2()" data-toggle="modal" data-target="#myModal">
 				现在预约
						</button>
					   </div>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div class="portfolio-item big mix_all" data-cat="big" >


                        <img src="assets/img/portfolio/g.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                          <p>
                                <span>
                          		     面积：155
                                </span>
									洛杉矶                         
                            </p>
		<a class="preview btn btn-info btn-xs" title="Image Title Here" href="assets/img/portfolio/g.jpg"><i class="fa fa-plus fa-2x"></i></a>
 						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary btn-lg" name="roomId" id="roomId1"    onclick="javascript:getValue3()" data-toggle="modal" data-target="#myModal">
 				现在预约
						</button>                        </div>
                    </div>
                </div>

            </div>

            <div class="row " style="padding-top: 50px;">
                <div class="col-md-4 ">

                    <div  class="portfolio-item big mix_all" data-cat="big" >


                        <img src="assets/img/portfolio/d.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                           <p>
                                <span>
                       			       面积：166
                                </span>
  									纽约                            
                            </p>
                            	<a class="preview btn btn-info btn-xs" title="Image Title Here" href="assets/img/portfolio/d.jpg"><i class="fa fa-plus fa-2x"></i></a>
 						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary btn-lg" name="roomId" id="roomId1"    onclick="javascript:getValue4()" data-toggle="modal" data-target="#myModal">
 				现在预约
						</button>                        </div>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div  class="portfolio-item big mix_all" data-cat="big" >


                        <img src="assets/img/portfolio/e.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
									面积：168
                                </span>
								新西兰                              
                            </p>
                            	<a class="preview btn btn-info btn-xs" title="Image Title Here" href="assets/img/portfolio/e.jpg"><i class="fa fa-plus fa-2x"></i></a>
 						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary btn-lg" name="roomId" id="roomId1"    onclick="javascript:getValue5()" data-toggle="modal" data-target="#myModal">
 				现在预约
						</button>                        </div>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div  class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="assets/img/portfolio/i.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                          <p>
                                <span>面积：200</span>
								白宫                               
                            </p>
                            	<a class="preview btn btn-info btn-xs" title="Image Title Here" href="assets/img/portfolio/i.jpg"><i class="fa fa-plus fa-2x"></i></a>
 						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary btn-lg" name="roomId" id="roomId1"    onclick="javascript:getValue6()" data-toggle="modal" data-target="#myModal">
 				现在预约
						</button>                        </div>
                    </div>
                </div>

            </div>
                    <div class="row "  style="padding-top: 50px;" >
                <div class="col-md-4 ">

                    <div  class="portfolio-item awesome mix_all" data-cat="awesome" >


                        <img src="assets/img/portfolio/h.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
            	                		    面积：200                                </span>
									珍珠港                            
                            </p>
                            	<a class="preview btn btn-info btn-xs" title="Image Title Here" href="assets/img/portfolio/h.jpg"><i class="fa fa-plus fa-2x"></i></a>
 						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary btn-lg" name="roomId" id="roomId1"    onclick="javascript:getValue7()" data-toggle="modal" data-target="#myModal">
 				现在预约
						</button>                          </div>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div  class="portfolio-item double mix_all" data-cat="double" >


                        <img src="assets/img/portfolio/b.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                            <p>
                                <span>
                               面积：199
                                </span>
						香港                   </p>
                            	<a class="preview btn btn-info btn-xs" title="Image Title Here" href="assets/img/portfolio/b.jpg"><i class="fa fa-plus fa-2x"></i></a>
 						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary btn-lg" name="roomId" id="roomId1"    onclick="javascript:getValue8()" data-toggle="modal" data-target="#myModal">
 				现在预约
						</button>                          </div>
                    </div>
                </div>
                <div class="col-md-4 ">

                    <div  class="portfolio-item double mix_all" data-cat="double" >


                        <img src="assets/img/portfolio/c.jpg" class="img-responsive " alt="" />
                        <div class="overlay">
                          <p>
                                <span>
面积：100                                </span>
东京                             
                            </p>
                            	<a class="preview btn btn-info btn-xs" title="Image Title Here" href="assets/img/portfolio/c.jpg"><i class="fa fa-plus fa-2x"></i></a>
 						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary btn-lg" name="roomId" id="roomId1"    onclick="javascript:getValue9()" data-toggle="modal" data-target="#myModal">
 				现在预约
						</button>                          </div>
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
        Copyright &copy; 2018.XXXX酒店All rights reserved.   </div>
    <!-- /. FOOTER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.js"></script>
     <!-- PAGE LEVEL SCRIPTS -->
    <script src="assets/js/jquery.prettyPhoto.js"></script>
    <script src="assets/js/jquery.mixitup.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="assets/js/jquery.metisMenu.js"></script>
    <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
     <!-- CUSTOM Gallery Call SCRIPTS -->
    <script src="assets/js/galleryCustom.js"></script>
    	<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
	<!-- jQuery -->
	<script type="text/javascript" src="js/moment.js"></script>
	<!-- moment.js -->
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<!-- bootstrap js -->
	<script type="text/javascript" src="../js/bootstrap-datetimepicker.min.js"></script>
	<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
	<!-- jQuery -->
	<script type="text/javascript" src="js/moment.js"></script>
	<!-- moment.js -->
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<!-- bootstrap js -->
	<script src="js/jquery.backstretch.min.js"></script>
	<script src="js/scripts.js"></script>
	<script type="javascript" src="js/jquery.flexslider-min.js"></script>
	<script src="js/scripts.js"></script>
	<script type="text/javascript" src="js/templatemo-script.js"></script>
	<!-- Templatemo Script -->
	
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="modal-register-label" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">预约</span>
					</button>
					<h3 class="modal-title" id="modal-register-label">ÃÂ©ÃÂ¢ÃÂÃÂ§ÃÂºÃÂ¦</h3>
					<p>请填写下方表格以完成预约</p>
				</div>

				<div class="modal-body">
					<form role="form"
						action="${pageContext.request.contextPath}/orderGuest.action"
						method="post" class="registration-form">
						<div class="form-group">
							<label class="sr-only" for="form-first-name"></label>
							<input type="text" id="roomId" name="roomId"
								 class="form-first-name form-control"
								id="form-first-name" readonly>
						</div>
						
						<div class="form-group">
							<label class="sr-only" for="form-first-name"></label>
							<input type="text" id="liveTime" name="liveTime"
								 class="form-first-name form-control"
								id="form-first-name" placeholder="请输入入住时间，格式：2018-01-01">
								
						</div>
						<div class="form-group">
							<label class="sr-only" for="form-first-name"></label>
							<input type="text" id="leaveTime" name="leaveTime"
								 class="form-first-name form-control"
								id="form-first-name" placeholder="请输入离店时间，格式：2018-01-01">
								
						</div>
						<div class="form-group">
							<label class="sr-only" for="form-first-name"></label>
							<input type="text" id="guestPhone" name="guestPhone"
								 class="form-first-name form-control"
								id="form-first-name" placeholder="请输入联系方式">
						</div>
						<br/>
						<br/>
						<br/>
						<button type="submit" class="btn">预&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;约</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script>
		
	/* $("#roomId1").click(function(){
		
 		getValue(); 	
 	}); */
	function getValue1()
	{
		$("#roomId").val("6001");
	}
 	function getValue2()
	{
		$("#roomId").val("6002");
	}
	function getValue3()
	{
		$("#roomId").val("8008");
	}
	function getValue4()
	{
		$("#roomId").val("8006");
	}
	function getValue5()
	{
		$("#roomId").val("8888");
	}
	function getValue6()
	{
		$("#roomId").val("7001");
	}
	function getValue7()
	{
		$("#roomId").val("7002");
	}
	function getValue8()
	{
		$("#roomId").val("6006");
	}
	function getValue9()
	{
		$("#roomId").val("7003");
	}
	</script>
	
</body>
</html>
