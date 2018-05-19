<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<script src="../resources/js/productbutton.js"></script>


</html>
