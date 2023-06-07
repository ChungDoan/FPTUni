<%-- 
    Document   : primeDivisor_de1
    Created on : Jun 7, 2023, 10:20:57 AM
    Author     : chungDoan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>De1 PrimeDivisor</title>
        <style>
            #table{border: 3px solid #ffb78e;}
            #nameTable{color: blue;font-size: 32px;}
            #inputMess{margin-bottom: 0px; font-size: 26px;font-style: italic;font-weight: bold}
            #inputTable{width: 143px}
            #inputBox{margin: auto 65px; color: red; font-weight: bold;}
            #textArea{resize: none;overflow-y: scroll }
        </style>
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
            <table id="table">
                <thead>
                <th id="nameTable" colspan="2" >
                    PRIME DIVISOR
                </th>
                </thead>
                <tbody>
                    <tr> 
                        <td><p id="inputMess">Enter an integer n:</p></td>
                    </tr>
                    <tr>
                        <td>
                            <input id="inputTable" type="text" name="numInput" value="<%=numberFinal%>"> <input type="submit" value=">>"> <br> <br>
                            <button id="inputBox" type="submit" name="reset">RESET</button>
                        </td>
                        <td>
                            <textarea name="" id="textArea" cols="30" rows="10"><%=result%></textarea> <br>
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
