$(document).ready(function(){
$("#comment_box_button").click(function() {
	
	var ctx = $('#displayer')[0].getContext("2d");
	ctx.fillText($("#comment_box").val(), 0, 20);
	alert(ctx.getText())
}
);
});