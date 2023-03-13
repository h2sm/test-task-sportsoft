$(function () {
    $("#checkSigns").click(function () {
        $.ajax({
            type: "GET",
            url: "/getAllSigns",
            success: function (response) {
                console.log(response);
            },
            error: function (d) {
                console.log(d);
            }
        });
    });
});