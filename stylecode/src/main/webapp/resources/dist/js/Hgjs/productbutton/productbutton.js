$(document).ready(function() {
	/* 낮은 가격순 */
	$(".btn-primary").on("click", function() {
		self.location = "/productlistLow"
	});

	/* 높은가격순 */
	$(".btn-danger").on("click", function() {
		self.location = "/productlistHigh"
	});

});