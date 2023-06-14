<%-- 
    Document   : user
    Created on : Aug 10, 2022, 4:06:09 PM
    Author     : minh tri
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>user Page</title>
    </head>
    <body>
        <c:if test="${sessionScope.USER_GG == null}">
            <c:if test="${sessionScope.LOGIN_USER ==null || sessionScope.LOGIN_USER.roleID ne 'US'}">
                <c:redirect url="login.jsp"/>
            </c:if>
            <h1>Welcome ${sessionScope.LOGIN_USER.userID}</h1>
            Full name: ${sessionScope.LOGIN_USER.fullName}<br>     
            Role ID:  ${sessionScope.LOGIN_USER.roleID}<br>
            Password:  ${sessionScope.LOGIN_USER.password}<br>
            Status:  ${sessionScope.LOGIN_USER.status}<br>
        </c:if>
        <c:if test="${sessionScope.USER_GG != null}">
            Welcome   ${sessionScope.USER_GG.name}<br> 
            <img src="${sessionScope.USER_GG.picture}" alt="alt"/> <br>
        </c:if>
        <a href="shopping.jsp">shopping page</a>
        <form action="MainControllerServlet">
            <input type="submit" value="logout" name="action" />
        </form>
    </body>
</html>
