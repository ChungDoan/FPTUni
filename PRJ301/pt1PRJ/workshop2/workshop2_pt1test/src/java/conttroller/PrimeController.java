/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package conttroller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name="PrimeController", urlPatterns={"/prime"})
public class PrimeController extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PrimeController</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PrimeController at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String n_raw = request.getParameter("n");
        String result = "";
        String err = "";
        try {
            int n = Integer.parseInt(n_raw);
            for (int i = 2; i < 10; i++) {
                if( n % i == 0 && isPrime(i)) {
                    result += i +"\n";
                }
            }
            
        } catch (NumberFormatException e) {
            err = "Must input integer number > 0!";
        }
        request.setAttribute("n", n_raw);
        request.setAttribute("err", err);
        request.setAttribute("result", result);
        request.getRequestDispatcher("prime.jsp").forward(request, response);
    } 
    
    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String n_raw = request.getParameter("n");
        String err = "";
        String result = "";
        try {
            int n = Integer.parseInt(n_raw);
            if(n < 2) {
                err = "n must >  2";
            }
            else {
                result = getResult(n);
            }
        } catch (NumberFormatException e) {
            err = "Wrong format!";
        }
        request.setAttribute("err", err);
        request.setAttribute("result", result);
    }

    
    public String getResult(int n) {
        int count = 0;
        String result = "";
        for (int i = n; i < Integer.MAX_VALUE; i++) {
            if(isPrime(n) && count < n) {
                count++;
                result += i;
            }
        }
        return result;
    }
    
    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
