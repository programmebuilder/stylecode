<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- 부트스트랩  프레임워크 -->
<link rel="stylesheet"
	href="../resources/bootstrap/css/bootstrap.min.css" />
<!-- CUSTOM  CSS -->
<link rel="stylesheet" href="../resources/HJH/css/rcCustom.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>추천 페이지</title>
</head>
<body>

	<!-- 카테고리 상단바 -->
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3">
				<img src="../resources/HJH/rcImgs/lineMenu.png" width="30"
					height="30" class="d-inline-block align-top" alt="" /> <span
					id="category">category</span>
			</div>
			<div class="col-sm-9"></div>
		</div>
	</div>
	​
	<!-- 카테고리 이미지 메뉴바  -->
	<div id="cgImgMn" class="container-fluid">
		<div class="row">
			<div class="col-md-1">
				<figure class="figure">
					<a> <img class="img-thumbnail"
						src="../resources/HJH/rcImgs/outer.png" alt="outer">
					</a>
					<figcaption class="text-center">아우터</figcaption>
				</figure>
			</div>
			<div class="col-md-1">
				<figure class="figure">
					<a> <img class="img-thumbnail"
						src="../resources/HJH/rcImgs/top.png" alt="top">
					</a>
					<figcaption class="text-center">상의</figcaption>
				</figure>
			</div>
			<div class="col-md-1">
				<figure class="figure">
					<a> <img class="img-thumbnail"
						src="../resources/HJH/rcImgs/pants.png" alt="pants">
					</a>
					<figcaption class="text-center">하의</figcaption>
				</figure>
			</div>
			<div class="col-md-1">
				<figure class="figure">
					<a> <img class="img-thumbnail"
						src="../resources/HJH/rcImgs/dress.png" alt="dress">
					</a>
					<figcaption class="text-center">원피스</figcaption>
				</figure>
			</div>
			<div class="col-md-1">
				<figure class="figure">
					<a> <img class="img-thumbnail"
						src="../resources/HJH/rcImgs/shoes.png" alt="bag">
					</a>
					<figcaption class="text-center">슈즈</figcaption>
				</figure>
			</div>
			<div class="col-md-1">
				<figure class="figure">
					<a> <img class="img-thumbnail"
						src="../resources/HJH/rcImgs/plus.png" alt="shoes">
					</a>
					<figcaption class="text-center">기타</figcaption>
				</figure>
			</div>
		</div>
		<!-- 나머지 이미지 메뉴바  -->
		<div class="row" hidden>
			<div class="col-md-1">
				<figure class="figure">
					<a href="#"> <img class="img-thumbnail"
						src="../resources/HJH/rcImgs/shoes.png" alt="shoes">
					</a>
					<figcaption class="text-center">슈즈</figcaption>
				</figure>
			</div>
		</div>
	</div>
	
<!-- 상품 리스트 보여주는 부분 -->
<div id="pdRcList" class="container-fluid">
	<div class="row">
		<c:forEach var="prod" items="${prodList}">
		<div class="col-sm-3 mb-3">
			  <div class="card">
			    <img class="card-img-top rounded mx-auto d-block" src="${prod.pImg }" alt="pImg" data-toggle="modal" data-target="#prodModal" style="width: 100%;">
			    <div class="card-body mx-auto d-block">
			      <h5 class="card-title">${prod.pNm }</h5>
			      <p class="card-text mx-auto d-block">가격 : ${prod.mPrice }원</p>
			      <a href="${prod.prodURL }">상세보기</a>
			      <!-- 상품 URL 값을 모달에서 받기 위한 hidden type의 input박스  -->
			      <input type="hidden" value="${prod.prodURL }"/>
			    </div>
			  </div>
		</div>
		</c:forEach>
	</div>
</div>

<!-- Modal -->
<div class="modal fade" id="prodModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div id="prodModalBd" class="modal-body">
      	Modal contents
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary btn-lg" data-dismiss="modal">Close</button>
        <a href="#" class="btn btn-primary btn-lg" role="button" aria-disabled="true">Purchase</a>
      </div>
    </div>
  </div>
</div>

	<!-- JQuery JavaScript 추가  -->
	<script type="text/javascript"
		src="../resources/HJH/js/jquery-3.3.1.min.js"></script>
	<!-- Bootstrap JavaScript 추가 -->
	<script type="text/javascript"
		src="../resources/bootstrap/js/bootstrap.min.js"></script>
	<!-- CUSTOM JavaScript 추가 -->
	<script type="text/javascript" src="../resources/HJH/js/rcCustom.js"></script>
</body>
</html>