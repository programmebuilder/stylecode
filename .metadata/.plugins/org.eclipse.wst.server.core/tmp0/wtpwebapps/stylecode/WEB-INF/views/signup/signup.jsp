<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--CSS파일  -->
<link rel="stylesheet" type="text/css" href="../resources/dist/css/HgCss/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../resources/dist/css/HgCss/login.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<div class=cc>
	<h3>SIGN UP</h3>
</div>
<hr>
<body cellpadding="0" cellspacing="0" marginleft="0" margintop="0"
	width="100%" height="100%" align="center">

	<div class="card align-middle"
		style="width: 20rem; border-radius: 20px;">
		<div class="card-title" style="margin-top: 30px;">
			<h2 class="card-title text-center" style="color: #113366;">회원가입
			</h2>
		</div>


		<!-- 회원가입 폼 START -->
		<div class="card-body">
			<form class="form-signin" action="/SignUpInsert">

				<!--회원가입 이메일 주소 적기 -->
				<label for="inputEmail" class="sr-only">Email을 입력해주세요</label> <input
					type="email" id="mId" name="mId" class="form-control"
					placeholder="Your Email" required autofocus> <br>


				<!--회원가입 비밀번호 적기  -->
				<label for="inputPassword" class="sr-only">Password</label> <input
					type="password" id="mPassword" name="mPassword" class="form-control"
					placeholder="Password" required><br>

				<!--회원가입 비밀번호 확인 체크  -->

				<label for="inputPasswordcheack" class="sr-only">PasswordCheck
					Cheack</label> <input type="password" name="chpass" id="chpass"
					class="form-control" placeholder="PasswordCheak" required>
				<font name="check" size="2" color="red"></font><br>


				<!--회원가입 이름적기 -->

				<label for="inputName" class="sr-only">Name</label> <input
					type="text" name="mNm" class="form-control"
					placeholder="이름을 입력해주세요" required><br>

				<!--회원가입 휴대번호 적기 -->

				<label for="inputPhoneNum" class="sr-only">Phone</label> <input
					type="text" name="mPhone" class="form-control"
					placeholder="휴대폰번호를-제외하고적어주세요" required><br> <label
					for="inputBirth" class="sr-only">생년월일</label> 생년월일:<select
					name="birth1">
					<%
						for (int i = 2013; i > 1950; i--) {
					%>
					<option value="<%=i%>">
						<%=i%></option>
					<%
						}
					%>
				</select>년&nbsp; <select name="birth2">
					<%
						for (int i = 1; i <= 12; i++) {
					%>
					<option value="<%=i%>">
						<%=i%></option>
					<%
						}
					%>
				</select> <select name="birth3">
					<%
						for (int i = 1; i <= 31; i++) {
					%>
					<option value="<%=i%>">
						<%=i%></option>
					<%
						}
					%>
				</select>일<br> <Br>


				<button id="btn-Yes" class="btn btn-lg btn-primary btn-block"
					type="submit" disabled="disabled">회원가입하기</button>
				<button id="btn=No" class="btn btn-lg btn-warning btn-block"
					type="reset">다시적기</button>
			</form>

		</div>
	</div>

</body>
<!--script선언부  -->
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="../resources/dist/js/Hgjs/signup/signup.js"></script>
</html>