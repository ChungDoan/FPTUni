<%-- 
    Document   : Login
    Created on : Jun 2, 2023, 9:40:49 AM
    Author     : thant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="POST" style="margin:auto">
            Account:<input type="text" name="account"> 
            <br>Password:<input type="text" name="password">
            <br><input type="submit" value="LOGIN" name="login">
        </form>
    </body>
</html>
