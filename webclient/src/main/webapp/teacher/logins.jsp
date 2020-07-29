
<%@ page contentType="text/html;charset=UTF-8" language="java" isThreadSafe="false" %>
<%
    String path=request.getContextPath();
%>
<html lang="en" dir="ltr">
<head>
    <meta charset="UTF-8">
    <title>职工登录</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Access-Control-Allow-Origin" content="*">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="<%=path%>/static/X-admin/lib/layui/css/layui.css" media="all">
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        body {background-image:url("<%=path%>/static/img/bg1.png");background-size:cover;}
        #container{height:100%;width:100%;}
        input:-webkit-autofill {-webkit-box-shadow:inset 0 0 0 1000px #fff;background-color:transparent;}
        .admin-login-background {width:300px;height:300px;position:absolute;left:50%;top:40%;margin-left:-150px;margin-top:-100px;}
        .admin-header {text-align:center;margin-bottom:20px;color:#ffffff;font-weight:bold;font-size:30px;color: #1E9FFF}
        .admin-input {border-top-style:none;border-right-style:solid;border-bottom-style:solid;border-left-style:solid;height:50px;width:300px;padding-bottom:0px;}
        .admin-input::-webkit-input-placeholder {color:#a78369}
        .layui-icon-username {color:#a78369 !important;}
        .layui-icon-username:hover {color:#9dadce !important;}
        .layui-icon-password {color:#a78369 !important;}
        .layui-icon-password:hover {color:#9dadce !important;}
        .admin-input-username {border-top-style:solid;border-radius:10px 10px 0 0;}
        .admin-input-verify {border-radius:0 0 10px 10px;}
        .admin-icon {margin-left:260px;margin-top:10px;font-size:30px;}
        i {position:absolute;}
        .captcha-img {display:inline-block;width:34%;float:right;position: absolute;margin-left: 205px;margin-top: -40px;}
        #forget_pwd{color: #1E9FFF;font-size: 15px}
    </style>
</head>
<body>
<div id="container">
    <div></div>
    <div class="admin-login-background">
        <div class="admin-header">
            <span>教职员登录</span>
        </div>
        <form class="layui-form" action="">
            <div>
                <i class="layui-icon layui-icon-username admin-icon"></i>
                <input type="text" name="account" placeholder="请输入账号" value="" autocomplete="off" class="layui-input admin-input admin-input-username">
            </div>
            <div>
                <i class="layui-icon layui-icon-password admin-icon"></i>
                <input type="password" name="password" placeholder="请输入密码"value="" autocomplete="off" class="layui-input admin-input">
            </div>
            <div>
                <input type="text" id="captcha" placeholder="请输入验证码" value="" autocomplete="off" class="layui-input admin-input admin-input-verify">
                <div class="captcha-img">
                    <canvas id="canvas" width="100" height="38"></canvas>
                </div>
            </div>
            <div style="margin-top: 10px;text-align: right">
                <a id="forget_pwd" href="/page/teacher/find_password">忘记密码</a>
            </div>
            <div style="margin-top: 20px">
                <button class="layui-btn layui-btn layui-btn-normal layui-btn-fluid" lay-submit="" lay-filter="login" id="loginBtn">登 入</button>
            </div>
        </form>
    </div>
</div>
<script src="<%=path%>/static/X-admin/js/jquery.min.js" charset="utf-8"></script>
<script src="<%=path%>/static/X-admin/lib/layui/layui.js" charset="utf-8"></script>
<script src="<%=path%>/static/X-admin/js/staff_login.js" charset="utf-8"></script>

<script>
    layui.use(['form'], function () {
        var form = layui.form,
            layer = layui.layer;
        // 登录过期的时候，跳出ifram框架
        if (top.location != self.location) top.location = self.location;

    });
</script>
</body>
</html>

