<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="../resources/bootstrap/js/bootstrap.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<link rel="stylesheet" type="text/css" href="../resources/bootstrap/css/bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

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

		
		<!--           쇼핑몰 리스트                      -->
		<div id="spmList">
			<c:forEach var="SPM" items="${list}">
				<p class="list-group-item list-group-item-action list-group-item-light" style="background-color: #FFFFFF;">
					<input type="checkbox"  name="checkRow" value="${content.IDX}"> 
					<img width="100px" height="100px" alt="사진이 없음" class="img-circle" src="${style.tm }"> 
					<span>&emsp;</span><b style="color: black;">스타일난다</b> 					
					<span class="spmInfo">&emsp;관리자 이름</span>
					<span class="spmInfo">&emsp;스타일난다 입니다.</span>
				</p>
			</c:forEach>
		</div>
		
		</form>
	</div>
</body>
<!-- 템플릿 -->
<script id="template" type="text/x-handlebars-template">
	{{#each .}}
	<p class="list-group-item list-group-item-action list-group-item-light" style="background-color: #FFFFFF;">
			<input type="checkbox"  name="checkRow" value="{{spmEnrollNo}}">
			<img width="100px" height="100px" alt="사진이 없음" class="img-circle" src="{{shoppingmallVO.smpTn}}"> 
			<span>&emsp;</span>
			<a class="btn spmNm" href={{spmURL}}><b style="color: black;">{{shoppingMallVO.spmNm}}</b></a>		
			<span class="spmInfo">&emsp;{{shoppingMallVO.spmClassifcn}}</span>
			<span class="spmInfo">&emsp;{{shoppingMallVO.spmInfo}}</span>
			
			<span class="spmInfo">&emsp;{{mId}}</span>
	</p>
	{{/each}}
</script>

<script type="text/javascript">


var template = Handlebars.compile($("#template").html());

	$.getJSON("/admin/all",function(data){
		console.log(data.length);
		$("#spmList").html(template(data));
	});
	
	
</script>


<!-- <script>
 var source = $("#template").html();
 var template = Handlebars.compile(source);
 var data = 데이터;
 function getAllList() {
	
	 $.getJSON("/admin/all", function(data){
		 
		 
		 /* data내용을 넣은 template를  replies div 안에 넣는다. */
		 $("#replies").html(template(data));
	 });
}

 </script> -->
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