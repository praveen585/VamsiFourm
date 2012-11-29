$(document).ready(function(){
	var source = new EventSource('/wehelpsufourm');
	source.onopen = function (e) {
	  connectionOpen(true);
	};

	source.onerror = function () {
	  connectionOpen(false);
	};
	
});

function start_filter(data) {
	
	canvas=$('#displayer')[0];
	
		ctx=get_canvas()
		ctx.clearRect(0, 0,canvas.width, canvas.height)
        var i;
		var obj = JSON.parse(data);
		var key, count = 0;
	    for(key in obj) {
	    	ctx.fillText(key+": "+obj[key], 0, 20+(20*count++))
	    }
	
}

function get_canvas(){
	canvas=$('#displayer')[0];
	var ctx = $('#displayer')[0].getContext("2d");
	 
	gradient = ctx.createLinearGradient(0, 0, canvas.width, 0);
     // Add the colors with fixed stops at 1/4 of the width.
     gradient.addColorStop("0", "black");
    

     // Use the gradient.
     ctx.font = "italic 200 14px/2 Unknown Font, sans-serif"
     ctx.fillStyle = gradient;
     return ctx;
}

function real_displayer(data,another){
	ctx=get_canvas()
    var i;
   var obj = JSON.parse(json_comments);
	var key, count = 0;
    for(key in obj) {
    	ctx.fillText(key+": "+obj[key], 0, 20+(20*count++))
    }
    for(key in another) {
    	ctx.fillText(key+": "+another[key], 0, 20+(20*count++))
    }
}

function connectionOpen(flag,data){
if (flag){
	
	$.ajax({
		  url: "/ChatServlet",
		  //dataType: "json",
		  //data: json_new_array,
		  //contentType: "application/json; charset=utf-8",	  
		  success: function(data) {
			  start_filter(data);
		}
		});
	
}
else{
	//alert("in else")
}
}