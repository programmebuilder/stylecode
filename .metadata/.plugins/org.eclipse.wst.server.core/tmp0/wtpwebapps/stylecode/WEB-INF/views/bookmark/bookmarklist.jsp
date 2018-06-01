<%@page import="stylecode.kosta180.domain.ShoppingMallVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="../resources/bootstrap/js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="../resources/bootstrap/css/bootstrap.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쇼핑몰 즐겨찾기</title>
<style type="text/css">
.list-group a {
	font-size: 20px;
	font-family: NanumGothic;
	color: black;
}

.menu_tit {
	font-size: 35px;
	color: black;
	font-family: NanumGothic;
}

.ic_new {
	font-size: 35px;
	color: black;
	font-family: NanumGothic;
}

h2 {
	margin: 30px 0;
}
</style>
</head>
<%
	List<ShoppingMallVO> list =(List)request.getAttribute("list");
%>



<body>
		<%@include file="../header.jsp"%>
	<div class="container">
		<h2 style="margin-left: 200px;">
			<a href="#" class="menu_tit">나만의<em class="ic_new">
					BookMark</em></a>
		</h2>

		<!-- 즐겨찾기 리스트 -->
		<div class="list-group"
			style="margin-left: 200px; margin-right: 200px;">
			<table>
				<c:forEach var="i" items="${list}">
					<p
						class="list-group-item list-group-item-action list-group-item-white">
						<img width="100px" height="100px" alt="사진이 없음" src="${i.spmTn}">
						<a id="spmbm" href="../spmDetail/Spmdetail.do?spmEnrollNo=${i.spmEnrollNo}">
							<span>&emsp;</span>${i.spmNm}</a><span>&emsp;/스타일태그/</span><span>&emsp;&emsp;&emsp;</span>
						<a href="/bookmark/deletebookmark?spmEnrollNo=${i.spmEnrollNo}">
							<button
								style="position: absolute; right: 2%; border: none; background: none;">
								<img  src="../resources/MH/images/delete.png">
							</button>
						</a>

					</p>
				</c:forEach>
			</table>

		</div>
		<%@include file="../footer.jsp"%>
</body>
</html>