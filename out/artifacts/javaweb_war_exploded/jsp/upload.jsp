<%--
  Created by IntelliJ IDEA.
  User: 刘俊
  Date: 2021/6/13
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
    <base href="http://127.0.0.1:8080/javaweb/">
</head>
<body>
    <form  method="post"   action="${pageContext.request.contextPath}/UploadServlet" enctype="multipart/form-data">
        用户名：<input type="text" name="username"><br/>
        头像：<input type="file" name="photo" id="pt"><br/>
        <input type="submit" value="上传头像">
    </form>
</body>
</html>
