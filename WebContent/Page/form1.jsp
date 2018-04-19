<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/guestRegister.action" method="post">
		guestName:<input type="text" name="guestName"/>
		<br/>
		guestPwd:<input type="text" name="guestPwd"/>
		<br/>
		guestSex:<input type="text" name="guestSex"/>
		<br/>
		guestCdtType:<input type="text" name="guestCdtType"/>
		<br/>
		guestId:<input type="text" name="guestId"/>
		<br/>
		guestPhone:<input type="text" name="guestPhone"/>
		<br/>
		<input type="submit" value="提交"/>
	</form>
	<form action="${pageContext.request.contextPath}/empLogin.action" method="post">
		编号：<input type="text" name="empId"/>
		<br/>
		密码:<input type="text" name="empPwd"/>
		<br/>
		<input type="submit" value="登录"/>
	 
	
	</form>
	<form action="${pageContext.request.contextPath}/guestLogin.action" method="post">
		<a>顾客登录</a>
		编号：<input type="text" name="guestId"/>
		<br/>
		密码:<input type="text" name="guestPwd"/>
		<br/>
		<input type="submit" value="登录"/>
	 
	
	</form>
	
	
</body>
</html>