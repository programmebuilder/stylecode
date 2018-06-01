$(document).ready(function(){
	
 /*//카테고리 이미지클릭시 정렬.
	$(document).on('click', '#cgImgMn a', function(){
		var index = $('#cgImgMn a').index(this);
		
		//ajax통신을 이용하여 디테일 카테고리 추출하는 부분
		$.ajax({
			url: 'cgno/'+(index+101),
			type: 'get',
			dataType: 'json',
			data: $(this).serialize(),
			contentType: 'application/x-www-form-urlencoded; charset=UTF-8', 
			success:successHandler,
			error:errorHandler
		});
		
		//성공 핸들러
		function successHandler(data){
			$('#pdRcList').empty(); //안에있는 자식노드를 비우는 작업
			
			//#pdRcList 도입부를 나타내기 위한 부분
			var html = '<div class="row">';
			$('#pdRcList').append(html);
			
			//각각의 요소(li)를 나타내기 위한 부분
			$.each(data, function(index,entry){ //entry : 하나의 객체의 값
			var html = '<div class="col-sm-3 mb-3">';
				  html += '<div class="card">';
				  html += '<img class="card-img-top rounded mx-auto d-block" src="'+ $(this).attr('pImg') +'" alt="pImg" data-toggle="modal" data-target="#prodModal" style="width: 100%;">';
				  html += '<div class="card-body mx-auto d-block">';
				  html += '<h5 class="card-title">'+ $(this).attr('pNm') +'</h5>';
				  html += '<p class="card-text mx-auto d-block">가격 : '+ $(this).attr('mPrice') +'원</p>';
				  html += '<a href="'+ $(this).attr('prodURL') +'">상세보기</a>';

				  html += '<input type="hidden" value="'+ $(this).attr('prodURL') +'"/>';
				  html += '</div>';
				  html += '</div>';
				  html += '</div>';
			$('#pdRcList>div').append(html).hide().show('fast');
		});
			//#pdRcList 도입부를 닫아주기 위한 부분
			var html = '</div>';
			$('#pdRcList').append(html);	
		}
		
		//에러 핸들러
		function errorHandler(){
			alert('ajax error!!');
		}
		
		return false;
	});
	
	$(function(){
		//카테고리 이미지 hover시 이벤트 처리
		$("#cgImgMn a").hover(function(){
		$(this).css('cursor','pointer');
		},function(){
	    $(this).css('cursor','default');
		});
	});
	
	//카테고리.
	$(document).on('click', '#cgImgMn a', function(){
		var index = $('#cgImgMn a').index(this) +101;
		alert("categoryNm : " + index);
		self.location= "/recommend/?cgNo="+cgNo;
	});*/
	
	$("#cgImgMn a").on("click", function(event) {
		 self.location = "";
	});
	
});

/*$(window).scroll(function() {
    if ($(window).scrollTop() == $(document).height() - $(window).height()) {
     alert("스크롤 닿음");
      
    }
});


/*
 Copyright (C) KOSTA180 3조 2018-04-24 Middle Project
 
$(document).ready(function(){

	//	디테일 메뉴 클릭시 상품리스트 Ajax로 보여주는 부분
	//	디테일 메뉴 생성 후 클릭 동적 바인딩 이벤트 처리	
	$(document).on('click', '#navbarNav a',function(){
		//ajax src를 위해 href속성 값 받는 부분
		var prdListSrc = $(this).attr('href');
		
		//ajax통신을 이용하여 상품 리스트 추출하는 부분
		$.ajax({
			url: prdListSrc,
			type: 'post',
			dataType: 'json',
			data: $(this).serialize(),
			contentType: 'application/x-www-form-urlencoded; charset=UTF-8', 
			success:successHandler,
			error:errorHandler
		});
		
		//성공 핸들러
		function successHandler(data){
			$('#pdRcList').empty(); //안에있는 자식노드를 비우는 작업
			
			//div[row]를 나타내기 위한 부분
			var allPdListHtml = '<div class="row">';
			$('#pdRcList').append(allPdListHtml);
			
			//각각의 요소(div[card])를 나타내기 위한 부분
			$.each(data, function(index,entry){ //entry : 하나의 객체의 값
			var html = '<div class="col-sm-4 mb-4">';
				html += '<div class="card">';
				html += '<img class="card-img-top rounded mx-auto d-block" src="' + $(this).attr('pImg') +'" data-toggle="modal" data-target="#prodModal" style="width: 20rem;">'
				html += '<div class="card-body mx-auto d-block">';
				html += '<h5 class="card-title">' + $(this).attr('pNm') + '</h5>';
				html += '<p class="card-text mx-auto d-block"> 가격 : ' + $(this).attr('mPrice') + '원</p>';
				html += '<input type="hidden" value="' + $(this).attr('prodURL') + '"/>';
				html += '</div>'; 
				html += '</div>';
				html += '</div>';
			$('#pdRcList>div').append(html).hide().show('fast');
		});
			
		//div[row]를 나타내기 위한 부분
		var allPdListHtml = '</div>';
		$('#pdRcList').append(allPdListHtml);
		
		} //end of sucessHandler
		
		//에러 핸들러
		function errorHandler(){
			alert('상품 리스트부분 ajax error!!');
		}	
	
		return false;
	});
	
});

$(function(){
	//카테고리 이미지 hover시 이벤트 처리
    $("#cgImgMn a").hover(function(){
        $(this).css('cursor','pointer');
     },function(){
        $(this).css('cursor','default');
     });
    
 
    //카테고리 이미지클릭시 이벤트 처리
	$('#cgImgMn a').on('click',function(){		
		//각각의 인덱스를 가져오기 위한 부분
		var index = $('#cgImgMn a').index(this);

		//ajax통신을 이용하여 디테일 카테고리 추출하는 부분
		$.ajax({
			url: 'detailMnList.do?cgno='+(index+1),
			type: 'post',
			dataType: 'json',
			data: $(this).serialize(),
			contentType: 'application/x-www-form-urlencoded; charset=UTF-8', 
			success:successHandler,
			error:errorHandler
		});		
		
		//성공 핸들러
		function successHandler(data){
			$('#navbarNav ul').empty(); //안에있는 자식노드를 비우는 작업
			//전체를 나타내기 위한 부분
			var allMnHtml = '<li class="nav-item active">';
				allMnHtml	+= '<a class="nav-link" href="prodList.do?cgNo='+ (index+1) +'">';
				allMnHtml	+= '전체<span class="sr-only">(current)</span></a>';
				allMnHtml	+= '</li>';
			$('#navbarNav ul').append(allMnHtml);
			
			//각각의 요소(li)를 나타내기 위한 부분
			$.each(data, function(index,entry){ //entry : 하나의 객체의 값
			var html = '<li class="nav-item">';
			
			//각각의 cgdtNo 속성을 이용해 링크로 나타낸 부분.
			//추후 ajax로 변환할 예정.
			html += '<a class="nav-link" href="prodList.do?cgdtNo='+ $(this).attr('cgdtNo') +'">' + $(this).attr('cgDtContent')+ '</a>'; 
			html += '</li>';
			$('#navbarNav ul').append(html).hide().show('fast');
		});
		}
		
		//에러 핸들러
		function errorHandler(){
			alert('ajax error!!');
		}
		
		return false;

	});	
});

$(function(){
	
	$(document).on("mouseenter", "#pdRcList img", function() {
	    // hover starts code here
		$(this).css('cursor','pointer');
	});
	$(document).on("mouseleave", "#pdRcList img", function() {
	    // hover ends code here
		$(this).css('cursor','default');
	});
	
	$(document).on('click', '#pdRcList img',function(){
		//해당하는 이미지 상대경로
		var imgSrc = $(this).attr('src');

		//해당하는 상품명
		var prodNm = $(this).nextAll().find('h5').text();

		//해당하는 상품 가격
		var prodPrice = $(this).nextAll().find('p').text();
		
		//모달 타이틀 수정하기.
		$('#exampleModalLabel').text(prodNm);
		
		//모달 컨텐츠 비우기
		$('#prodModalBd').empty();
		
		var html = '<img src="' + imgSrc + '" class="mx-auto d-block" style="width: 40rem;">';
		html += '<hr>';	  
		html += '상품명 : ' + prodNm + '<br>';
		html += prodPrice;	  
		
		//모달 컨텐츠 채우기
		$('#prodModalBd').append(html);
		
		//해당하는 상품URL을 카드에서 받아 오는 부분 
		var prodHref = $(this).next().find('input').attr('value');
		
		//해당하는 상품URL을 modal 버튼에 설정하는 부분
		$('.modal-footer').find('a').attr('href',prodHref);
		
		return false;
	});

});*/