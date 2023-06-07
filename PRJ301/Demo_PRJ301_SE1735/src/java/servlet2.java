
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
 *
 * @author chungDoan
 */
public class servlet2 extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            //nhan thong tin tu client
            int a, b;
            if(req.getParameter("a") == null || req.getParameter("a").isEmpty()){
                a = Integer.parseInt(getInitParameter("a"));
            }else {
                a = Integer.parseInt(req.getParameter("a"));
            } 
            
            if (req.getParameter("b") == null || req.getParameter("b").isEmpty()) {
                b = Integer.parseInt(getInitParameter("b"));
            }else {
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
            
            if(req.getParameter("op").equals("0")){
                out.print("\nChua chon phep tinh");
            } 
            if (req.getParameter("op").equals("1")) {
                out.print("\nUCLN: " + ucln(a,b));
            }
            if (req.getParameter("op").equals("2")) {
                out.print("\nBCNN: " + bcnn(a,b));
            }
        }

        
    }
    
    public int ucln(int a, int b) {
        while(a != b){
            if(a > b){
                a = a - b;
            }else {
                b = b - a;
                
            }
            
        }
        return a;
    }
    
    public int bcnn(int a, int b){
        return a * b / (ucln(a, b));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            //nhan thong tin tu client
            int a, b;
            if (req.getParameter("a") == null || req.getParameter("a").isEmpty()) {
                a = Integer.parseInt(getInitParameter("a"));
            } else {
                a = Integer.parseInt(req.getParameter("a"));
            }

            if (req.getParameter("b") == null || req.getParameter("b").isEmpty()) {
                b = Integer.parseInt(getInitParameter("b"));
            } else {
                b = Integer.parseInt(req.getParameter("b"));
            }

            //xu ly data
            boolean btn = false;
            String c = "";
            if (req.getParameter("cong") != null) {
                c = String.valueOf(a + b);
//                out.print("a + b = " + c);
                btn = true;
            }
            if (req.getParameter("tru") != null) {
                c = String.valueOf(a - b);
//                out.print("a - b = " + c);
                btn = true;
            }
            if (req.getParameter("nhan") != null) {
                c = String.valueOf(a * b);
//                out.print("a * b = " + c);
                btn = true;
            }
            if (req.getParameter("chia") != null) {
                c = String.valueOf(a / b);
//                out.print("a chia b = " + c);
                btn = true;
            }

            if (req.getParameter("op").equals("0") && !btn) {
//                out.print("\nChua chon phep tinh");
            }
            if (req.getParameter("op").equals("1") && !btn) {
//                out.print("\nUCLN: " + ucln1(a, b));
                c = String.valueOf( ucln(a, b));
            }
            if (req.getParameter("op").equals("2") && !btn) {
//                out.print("\nBCNN: " + bcnn2(a, b));
                c = String.valueOf(bcnn(a, b));
            }
            
            // tra kq ve client
            
            req.setAttribute("a", String.valueOf(a));
            req.setAttribute("b", String.valueOf(b));
            
            req.setAttribute("c", c);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
}
