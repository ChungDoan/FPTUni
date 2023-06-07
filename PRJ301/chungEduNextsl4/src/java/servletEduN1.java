
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
public class servletEduN1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            out.print("<form id='frm' action = 'demoEdu1' method = 'get'>");
            out.print("IDStudent: <input type = 'text' name = 'id'> <br>");
            out.print("FullName:  <input type = 'text' name = 'name'> <br>");
            out.print("Gender:     \n"
                    + "            <select name ='gender'>\n"
                    + "                <option name='male'>Male</option>\n"
                    + "                <option name='female'>Female</option>\n"
                    + "            </select>\n"
                    + "            <br>");
            out.print("<input type='submit' name ='ok'>");
            
            String name = req.getParameter("name");
            String id = req.getParameter("id");
            String gender = req.getParameter("gender");
//            String nam = req.getParameter("male");
//            String nu = req.getParameter("Female");
            if (!name.isEmpty() || !id.isEmpty() || !gender.isEmpty()) {
//                if (req.getParameter("male").equals("Male")) {
//                    out.print("\nName:" + name + "\nID: " + id + "\nGender: " + "Male");
//                } else if (req.getParameter("female").equals("Female")) {
//                    out.print("\nName:" + name + "\nID: " + id + "\nGender: " + "Female");
                out.print("<br>"+name + id + gender);
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
