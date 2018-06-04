<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Jua|Nanum+Pen+Script" rel="stylesheet">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<script type="text/javascript">
	
</script>
<title>4 Col Portfolio - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link href="../resources/dist/css/HgCss/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link rel="stylesheet" type="text/css"
	href="../resources/dist/css/HgCss/4-col-portfolio.css">

</head>

<body>
	<jsp:include page="../header.jsp" flush="true" />


	<hr>
	<!--카테고리 선택   -->
	<div class="container">
		<div class="aa"
			style="display: inline; position: absolute; width: 50%;">
			<button type="button" class="btn btn-primary "
				style="margin-top: 2%; margin-left: 1%;">낮은 가격순</button>
			<button type="button" class="btn btn-danger"
				style="margin-top: 2%; margin-left: 1%;">높은 가격순</button>
			<button type="button" class="btn btn-light" data-toggle="modal"
				style="margin-top: 2%; margin-left: 1%;" data-target="#myModal2">상품추천</button>
		</div>
	</div>
	<!--검색바 생성  -->

	


	<div class="modal fade" id="myModal2" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">×</span><span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">나에게맞는 스타일찾기</h4>
				</div>
				<div class="modal-body">
					<form action="/recommendCheakBox" method="get"
						entype="multipart/form-data">
						<h1 class="my-4"></h1>
						<div class="row" style="margin-top: 5%;">
							<!-- 추천모달 검색창 -->
							<c:forEach var="a" items="${recommendList }" begin="1" end="20">
								<div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
									<div class="card h-100">
										<a href="#"><img class="card-img-top" src=${a.pImg }
											alt="" width="150px" height="150px"></a>
										<div class="card-body">
										<div class="description">
											<h4 class="card-title">
												<a href="#">${a.pNm }</a>
											</h4>
											</div>
											<div class="price">
											<p class="card-text">${a.mPrice }
												<input type="checkbox" name="chk" value="${a.penRollNo }">
											</p>
											</div>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="submit" class="btn btn-primary">Save
								changes</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


	<!--상품 뿌려주기위한 부분  -->
	<div class="container">
	<div style=" margin-top: 3%">
		<form class="form-search form-inline" action="productlist">
			<div class="input-append">
				<input type="text" class="search-query" name="searchKey"
					placeholder="Search..." />
				<button type="submit" class="btn btn-outline-dark" style="vertical-align: top;">Search</button>
			</div>
		</form>
	</div>
		<h1 class="my-4">&ensp; &ensp;</h1>
		<div class="row" style="margin-top: 5%;">
			<c:forEach var="i" items="${list }">
				<div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
					<div class="card h-100">
						<a href="${i.prodUrl }" target="_blank"><img
							class="card-img-top" src=${i.pImg } alt="" width="253px"
							height="375px"></a>
						<div class="card-body">
						<div class="description">
							<h4 class="card-title">
								<a href="#">${i.pNm }</a>
							</h4>
							</div>
							<div class="price">
							<p class="card-text">${i.mPrice }</p>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<!-- /.row -->

	<!-- 페이징처리 -->
	<ul class="pagination justify-content-center">
		<!-- 이전 -->
		<c:if test="${pageMaker.prev}">
			<li class="page-item"><a class="page-link"
				href="productlist${pageMaker.makeSearch(pageMaker.startPage - 1) }">&laquo;</a></li>
		</c:if>

		<!-- 페이지 목록 -->
		<c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }"
			var="idx">
			<li class="page-item"
				<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
				<a class="page-link" href="productlist${pageMaker.makeSearch(idx)}">${idx}</a>
			</li>
		</c:forEach>

		<!-- 다음 -->
		<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
			<li class="page-item"><a class="page-link"
				href="productlist${pageMaker.makeSearch(pageMaker.endPage +1) }">&raquo;
			</a></li>
		</c:if>

	</ul>

	<!-- Footer -->
	<jsp:include page="../footer.jsp" flush="true" />

	</footer>

	<!-- Bootstrap core JavaScript -->
	<script src="../resources/dist/js/Hgjs/jquery.min.js"></script>
	<script src="../resources/dist/js/Hgjs/bootstrap.bundle.min.js"></script>
	<script src="../resources/dist/js/Hgjs/productbutton/productbutton.js"></script>
</body>

</html>