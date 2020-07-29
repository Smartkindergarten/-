<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<!doctype html>--%>
<html  class="x-admin-sm">
<head>
	<meta charset="UTF-8">
	<title>后台登录</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/X-admin/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/X-admin/css/login.css">
	  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/X-admin/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/X-admin/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/X-admin/lib/layui/layui.js" charset="utf-8"></script>
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="login-bg">

<%String path=request.getContextPath();%>
<input id="path" type="hidden" value=<%=path%> >

    <div class="login layui-anim layui-anim-up">
        <div class="message">智慧幼儿园家长登陆</div>
        <div id="darkbannerwrap"></div>
        
        <form method="post" class="layui-form" >
            <input name="tel" placeholder="手机号"  type="tel" lay-verify="required" class="layui-input" >
            <hr class="hr15">
            <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
            <hr class="hr15">
            <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="button" onclick="tologin()">
            <hr class="hr20" >
        </form>
    </div>

    <script>
        $(function  () {
            layui.use('form', function(){
              var form = layui.form;


            });
        });
        function tologin() {
            var path=$("#path").val();
            layui.use(['layer','form'], function() {
                var layer = layui.layer;
                var form = layui.form;

                //监听提交
                form.on('submit(login)', function (data) {
                    // alert(888);
                    // layer.msg(JSON.stringify(data.field),function(){
                    //     location.href='index.html'
                    // });
                    // return false;
                    //   console.log(JSON.stringify(data.field.username));
                    // var account = JSON.stringify(data.field.username);
                    var tel =data.field.tel;
                    var password =data.field.password;
                    console.log(tel);
                    console.log(password);
                    // alert(path);
                    $.ajax({
                        url:path+"/parentController/Login",
                        async: true,
                        type: "post",
                        data:{"tel":tel,"password":password},
                        dataType: "text",
                        success: function (msg) {
                            if (msg === "success") {
                                layer.msg(msg);
                                // location.href=path+'/admin/index.jsp';

                            } else {
                                layer.msg(msg, {icon: 5});

                            }
                        },
                        error: function () {
                            alert("网络繁忙");

                        },
                        complete: function () {
                            // alert("ajax执行完毕");
                        }
                    })

                });
                return false;

            });


         }

    </script>
    <!-- 底部结束 -->
</body>
</html>