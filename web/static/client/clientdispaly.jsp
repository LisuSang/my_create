<%--
  Created by IntelliJ IDEA.
  User: HONOR
  Date: 2022/11/1
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>前台管理</title>
    <%
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
                request.getServerPort() + "/" + request.getContextPath() + "/";
    %>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="static/client/clientdisplay.css">

</head>
<body>
<header class="header"><img src="背景图片\导航栏背景.png" alt="" height="100px" width="300px">
</header>
<nav style="text-align: center"><a href="manager/bookServlet?action=page">二创文章管理</a>
<form action="client/clientBookServlet">
    搜索<input type="text"  name="keyword"placeholder="输入作者或书名搜索"><input type="submit" value="搜索">
    <input type="hidden" name="action" value="pageByKeyword">
</form>
</nav>

<div class="book_box">
    <c:forEach items="${requestScope.page.items}" var="book">
        <div class="book_body">
            <img src="${book.imgPath}" width="200px">
            <div class="book_info"><span>编号:${book.id}</span></div>
            <div class="book_info"><span>书名:${book.name}</span></div>
            <div class="book_info"><span>作者:${book.author}</span></div>
        </div>
    </c:forEach>

</div>
<%@include file="/static/common/page.jsp"%>
</body>
</html>
