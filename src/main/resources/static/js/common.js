$(function() {
	$(".jump-btn").click(function() {
		var href = $(this).attr("href");
		if (href) {
			location.href = href;
		}
	});
});