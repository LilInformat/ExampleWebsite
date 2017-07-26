$('#list-item').on('click',function(e){
    var previous = $(this).closest(".list-group").children(".active");
    previous.removeClass('active');
    $(e.target).addClass('active');
  });
  
$(document).ready(function() {
	$('#myModal').modal();
    $("#content-main").load( "web/main.html" );
});