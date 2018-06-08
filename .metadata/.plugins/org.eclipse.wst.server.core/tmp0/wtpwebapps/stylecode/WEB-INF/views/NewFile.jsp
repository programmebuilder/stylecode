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
<link rel="stylesheet" type="text/css" href="../resources/MH/chat.css"> 
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<!-- JQuery JavaScript 추가  -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/jquery-3.3.1.min.js"></script>
<!-- Bootstrap JavaScript 추가 -->
<script type="text/javascript" src="../resources/YJH/bootstrap/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
  	
<div class="row bootstrap snippets">

    <div class="col-md-4" style="width:500px; overflow:hidden;">
      <!-- DIRECT CHAT PRIMARY -->
      <div class="box box-primary direct-chat direct-chat-primary">
        <div class="box-header with-border">
          <h3 class="box-title">Style Code</h3>
    
          <div class="box-tools pull-right">
      
          </div>
        </div>
        <!--채팅박스 헤더부분 끝 -->
        
        <!--채팅박스 body -->
        <div class="box-body">
          <!-- 메세지 들어갈 곳 -->
          <div class="direct-chat-messages" style="height:500px;">
          
            <!-- 스타일코드 채팅메세지 -->
            <div class="direct-chat-msg">
              <div class="direct-chat-info clearfix">
                <span class="direct-chat-name pull-left">Style Code</span> 
              </div>
              <!-- /.direct-chat-info -->
              <img class="direct-chat-img" src="https://bootdey.com/img/Content/user_1.jpg" alt="Message User Image"><!-- /.direct-chat-img -->
              <div class="direct-chat-text">안녕하세요 무엇을 도와드릴까요?</div>
              <!-- /.direct-chat-text -->
            </div>
            <!--  스타일코드 채팅메세지 끝 -->
    
                 
          </div>

        </div>
        <!--채팅박스 body -->
        
        
        <!-- /.box-body -->
        <div class="box-footer">
           
           <div class="form-horizontal col-sm-12" id='searchForm' style="margin-top: 15px;">  
            <div class="input-group">
                  <input type="text" class="form-control" name="searchKey" id="input-submit" placeholder="내용을 입력하세요">
                  <span class="input-group-btn">
                    <button class="btn btn-secondary" type="button" id="send">Send</button>
                  </span>
            </div>
        </div>

        </div>
        <!-- /.box-footer-->
      </div>
      <!--/.direct-chat -->
    </div>
    
  </div>
 </body>   
<script type="text/javascript">

$(document).ready(function() { 
	

	
	/* send버튼 클릭시 이벤트 */
	$('#send').click(function() {
		
		/* 유저 채팅 태그 값 */
		var userChat = '<div class="direct-chat-msg right">'
			+'<div class="direct-chat-info clearfix">'
			+'<span class="direct-chat-name pull-right">Me</span></div>'
			+'<img class="direct-chat-img" src="https://bootdey.com/img/Content/user_2.jpg" alt="Message User Image">'
			+'<div class="direct-chat-text">';
		/* 저장된  채팅 태그 값 */
		var comChat ='<div class="direct-chat-msg">'
			+'<div class="direct-chat-info clearfix">'
			+'<span class="direct-chat-name pull-left">Style Code</span></div>'
			+'<img class="direct-chat-img" src="https://bootdey.com/img/Content/user_1.jpg" alt="Message User Image">'
			+'<div class="direct-chat-text">';
		/* 유저가 검색한 값을 변수에 저장  */	
		var input = $('#input-submit').val();        			
		$(".direct-chat-messages").append(userChat+input+"</div></div>");
		
			/* input으로 값 보내고 그에 따른 대답 출력 */
			$.get("/chat/Ok",{input : input},function(data){
				$(".direct-chat-messages").append(comChat + data + '</div></div>');
			});
	});
});
 
</script>
  	
  	
  	
</body>
</html>