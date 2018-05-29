
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="../resources/bootstrap/js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css"
	href="../resources/bootstrap/css/bootstrap.css">
<html>
<head>

<title>Home</title>
<%
	String mId = "aaaa@NAVER.COM";
	session.setAttribute("mId", mId);
%>


</head>


<body>

	<h3>관리자 페이지</h3>
	<div>

	
	
		<div>
		<form action="">
		<!--  버튼 -->

			
				<div class="container" style="margin: 10px;">
					  <div class="row">
					    <div class="col-sm">
					      <input style="margin-top: 15px;" type="checkbox" name="checkAll" id="th_checkAll" />&emsp;전체 선택
					    </div>
					    <div class="col-sm">
					      
				</div>
				 <div class="col-sm">
					      		<button type="button" class="btn btn-outline-dark">승인</button>
								<button type="button" class="btn btn-outline-dark">거절</button>
				</div>
			 </div>
		</div>

			

<!-- - 		<div>
			<p class="list-group-item list-group-item-action list-group-item-light" style="background-color: #FFFFFF;">
				<input type="checkbox" name="checkAll" id="th_checkAll" />전체 선택
				<button type="button" class="btn btn-outline-dark">승인</button>
				<button type="button" class="btn btn-outline-dark">거절</button>
				</p>
		</div>  -->
		
 
		
		
			<div>

				<p class="list-group-item list-group-item-action list-group-item-light" style="background-color: #FFFFFF;">
					<input type="checkbox"  name="checkRow" value="${content.IDX}"/>
					<img width="100px" height="100px" alt="사진이 없음" class="img-circle" src="../resources/MH/images/lip.png"> 
					<span>&emsp;</span><a href="www.naver.com"><b style="color: black;">스타일난다</b> </a>					
					<span class="spmInfo">&emsp;관리자 이름</span>
					<span class="spmInfo">&emsp;스타일난다 입니다.</span>
				</p>


			</div>
					
		</form>
	</div>
</body>
		<script type="text/javascript">

		<!-- 체크박스 전체체크/해제 하는 js -->
		$("#th_checkAll").on("click", function(){
			
			    if( $("#th_checkAll").is(':checked') ){
			      $("input[name=checkRow]").prop("checked", true);
			    }else{
			      $("input[name=checkRow]").prop("checked", false);
			    };
			
		});
		

</script>
</html>
