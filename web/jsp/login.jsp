<%--
  Created by IntelliJ IDEA.
  User: 刘俊
  Date: 2021/6/18
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
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
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
        }

        body {
            text-align: center;
        }

        #login {
            background-color:  burlywood;
            width: 300px;
            height: 300px;
            position: absolute;
            left: 50%;
            top: 50%;
            margin-left: -150px;
            margin-top: -150px;
        }

        #tb{
            width: 300px;
            height: 300px;
            position: relative;
            border-collapse:  collapse;
        }
        tr{
            text-align: center;
            height: 75px;
        }
        input:not(#sb){
            background-color:silver;
        }
        #sb{
            width: 200px;
        }
        #sp{
            display: inline-block;
            color: red;
        }
    </style>
</head>
<body>
<div id="login">
    <form id="form" action="loginServlet?action=login" method="post" >
        <table id="tb">
            <tr ><td colspan="2"><span id="sp">${empty requestScope.illegal?"":"用户名或密码错误！"}</span></td></tr>
            <tr>
                <td>用户名：</td>
                <td><input type="text" id="username" name="username" value="${requestScope.username}"/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" id="pwd" name="password" value=""/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" id="sb" value="登录"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
