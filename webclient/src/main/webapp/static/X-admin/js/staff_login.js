$(function(){

    var show_num = [];
    draw(show_num);
    $("#canvas").on('click',function(){
        draw(show_num);
    })

    layui.use(['form','layer'], function () {
        var form = layui.form,
            layer = layui.layer,
            $=layui.jquery;
        // 进行登录操作
        form.on('submit(login)', function (data) {
            data = data.field;
            if (data.account == '') {
                layer.msg('用户名不能为空');
                return false;
            }
            if (data.password == '') {
                layer.msg('密码不能为空');
                return false;
            }
            if ($("#captcha").val() == '') {
                layer.msg('验证码不能为空');
                return false;
            }else{
                var path=$("#path").val();
                var val = $("#captcha").val().toLowerCase();
                var num = show_num.join("");
                var tel = data.field.account;
                var password = data.field.password;
                console.log(tel);
                console.log(password);
                if(val == num){
                    alert('提交成功！');
                    $("#captcha").val('');
                    draw(show_num);
                    $.ajax({
                        url:path+"/teacherController/Login",
                        method:"post",
                        data:{"tel":tel,"password":password},
                        dataType:"text",
                        success:function (msg) {
                            if (msg === "success") {
                                layer.msg(msg);
                                // window.location.href = "https://www.baidu.com";
                            }else {
                                layer.msg(msg, {icon: 5});
                                layer.msg("登录失败")
                            }
                        },
                        beforeSend:function () {
                            $("#loginBtn").attr('disabled',true)
                        },
                        complete:function () {
                            $("#loginBtn").attr('disabled',false)
                        }
                    })
                }else{
                    alert('验证码错误！请重新输入！');
                    $("#captcha").val('');
                    draw(show_num);
                    return false;
                }
            }
            return false;
        });
    })
})

function draw(show_num) {
    var canvas_width=$('#canvas').width();
    var canvas_height=$('#canvas').height();
    var canvas = document.getElementById("canvas");//获取到canvas的对象，演员
    var context = canvas.getContext("2d");//获取到canvas画图的环境，演员表演的舞台
    canvas.width = canvas_width;
    canvas.height = canvas_height;
    // var sCode = "A,B,C,E,F,G,H,J,K,L,M,N,P,Q,R,S,T,W,X,Y,Z,1,2,3,4,5,6,7,8,9,0";
    var sCode = "1,2,3,4,5,6,7,8,9,0";
    var aCode = sCode.split(",");
    var aLength = aCode.length;//获取到数组的长度

    for (var i = 0; i <= 3; i++) {
        var j = Math.floor(Math.random() * aLength);//获取到随机的索引值
        var deg = Math.random() * 30 * Math.PI / 180;//产生0~30之间的随机弧度
        var txt = aCode[j];//得到随机的一个内容
        show_num[i] = txt.toLowerCase();
        var x = 10 + i * 20;//文字在canvas上的x坐标
        var y = 20 + Math.random() * 8;//文字在canvas上的y坐标
        context.font = "bold 23px 微软雅黑";

        context.translate(x, y);
        context.rotate(deg);

        context.fillStyle = randomColor();
        context.fillText(txt, 0, 0);

        context.rotate(-deg);
        context.translate(-x, -y);
    }
    for (var i = 0; i <= 5; i++) { //验证码上显示线条
        context.strokeStyle = randomColor();
        context.beginPath();
        context.moveTo(Math.random() * canvas_width, Math.random() * canvas_height);
        context.lineTo(Math.random() * canvas_width, Math.random() * canvas_height);
        context.stroke();
    }
    for (var i = 0; i <= 30; i++) { //验证码上显示小点
        context.strokeStyle = randomColor();
        context.beginPath();
        var x = Math.random() * canvas_width;
        var y = Math.random() * canvas_height;
        context.moveTo(x, y);
        context.lineTo(x + 1, y + 1);
        context.stroke();
    }
}

function randomColor() {//得到随机的颜色值
    var r = Math.floor(Math.random() * 256);
    var g = Math.floor(Math.random() * 256);
    var b = Math.floor(Math.random() * 256);
    return "rgb(" + r + "," + g + "," + b + ")";
}


