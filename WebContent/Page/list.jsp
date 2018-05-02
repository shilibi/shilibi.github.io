<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:debug>debug</s:debug>
<form action="${pageContext.request.contextPath}/list.action" method="post">
									<s:iterator value="list" var="emp">
										<s:property value="emp.empId"/>		
										<s:property value="emp.empName"/>
										<s:property value="emp.empSex"/>
										<s:property value="emp.empPhone"/>
										<s:property value="emp.empDepart"/>			
										<s:property value="emp.empJob"/>
										<a href="#" class="btn btn-primary ">修改</a>
										&nbsp;&nbsp;&nbsp;&nbsp;
										<a href="#" class="btn btn-danger">删除</a>
									</s:iterator>
											
</form>
</body>
</html>