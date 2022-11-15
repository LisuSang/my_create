<%--
  Created by IntelliJ IDEA.
  User: HONOR
  Date: 2022/10/26
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>登录界面</title>
    <%
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+
                request.getServerPort()+"/"+request.getContextPath()+"/";
    %>
    <link rel="shortcut icon" href="static/favicon.ico" />
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="static/login.css">
</head>
<body>


<!-- 头部 -->
<header class="header"><img src="背景图片\导航栏背景.png" alt="" height="100px" width="300px">
</header>
<!-- 内容 -->
<div class="decoration">
    <nav class="nav">
        <h3>未注册账号，点击此<a href="static/register.jsp">注册</a></h3>
        <h1>爱莉神教登录&gt;</h1>


    </nav>
    <!-- 注册表 -->
    <div class="contain">

        <div class="c_body">
            <form action="userservlet" name="form_user" method="post">
                <ul>
                    <li><label for="user_name">用户名:</label><input type="text" name="username" id="user_name"></li>
                    <li><label for="user_password">密码:</label><input type="password" name="password" id="user_password"
                                                                       placeholder="由12位字母或数字组成"></li>
                    <li><label for="load_yz">验证码</label><input type="text" name="yanzheng" id="load_yz"></li>
                    <li><input type="submit" name="sumbit" class="submit" value="确认登录" id="submit_id"></li>
                    <li><label></label>
                        <span class="err">
<%--                            <%=request.getAttribute("err") == null?"":request.getAttribute("err")%>--%>
                        ${requestScope.err}
                        </span></li>
                     <input type="hidden" name="action" value="login">
                </ul>
            </form>
        </div>
    </div>
    <footer class="footer">
        <div class="footer_adress">地址：蒙德城西风街365号天使的馈赠后门 邮编：431103 电话：400-522-1111 传真：020-45616116
            邮箱：1719962939@qq.com</div>
    </footer>
</div>
</body>


</html>
