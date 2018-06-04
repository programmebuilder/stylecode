<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/YJH/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="../resources/YJH/bootstrap/css/bootstrap.min.css">
</head>
<body>
<!-- JQuery JavaScript 추가  -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/jquery-3.3.1.min.js"></script>
<!-- Bootstrap JavaScript 추가 -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/bootstrap.min.js"></script>

	<table class="table" id="table-chat">
		<thead class="thead-dark">
			<tr>
				<th scope="col">#</th>
				<th scope="col">이름</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
		<%-- <c:if test="${searchKey != null}"> --%>
		<c:forEach var="SPM" items="${list}">
			<tr>
				<td>${SPM.spmNm}</td>
				<td>${SPM.spmTn}</td>
			</tr>
		</c:forEach> 
		<%-- </c:if> --%>
	</table>
	
	<form class="form-horizontal" id='searchForm' role="form">
	<!-- <div class="form-horizontal col-sm-6" id='searchForm'> -->
    	<div class="form-group">
      		<input type="text" class="form-control" name="searchKey" id="input-submit" placeholder="Search for..." value='${cri.searchKey}'>
      		<span class="form-group-btn">
        		<button class="btn btn-secondary" type="submit" id="btn-submit">Go!</button>
      		</span>
    	</div>
  	<!--</div>  -->
  	</form>
  	
  	<script>
   	 $('#btn-submit').click(function() {
   		 var input = $('#input-submit').val()
   		 $('#searchForm').submit();
  		 $('#table-chat > tbody:last').append('<tr><td>안녕</td><td>'+input+'</td></tr>');
  	 }); 
  	</script>
</body>
</html>