
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
public class Servlet2 extends HttpServlet{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String reset = request.getParameter("reset");
        if (reset != null) {
            response.sendRedirect("index2.jsp");
            return;
        }
        String n_raw = request.getParameter("n");
        String err = "";
        String result = "";
        try {
            int n = Integer.parseInt(n_raw);
            if (n < 2) {
                err = "n must >  2";
            } else {
                result = getResult(n);
                System.out.println(result);
            }
        } catch (NumberFormatException e) {
            err = "Wrong format!";
        }
        request.setAttribute("err", err);
        request.setAttribute("result", result);
        request.getRequestDispatcher("index2.jsp").forward(request, response);
    }

    public String getResult(int n) {
        int count = 0;
        String result = "";
        for (int i = n; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i) && count < n) {
                count++;
                result += i + " ";
            } else if (count == n) {
                break;
            }
        }
        return result;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    }
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
