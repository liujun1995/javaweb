<%--
  Created by IntelliJ IDEA.
  User: 刘俊
  Date: 2021/6/12
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8"  language="java" %>
<html>
<head>
    <title>9*9乘法口诀表</title>
    <base href="http://127.0.0.1:8080/javaweb/">
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        body{
            text-align: center;
        }
        div{
            background-color: orange;
            width: 120px;
            height: 30px;
            text-align: center;
            line-height: 30px;
            position: absolute;
            left: 50%;
        }
        table{
            width: 650px;
            border: orange 1px solid;
            margin: auto;
        }
    </style>
</head>
<body>
    <%-- 输出9*9乘法口诀表--%>
    <div >九九乘法口诀表</div>
    <table>
        <%
            for (int i = 1; i <= 9; i++) {
        %>
            <tr>
                <%for (int j = 1; j <= i; j++) {%>
                <td><%=j+"*"+i+"="+(i*j)%></td>
                <%}%>
            </tr>
        <%}%>
    </table>
</body>
</html>
