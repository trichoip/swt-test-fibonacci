<%-- 
    Document   : viewCart
    Created on : Aug 15, 2022, 8:50:28 AM
    Author     : minh tri
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view cart</title>
    </head>
    <body>
        <h1>your shopping cart: </h1>
        <c:if test="${not empty sessionScope.CART}">
            <table border="1">
                <thead>
                    <tr>
                        <th>NO</th>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>total</th>
                        <th>edit</th>
                        <th>remove</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="tree" items="${sessionScope.CART.getCart().values()}" varStatus="count">
                        <c:set var="total" value="${total + (tree.quantity * tree.price)}" />
                    <form action="MainControllerServlet">
                        <tr>
                            <td>${count.count}</td>
                            <td>${tree.id}</td>
                            <td>${tree.name}</td>
                            <td>${tree.price}</td>
                            <td><input type="number" name="quantity" value="${tree.quantity}" min="1" /></td>
                            <td>${tree.quantity * tree.price}</td>
                        <input type="hidden" name="id" value="${tree.id}" />
                        <td><input type="submit" value="edit" name="action" /> </td>
                        <td><input type="submit" value="remove" name="action" /> </td>
                        </tr>
                    </form>
                </c:forEach>
            </tbody>
        </table>
        <h1>Total: ${total}</h1>
    </c:if>
    <c:if test="${empty sessionScope.CART}">
        <h5>No product in cart</h5>
    </c:if>
    <a href="shopping.jsp">add more</a>
</body>
</html>
