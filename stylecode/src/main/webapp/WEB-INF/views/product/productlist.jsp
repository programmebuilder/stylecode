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
<%@page import="java.util.Random"%>
<%@page import="java.util.List"%>
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

	<hr>
	<!--카테고리 선택   -->
	<div class="container">
		<div class="aa"
			style="display: inline; position: absolute; width: 50%;">
			<button type="submit" class="btn btn-warning "
				style="margin-top: 2%; margin-left: 1%;">낮은 가격순</button>
			<button type="submit" class="btn btn-primary"
				style="margin-top: 2%; margin-left: 1%;">높은 가격순</button>
			<button type="button" class="btn btn-lg" data-toggle="modal"
				style="margin-top: 2%; margin-left: 1%;" data-target="#myModal2">상품추천</button>
		</div>
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
	</div>


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
						<h1 class="my-4">&ensp; &ensp;</h1>
						<div class="row" style="margin-top: 5%;">
							<c:forEach var="i" items="${list }">
								<c:if test="${i.penRollNo >=5000 && i.penRollNo<=5030}">
									<div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
										<div class="card h-100">
											<a href="#"><img class="card-img-top" src=${i.pImg }
												alt="" width="150px" height="150px"></a>
											<div class="card-body">
												<h4 class="card-title">
													<a href="#">${i.pNm }</a>
												</h4>
												<p>${i.penRollNo }</p>
												<p class="card-text">${i.mPrice }
													<input type="checkbox" name="chk" value="${i.penRollNo }">
												</p>
											</div>
										</div>
									</div>
								</c:if>
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



	<div class="container">
		<h1 class="my-4">&ensp; &ensp;</h1>
		<div class="row" style="margin-top: 5%;">
			<c:forEach var="i" items="${list }" begin="0" end="20">
				<div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
					<div class="card h-100">
						<a href="#"><img class="card-img-top" src=${i.pImg } alt=""
							width="253px" height="375px"></a>
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
