<%-- 
    Document   : prime2
    Created on : Jun 5, 2023, 2:41:37 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <style>
        #fr{
            border: 1px solid orange;
            padding: 1em;
            width: 30%;
            margin: auto;
            text-align: center
        }
    </style>
    <body>
        <%
            String err = "";
            String result = "";
            if(request.getAttribute("err") != null) err = (String) request.getAttribute("err");
            if(request.getAttribute("result") != null) result = (String) request.getAttribute("result");
        %>
        <form id="fr" action="new" method="new">
            <h3 style="text-align: center">PRIME NUMBER</h3>
            <%
                if(err.equals("")){
            %>
            <p style="text-align: left">Enter an integer n:</p>
            <%
                } else{
            %>
            <p style="text-align: left; color:red"><%=err%></p>
            <%}%>
            <div style="width: 75%; margin: auto 50px">
                <input type="text" name="n" required/> <input type="reset" value="RESET"/> <br><!-- comment -->
            </div>
            
            
            <p style="text-align: center">Shown n prime numbers >= n</p><br>
            <input style="margin-bottom: 20px" type="submit" value="--V--"/><br><!-- comment -->
            <input type="text" value="<%=result%>" readonly/>
        </form>
    </body>
</html>
