<%-- 
    Document   : viDuJSP
    Created on : May 26, 2023, 7:52:39 AM
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
        <br/>
        <%
            //Scriptlet- Code java
            String message = "Hello Tun";
            out.print(message+"<br/>");
            //khai bao va khoi tao 2 bien so a va b
            //hien thi tong hieu tich thuong
            int a = 4 ;
            int b = 26;
            
            //nhung html trong java , java trong html :)
            out.print(a+b+"<br/>");
            out.print(a-b+"<br/>");
            out.print(a*b+"<br/>");
            out.print(a/b+"<br/>");
            


            //in ra
            out.print("Prime numbers giua " + a + " va " + b + "la:<br/>");
            for (int i = a; i <= b; i++) {
                if (isPrime(i)) {
                    out.print(i + " ");
                }
            }
        %>
        <%!
            //xay dung ham isPrime(int n) ap dung  ham tren de hien snt tu a den b
            boolean isPrime(int n) {
                if (n <= 1) {
                    return false;
                }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
            }
            %>
        
        <%!
            String message = "Hello nam";
//              khoi tao glocal
        %>
        <!-- de ko nhung html trong java nua -->
        <p>SU dung %= </p>
        <br/> a = <%=a%>
        <br/> b = <%=b%>
        <br/> a+b = <%=a+b%>
        <br/> a-b = <%=a%>
        <br/> a*b = <%=a*b%>
        <br/> a/b = <%=(double)a/b%>
        <br/> a%b = <%=a%b%>
    </body>
</html>
