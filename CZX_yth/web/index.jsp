<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 2019/5/5
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>

<form action="Servlet?flag=login" method="post">
  <input type="text" name="name">
  <input type="password" name="password">
  <input type="submit" value="登录">
</form>
  </body>
</html>
