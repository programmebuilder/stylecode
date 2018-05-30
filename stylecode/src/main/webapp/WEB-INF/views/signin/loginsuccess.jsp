<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
    <%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
    <%@ page import="org.springframework.security.core.Authentication" %>
    
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
<!--�α��� ���Ѻ��� �ֱ�  -->
<sec:authorize ifAnyGranted="ROLE_ADMIN">
	ROLE_ADMIN �������
</sec:authorize>
<sec:authorize ifAnyGranted="ROLE_USER">
	ROLE_USER �������
</sec:authorize>
<sec:authorize ifAnyGranted="ROLE_MANAGER">
	ROLE_MANAGER ���� ���
</sec:authorize>

	<div class="container">
	${pageContext.request.userPrincipal}
		<h1>Welcome! ${pageContext.request.userPrincipal.name}! This is
			Login Success Page :)</h1>
		<a href="j_spring_security_logout" style="color: red">
			${pageContext.request.userPrincipal.name} �α׾ƿ�</a>
	</div>
</body>
</html>