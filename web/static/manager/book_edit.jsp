<%--
  Created by IntelliJ IDEA.
  User: HONOR
  Date: 2022/11/3
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + "/" + request.getContextPath() + "/";
%>
<html>
<html>
<head>
    <title>添加</title>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="static/manager/book_edit.css">

</head>
<body>
<header class="header"><img src="背景图片\导航栏背景.png" alt="" height="100px" width="300px">
</header>
<div class="deco" align="center">
    <form action="manager/bookServlet" method="post">
        <table align="center" cellpadding="20" cellspacing="50">
            <tr>
                <td>书名</td>
                <td>作者</td>
            </tr>
            <tr>
                <td><input type="text" name="name" value="${requestScope.book.name}"></td>
                <td><input type="text" name="author" value="${requestScope.book.author}"></td>
                <td><input type="submit" value="提交"></td>
                <input type="hidden" name="action" value="${ empty param.id?"add":"update"}">
                <input type="hidden" name="id" value="${requestScope.book.id}">
                <input type="hidden" name="pageNo" value="${param.pageNo}">
            </tr>
        </table>
    </form>
</div>
</body>
</html>
