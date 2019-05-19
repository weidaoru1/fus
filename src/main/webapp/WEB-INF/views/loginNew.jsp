<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/3/30
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />

    <jsp:include page="/common/common.jsp"></jsp:include>
    <link rel="stylesheet" type="text/css" href="/css/login.css" />
    <link rel="stylesheet" type="text/css" href="/css/reset.css" />
    <script type="text/javascript" src="/js/login.js"></script>
</head>
<body onkeydown="keyLogin();">
<div id="login">
    <div class="center">
        <%--<div class="fl"><img src="/images/login.png" alt=""></div>--%>
        <div class="white fr">
            <form action="" id="submit">
                <a><span class="glyphicon glyphicon-user" style=""></span></a>&nbsp;&nbsp;<input type="text" name="userName" placeholder="请输入账号" class="userName">
                    <p class="prompt_username"></p>
                <a><span class="glyphicon glyphicon-lock" style=""></span></a>&nbsp;&nbsp;<input type="password" name="password" placeholder="请输入密码" class="password">
                    <p class="prompt_pass"></p>
                    <input type="submit" value="登录" class="submit login_submit">
            </form>
        </div>
    </div>
</div>
</body>
</html>
