$(function () {
    $("#submit_id").click(function (){
        var pass = /^\w{5,12}$/;

            if (!pass.test($("#user_password").val())) {
                $(".err").css("display", "inline-block");
                return false;
            }
               if($("#user_name").val()==""){
                    $(".tname").css("display", "inline-block");
                    return  false;
                }
            if ($("#user_password").val() != $("#user_repass").val()) {
                $(".tname").css("display", "none");
                $(".err").css("display", "none");
                $(".reerr").css("display", "inline-block");
                return false;
            }
         if(!(!pass.test($("#user_password").val()))&&!($("#user_password").val() != $("#user_repass").val())&&!($("#user_password").val() != $("#user_repass").val())) {
                $(".tname").css("display", "none");
                $(".err").css("display", "none");
                $(".reerr").css("display", "none");

                return true;
            }


    });


});