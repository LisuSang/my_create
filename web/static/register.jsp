<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>注册界面</title>
  <%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+
    request.getServerPort()+"/"+request.getContextPath()+"/";
  %>
  <base href="<%=basePath%>">
  <link rel="shortcut icon" href="static/favicon.ico" />
  <link rel="stylesheet" href="static/register.css">
  <script src="static/jQuery.js"></script>
  <script src="static/register.js"></script>

</head>

<body>
<!-- 头部 -->
<header class="header"><img src="背景图片\导航栏背景.png" alt="" height="100px" width="300px">
</header>
<!-- 内容 -->
<div class="decoration">
  <nav class="nav">
    <h1>爱莉神教注册&gt;</h1>
    <h3>已有账号，点击此<a href="static/login.jsp">登录</a></h3>

  </nav>
  <!-- 注册表 -->
  <div class="contain">
    <div class="c_body">
      <form action="userservlet" name="form_user" method="post">
        <ul>
          <li><label for="user_name">用户名:</label><input type="text" name="username" id="user_name"><span class="tname">用户名为空</span></li>
          <li><label for="bri_date">出生日期:</label><input type="date" name="bri" id="bri_date" value="2002-11-11">
          </li>
          <li><label for="tel_value">手机号:</label><input type="tel" name="tel" id="tel_value"></li>
          <li><label for="user_email">邮箱:</label><input type="email" name="email" id="user_email"></li>

          <li><label for="user_password">密码:</label><input type="password" name="password" id="user_password"
                                                 placeholder="由12位字母或数字组成"><span class="err">密码格式错误</span></li>
          <li><label for="user_repass">确认密码:</label><input type="password" name="password_re" id="user_repass"><span
                  class="reerr">两次密码不同</span></li>
          <li><input type="submit" name="sumbit" class="submit" value="确认注册" id="submit_id">
          </li>
          <li><label></label><span  style="color: red;margin-left:34px"><%=request.getAttribute("ername") == null?"":request.getAttribute("ername")%></span></li>
          <input type="hidden" name="action" value="register">
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