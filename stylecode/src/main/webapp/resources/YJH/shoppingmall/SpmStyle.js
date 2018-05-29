//필터 버튼 클릭 시 active 상태로 바꿔 줄 코드
$(function() {
	$(".age-check, .style-check, .spmNm").click(function(event) {
        var checkbox = $(this);
        var label = checkbox.parent('label');
        if (checkbox.is(':checked')) {
               label.addClass('active');
        } else {
               label.removeClass('active');
        }
	});
});
