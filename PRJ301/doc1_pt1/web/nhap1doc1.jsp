<%-- 
    Document   : nhap1doc1
    Created on : Jun 7, 2023, 2:37:29 AM
    Author     : chungDoan
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
        <form action="demo" method="get">
            <table style="border: 3px solid #ffb78e;">
                <thead>
                <th style="color: blue;" colspan="2" >
                    PRIME DIVISOR
                </th>
                </thead>
                <tbody>
                    <tr> 
                        <td><p style="margin-bottom: 0px; font-size: 26px;font-style: italic;font-weight: bold">Enter an integer n:</p></td>
                    </tr>
                    <tr>
                        <td>
                            <input style="width: 143px" type="text" name="number" value="<%=numberFinal%>"> <input type="submit" value=">>"> <br> <br>
                            <button type="submit" name="reset" style="margin: auto 65px; color: red; font-weight: bold;">RESET</button>
                        </td>
                        <td>
                            <textarea style="resize: none;overflow-y: scroll " name="" id="" cols="30" rows="10"  ><%=result%></textarea> <br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <p><%=error%></p>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
