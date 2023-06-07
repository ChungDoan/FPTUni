<%-- 
    Document   : index
    Created on : Jun 6, 2023, 10:08:25 PM
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
            String a = "";
            if (request.getAttribute("a") != null) a = String.valueOf(request.getAttribute("a"));
            
            String b = "";
            if (request.getAttribute("b") != null) b = String.valueOf(request.getAttribute("b"));
            
            String c = "";
            if (request.getAttribute("c") != null) c = String.valueOf(request.getAttribute("c"));
            
            String res = "";
            if (request.getAttribute("res") != null) res = String.valueOf(request.getAttribute("res"));
        %>

        <form id="form" method="get" action="hoang">
            <table>
                <tr>
                    <td colspan="2" style="font-size: 1.6em; text-align: center; color: blue; font-weight: bold">TÌM MAX VÀ MIN</td>
                </tr>

                <tr>
                    <td style="font-weight: bold">Enter a: </td>
                    <td>
                        <input type="text" name="a" id="a" value="<%=a%>">
                    </td>
                </tr>

                <tr>
                    <td style="font-weight: bold">Enter b: </td>
                    <td>
                        <input type="text" name="b" id="b" value="<%=b%>">
                    </td>
                </tr>

                <tr>
                    <td style="font-weight: bold">Enter c: </td>
                    <td>
                        <input type="text" name="c" id="c" value="<%=c%>">
                    </td>
                </tr>

                <tr>
                    <td style="font-weight: bold">Result: </td>
                    <td>
                        <input type="text" name="result" id="result" value="<%=res%>" readonly>
                    </td>   
                </tr>
                <tr>
                    <td colspan="2" style="font-weight: bold; font-style: italic">
                        <input type="radio" value="max" name="operation"> Find MAX
                        <input type="radio" value="min" name="operation"> Find MIN
                    </td>
                </tr>

                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" id="find" value="Find">
                        <input type="button" id="delete" value="Delete" onclick="clearInput()"><br>
                    </td>
                </tr>
            </table>
        </form>

        <script>
            function clearInput() {
                document.getElementById("a").value = "";

                document.getElementById("b").value = "";

                document.getElementById("c").value = "";

                document.getElementById("result").value = "";
            }
        </script>
    </body>
</html>
