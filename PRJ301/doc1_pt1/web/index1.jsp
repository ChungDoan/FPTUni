<%-- 
    Document   : index1
    Created on : Jun 7, 2023, 2:14:15 AM
    Author     : chungDoan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>doc1</title>
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
            <form action="demo" method="get">
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
