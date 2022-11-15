<%--
  Created by IntelliJ IDEA.
  User: HONOR
  Date: 2022/10/9
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>永世乐土</title>
  <link rel="stylesheet" href="static/index.css">
  <link rel="shortcut icon" href="static/favicon.ico" />
  <meta name="description" content="爱莉神教由各教会成员组成、用于为吾主爱莉进行祈祷、祷告、...">
  <%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+
            request.getServerPort()+"/"+request.getContextPath()+"/";
  %>
  <base href="<%=basePath%>">
</head>


<body>
<!-- 导航栏开始 -->
<div class="top1">
  <h1 class="h1" id="first">爱莉神教</h1>
  <div class="nav">
    <a href="" class="navi"><img src=背景图片\导航栏背景.png height="70px
                " alt=""> </a>
    <ul>
      <li><a href="#">圣堂</a></li>
      <li><a href="#">教会资料</a></li>
      <li><a href="#">教会活动</a></li>
      <li><a href="#">首页</a></li>
    </ul>

  </div>
</div>
<!-- 导航栏结束 -->
<!-- 宣传开始 -->
<div class="banner">
  <div class="w">
    <div class="banle">
      <ul>
        <li><a href="#">角色介绍</a></li>
        <li><a href="#">角色经历</a></li>
        <li><a href="#">关系网</a></li>
        <li><a href="static/manager/manager.jsp">角色二创</a></li>
        <li><a href="#">加入我们</a></li>
      </ul>
    </div>
    <div class="banri">
      <img src=背景图片\mmexport1663937297143.png alt="" width="1058px">
    </div>
  </div>

</div>
<!-- 宣传结束 -->
</div>
<br><br><br><br><br><br><br><br><br>
<h2>每日一悦</h2>
<div class="mid">
  <div class="bottom">
            <span>
                <img src=每日图片\880B9887FA81F23369DFDA3F20C8E231.jpg alt="色到图裂" title="别nm乱点" height="300"></span>
    <span><img src="每日图片/\F09A909D09402A8DDAB6A6276453D60A.jpg" alt="色到图裂" height="300" title="别nm乱点"></span>
    <span><img src="每日图片/\3.jpg" alt="色到图裂" height="300" title="别nm乱点"></span>
    <span>
                <img src="每日图片/\QQ图片20220904141046.jpg" alt="色到图裂" height="300" title="别nm乱点">
            </span>

    <span><img src="每日图片/\7dffb038475a48cf.jpg" alt="色到图裂" height="300" title="别nm乱点"></span>
    <span><img src="每日图片/\-440086e0987ecf8c.jpg" alt="色到图裂" height="300" title="别nm乱点"></span>
    <span><img src="每日图片/\QQ图片20220913143230.jpg" alt="色到图裂" height="300" title="别nm乱点"></span>
    <span><img src="每日图片/\Cache_-5ceef1f1eb12502a..jpg" alt="色到图裂" height="300" title="别nm乱点"></span>
    <span><img src="每日图片/\1fa454c4178fcdd.jpg" alt="色到图裂" height="300" title="别nm乱点"></span>
    <span><img src="每日图片/\-2df15f6831e6094d.jpg" alt="色到图裂" height="300" title="别nm乱点"></span>
    <span><img src="每日图片/\dc5e804bad52583.jpg" alt="色到图裂" height="300" title="别nm乱点"></span>
    <span><img src="每日图片/\60e602c589a672b.jpg" alt="色到图裂" height="300" title="别nm乱点"></span>
    <span><img src="每日图片/\2837939112b7ced0.jpg" alt="色到图裂" height="300" title="别nm乱点"></span>
  </div>
</div>
<div class="fh"><a href="#first"><img src=背景图片\向上.png alt="" height="50px
        "></a>
</div>
<audio src="C:\Users\HONOR\Music\やまだ豊 - やわらかな光 (YAWARAKANA HIKARI).mp3" autoplay="autoplay" controls="controls"
       preload="auto" id="au">
</audio>
<a href="角色介绍.html" target="_blank"><em>逐火十三英杰</em></a><br>
<a href="static/register.jsp" target="_blank">注册账号</a>
<h3><a href="#first">返回顶部</a></h3>

<script>

</script>
</body>

</html>
