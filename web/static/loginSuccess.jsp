<%@ page import="java.beans.Encoder" %>
<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: HONOR
  Date: 2022/10/26
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
    <%
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+
                request.getServerPort()+"/"+request.getContextPath()+"/";
    %>
  <base href="<%=basePath%>">
</head>
<body>
<%
    response.setCharacterEncoding("utf-8");
    request.setCharacterEncoding("utf-8");
  response.setHeader("Refresh","3;URL=index.jsp?name="+ URLEncoder.encode(request.getParameter("username"),"utf-8"));
%>
登录成功！
</body>
</html>
