<%-- 
    Document   : index2
    Created on : Jun 6, 2023, 11:36:01 PM
    Author     : chungDoan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>doc2</title>
    </head>
    <body>
        <%
            String err = "";
            String result = "";
            if(request.getAttribute("err") != null){
                err = (String) request.getAttribute("err");                
            }
            if(request.getAttribute("result") != null){
                result = (String) request.getAttribute("result");
            }
        %>

        <form id="fr" action="demo" method="get">
            <h3>PRIME NUMBER</h3>
            <%
                if(err.equals("")){
            %>
            <p>Enter an integer n:</p>
            <%
                } else{
            %>
            <p><%=err%></p>
            <%}%>
            <div>
                <input type="text" name="n" required/> <input type="reset" value="RESET"/> <br><!-- comment -->
            </div>


            <p>Shown n prime numbers >= n</p><br>
            <input type="submit" value="--V--"/><br><!-- comment -->
            <input type="text" value="<%=result%>" readonly/>
        </form>
    </body>
</html>
