<%@ page import="com.atguigu.pojo.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 刘俊
  Date: 2021/6/12
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>person</title>
    <base href="http://127.0.0.1:8080/javaweb/">
</head>
<body>
    <%Person person = new Person();
        person.setName("国哥");
        person.setPhones(new String[]{"17611051505", "18688886666", "18699998888"});
        List<String> cities= new ArrayList<>();
        cities.add("北京");
        cities.add("上海");
        cities.add("深圳");
        person.setCities(cities);
        Map<String,Object> map = new HashMap<>();
        map.put("key_first", "val_first");
        map.put("key_second", "val_second");
        map.put("key_third", "val_third");
        person.setMp(map);

        pageContext.setAttribute("person", person);
    %>
    ${person}<br/>
    ${person.name}<br/>
    ${person.phones[0]}<br/>
    ${person.cities[0]}<br/>
    ${person.mp.key_first}<br/>
    <%=config.getServletContext().getInitParameter("password")%><br/>
    ${initParam.username}

</body>
</html>
