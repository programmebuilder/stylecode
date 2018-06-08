<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page
	import="org.springframework.security.core.context.SecurityContextHolder"%>
<%@ page import="org.springframework.security.core.Authentication"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Bootstrap core JavaScript -->
<script src="../resources/dist/js/Hgjs/jquery.min.js"></script>
<script src="../resources/dist/js/Hgjs/bootstrap.bundle.min.js"></script>
<script src="../resources/dist/js/Hgjs/productbutton/productbutton.js"></script>
<link
	href="https://fonts.googleapis.com/css?family=Jua|Nanum+Pen+Script"
	rel="stylesheet">
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
<script>
	$(document).ready(function() {
		var rate;
		var mCode = $('#mCode').val();
		var pEnrollNo = $('#pEnrollNo').val();

		$('#recommend').click(function() {
			var rand = $('#rand').val();
			//alert("rand : " + rand);
		});

		$('.starRev span').click(function() {
			//별점 온/오프
			$(this).parent().children('span').removeClass('on');
			$(this).addClass('on').prevAll('span').addClass('on');

			rate = $(this).children('#starR').val();
			$('#rate').val(rate);
			sendRate(mCode, pEnrollNo, rate);

		});
	})

	function sendRate(mCode, pEnrollNo, rate) {
		console.log(mCode);

		$.ajax({
			type : 'post',
			url : '/rate',
			dataType : 'text',
			data : {
				"mCode" : mCode,
				"pEnrollNo" : pEnrollNo,
				"paramRate" : rate
			},
			success : function(data) {
				console.log(data);
			}
		});

	}
</script>
<style type="text/css">
.starRev {
	margin-left: 5%;
}

.starR {
	background:
		url('http://miuu227.godohosting.com/images/icon/ico_review.png')
		no-repeat right 0;
	background-size: auto 100%;
	width: 25px;
	height: 25px;
	display: inline-block;
	text-indent: -9999px;
	cursor: pointer;
}

.starR.on {
	background-position: 0 0;
}

#ok {
	width: 35px;
	height: 35px;
	background: transparent;
	border: none;
}

.modal-dialog.modal-fullsize {
	width: 90%;
	height: 100%;
	margin: 0;
	padding: 0;
}

.modal-content.modal-fullsize {
	height: auto;
	min-height: 100%;
	border-radius: 0;
}

.modal.modal-center {
	text-align: center;
}

@media screen and (min-width: 100%) {
	.modal.modal-center:before {
		display: inline-block;
		height: 100%;
	}
}

.modal-dialog.modal-center {
	display: inline-block;
	text-align: left;
	vertical-align: middle;
}

#submit {
	position: absoulte;
	right: 40%
}

#productRateModal {
	text-align: center;
    max-width: 950px;
}

#portfolio-item-id {
	width: 300px;
	display: inline-block;
}
</style>
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

			<!--회원일때 상품 추천 하는 버튼 (권한:ROLE_USER일때만 생성 -->
			<%if(session.getAttribute("mId")!=null){ %>
			<sec:authorize ifAnyGranted="ROLE_USER">
				<!--상품추천 선택   -->
				<button id="recommend" class="btn btn-outline-dark"
					data-target="#modal" data-toggle="modal"
					style="margin-top: 2%; margin-left: 1%;">추천 상품 보기</button>
			</sec:authorize>
			<%} %>


			<!--비회원일때 접속시 상품추천버튼 생김 아이템기반-->
			<%
				if (session.getAttribute("mId") == null) {
			%>
			<button type="button" class="btn btn-light" data-toggle="modal"
				style="margin-top: 2%; margin-left: 1%;" data-target="#myModal2">상품추천</button>
			<%
				}
			%>

		</div>
	</div>

	<!-- 회원일떄 상품추천 클릭시 모달창 -->
	<!-- 상품추천 모달 -->

	<div class="row">
		<div class="modal modal-center" id="modal" tabindex="-1" role="dialog">
			<div class="modal-dialog modal-fullsize modal-center" id="productRateModal" role="document">
				<div class="modal-content modal-fullsize">
					<div class="modal-header">
						<h3>회원 상품 추천</h3>
						<button class="close" data-dismiss="modal">&times;</button>
					</div>
					<div class="modal-body">

						<c:forEach var="i" items="${a_list }" begin="${rand}"
							end="${rand2}">
							<div class="col-lg-9 col-md-9 col-sm-6 portfolio-item" id="portfolio-item-id">
								<div class="card h-100">
									<a href="#"><img class="card-img-top" src=${i.pImg }
										alt="사진이 없음" width="150px" height="300px"></a>
									<div class="card-body" style="height: 180px";>
										<h5 class="card-title">
											<a href="#">${i.pNm }</a>
										</h5>
										<input type="hidden" id="pEnrollNo" value="${i.pEnrollNo }" />
										<p class="card-text">${i.mPrice }</p>
										<div class="starRev">
											<span class="starR"> <input id="starR" name="starR"
												type="hidden" value="1"> <img width="20px"
												height="20px" src="../resources/GW/image/emptystar.png" />
											</span> <span class="starR"><input id="starR" name="starR"
												type="hidden" value="2"> <img width="20px"
												height="20px" src="../resources/GW/image/emptystar.png"
												value="ratest" /> </span> <span class="starR"><input
												id="starR" name="starR" type="hidden" value="3"> <img
												width="20px" height="20px"
												src="../resources/GW/image/emptystar.png" value="ratest" />
											</span> <span class="starR"><input id="starR" name="starR"
												type="hidden" value="4"> <img width="20px"
												height="20px" src="../resources/GW/image/emptystar.png" />
											</span> <span class="starR"><input id="starR" name="starR"
												type="hidden" value="5"> <img width="20px"
												height="20px" src="../resources/GW/image/emptystar.png" />
											</span>
										</div>

										<input type="hidden" name="pEnrollNo" id="pEnrollNo"
											value="${i.pEnrollNo }"> <input type="hidden"
											name="rate" id="rate">

									</div>
								</div>
							</div>
						</c:forEach>
						<form action="/user" name="send" method="get">
							<input type="hidden" name="mCode" id="mCode" value="${mCode}">
							<button type="submit" id="ok" style="margin-left: 30px">
								<img src="../resources/GW/image/checked.png" />
							</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--비회원일떄 상품추천 클릭시 모달창  -->
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

													<!--chk값 넘겨주기  -->
													<input type="checkbox" name="chk" value="${a.pEnrollNo }">
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
							<button type="submit" class="btn btn-primary">추천받기</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


	<!--상품 뿌려주기위한 부분  -->
	<div class="container">
		<!--검색바 생성  -->
		<div style="margin-top: 3%">
			<form class="form-search form-inline" action="productlist">
				<div class="input-append">
					<input type="text" class="search-query" name="searchKey"
						placeholder="Search..." />
					<button type="submit" class="btn btn-outline-dark"
						style="vertical-align: top;">Search</button>
				</div>
			</form>
		</div>
		<!--상품 뿌리기 시작  -->
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


</body>

</html>