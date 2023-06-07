
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
 * @author hoang
 */
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        try {
            if (req.getParameter("a") == null || req.getParameter("a").isEmpty() ||
                    req.getParameter("b") == null || req.getParameter("b").isEmpty() ||
                    req.getParameter("c") == null || req.getParameter("c").isEmpty()) {
                out.print("Input must not empty!");
            } else {
                double a = Double.parseDouble(req.getParameter("a"));
                double b = Double.parseDouble(req.getParameter("b"));
                double c = Double.parseDouble(req.getParameter("c"));

                String operation = req.getParameter("operation");
                switch (operation) {
                    case "max": {
                        double res = a;
                        if (res < b)
                            res = b;
                        if (res < c)
                            res = c;

                        out.print(res);
                        break;
                    }
                    case "min": {
                        double res = a;
                        if (res > b)
                            res = b;
                        if (res > c)
                            res = c;

                        out.print(res);
                        break;
                    }
                    default:
                        out.print("Choose a operation!");
                        break;
                }
            }
        } catch (NumberFormatException e) {
            out.print("Input must be a number.");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        try {
            if (req.getParameter("a") == null || req.getParameter("a").isEmpty() ||
                    req.getParameter("b") == null || req.getParameter("b").isEmpty() ||
                    req.getParameter("c") == null || req.getParameter("c").isEmpty()) {
                out.print("Input must not empty!");
            } else {
                double a = Double.parseDouble(req.getParameter("a"));
                double b = Double.parseDouble(req.getParameter("b"));
                double c = Double.parseDouble(req.getParameter("c"));
                double res = 0;

                String operation = req.getParameter("operation");
                switch (operation) {
                    case "max": {
                        res = a;
                        if (res < b)
                            res = b;
                        if (res < c)
                            res = c;

                        break;
                    }
                    case "min": {
                        res = a;
                        if (res > b)
                            res = b;
                        if (res > c)
                            res = c;

                        break;
                    }
                    default:
                        out.print("Choose a operation!");
                        break;
                }
                req.setAttribute("res", res);
                req.setAttribute("a", a);
                req.setAttribute("b", b);
                req.setAttribute("c", c);
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            }
        } catch (NumberFormatException e) {
            out.print("Input must be a number.");
        }

    }

}
