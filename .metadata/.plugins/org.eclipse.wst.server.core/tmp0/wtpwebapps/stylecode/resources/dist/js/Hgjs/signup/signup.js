$(document).ready(function() {
		$('#MPASSWD').keyup(function() {
			$('font[name=check]').text('');
		});

		$('#chpass').keyup(function() {
			var btn;
			if ($('#MPASSWD').val() != $('#chpass').val()) {
				$('font[name=check]').text('');
				$('font[name=check]').html("암호를 다시입력해주세요");
				btn = document.getElementById("btn-Yes");
				btn.disabled = true;
			} 
			
			if($('#MPASSWD').val() == $('#chpass').val()){
				$('font[name=check]').text('');
				$('font[name=check]').html("동일한 암호입니다");
				btn = document.getElementById("btn-Yes");
				btn.disabled = false;
			}
		});

	});