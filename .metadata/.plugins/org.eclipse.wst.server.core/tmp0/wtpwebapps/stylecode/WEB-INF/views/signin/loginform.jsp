<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page
	import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@ page import="org.springframework.security.core.Authentication"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>직원 관리</title>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="modal-dialog">

		<div>
			<h1 style="font-size: x-large;">
				Spring Security<small>v.인메모리</small>
			</h1>
		</div>
		<!-- Modal content-->
		<div class="modal-content">

			<div class="modal-header" style="padding: 35px 50px;">
				<h4>
					<span class="glyphicon glyphicon-lock"></span> 로그인
				</h4>
				<label>정상적인 서비스 사용을 위해서 로그인해야 합니다.
			
					<%=session.getAttribute("mId") %> </label>
			</div>


			<div class="modal-body" style="padding: 40px 50px;">
				<form role="form" method="post" action="j_spring_security_check">
					<div class="form-group">
						<label for="id"> ID :</label> <input type="text"
							class="form-control" id="id" name="j_username"
							placeholder="Enter ID" required="required">
					</div>
					<div class="form-group">
						<label for="pw"> Password :</label> <input type="password"
							class="form-control" id="pw" name="j_password"
							placeholder="Enter Password" required="required">
					</div>
					
					<button type="submit" class="btn btn-default btn-block">
						Login</button>
				</form>

			</div>
			<div class="modal-footer"></div>
		</div>

	</div>
</body>
</html>