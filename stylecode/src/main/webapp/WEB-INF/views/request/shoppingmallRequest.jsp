<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/YJH/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="../resources/YJH/bootstrap/css/bootstrap.min.css">
</head>
<body>
<%@include file="../header.jsp"%>
<!-- JQuery JavaScript 추가  -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/jquery-3.3.1.min.js"></script>
<!-- Bootstrap JavaScript 추가 -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/bootstrap.min.js"></script>

<form class="form-horizontal" id='requestForm' role="form" method="post" style="margin: 30px 60px;">
		<div class="form-group" id="user-info"><strong>계정 정보 입력</strong><br><br>
			<label for="emailInput" class="col-sm-2 control-label">이메일</label>
				<div class="col-sm-6">
      				<input type="text" class="form-control" name="mId" id="emailInput">
    			</div>
			<label for="passwdInput" class="col-sm-2 control-label">비밀번호</label>
				<div class="col-sm-6">
      				<input type="text" class="form-control" name="mPasswd" id="passwdInput">
    			</div>
		</div><br>
	
		<div class="form-group" id="shop-info"><strong>쇼핑몰 정보 입력</strong><br><br>
			<label for="spmNmInput" class="col-sm-2 control-label">쇼핑몰 명</label>
				<div class="col-sm-6">
      				<input type="text" class="form-control" name="spmNm" id="spmNmInput">
    			</div>
			<label for="spmURLInput" class="col-sm-2 control-label">사이트URL</label>
				<div class="col-sm-6">
      				<input type="text" class="form-control" name="spmURL" id="spmURLInput">
    			</div>
			<label for="spmInfoInput" class="col-sm-2 control-label">쇼핑몰 소개</label>
				<div class="col-sm-6">
      				<input type="text" class="form-control" name="spmInfo" id="spmInfoInput">
    			</div>
    		<label class="col-sm-2 control-label">쇼핑몰 분류지정</label>
    			<div class="col-sm-6">
    				<select name="spmClassifcn">
						<option value="의류">의류</option>
						<option value="액세서리">액세서리</option>
						<option value="신발">신발</option>
						<option value="가방">가방</option>
					</select>
    			</div>
    		<label class="col-sm-2 control-label">쇼핑몰 나이대 지정</label>
    			<div class="col-sm-4">
    				<select name="spmAges">
						<option value="10대">10대</option>
						<option value="20대">20대</option>
						<option value="30대">30대</option>
					</select>
    			</div>
			<label for="spmTnInput" class="col-sm-2 control-label">쇼핑몰 썸네일 URL</label>
				<div class="col-sm-6">
      				<input type="text" class="form-control" name="spmTn" id="spmTnInput">
    			</div>			
    	</div><br>
    	
		<div class="form-group" id="shopmanager-info"><strong>쇼핑몰 담당자 정보 입력</strong><br><br>
			<label for="spmMNmInput" class="col-sm-2 control-label">이름</label>
				<div class="col-sm-6">
      				<input type="text" class="form-control" name="mName" id="spmMNmInput">
    			</div>
			<label for="spmMPhoneInput" class="col-sm-2 control-label">휴대폰</label>
				<div class="col-sm-6">
      				<input type="text" class="form-control" name="mPhone" id="spmMPhoneInput">
    			</div>
    		<label for="spmMCallInput" class="col-sm-2 control-label">유선전화</label>
				<div class="col-sm-6">
      				<input type="text" class="form-control" name="mCall" id="spmMCallInput">
    			</div>
		</div><br>
				
		<button type="submit" class="btn btn-primary">신청하기</button>
</form>

<script>
$("#requestForm").submit(function(event){
	event.preventDefault();
	
	var that = $(this);

	that.get(0).submit();
});
</script>
<%@include file="../footer.jsp"%>
</body>
</html>