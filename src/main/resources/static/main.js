$(document).ready(function() {

    $("#submitButton").click(function(event) {
        event.preventDefault();

        sendMsg()

    });

});

function sendMsg() {

    // Get form
    var formData = {
        context : $("#text").val()
    }


    $("#submitButton").prop("disabled", true);

    $.ajax({
        type: "POST",
        url: "/sendMessage",
        data: formData,
        success: function(formData) {

            $("#text").html(data);
            console.log("SUCCESS : ", data);
            $("#submitButton").prop("disabled", false);
            $('#messageForm')[0].reset();
        }
    });

}