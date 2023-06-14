<%-- 
    Document   : admin
    Created on : Aug 10, 2022, 4:06:03 PM
    Author     : minh tri
6Lea6JghAAAAAJIVvUKFe9hgkNeKM7rFOglMouub   size key
6Lea6JghAAAAAIGW81peAQpHReNnmGiSHhtzs-VV   secret key 
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>admin page</title>
    </head>
    <body>
        <c:if test="${sessionScope.LOGIN_USER == null || sessionScope.LOGIN_USER.roleID != 'AD' }">
            <c:redirect url="login.jsp"/>
        </c:if>

        <h1>Hello ${sessionScope['LOGIN_USER'].getFullName()}</h1>
        <h1>Hello ${sessionScope['LOGIN_USER'].fullName}</h1>
        <h1>Hello ${sessionScope.LOGIN_USER.getFullName()}</h1>
        <h1>Hello ${sessionScope.LOGIN_USER.fullName}</h1>


        <a href="MainControllerServlet?action=logout">log out</a> <br>

        <c:url var="LogoutLink" value="MainControllerServlet">
            <c:param name="action" value="logout"/>
        </c:url>
        <a href="${LogoutLink}">Logout JSTL</a>



        <form action="MainControllerServlet" method="get">
            Search:  <input type="text" name="search" value="${param.search}" />
            <input type="submit" value="search" name="action" />
            <input type="submit" value="logout" name="action" />
        </form>

        <c:if test="${not empty requestScope.LIST_USER}">
            <table border="1">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>User ID</th>
                        <th>Full Name</th>
                        <th>Role ID</th>
                        <th>Password</th>
                        <th>status</th>
                        <th>delete</th>
                        <th>update</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${requestScope.LIST_USER}" varStatus="counter">
                    <form action="MainControllerServlet">
                        <tr>
                            <td>${counter.count}</td>
                            <td><input type="text" name="userID" value="${user.userID}" readonly=""/> </td>
                            <td><input type="text" name="fullName" value="${user.fullName}" required=""/></td>
                            <td><input type="text" name="roleID" value="${user.roleID}" required=""/></td>
                            <td>${user.password}</td>
                            <td>${user.status}</td>
                            <td>
                                <c:url var="DeleteLink" value="MainControllerServlet">
                                    <c:param name="action" value="delete"/>
                                    <c:param name="userID" value="${user.userID}"/>
                                    <c:param name="search" value="${param.search}"/>
                                </c:url>
                                <a href="${DeleteLink}">delete</a>
                            </td>
                            <td>
                                <input type="submit" name="action" value="update" />
                                <input type="hidden" name="search" value="${param.search}" />
                            </td>
                        </tr>
                    </form>
                </c:forEach>
            </tbody>
        </table>
         <font color="red">${requestScope.ERROR}</font> 
    </c:if>

</body>
</html>

