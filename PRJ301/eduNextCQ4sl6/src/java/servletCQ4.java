
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
public class servletCQ4 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            //nhan thong tin tu client
            int a, b,c ;
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
            
            if (req.getParameter("c") == null || req.getParameter("b").isEmpty()) {
                c = Integer.parseInt(getInitParameter("c"));
            } else {
                c = Integer.parseInt(req.getParameter("c"));
            }
            
            //xu ly data
            String operation = "";
//            if (req.getParameter("check1") != null) {
//                operation = "max";
//            } else if (req.getParameter("check2") != null) {
//                operation = "min";
//            }
            int result = 0;
            if (operation.equals("max")) {
                result = Math.max(a, Math.max(b, c));
                  
//                out.println(result);
            } else if (operation.equals("min")) {
                result = Math.min(a, Math.min(b, c));
//                out.println(result);
            }
            boolean check = true;
            if(req.getParameter("option").equals("")){
                  check = false;
                  req.setAttribute("answer", "Empty choice" );
            }
             if(req.getParameter("option").equals("max")){
                  result= a>b?(a>c?a:c):(b>c?b:c);
             }
             else if(req.getParameter("option").equals("min")){
                  result= a<b?(a<c?a:c):(b<c?b:c);
             }
             
            //tra ve client
            String button = req.getParameter("option");
//            if(req.getParameter("t4").equals("need")){
//                req.setAttribute("a","");
//            }
            req.setAttribute("a",String.valueOf(a));
            req.setAttribute("b", String.valueOf(b));
            req.setAttribute("c", String.valueOf(c));
            
            
            if(check == true) req.setAttribute("answer", String.valueOf(result) );
   
            req.getRequestDispatcher("indexCQ4.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setAttribute("a", "");
    req.getRequestDispatcher("indexCQ4.jsp").forward(req, resp);
    }
    
}
