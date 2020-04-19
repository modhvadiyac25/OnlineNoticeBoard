package org.apache.jsp.template.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Login</title>\n");
      out.write("\n");
      out.write("\t<style type=\"text/css\">@import url(https://fonts.googleapis.com/css?family=Roboto:300);\n");
      out.write("\n");
      out.write(".login-page {\n");
      out.write("  width: 360px;\n");
      out.write("  padding: 8% 0 0;\n");
      out.write("  margin: auto;\n");
      out.write("}\n");
      out.write(".form {\n");
      out.write("  position: relative;\n");
      out.write("  z-index: 1;\n");
      out.write("  background: #FFFFFF;\n");
      out.write("  max-width: 360px;\n");
      out.write("  margin: 0 auto 100px;\n");
      out.write("  padding: 45px;\n");
      out.write("  text-align: center;\n");
      out.write("  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);\n");
      out.write("}\n");
      out.write(".form input {\n");
      out.write("  font-family: \"Roboto\", sans-serif;\n");
      out.write("  outline: 0;\n");
      out.write("  background: #f2f2f2;\n");
      out.write("  width: 100%;\n");
      out.write("  border: 0;\n");
      out.write("  margin: 0 0 15px;\n");
      out.write("  padding: 15px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-size: 14px;\n");
      out.write("}\n");
      out.write(".form button {\n");
      out.write("  font-family: \"Roboto\", sans-serif;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  outline: 0;\n");
      out.write("  background: #4CAF50;\n");
      out.write("  width: 100%;\n");
      out.write("  border: 0;\n");
      out.write("  padding: 15px;\n");
      out.write("  color: #FFFFFF;\n");
      out.write("  font-size: 14px;\n");
      out.write("  -webkit-transition: all 0.3 ease;\n");
      out.write("  transition: all 0.3 ease;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write(".form button:hover,.form button:active,.form button:focus {\n");
      out.write("  background: #43A047;\n");
      out.write("}\n");
      out.write(".form .message {\n");
      out.write("  margin: 15px 0 0;\n");
      out.write("  color: #b3b3b3;\n");
      out.write("  font-size: 12px;\n");
      out.write("}\n");
      out.write(".form .message a {\n");
      out.write("  color: #4CAF50;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(".form .register-form {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write(".container {\n");
      out.write("  position: relative;\n");
      out.write("  z-index: 1;\n");
      out.write("  max-width: 300px;\n");
      out.write("  margin: 0 auto;\n");
      out.write("}\n");
      out.write(".container:before, .container:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: block;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write(".container .info {\n");
      out.write("  margin: 50px auto;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".container .info h1 {\n");
      out.write("  margin: 0 0 15px;\n");
      out.write("  padding: 0;\n");
      out.write("  font-size: 36px;\n");
      out.write("  font-weight: 300;\n");
      out.write("  color: #1a1a1a;\n");
      out.write("}\n");
      out.write(".container .info span {\n");
      out.write("  color: #4d4d4d;\n");
      out.write("  font-size: 12px;\n");
      out.write("}\n");
      out.write(".container .info span a {\n");
      out.write("  color: #000000;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(".container .info span .fa {\n");
      out.write("  color: #EF3B3A;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("  background: #76b852; /* fallback for old browsers */\n");
      out.write("  background: -webkit-linear-gradient(right, #76b852, #8DC26F);\n");
      out.write("  background: -moz-linear-gradient(right, #76b852, #8DC26F);\n");
      out.write("  background: -o-linear-gradient(right, #76b852, #8DC26F);\n");
      out.write("  background: linear-gradient(to left, #76b852, #8DC26F);\n");
      out.write("  font-family: \"Roboto\", sans-serif;\n");
      out.write("  -webkit-font-smoothing: antialiased;\n");
      out.write("  -moz-osx-font-smoothing: grayscale;      \n");
      out.write("}</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    ");

    if(session.getAttribute("ERROR_LOGIN") == "true")
    out.println("<script>alert('username or password may incorrect !!')</script>");
    
      out.write("\n");
      out.write("    \n");
      out.write("<div class=\"login-page\">\n");
      out.write("    \n");
      out.write("    <center>\n");
      out.write("          <h1 style=\"width:100%;\">\n");
      out.write("              <b>\n");
      out.write("              Online Notice Board\n");
      out.write("              </b>    \n");
      out.write("          </h1>\n");
      out.write("    </center>\n");
      out.write("    <div class=\"form\">\n");
      out.write("    <form  action=\"http://localhost:8080/OnlineNoticeBoard/student_login\" method=\"post\">\n");
      out.write("      <input type=\"text\" placeholder=\"username\" name=\"username\" id=\"\"/>  \n");
      out.write("      <input type=\"password\" placeholder=\"password\" name=\"password\"/>\n");
      out.write("      <button type=\"sumit\" name=\"login\" id=\"login\" value=\"login\">Login</button>\n");
      out.write("      <p class=\"message\">Already registered? <a href=\"#\">Sign In</a></p>\n");
      out.write("    </form>\n");
      out.write("   \n");
      out.write("<!--\n");
      out.write("    <form class=\"login-form\">\n");
      out.write("      <input type=\"text\" placeholder=\"username\" name=\"\" id=\"\"/>  \n");
      out.write("      <input type=\"password\" placeholder=\"password\" />\n");
      out.write("      <button>login</button>\n");
      out.write("      <p class=\"message\">Not registered? <a href=\"#\">Create an account</a></p>\n");
      out.write("    </form>\n");
      out.write("-->\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascr name=\"firstname\"ipt\">\n");
      out.write("\t$('.message aLastick(fuscript type=\"texname=\"firstname\"t/javascr\n");
      out.write("    script type=\"text/javasname=\"firstname\"cr\n");
      out.write("    script type=\"text/javascrnction(){\n");
      out.write("   $('form').animate({height: \"toggle\", opacity: \"toggle\"}, \"slow\");\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
