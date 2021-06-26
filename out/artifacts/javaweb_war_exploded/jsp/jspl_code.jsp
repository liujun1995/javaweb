<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.atguigu.pojo.Teacher" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: 刘俊
  Date: 2021/6/13
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jspl标准标签库</title>
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
        }

        table {
            border-collapse: collapse;
            border: black 1px solid;
        }

        tr {
            border: black 1px solid;
        }
        table {
            width: 500px;
            border: black 1px solid;
            border-collapse: collapse;
            text-align: center;
        }

    </style>
</head>
<body>
保存之前：${pageScope.abc}<br>
<c:set scope="page" var="abc" value="abcValue"/>
保存之后：${pageScope.abc}
<c:if test="${'abcValue'==pageScope.abc}">
    <h1>test判断条件成立</h1>
</c:if>
${pageContext.request.setAttribute("height",168)}
<c:choose>
    <%--标签内部必须用jsp注释--%>
    <c:when test="${requestScope.height>190}">
        <h2>小巨人</h2>
    </c:when>
    <c:when test="${requestScope.height>180}">
        <h2>很高</h2>
    </c:when>
    <c:when test="${requestScope.height>170}">
        <h2>还行</h2>
    </c:when>
    <c:otherwise>
        <h2>加油！</h2>
    </c:otherwise>
</c:choose>
<%--<table>
    <c:forEach begin="1" end="10" var="i">
        <tr>
            <td>第${i}行</td>
        </tr>
    </c:forEach>
</table>--%>
<% pageContext.setAttribute("stringArr", new String[]{"18610657845", "19632112145", "15789645677"});%>
<c:forEach items="${pageScope.stringArr}" var="item">
    ${item}&ensp;
</c:forEach>
<br/>
<%
    Map<String, Object> map = new HashMap<>();
    Object stringAttr = pageContext.getAttribute("stringArr");
    map.put("strArr", stringAttr);
    map.put("integer", 1);
   /* for (Map.Entry<String, Object> entry : map.entrySet()) {

    }*/
    request.setAttribute("map", map);
%>
<c:forEach items="${requestScope.map}" var="entry">
    ${entry.key} = ${entry.value}
</c:forEach>
<br/>
<%
    List<Teacher> teachers = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
        Teacher teacher = new Teacher(i, "teacher" + i, "pwd" + i, 18 + i, "1584657902" + (i - 1));
        teachers.add(teacher);
    }
    request.setAttribute("teachers", teachers);
%>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>密码</th>
        <th>年龄</th>
        <th>电话</th>
        <th>累计</th>
    </tr>
    <c:forEach begin="2" end="7" step="2" items="${requestScope.teachers}" var="teacher" varStatus="status">
        <tr>`
            <td>${teacher.id}</td>
            <td>${teacher.username}</td>
            <td>${teacher.password}</td>
            <td>${teacher.age}</td>
            <td>${teacher.phone}</td>
            <td>${status.count}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
