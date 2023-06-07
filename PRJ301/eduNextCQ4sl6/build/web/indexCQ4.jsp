<%-- 
    Document   : indexCQ4
    Created on : May 26, 2023, 9:45:27 AM
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
//            nhan thong tin tu servlet
            String nhanA = "";
            String ketQua = "";
            String nhanB = "";
            String nhanC = "";
            if(request.getAttribute("a") != null ){
                nhanA = (String)request.getAttribute("a");
            }
            if(request.getAttribute("b") != null ){
                nhanB = (String)request.getAttribute("b");
            }
            if(request.getAttribute("c") != null ){
                nhanC = (String)request.getAttribute("c");
            }
            
            if(request.getAttribute("answer") != null ){
                ketQua = (String)request.getAttribute("answer");
            }
            
        %>
        <form action="slot64" method="get" id="frm">
            <table>
                <thead>
                <th colspan="2">TÌM MAX VÀ TÌM MIN</th>
                </thead>
                <tbody>
                    <tr>
                        <td>Nhap a:</td>
                        <td><input type="number" id="t1" name="a" value="<%=nhanA%>"></td>
                    </tr>

                    <tr>
                        <td>Nhap b:</td>
                        <td><input type="number" id="t2" name="b" value="<%=nhanB%>"></td>
                    </tr>

                    <tr>
                        <td>Nhap c:</td>
                        <td><input type="number" id="t3" name="c" value="<%=nhanC%>"></td>
                    </tr>

                    <tr>
                        <td>Ket qua:</td>
                        <td><input type="text" id="t4" name="answer" value="<%=ketQua%>"></td>

                        <td></td>
                    </tr>

                    <tr>
                        <!--<td><input type="radio"  id="check1" name="option">Tìm so lon nhat</td>
                             <td><input type="radio" id="check2" name="option">Tìm so nho nhat</td>-->
                        <td><input type="radio" name="option" value="max" checked="checked" /> Tim so lon nhat</td>
                        <td><input type="radio" name="option" value="min" /> Tim so be nhat</td> 
                
                    </tr>

                    <tr>
                        <td><input type="submit" /></td>
<!--                        <td><button onchange ="find()">Tìm</button></td>
-->                    <td><button onclick="del()" >Reset</button></td>
                        
                    </tr>
                </tbody>
            </table>
        </form>
        <script>
            function del() {
                document.getElementById("t1").value="0";
                document.getElementById("t2").value="0";
                document.getElementById("t3").value="0";
                document.getElementById("t4").value="";
            }
        </script>       

    </body>
</html>
