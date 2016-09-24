<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		user add error!
		<s:fielderror fieldName="name" theme="simple" />
		<s:property value="errors.name[0]" />
		<s:property value="errors.name[1]" />
		<s:property value="#session"/>
		<s:property value="#attr"/>
		<s:property value="#action"/>
		<s:property value="#parameters"/>
		<%--<s:property value="#application"/>
		--%>
		<%--<s:property value="#request"/>
		--%>
		<s:debug></s:debug>
	</body>
</html>