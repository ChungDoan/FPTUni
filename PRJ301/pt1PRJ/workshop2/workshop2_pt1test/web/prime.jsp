<%-- 
    Document   : prime
    Created on : Jun 5, 2023, 12:55:56 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #contain-content{
                border: 1px solid orange;
                width: 500px;
                height: 500px;
                margin: auto;
            }

            #contain-form{
                margin-left: 20px;
                
            }

            #fr{
                display: flex;
                justify-content: space-between
            }
            a{
                text-decoration: none;
                border: 1px solid;
                padding: 5px;
                margin-top: 50px;
                display: block;
                width: 55px;
                border-radius: 10px
            }
        </style>
    </head>
    <body>
        <%
            String result = "";
            String err = "";
            String n = "";
            if(request.getAttribute("result") != null) result = (String)request.getAttribute("result");
            if(request.getAttribute("err") != null) err = (String)request.getAttribute("err");
            if(request.getAttribute("n") != null) n = (String)request.getAttribute("n");
        %>

        <div id="contain-content">
            <h3 style="text-align: center; color: blue">PRIME DIVISOR</h3>
            <div id="contain-form">

                <form id="fr" action="prime">
                    
                    <div id="contain-in">
                        <%
                    if(err.equals("")) {
                    %>
                    <p style="font-style: italic; font-weight: bold">Enter an integer n: </p>
                    <%
                        }
                        else {
                    %>
                    <p style="color:red"><%=err%></p>
                    <%}%>
                        <input type="text" name="n" value="<%=n%>" required/> 
                        <input type="submit" value=">>"/><br>
                        <a href="prime.jsp" style="margin-top: 20px; margin-left: 60px">
                            <span style="font-weight: bold; color: red">RESET</span>
                        </a>
                    </div>

                    <div id="contain-list" style="margin-right: 80px">
                        <textarea id="tea" name="result" rows="10" cols="10"><%=result%></textarea>
                    </div>
                </form>
            </div>



        </div>

    </body>
</html>
