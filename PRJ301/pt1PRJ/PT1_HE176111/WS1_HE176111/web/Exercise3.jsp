<%-- 
    Document   : Exercise3
    Created on : Jun 5, 2023, 3:31:41 PM
    Author     : dmx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            .main {
                display: flex;
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body>
    
        <%
            String result = "";
            if(request.getAttribute("result") != null) {
                result = (String) request.getAttribute("result");
            }
            String sum = "";
            if(request.getAttribute("sum") != null) {
                sum = (String) request.getAttribute("sum");
            }
            String numberFinal = "";
            if(request.getAttribute("numberFinal") != null) {
                numberFinal = (String) request.getAttribute("numberFinal");
            }
            String error = "";
            if(request.getAttribute("error") != null) {
                error = (String) request.getAttribute("error");
            }
        %>

        <h1 style="color: blue;">INPUT AND CAlCULATE</h1>
        <div class="main">
            <form action="pt" method="get">
                <p>Enter an integer n:</p>
                <input type="text" name="number" value="<%=numberFinal%>"> <input type="submit" value=">>"> <br> <br>
                <button type="submit" name="reset" style="color: red; font-weight: bold;">RESET</button>
                <textarea name="" id="" cols="30" rows="10"  readonly><%=result%></textarea> <br>
                Sum of numbers in list: <input type="text" name="sum" value="<%=sum%>" readonly>
            </form>

        </div>  
            <h2><%=error%></h2>
    </body>
</html>
