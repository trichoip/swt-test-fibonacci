<%-- 
    Document   : shopping
    Created on : Aug 15, 2022, 7:47:06 AM
    Author     : minh tri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>shopping page</title>
    </head>
    <body>
        <h1>hello tree store</h1>
        choose your tree:
        <form action="MainControllerServlet">
            <select name="cmbTree">
                <option value="TO1-Ben Tre Cononut-10">Ben Tre Coconut 10M</option>
                <option value="TO2-Afica Cactus-5">Afica Cactus 5M</option>
                <option value="TO3-Rock Lotus-3">Rock Lotus 3M</option>
                <option value="TO4-Viet Nam Sa nu-3">Viet Nam Sa nu 3M</option>
                <option value="TO5-Lemon Tree-1">Lemon Tree 1M</option>
            </select>
            <select name="cmbQuantity">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="10">10</option> 
            </select>
            <input type="submit" value="add" name="action" />
            <input type="submit" value="view" name="action" />

        </form>
        ${requestScope.MESSAGE}<br>
    </body>
</html>
