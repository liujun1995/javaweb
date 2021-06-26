<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%--引入fmt标签，实现国际化--%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="cache-control" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <%--使用标签设置local信息--%>
    <fmt:setLocale value="${param.local}"/>
    <%--使用标签设置国际化信息--%>
    <fmt:setBundle basename="i18n"/>
</head>
<body>
<a href="i18n_fmt.jsp?local=zh_CN">中文</a>|
<a href="i18n_fmt.jsp?local=en_US">english</a>
<center>
    <%--输出信息--%>
    <h1><fmt:message key="regist"/></h1>
    <table>
        <form>
            <tr>
                <td><fmt:message key="username"/></td>
                <td><input name="username" type="text"/></td>
            </tr>
            <tr>
                <td><fmt:message key="password"/></td>
                <td><input type="password"/></td>
            </tr>
            <tr>
                <td><fmt:message key="gender"/></td>
                <td><input type="radio"/>男<input type="radio"/>女</td>
            </tr>
            <tr>
                <td><fmt:message key="email"/></td>
                <td><input type="text"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="reset" value="<fmt:message key="reset"/>"/>&nbsp;&nbsp;
                    <input type="submit" value="<fmt:message key="submit"/>"/></td>
            </tr>
        </form>
    </table>
    <br/> <br/> <br/> <br/>
</center>
</body>
</html>