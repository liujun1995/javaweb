<%@ page import="java.util.ArrayList" %>
<%@ page import="com.atguigu.pojo.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 刘俊
  Date: 2021/6/12
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输出一个表格包含10个学生的信息</title>
    <base href="http://127.0.0.1:8080/javaweb/">
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        body{
            text-align: center;
        }
        table{
            border: 1px black solid;
            border-collapse: collapse;
            width: 600px;
            margin: auto;
        }
        td,th{
            border: black 1px solid;
            text-align: center;
        }
    </style>
</head>
<body>
<%
   List<Student> students= (List<Student>) request.getAttribute("stuList");
%>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>电话</td>
        <td>操作</td>
    </tr>
    <%for (Student stu : students) {%>
        <tr>
            <td><%=stu.getId()%></td>
            <td><%=stu.getName()%></td>
            <td><%=stu.getAge()%></td>
            <td><%=stu.getPhone()%></td>
            <td>删除/修改</td>
        </tr>
    <%
        }
    %>
</table>
</body>
</html>
