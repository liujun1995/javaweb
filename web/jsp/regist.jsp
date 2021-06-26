<%--
  Created by IntelliJ IDEA.
  User: 刘俊
  Date: 2021/6/19
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <%
        String basePath = request.getScheme()
                + "://"
                + request.getServerName()
                + ":"
                + request.getServerPort()
                + request.getContextPath()
                + "/";
        pageContext.setAttribute("basePath", basePath);
    %>
    <base href="<%=basePath%>">
</head>
<body>
    <form action="registServlet?action=regist" method="post">
        用户名：<input type="text" name="username" value=""><br/>
        验证码：<input type="text" style="width: 70px" name="code" value=""><img style="width: 70px" height="28px" src="Kaptcha.jpg" alt="validate code">
        <br/><input type="submit" value="提交">
    </form>
</body>
</html>
