<%--
  Created by IntelliJ IDEA.
  User: HONOR
  Date: 2022/11/1
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+
            request.getServerPort()+"/"+request.getContextPath()+"/";
    pageContext.setAttribute("basePash",basePath);
%>

<html>
<head>
    <title>图书管理</title>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="static/manager/book_manager.css">
    <script src="static/jQuery.js"></script>
    <style>
        td {
            color: #ed40ee;
            font-size: 25px;
            font-family: "微软雅黑 Light";
        }
    </style>
    <script type="text/javascript">
        $(function (){
            $("a.deleteClass").click(function (){
              return confirm("确认删除《"+$(this).parent().parent().find("td:nth-child(2)").text()+"》?");
            });

        });
    </script>
</head>
<body>
<header class="header"><img src="背景图片\导航栏背景.png" alt="" height="100px" width="300px">
</header>
<div class="decorate">
    <br>
    <div class="sco">
    <table align="center" cellpadding="20" cellspacing="50">
        <caption style="color: cyan">作品管理</caption>
    <tr><td>文章编号</td><td>篇名</td><td>作者</td></tr>
    <c:forEach items="${requestScope.page.items}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td><a href="manager/bookServlet?action=getBook&id=${book.id}&pageNo=${requestScope.page.pageNo}" >修改</a> </td>
            <td><a class="deleteClass" href="manager/bookServlet?action=delete&id=${book.id}&pageNo=${requestScope.page.pageNo}" >删除</a> </td>
        </tr>
    </c:forEach>

    </table>
    </div>
    <%@include file="/static/common/page.jsp"%>
    <a href="static/manager/book_edit.jsp?pageNo=${requestScope.page.pageTotal}" class="add">添加图书</a>
</div>
</body>
</html>
