<%-- 
    Document   : index.jsp
    Created on : May 26, 2023, 8:27:35 AM
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
        <!-- nhan thong tin tra ve tu svl -->
        <%
           String nhan = "" ;
           if(request.getAttribute("c") != null){
            nhan = (String)request.getAttribute("c");
            }
                       String nhanVeA = "" ;
           if(request.getAttribute("a") != null){
            nhanVeA = (String)request.getAttribute("a");
            }
                       String nhanVeB = "" ;
           if(request.getAttribute("b") != null){
            nhanVeB = (String)request.getAttribute("b");
            }
        %>
        
        
        <!--         method ='post'  la goi len doPost()-->
        <form action = 'demo2' method = 'get' id="frm">
            Enter a: <input type = 'text' name = 'a' value="<%= nhanVeA %>"> <br>
            Enter b: <input type = 'text' name = 'b'value="<%= nhanVeB %>"> <br>

            Operator: 
            <select name = "op" onchange="change()">
                <option value = "0">ALL</option>
                <option value = "1">UCLN</option>
                <option value = "2">BCNN</option>
            </select>
            <br>
            <input type = 'submit' name = 'cong' value ='a+b'>
            <input type = 'submit' name = 'tru' value ='a-b' >
            <input type = 'submit' name = 'nhan' value ='a*b' >
            <input type = 'submit' name = 'chia' value ='a/b' >
            <br/> Result: <input type="text" value="<%= nhan%>" readonly >
        </form>

        <script>
            function change() {
                document.getElementById("frm").submit();
            }
        </script>
    </body>
</html>
