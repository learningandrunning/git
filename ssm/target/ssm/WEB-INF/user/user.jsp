<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/6/24
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>用户信息</title>
</head>
<h2>查询的用户信息</h2>
<body>
id:${requestScope.user.id}<br/>
email:${requestScope.user.email}<br/>
username:${requestScope.user.userName}<br/>
role:${requestScope.user.role}<br/>
mobile:${requestScope.user.mobile}<br/>
result:${requestScope.result}<br/>
</body>
</html>
