<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>

	<form action="/register" method="post">
		아이디:<input type="text" name="id" required="required" /><br /> 비밀번호:<input
			type="password" name="pw" required="required" /><br /> <input
			type="submit" value="회원가입" />
	</form>

</body>
</html>
