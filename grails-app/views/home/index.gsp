<%--
  Created by IntelliJ IDEA.
  User: Anthony
  Date: 6/3/2022
  Time: 2:38 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <h1>Home page</h1>
    <ul>
        <g:each in="${truckList}" var="truck">
            <li>
                <g:link controller="truck" action="show" id="${truck.id}">
                    ${truck.name}
                </g:link>
            </li>
        </g:each>
    </ul>
</body>
</html>