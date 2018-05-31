<%--
  Created by IntelliJ IDEA.
  User: inclu
  Date: 2018/4/4
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登陆</title>
</head>
<body>
<form method="post" action="/login">
    <p>姓名：<input type="text" name="username" size="10"></p>
    <p>密码：<input type="password" name="password" size="10"></p>
    <p><input type="submit" value="确定">
        <input type="reset" value="取消"></p>
    <p>${requestScope.error}</p>

</form>
 <h1>hello world</h1>
</body>
</html>
