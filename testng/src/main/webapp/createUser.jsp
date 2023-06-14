<%-- 
    Document   : createUser
    Created on : Aug 12, 2022, 8:33:42 AM
    Author     : minh tri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create User</title>
    </head>
    <body>
        <h1>Create new user</h1>

        <form action="MainControllerServlet" method="POST">
            User ID<input type="text" name="userID" value="" required="" placeholder="User ID"/> 
            ${requestScope.USER_ERROR.userIDError}<br>
            Full Name<input type="text" name="fullName" value="" required="" placeholder="Full Name"/> 
            ${requestScope.USER_ERROR.fullNameError}<br>
            Role ID<input type="text" name="roleID" value="US" readonly="" placeholder="Role ID"/> <br>
            Password<input type="password" name="password" value="" required="" placeholder="Password"/> <br>
            Confirm<input type="password" name="confirm" value=""  required=""placeholder="Confirm"/>
             ${requestScope.USER_ERROR.confirmError}<br>
            Status<input type="text" name="status" value="true"  readonly=""/> <br>
            <input type="submit" value="create" name="action" />
            <input type="reset" value="Reset" />
        </form>
            <a href="login.jsp">login</a>
    </body>
</html>
