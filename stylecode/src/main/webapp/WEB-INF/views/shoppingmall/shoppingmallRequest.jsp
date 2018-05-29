<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- JQuery JavaScript 추가  -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/jquery-3.3.1.min.js"></script>
<!-- Bootstrap JavaScript 추가 -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/bootstrap.min.js"></script>

<form class="text-center" id='requestForm' role="form" method="post">
		<div id="user-info">계정 정보 입력<br>
			이메일 &nbsp;<input type="text" name="email" size="30" id="emailInput"><br>
			비밀번호 &nbsp;<input type="text" name="passwd" size="30" id="passwdInput"><br>
		</div><br>
		<div id="shop-info">쇼핑몰 정보 입력<br>
			쇼핑몰명 &nbsp;<input type="text" name="spmNm" size="30" id="spmNmInput"><br>
			사이트URL &nbsp;<input type="text" name="spmURL" size="30" id="spmURLInput"><br>
			쇼핑몰 분류지정
			<select>
				<option value="의류">의류</option>
				<option value="액세서리">액세서리</option>
				<option value="신발">신발</option>
				<option value="가방">가방</option>
			</select> <br>
		</div><br>
		<div id="shopmanager-info">쇼핑몰 담당자 정보 입력<br>
			이름 &nbsp;<input type="text" name="spmMNm" size="30" id="spmMNmInput"><br>
			휴대폰 &nbsp;<input type="text" name="spmMPhone" size="30" id="spmMPhoneInput"><br>
			유선전화 &nbsp;<input type="text" name="spmMCall" size="30" id="spmMCallInput"><br>
		</div><br>			
		<button type="submit" class="btn btn-primary">신청하기</button>
</form>

<script>
$("#requestForm").submit(function(event){
	event.preventDefault();
	
	var that = $(this);
	
	var str ="";
	$(".uploadedList .delbtn").each(function(index){
		 str += "<input type='hidden' name='files["+index+"]' value='"+$(this).attr("href") +"'> ";
	});
	
	that.append(str);

	that.get(0).submit();
});
</script>

</body>
</html>