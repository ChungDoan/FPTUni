
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
public class servlet1_b1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            // Get the values submitted from the HTML form
            int a = Integer.parseInt(req.getParameter("t1"));
            int b = Integer.parseInt(req.getParameter("t2"));
            int c = Integer.parseInt(req.getParameter("t3"));
            
            //xu ly data
            String operation = "";
            if (req.getParameter("check1") != null) {
                operation = "max";
            } else if (req.getParameter("check2") != null) {
                operation = "min";
            }

            int result = 0;
            if (operation.equals("max")) {
                result = Math.max(a, Math.max(b, c));
                out.println(result);
            } else if (operation.equals("min")) {
                result = Math.min(a, Math.min(b, c));
                out.println(result);
            }
        }
    }
}
