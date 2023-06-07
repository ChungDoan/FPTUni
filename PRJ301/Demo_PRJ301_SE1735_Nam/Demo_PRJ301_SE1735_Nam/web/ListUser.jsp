<%-- 
    Document   : ListUser
    Created on : Jun 2, 2023, 8:37:28 AM
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
        <%
            //nhan thong tin tra ve tu servlet
            String name="";
            if(request.getAttribute("name")!=null)
                name=(String)request.getAttribute("name");
        %>
        <h1>Hello <%=name%>!</h1>
    </body>
</html>
