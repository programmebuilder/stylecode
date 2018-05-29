<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="../resources/bootstrap/js/bootstrap.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<link rel="stylesheet" type="text/css" href="../resources/bootstrap/css/bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
var bmNo = ${spmBmNo};
</script>
<div class="container">
		<!-- 선택한 쇼핑몰 정보 div -->
		
		
		<!-- 세션확인할라고 해놓은곳~ -->
		<h1>${mId }</h1>
		<h2>${spmbmNo }</h2>
		
		
		<div class="card flex-md-row mb-4 box-shadow h-md-250"
			style="width: 100%">
			<img class="card-img-lgft" alt="" src="${spm.spmTn} "
				style="width: 150px; height: 150px;">
			<div class="card-body d-flex flex-column align-items-start">
				<div class="row" style="width: 100%">

	
					<div class="col-8">
						<h3>${spm.spmNm}</h3>
					</div>

					<!-- 즐겨찾기 버튼 -->
					<div class="col-4">
						
<%-- 						<c:choose>
							<c:when test="${spmBmNo ne 0}">
								<button id="like_O" style="margin-left: 80%; border: none; background-color: white;">
									<img id="likeO" alt="" src="../resources/MH/images/likeO.png">
								</button>
							</c:when>
							<c:otherwise>
								<button id="like_X" style="margin-left: 80%; border: none; background-color: white;">
									<img id="likeX" alt="" src="../resources/MH/images/likeX.png">
								</button>
							</c:otherwise>	
						
						</c:choose> --%>
						
						<c:choose>
							<c:when test="${spm.spmEnrollNo eq 1}">
								<button id="like_O" style="margin-left: 80%; border: none; background-color: white;">
									<img id="likeO" alt="" src="../resources/MH/images/likeO.png">
								</button>
							</c:when>
							<c:otherwise>
								<button id="like_X" style="margin-left: 80%; border: none; background-color: white;">
									<img id="likeX" alt="" src="../resources/MH/images/likeX.png">
								</button>
							</c:otherwise>	
							</c:choose>
						
					</div>

				</div>	
				<div class="row">
					<div class="col">
						<span class="badge badge-light">${spm.spmAges }</span>
					</div>
				</div>
				<div class="row">
					<c:forEach var="style" items="${spmStyle}">
						<div class="col" style="padding-right: 5px;">
							<span class="badge badge-dark">${style}</span>
						</div>
					</c:forEach>
				</div>
				<div class="row">
					<!-- 쇼핑몰 정보 출력 -->
					<div class="col" style="margin-top: 10px;">${spm.spmInfo }</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>