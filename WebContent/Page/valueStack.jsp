<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 使用struts2标签查看值栈结构 -->
	<s:debug></s:debug>
	
	<!-- 1 获取字符串值 -->
	<s:property value="username"/>
	
	<!-- 2 获取值栈对象的值 -->
	<br/>
	获取对象的值：
	<br/>
	<s:property value="user.username"/>
	<s:property value="user.password"/>
	<s:property value="user.address"/>
	
	<br/>
	获取list的值第一种方式：
	<br/>
	<!-- 3 获取值栈list集合数据 -->
	<!-- 第一种方式实现  -->
	<s:property value="list[0].username"/>
	<s:property value="list[0].password"/>
	<s:property value="list[0].address"/>
	<br/>
	<s:property value="list[1].username"/>
	<s:property value="list[1].password"/>
	<s:property value="list[1].address"/>
	
	<br/>
	获取list的值第二种方式：
	<br/>
	<!-- 使用struts2标签 类似jstl的foreach标签
		s:iterator：遍历值栈的list集合
	 -->
	 <s:iterator value="list">
	 	<!-- 遍历list得到list里面每个user对象 -->
	 	<s:property value="username"/>
	 	<s:property value="password"/>
	 	<s:property value="address"/>
	 	<br/>
	 </s:iterator>
	 
	  <br/>
	 <br/>
	获取list的值第三种方式：
	<br/>
	<s:iterator value="list" var="user">
		<!-- 
			遍历值栈list集合，得到每个user对象
			机制： 把每次遍历出来的user对象放到 context里面
			获取context里面数据特点：写ognl表达式，
			使用特殊符号 #
		 -->
		<s:property value="#user.username"/>
		<s:property value="#user.password"/>
		<s:property value="#user.address"/>
		<br/>
	</s:iterator>
	
	<br/>
	<!-- 使用foreach标签+el表达式获取值栈list集合数据 -->
	<c:forEach items="${list }" var="user">
		${user.username }
		${user.password }
		${user.address }
		<br/>
	</c:forEach>
	
	<br/>
	<br/>
	<!-- 获取set方法设置的值  根据名称获取值-->
	<%-- <s:property value="itcast"/> --%>
	
	<br/>
	<!-- 获取push方法设置的值 -->
	<%-- <s:property value="[0].top"/> --%>
</body>
</html>









