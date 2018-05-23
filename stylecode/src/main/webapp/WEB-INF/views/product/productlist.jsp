<%-- <%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--부트스트랩 css  -->
<link rel="stylesheet" type="text/css"
	href="../resources/dist/css/HgCss/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="../resources/dist/css/HgCss/4-col-portfolio.css">
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<hr>
	<!--카테고리 선택   -->
	<div class="container">
		<div class="aa"
			style="display: inline; position: absolute; width: 50%;">
			<button type="submit" class="btn btn-warning "
				style="margin-top: 2%; margin-left: 1%;">낮은 가격순</button>
			<button type="submit" class="btn btn-primary"
				style="margin-top: 2%; margin-left: 1%;">높은 가격순</button>
		</div>


		<!--검색바 생성  -->
		<div style="margin-right: 20px; margin-top: 3%">
			<form class="form-search form-inline"
				style="position: absolute; right: 10%;">
				<div class="input-append">
					<input type="text" class="search-query" name="searchKey"
						placeholder="Search..." />
					<button type="submit" class="btn btn-outline-dark">Search</button>
				</div>
			</form>
		</div>
	</div>
	<br>
	<br>
	<br>
	<!-- 상품 리스트 뿌려주기 -->
	
	
	
	<c:forEach var="productItem" items="${list }">
		<div>

			<div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
				<div class="card h-100">
					<!-- <a href="#"><img class="card-img-top" src=../resources/dist/img/(${productItem.pImg}).${subString }
					  alt="" width="253px" height="375px"></a> -->
					<div class="card-body">
						<h4 class="card-title">
							<a href="#">${productItem.pNm }</a>
						</h4>

						<p class="card-text">${productItem.mPrice }</p>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>


</body>

<!--script  -->
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="../resources/dist/js/Hgjs/bootstrap.js"></script>
<script src="../resources/dist/js/Hgjs/gulpfile.js"></script>
<script src="../resources/dist/js/Hgjs/productbutton/productbutton.js"></script>


</html>

 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>4 Col Portfolio - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link href="../resources/dist/css/HgCss/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link rel="stylesheet" type="text/css"
	href="../resources/dist/css/HgCss/4-col-portfolio.css">

</head>

<body>

	<hr>
	<!--카테고리 선택   -->
	<div class="container">
		<div class="aa"
			style="display: inline; position: absolute; width: 50%;">
			<button type="submit" class="btn btn-warning "
				style="margin-top: 2%; margin-left: 1%;">낮은 가격순</button>
			<button type="submit" class="btn btn-primary"
				style="margin-top: 2%; margin-left: 1%;">높은 가격순</button>
		</div>


		<!--검색바 생성  -->
		<div style="margin-right: 20px; margin-top: 3%">
			<form class="form-search form-inline"
				style="position: absolute; right: 10%;">
				<div class="input-append">
					<input type="text" class="search-query" name="searchKey"
						placeholder="Search..." />
					<button type="submit" class="btn btn-outline-dark">Search</button>
				</div>
			</form>
		</div>
	</div>
	<div class="container">
		<h1 class="my-4">&ensp; &ensp;</h1>
		<div class="row" style="margin-top: 5%;">
			<c:forEach var="i" items="${list }">

				<div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
					<div class="card h-100">
						<a href="#"><img class="card-img-top"
							src=../resources/dist/img/credit/cirrus.png alt="" width="253px"
							height="375px"></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="#">${i.pNm }</a>
							</h4>

							<p class="card-text">${i.mPrice }</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<!-- /.row -->

	<!-- Pagination -->
	<ul class="pagination justify-content-center">
		<li class="page-item"><a class="page-link" href="#"
			aria-label="Previous"> <span aria-hidden="true">&laquo;</span> <span
				class="sr-only">Previous</span>
		</a></li>
		<li class="page-item"><a class="page-link" href="#">1</a></li>
		<li class="page-item"><a class="page-link" href="#">2</a></li>
		<li class="page-item"><a class="page-link" href="#">3</a></li>
		<li class="page-item"><a class="page-link" href="#"
			aria-label="Next"> <span aria-hidden="true">&raquo;</span> <span
				class="sr-only">Next</span>
		</a></li>
	</ul>




	<!-- Footer -->


	</footer>

	<!-- Bootstrap core JavaScript -->
	<script src="../resources/dist/js/Hgjs/jquery.min.js"></script>
	<script src="../resources/dist/js/Hgjs/bootstrap.bundle.min.js"></script>
	<script src="../resources/dist/js/Hgjs/productbutton/productbutton.js"></script>
</body>

</html>
