$(function(){
    $(window).scroll(function(){
       if($(this).scrollTop()!=0){
           $('footer').fadeIn();
           
       } else{
           $('footer').fadeOut();
       }
    });
    
    $('footer').click(function(){
        $('body,html').animate({scrollTop:0},800);
    });
    
});