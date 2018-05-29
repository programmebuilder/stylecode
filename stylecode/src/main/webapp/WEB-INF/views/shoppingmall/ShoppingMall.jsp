<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/YJH/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="../resources/YJH/bootstrap/css/bootstrap.min.css">

<style type="text/css">
	#search-box {
		float: left;
		margin-left: 37%;
	}
	.search-form {
		width: 300px;
	}
	#filter-box {
		margin-bottom: 20px;
	}
	button {
		border: 0;
		background-color: transparent;
	}
	.img-circle {
 		border-radius: 50%;
 		float: left;
 		margin-left: 100px;
	}
	.spmNm {
		float: left;
		margin-left: 150px;
		/* padding-top: 35px; */
	}
</style>
</head>
<body>
<%@include file="../header.jsp"%>
<!-- JQuery JavaScript 추가  -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/jquery-3.3.1.min.js"></script>
<!-- Bootstrap JavaScript 추가 -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../resources/YJH/shoppingmall/SpmStyle.js"></script>

	<div class="text-center">
	
		<!-- 검색창 -->
		<div id="search-box">
			<form id="searchForm" role="form">
				<input type="text" name="searchKey" size="10" class="search-form" value='${cri.searchKey}' id="searchKeyInput">
				<button class="searchBtn">	
					<img alt="searchImg" src="../resources/YJH/shoppingmall/search.png" height="24px">
				</button>
			</form>
		</div>
		
		<!-- 필터버튼 -->
		<div id="filter-box">
 				<button>
					<img alt="filterImg" src="../resources/YJH/shoppingmall/filter.png"  class="btn" data-target = "#modal" data-toggle = "modal">
				</button>	 
				<a  href="../bookmark/bookmarklist.do" style="font-weight:bold; font-size:13px; color:black;">즐겨찾기</a>
		</div>	
		
		<!-- 모달로 필터 적용 -->
		<div class="row">
			<div class="modal" id = "modal" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content">	
						<div class="modal-header">	
							<div id="i_spmNm"></div>	
							<button class="close" data-dismiss="modal">&times;</button>
						</div>
						<div class="modal-body" style="text-align:center;">
							<form id="spmFilterForm" role="form">
								<div class="container" id="filterForm">
									<div class="row">
										<div class="col-md-1"><b>category</b></div>
									</div>
									<div class="category">
										<label class="btn btn-secondary">
											<input name="category" type="radio" id="clothes" value="의류" checked="checked">의류
										</label>
										<label class="btn btn-secondary">
											<input name="category" type="radio" id="accessories" value="액세서리">액세서리 
										</label>
										<label class="btn btn-secondary">
											<input name="category" type="radio" id="shoese" value="신발">신발
										</label>
										<label class="btn btn-secondary">
											<input name="category" type="radio" id="bag" value="가방">가방
										</label>
									</div><br>
									<div class="row">
										<div class="col-md-1"><b>age</b></div>
									</div>
									<div class="age">
										<label class="btn btn-secondary">
											<input class="age-check" name="age" type="checkbox" id="10" value="10대">10대
										</label>
										<label class="btn btn-secondary">
											<input class="age-check" name="age" type="checkbox" id="early20" value="20대">20대
										</label>
										<label class="btn btn-secondary">
											<input class="age-check" name="age" type="checkbox" id="30" value="30대">30대
										</label>
									</div><br>
									<div class="row">
										<div class="col-md-1"><b>style</b></div>
									</div>
									<div class="style">
										<label class="btn btn-secondary">
											<input class="style-check" name="style" type="checkbox" id="modern_chic" value="모던시크">모던시크
										</label>
										<label class="btn btn-secondary">
											<input class="style-check" name="style" type="checkbox" id="simple_Basic" value="심플베이직">심플베이직
										</label>
										<label class="btn btn-secondary">
											<input class="style-check" name="style" type="checkbox" id="lovely" value="러블리">러블리
										</label>
										<label class="btn btn-secondary">
											<input class="style-check" name="style" type="checkbox" id="luxury" value="럭셔리">럭셔리
										</label><br>
										<label class="btn btn-secondary">
											<input class="style-check" name="style" type="checkbox" id="feminine" value="페미닌">페미닌
										</label>
										<label class="btn btn-secondary">
											<input class="style-check" name="style" type="checkbox" id="unique" value="유니크">유니크
										</label>
										<label class="btn btn-secondary">
											<input class="style-check" name="style" type="checkbox" id="vintage" value="빈티지">빈티지
										</label>
										<label class="btn btn-secondary">
											<input class="style-check" name="style" type="checkbox" id="schoollook" value="스쿨룩">스쿨룩
										</label>
										<label class="btn btn-secondary">
											<input class="style-check" name="style" type="checkbox" id="big_size" value="빅사이즈">빅사이즈
										</label>
									</div><br><br>
									<input type="submit" value="선택완료" class="btn" id="filterBtn">
								</div> 
								<!-- 필터 div end -->
								<!-- 전체선택 해제 생각하기 -->
							</form>
							
						</div>
					</div>
							
				</div>
			
			</div>
		</div>
		<!-- 모달 end -->
		
		<!-- 필터 설정 시 필터 결과값 출력 -->
		<c:if test="${filterList!=null}">
			<div class="list-group" style="margin-left: 200px; margin-right: 200px;">
				<c:forEach var="SPM" items="${filterList}">
					<p class="list-group-item list-group-item-action list-group-item-light" style="background-color: #FFFFFF;">
						<img width="100px" height="100px" alt="사진이 없음" class="img-circle" src="${SPM.spmTn}">
							<a class="btn spmNm" href="../spmDetail/Spmdetail.do?spmEnrollNo=${SPM.spmEnrollNo}"> 
							<span>&emsp;</span><b style="color: black;">${SPM.spmNm}</b></a>
							<span class="spmInfo">&emsp;${SPM.spmInfo}</span>
					</p>
				</c:forEach>
			</div>
		</c:if>
		
		<!-- 필터 설정하지 않았을 시 -->
		<c:if test="${filterList==null}">
			<div class="list-group" style="margin-left: 200px; margin-right: 200px;">
				<c:forEach var="SPM" items="${list}">
					<p class="list-group-item list-group-item-action list-group-item-light" style="background-color: #FFFFFF;">
						<img width="100px" height="100px" alt="사진이 없음" class="img-circle" src="${SPM.spmTn}">
							<a class="btn spmNm" href="../spmDetail/Spmdetail.do?spmEnrollNo=${SPM.spmEnrollNo}"> 
							<span>&emsp;</span><b style="color: black;">${SPM.spmNm}</b></a>
							<span class="spmInfo">&emsp;${SPM.spmInfo}</span>
					</p>
				</c:forEach>
			</div>
		</c:if>

		<!-- 페이징 처리 -->
		<div class="box-footer text-center">
 			<c:if test="${filterList!=null}">
						<ul class="pagination">
							<!-- 이전 -->
							<c:if test="${pageMaker.prev}">
								<li><a
									href="ShoppingMall${pageMaker.makeFilter(pageMaker.startPage - 1) }">&laquo;</a></li>
							</c:if>

							<!-- 페이지 목록 -->
							<c:forEach begin="${pageMaker.startPage }" 
								end="${pageMaker.endPage }" var="idx">
								<li
									<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
									<a href="ShoppingMall${pageMaker.makeFilter(idx)}">${idx}</a>
								</li>
							</c:forEach>

							<!-- 다음 -->
							<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
								<li><a
									href="ShoppingMall${pageMaker.makeFilter(pageMaker.endPage +1) }">&raquo;</a></li>
							</c:if>

						</ul>
			</c:if>
			<c:if test="${searchKey !=null || filterList==null}">
						<ul class="pagination">
							<!-- 이전 -->
							<c:if test="${pageMaker.prev}">
								<li><a
									href="ShoppingMall${pageMaker.makeSearch(pageMaker.startPage - 1) }">&laquo;</a></li>
							</c:if>

							<!-- 페이지 목록 -->
							<c:forEach begin="${pageMaker.startPage }"
								end="${pageMaker.endPage }" var="idx">
								<li
									<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
									<a href="ShoppingMall${pageMaker.makeSearch(idx)}">${idx}</a>
								</li>
							</c:forEach>

							<!-- 다음 -->
							<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
								<li><a
									href="ShoppingMall${pageMaker.makeSearch(pageMaker.endPage +1) }">&raquo;</a></li>
							</c:if>

						</ul>
			</c:if>
			<br>			
		</div>
	</div>

<script>

$(document).ready(function() {
		$('.searchBtn').on("click", function(event) { //검색 버튼 클릭 시 처리 메소드
			self.location = "ShoppingMall"
 			+ '${pageMaker.makeQuery(1)}'
			+ $("select option:selected").val() 
			+ "&searchKey=" + $('#searchKeyInput').val();
		});
		
		$("#filterBtn").on("click", function(event) {
			 self.location = "ShoppingMall" 
		});
});
	
</script>

	<%@include file="../footer.jsp"%>
	
</body>
</html>