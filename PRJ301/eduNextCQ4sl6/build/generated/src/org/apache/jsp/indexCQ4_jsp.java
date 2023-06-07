package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexCQ4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

//            nhan thong tin tu servlet
            String nhanA = "";
            String ketQua = "";
            String nhanB = "";
            String nhanC = "";
            if(request.getAttribute("a") != null ){
                nhanA = (String)request.getAttribute("a");
            }
            if(request.getAttribute("b") != null ){
                nhanB = (String)request.getAttribute("b");
            }
            if(request.getAttribute("c") != null ){
                nhanC = (String)request.getAttribute("c");
            }
            
            if(request.getAttribute("answer") != null ){
                ketQua = (String)request.getAttribute("answer");
            }
            
        
      out.write("\n");
      out.write("        <form action=\"slot64\" method=\"get\" id=\"frm\">\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                <th colspan=\"2\">TÌM MAX VÀ TÌM MIN</th>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Nhap a:</td>\n");
      out.write("                        <td><input type=\"number\" id=\"t1\" name=\"a\" value=\"");
      out.print(nhanA);
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Nhap b:</td>\n");
      out.write("                        <td><input type=\"number\" id=\"t2\" name=\"b\" value=\"");
      out.print(nhanB);
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Nhap c:</td>\n");
      out.write("                        <td><input type=\"number\" id=\"t3\" name=\"c\" value=\"");
      out.print(nhanC);
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Ket qua:</td>\n");
      out.write("                        <td><input type=\"text\" id=\"t4\" name=\"answer\" value=\"");
      out.print(ketQua);
      out.write("\"></td>\n");
      out.write("\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <!--<td><input type=\"radio\"  id=\"check1\" name=\"option\">Tìm so lon nhat</td>\n");
      out.write("                             <td><input type=\"radio\" id=\"check2\" name=\"option\">Tìm so nho nhat</td>-->\n");
      out.write("                        <td><input type=\"radio\" name=\"option\" value=\"max\" checked=\"checked\" /> Tim so lon nhat</td>\n");
      out.write("                        <td><input type=\"radio\" name=\"option\" value=\"min\" /> Tim so be nhat</td> \n");
      out.write("                \n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" /></td>\n");
      out.write("<!--                        <td><button onchange =\"find()\">Tìm</button></td>\n");
      out.write("-->                    <td><button onclick=\"del()\" >Reset</button></td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("            function del() {\n");
      out.write("                document.getElementById(\"t1\").value=\"0\";\n");
      out.write("                document.getElementById(\"t2\").value=\"0\";\n");
      out.write("                document.getElementById(\"t3\").value=\"0\";\n");
      out.write("                document.getElementById(\"t4\").value=\"\";\n");
      out.write("            }\n");
      out.write("        </script>       \n");
      out.write("\n");
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
