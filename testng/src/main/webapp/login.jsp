<%-- 
    Document   : login
    Created on : Aug 10, 2022, 3:24:35 PM
    Author     : minh tri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Page</title>
        <script src='https://www.google.com/recaptcha/api.js?hl=en'></script>
    </head>
    <body>
        <form action="MainControllerServlet" method="POST">
            User ID: <input type="text" name="userID" value="" /> <br>
            Password: <input type="password" name="password" value="" /> <br>
            <br><input type="submit" value="login" name="action" />
        </form>
        ${requestScope.ERROR} <br>

        <a href="createUser.jsp">create new user</a>
        
        
  
    </body>
</html>
