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
		<form action="admin/accept">
		<!--  버튼 -->

			<div class="container" style="margin: 10px;">
					  <div class="row">
					    <div class="col-sm">
					      <input style="margin-top: 15px;" type="checkbox" name="checkAll" id="th_checkAll" />&emsp;전체 선택
					    </div>
					  <div class="col-sm">
					      
				</div>
				 <div class="col-sm">
					<button type="button" class="btn btn-outline-dark" id="accept">승인</button>
					<button type="button" class="btn btn-outline-dark" id="refuse">거절</button>
				</div>
			 </div>
		</div>

		
		<!--           쇼핑몰 리스트                      -->
		<div id="spmList">
		
					
			
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

<!-- 템플릿 -->
<script id="template" type="text/x-handlebars-template">
	{{#each .}}
	<p class="list-group-item list-group-item-action list-group-item-light" style="background-color: #FFFFFF;">
			<input type="checkbox" id="checkRow" name="checkRow" value="{{spmEnrollNo}}">
			<img width="100px" height="100px" alt="사진이 없음" class="img-circle" src="{{shoppingMallVO.spmTn}}"> 
			<span>&emsp;</span>
			<a class="btn spmNm" href={{spmURL}}><b style="color: black;">{{shoppingMallVO.spmNm}}</b></a>		
			<span class="spmInfo">&emsp;{{shoppingMallVO.spmClassifcn}}</span>
			<span class="spmInfo">&emsp;{{shoppingMallVO.spmInfo}}</span>
			
			<span class="spmInfo">&emsp;{{mId}}</span>
	</p>
	{{/each}}
</script>

<script type="text/javascript">

/*           쇼핑몰 리스트                  */
var template = Handlebars.compile($("#template").html());

function spmList() {
	
	$.getJSON("/admin/all",function(data){
		console.log(data.length);
		$("#spmList").html(template(data));
	});
	
};

spmList();

//체크박스 속에 val를 받을 배열 선언


/*                 승인                                   */
 $("#accept").on("click", function(){	   
	 
	 var array = [];
	 $('#checkRow:checked').each(function() { 
		   
		   array.push($(this).val());	    
		   
	   });
	 	alert(array);
	   if(array.length == 0){
		  alert("체크해주세요");
	   }else{
		   
		   $.ajax({
			   url :'/admin/accept',
			   type : 'post',
			   dataType: 'json',
			   data:{array : array},
			   success : function(result) {
					alert("승인 되었습니다.");
					spmList();	
					if(result == "SUCCESS"){
						alert("SUCCESS");
					};	
					}	   
		   });
			alert("승인 되었습니다.");
			spmList();
			
			
	   }
	  
	   
 });

 /*                  거절                                */
  $("#refuse").on("click", function(){
	  var array = [];
	 $('#checkRow:checked').each(function() { 
		 	
		   array.push($(this).val());	       
	   });
	 
	   if(array.length == 0){
		  alert("체크해주세요");
	   }else{
		   $.ajax({
			   url :'/admin/accept',
			   type : 'post',
			   dataType: 'json',
			   data:{array : array},
			   success : function() {
					alert("승인 되었습니다.");
					spmList();	
					if(result == "SUCCESS"){
						alert("SUCCESS");
					};	
					}	   
		   });
			alert("승인 되었습니다.");
			spmList();	
	   }
	   
 });

/* $("#accept").on("click", function(){
		//체크박스에 체크된 val를 받아온다.
	   $('#checkRow:checked').each(function() { 	      
		   array.push($(this).val());	       
	   });
		
		
		if(array.length == 0){
			alert("선택해 주세요.");
		}else{
		}
		
		
		)}; */

		
/* 			   $.ajax({
				   type : 'post',
				   url : '/admin/accept',
				   data :{array : array} ,
				   dataType:'json',
				   traditional : true,
				   success : function(result) {
						if(result == "SUCCESS"){
							alert("승인 되었습니다.");
							spmList();	
						};
						array = new Array();
					
				   }
			   }); */

			   


 
	
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

</html>