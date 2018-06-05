<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page
	import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@ page import="org.springframework.security.core.Authentication"%>
<!DOCTYPE html>
<html>
<head>
<!-- 부트스트랩  프레임워크 -->
<link rel="stylesheet"
	href="../resources/YJH/bootstrap/css/bootstrap.min.css" />
<!-- CUSTOM  CSS -->
<link rel="stylesheet" href="../resources/YJH/bootstrap/css/header.css" />
<!-- FonTello  CSS -->
<link rel="stylesheet"
	href="../resources/YJH/bootstrap/css/fontello.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>header</title>
</head>
<body>
	<div class="wrapper" style="background-color: #D3CBBD;">
		<div class="container" style="padding: 50px;">

			<div class="row">
				<div id="hTitle">
					<a href="../index.jsp" style="color: black;">Middle Project</a>
				</div>
			</div>

			<div class="row">
				<div id="hLMn" class="col-11" style="padding: 0px">
					<ul>
						<li class="nav-item"><a href="../index.jsp">상품추천</a></li>
						<li class="nav-item"><a
							href="../LoginProduct/productlist.jsp">상품검색</a></li>
						<li class="nav-item"><a
							href="<c:url value='/shoppingmall/ShoppingMall'/>">쇼핑몰</a></li>
						<li class="nav-item"><a href="../printBoard.do">모아보기</a></li>


						<!--stylecode 관리자만 사용할 수 있음 -->
						<sec:authorize ifAnyGranted="ROLE_ADMIN">
							<li class="nav-item"><a href="......">쇼핑몰 입점관리</a></li>
						</sec:authorize>

					</ul>
				</div>
				<div id="hRMn" class="col-1">
					<ul>
						<!-- fontello 아이콘 사용을 위한 부분  -->
						<!--회원별 권한별로 주기  -->

						<!--로그인 하였을때 북마크리스트로 가는 아이콘 뽑아줌  -->
						<!-- 로그인 되었을때 로그아웃창 -->
						<!-- 로그인 되었을때 마이페이지창 -->
						<%
							if (session.getAttribute("mId") == null) {
						%>

						<li class="nav-item"><a href="/loginform">&#xe802</a></li>

						<%
							}
						%>



						<%
							if (session.getAttribute("mId") != null) {
						%>
						<li class="nav-item"><a href="/logoutform">&#xe803</a></li>
						<li class="nav-item"><a href="../bookmark/bookmarklist.do">&#xe800</a></li>
						<li class="nav-item"><a href="#">&#xe801</a></li>
						<%
							}
						%>


					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- JQuery JavaScript 추가  -->
	<script type="text/javascript"
		src="../resources/YJH/bootstrap/js/jquery-3.3.1.min.js"></script>
	<!-- Popper JavaScript 추가 -->
	<script type="text/javascript"
		src="../resources/YJH/bootstrap/js/popper.js"></script>
	<!-- Bootstrap JavaScript 추가 -->
	<script type="text/javascript"
		src="../resources/YJH/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>