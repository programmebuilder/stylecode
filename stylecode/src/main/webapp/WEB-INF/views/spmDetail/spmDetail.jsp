<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
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
<script>
var mId ="aaaa@naver.com";
session(mId);
</script>

   <div class="container">
      <!-- 선택한 쇼핑몰 정보 div -->
      
      
      <!-- 세션확인할라고 해놓은곳~ -->
      <h1>${mId }</h1>
      <h2>${smbm }</h2>
      
      
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
                  
                  <c:choose>
                  
                     <c:when test="${smbm ne 0}">
                        <button id="like" value="O" style="margin-left: 80%; border: none; background-color: white;">
                           <img id="likeO" alt="" src="../resources/MH/images/likeO.png">
                        </button>
                        <c:set var="sw" value="O"/>
                     </c:when>
                     <c:otherwise>
                        <button id="like" value="X" style="margin-left: 80%; border: none; background-color: white;">
                           <img id="likeX" alt="" src="../resources/MH/images/likeX.png">
                        </button>
                        <c:set var="sw" value="X"/>
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

                  <div class="col" style="padding-right: 5px;">
                     <span class="badge badge-dark">${spm.spmClassifcn}</span>
                  </div>

            </div>
            <div class="row">
               <!-- 쇼핑몰 정보 출력 -->
               <div class="col" style="margin-top: 10px;">${spm.spmInfo }</div>
            </div>

         </div>
      </div>
   </div>
   
   

   <!-- 해당 쇼핑몰에 대해 DB에 있는 상품목록을 forEach문을 이용해 출력 -->
   <div id="pdRcList" class="container-fluid">
      <div class="row" style="margin: 0px 150px;">
         <c:forEach var="product" items="${product}">
            <div class="col-sm-4">
               <div class="card">
                  <img class="card-img-top rounded mx-auto d-block"
                     src="${product.pimg }" alt="pImg"
                     style="width: 20rem;">
                  <div class="card-body mx-auto d-block">
                     <h5 class="card-title">${product.pnm }</h5>
                     <p class="card-text mx-auto d-block">${product.mPrice} 원</p>
                     <a href="${product.prodURL}"><p class="card-text mx-auto d-block">상품 페이지로 이동</p></a>
                  </div>
               </div>
            </div>
         </c:forEach>
      </div>
   </div>



</body>

 <script type="text/javascript">
   //True false 값 주기
   //get으로 받아오기 ajax부분
   var spmEnrollNo = ${spm.spmEnrollNo};
   var mId = "${mId}"; 
   var sw = "${sw }";
   var spmBmNo = ${smbm };
   
   
   
   $("#like").on("click", function(){
   
      //즐겨찾기가 추가 되어 있지 않을 때 추가하는 부분
      if($("#like").attr("value") == "X"){
      $.ajax({
         type : 'post',
         url : '/spmBm',
         headers : {
            "Content-Type" : "application/json",
            "X-HTTP-Method-Override" : "POST"
         },
         dataType : 'text',
         data : JSON.stringify({
            bmEnrollNo : spmEnrollNo,
            mId : mId
         }),
         success : function(result){
            if(result == "SUCCESS"){
               alert("즐겨찾기에 추가되었습니다.");
               $("#like img").prop("src","../resources/MH/images/likeO.png");   
               $("#like").prop("value","O");
               

            }
         }
      });
      };
      
      //즐겨찾기 삭제
       if($("#like").attr("value") == "O"){
          
          $.get("/spmBm/get/"+spmEnrollNo, function(data){
             alert(data);
             
             $.ajax({
                type : 'delete',
                url : '/spmBm/' + data,
                headers : {
                   "Content-Type" : "application/json",
                   "X-HTTP-Method-Override" : "DELETE"
                },         
                dataType : 'text',
                success : function(result){
                   if(result == "SUCCESS"){
                      alert("삭제되었습니다.");
                      $("#like img").prop("src","../resources/MH/images/likeX.png");
                      $("#like").prop("value","X");   
                   }
                }

             });
             }); 

      }; 
   });
   
   
   
      

            
      


      

   
   //spmBmNo값 받기
/*    $.ajax({
      type : "GET",
      url : "/spmBm/get",
      headers : {
         "Content-Type" : "application/json",
         "X-HTTP-Method-Override" : "DELETE"
      },
      dataType : "text",
      data : JSON.stringify({
         "spmEnrollNo":spmEnrollNo, 
         "mId":mId
      }),
      success : function(result){}
      
   }); */
</script> 
</html> 