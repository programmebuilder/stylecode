<%@page import="java.awt.Window"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page
	import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@ page import="org.springframework.security.core.Authentication"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="s"%>





<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Spring Security Example</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>

</head>
<body>
	<!--로그인 권한별로 주기  -->
	<sec:authorize ifAnyGranted="ROLE_ADMIN">
	ROLE_ADMIN 형태출력
</sec:authorize>
	<sec:authorize ifAnyGranted="ROLE_USER">
	ROLE_USER 형태출력
</sec:authorize>
	<sec:authorize ifAnyGranted="ROLE_MANAGER">
	ROLE_MANAGER 형태 출력
</sec:authorize>

	
	<br />
</body>
</html>