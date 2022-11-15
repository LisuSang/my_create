<%--
  Created by IntelliJ IDEA.
  User: HONOR
  Date: 2022/11/1
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>二创中心</title>
  <link rel="shortcut icon" href="static/favicon.ico" />
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+
            request.getServerPort()+"/"+request.getContextPath()+"/";
  %>
  <base href="<%=basePath%>">
</head>
<body>
<!-- 头部 -->
<header class="header"><img src="背景图片\导航栏背景.png" alt="" height="100px" width="300px">
</header>
<!-- 内容 -->
<a href="">后台管理</a>
</body>
</html>
