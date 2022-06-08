<%--
  Created by IntelliJ IDEA.
  User: Anthony
  Date: 6/6/2022
  Time: 6:24 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <g:form action="logUser">
        <label>Username</label><br><input type="text" name="username"><br>
        <label>password</label><br><input type="text" name="password"><br>
        <g:submitButton name="login"/>
    </g:form>
</body>
</html>