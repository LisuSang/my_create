<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: HONOR
  Date: 2022/10/26
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>注册成功！</title>
  <%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+
            request.getServerPort()+"/"+request.getContextPath()+"/";
  %>

  <base href="<%=basePath%>">
  <style>
    .bjv {
      position: fixed;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      z-index: -10;
      object-fit: cover;

    }

  </style>
</head>

<body>
<!-- 头部 -->
<div class="body">
  <video src="C:\Users\HONOR\Desktop\网页设计\背景图片\202210261450.mp4" autoplay muted class="bjv"></video>
  <div>
  注册成功，3s后自动跳转到首页
  </div>
  <%
    response.setCharacterEncoding("utf-8");
    request.setCharacterEncoding("utf-8");
    response.setHeader("Refresh","3;URL=index.jsp?name="+   URLEncoder.encode(request.getParameter("username"),"utf-8"));
  %>

</div>
</body>

</html>
