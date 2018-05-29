<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- 부트스트랩  프레임워크 -->
<link rel="stylesheet" href="../resources/YJH/bootstrap/css/bootstrap.min.css" />
<!-- CUSTOM  CSS -->
<link rel="stylesheet" href="../resources/YJH/bootstrap/css/header.css" />
<!-- FonTello  CSS -->
<link rel="stylesheet" href="../resources/YJH/bootstrap/css/fontello.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>header</title>
</head>
<body>
<div class="container-fluid">

	<div class="row">
		<div id="hTitle"><a href="../index.jsp" style="color:black;">Middle Project</a></div>
	</div>
	
	<div class="row">
		<div id="hLMn" class="col-11">
			<ul>
				<li class="nav-item"><a href="../index.jsp">상품추천</a></li>
				<li class="nav-item"><a href="../LoginProduct/productlist.jsp">상품검색</a></li>
				<li class="nav-item"><a href="<c:url value='/shoppingmall/ShoppingMall'/>">쇼핑몰</a></li>
				<li class="nav-item"><a href="../printBoard.do">모아보기</a></li>
			</ul>	
		</div>
		<div id="hRMn" class="col-1">
			<ul>
				<!-- fontello 아이콘 사용을 위한 부분  -->
				<li class="nav-item"><a href="../bookmark/bookmarklist.do">&#xe800</a></li>
				<li class="nav-item"><a href="../LoginProduct/login.jsp">&#xe802</a></li>				
				<li class="nav-item" hidden >&#xe803</li>
				
 
									
				
				<li class="nav-item"><a href="#">&#xe801</a></li>
			</ul>	
		</div>
	</div>
</div>
<!-- JQuery JavaScript 추가  -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/jquery-3.3.1.min.js"></script>
<!-- Popper JavaScript 추가 -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/popper.js"></script>
<!-- Bootstrap JavaScript 추가 -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>