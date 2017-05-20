/**
 * Created by maurice on 5/17/17.
 * Ref: https://bootsnipp.com/snippets/featured/easy-table-filter
 */
$(document).ready(function () {

    $('.star').on('click', function () {
        $(this).toggleClass('star-checked');
    });

    $('.ckbox label').on('click', function () {
        $(this).parents('tr').toggleClass('selected');
    });

   /* $('.btn-filter').on('click', function () {
        var $target = $(this).data('target');
        if ($target != 'all') {
            $('.table tr').css('display', 'none');
            $('.table tr[data-status="' + $target + '"]').fadeIn('slow');
        } else {
            $('.table tr').css('display', 'none').fadeIn('slow');
        }
    });
*/
});

/*
 * Send request to checkout controller to modify the book status
 */
function checkOut(element, id){

    var status = element.checked;
    if(status){//dynamically change checkbox label text
        $("#" + id).empty();//.html("Due Date:");
        $("#" + id).prepend("Due Date:");//.html("Due Date:");
    }else{
        $("#" + id).empty();//clear old data;
        $("#" + id).prepend("Checked In");
        $("#due" + id).html("");
    }
    //update status in database - using ajax post request
    var url = "/LibTermSpring/checkout";
    $.post(url, {status:status, id:id}, function(data){
        //process response
        $("#due" + id).append(getDateString(data.dueDate));
    });
}

/*
 * Convert date to standard date string for display in view
 */
function getDateString(data) {
    var date = ""
    if(data){
        date = (new Date(data)).toDateString();
    }
    return date;
}