package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            table.main {\n");
      out.write("                width:100%;\n");
      out.write("                height:600px;\n");
      out.write("                border:1px solid black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table.main #logo{\n");
      out.write("                background:Blue;\n");
      out.write("                width:15%;\n");
      out.write("                height:15%;\n");
      out.write("            }\n");
      out.write("            table.main #banner{\n");
      out.write("                width:85%;\n");
      out.write("                height:15%;\n");
      out.write("            }\n");
      out.write("            table.main #menu1{\n");
      out.write("                background:Red;\n");
      out.write("                width:15%;\n");
      out.write("                height:70%;\n");
      out.write("                font-size:22;\n");
      out.write("                text-align:top;\n");
      out.write("            }\n");
      out.write("            table.main #content1{\n");
      out.write("                background:yellow;\n");
      out.write("                width:85%;\n");
      out.write("                height:70%;\n");
      out.write("            }\n");
      out.write("            table.main #footer1{\n");
      out.write("                background:green;\n");
      out.write("                width:100%;\n");
      out.write("                height:15%;\n");
      out.write("                font-size:25;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table class='main'>\n");
      out.write("            <tr>\n");
      out.write("                <td id='logo'><img src='images/logo.jpg' width='150px'></td>\n");
      out.write("                <td id='banner' background='images/banner2.jpg'></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td id='menu1'>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Exercise 1</li>\n");
      out.write("                        <li>Exercise 2</li>\n");
      out.write("                        <li>Exercise 3</li>\n");
      out.write("                        <li>Exercise 4</li>\n");
      out.write("                        <li>Exercise 5</li>\n");
      out.write("                    </ul>\n");
      out.write("                </td>\n");
      out.write("                <td id='content1'>\n");
      out.write("                    <form action=\"login\" method=\"POST\" style=\"margin:auto\">\n");
      out.write("                        Account: <input type=\"text\" name=\"account\">\n");
      out.write("                        <br/>\n");
      out.write("                        Password: <input type=\"text\" name=\"password\">\n");
      out.write("                        <br/>\n");
      out.write("                        <input type=\"submit\" value=\"login\" name=\"login\">\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr id='footer1'>\n");
      out.write("                <td colspan='2' align='center'>@Copyright by Your fullname</td>\t\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
