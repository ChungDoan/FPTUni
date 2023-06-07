
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *class se chua cac xu ly cua servlet
 * @author chungDoan
 */
public class servlet1 extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            //nhan thong tin tu client
//            int a = Integer.parseInt(req.getParameter("a"));
//            int b = Integer.parseInt(req.getParameter("b"));
            //chung minh cai nay chi chay cho svl 2 thoi
            int a, b;
            if (req.getParameter("a") == null || req.getParameter("a").isEmpty()) {
                a = Integer.parseInt(getServletContext().getInitParameter("a"));
            } else {
                a = Integer.parseInt(req.getParameter("a"));
            }

            if (req.getParameter("b") == null || req.getParameter("b").isEmpty()) {
                b = Integer.parseInt(getServletContext().getInitParameter("b"));
            } else {
                b = Integer.parseInt(req.getParameter("b"));
            }

            //xu ly data
            int c, d, e, f;
            if (req.getParameter("cong") != null) {
                c = a + b;
                out.print("a + b = " + c);
            }
            if (req.getParameter("tru") != null) {
                d = a - b;
                out.print("a + b = " + d);
            }
            if (req.getParameter("nhan") != null) {
                e = a * b;
                out.print("a + b = " + e);
            }
            if (req.getParameter("chia") != null) {
                f = a / b;
                out.print("a + b = " + f);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //khuon neu muon hien thi j trong srvlet
        //nho clean and build --> run
        resp.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = resp.getWriter()){
            out.print("<b>hello word</b>");
            out.print("<form action = 'demo1' method = 'post'>"); // method ='post' --> la goi len doPost()
            out.print("Enter a: <input type = 'text' name = 'a'> <br>");
            out.print("Enter b: <input type = 'text' name = 'b'> <br>");

            
            out.print("<input type = 'submit' name = 'cong' value ='a+b'> ");
            out.print("<input type = 'submit' name = 'tru' value ='a-b' >");
            out.print("<input type = 'submit' name = 'nhan' value ='a*b' >");
            out.print("<input type = 'submit' name = 'chia' value ='a/b' >");
            out.print("</form>");
            
            //nhan thong tin tu client
            int a = Integer.parseInt(req.getParameter("a"));
           int b = Integer.parseInt(req.getParameter("b"));
            

            //xu ly data
            int c,d,e,f;
            if(req.getParameter("cong") != null ){
                c = a + b;
                out.print("a + b = " + c);
            }
            if (req.getParameter("tru") != null) {
                d = a - b;
                out.print("a + b = " + d);
            }
            if (req.getParameter("nhan") != null) {
                e = a * b;
                out.print("a + b = " + e);
            }
            if (req.getParameter("chia") != null) {
                f = a / b;
                out.print("a + b = " + f);
            }
            //tra ket qua ve cho client
            
        }
    }
    
}
