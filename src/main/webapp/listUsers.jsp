<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User list</title>
    </head>
    <body>
        <h1>User list</h1>
        <ul>
            <c:forEach items="${users}" var="user">
                <li>${user.username} ${user.password} </li>
            </c:forEach>
        </ul>
        <br/>
        <a href="${pageContext.request.contextPath}/index.html">Return to Home page</a>
    </body>
</html>
