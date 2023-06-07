
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
public class servlet1 extends HttpServlet{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
            response.sendRedirect("nhap1doc1.jsp");
            return;
        }
        
        String result = "";
        String error = "";
        String numberFinal = "";
//        try {
//            String numberStr = request.getParameter("number");
//            int number = Integer.parseInt(numberStr);
//            numberFinal = String.valueOf(number);
//
//            if (number <= 3) {
//                numberFinal = "";
//                throw new Exception();
//            }
//            if (numberStr.isEmpty()) {
//                result = "Enter an integer n";
//            }
//        } catch (NumberFormatException num) {
//            error = "Invalid Number.";
//            result = "";
//        } catch (Exception ex) {
//            error = "Input n must be greater than 3.";
//            result = "";
//        }

        try {
            String numberStr = request.getParameter("number");

            if (numberStr == null || numberStr.isEmpty()) {
                throw new IllegalArgumentException("input empty!");
            }

            int number = Integer.parseInt(numberStr);
            numberFinal = String.valueOf(number);
            if (number < 2) {
                numberFinal = "";
                throw new Exception();
            }
            for (int i = 2; i <= 10; i++) {
                if (number % i == 0 && isPrime(i)) {
                    result += i + " ";
                }
            }

        } catch (NumberFormatException num) {
            error = "Invalid Number.";
            result = "";
        } catch (IllegalArgumentException ex) {
            error = ex.getMessage();
            result = "";
        } catch (Exception ex) {
            error = "Input n must be greater than 2.";
            result = "";
        }

        request.setAttribute("error", error);
        request.setAttribute("result", result);
        request.setAttribute("numberFinal", numberFinal);
        request.getRequestDispatcher("nhap1doc1.jsp").forward(request, response);

        
    }
    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
