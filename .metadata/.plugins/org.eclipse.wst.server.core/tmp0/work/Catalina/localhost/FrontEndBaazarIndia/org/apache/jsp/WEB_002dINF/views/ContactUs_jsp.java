/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2019-02-12 20:22:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContactUs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/E:/Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FrontEndBaazarIndia/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1546417435312L));
    _jspx_dependants.put("/WEB-INF/views/Header.jsp", Long.valueOf(1549981407865L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html\">\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageinfo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("Baazar India</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">BAAZAR INDIA</a>\r\n");
      out.write("      \r\n");
      out.write(" </div>\r\n");
      out.write("  \r\n");
      out.write("    <ul class=\"nav navbar-nav\"> \r\n");
      out.write("      <li><a href=\"home\">HOME</a></li>\r\n");
      out.write("      <li><a href=\"login\">LOGIN</a></li>\r\n");
      out.write("      <li><a href=\"register\">REGISTER</a></li>\r\n");
      out.write("      <li><a href=\"contactus\">CONTACTUS</a></li>\r\n");
      out.write("      <li><a href=\"aboutus\">ABOUTUS</a></li>\r\n");
      out.write("      <li><a href=\"category\">MANAGE CATEGORY</a></li>\r\n");
      out.write("      <li><a href=\"product\">MANAGE PRODUCT</a></li>\r\n");
      out.write("      \r\n");
      out.write("     </ul>\r\n");
      out.write("     \r\n");
      out.write("     </div>\r\n");
      out.write("     \r\n");
      out.write("     </nav>\r\n");
      out.write("     <img src=\"E:\\Project\\image\\bootstrap_image.jpg\" width=\"1200\" height=\"300\">\r\n");
      out.write("     </body>\r\n");
      out.write("     </html>\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("  <html>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container contact\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t<div class=\"contact-info\">\r\n");
      out.write("\t\t\t\t<img src=\"https://image.ibb.co/kUASdV/contact-image.png\" alt=\"image\"/>\r\n");
      out.write("\t\t\t\t<h2>Contact Us</h2>\r\n");
      out.write("\t\t\t\t<h4>We would love to hear from you !</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-9\">\r\n");
      out.write("\t\t\t<div class=\"contact-form\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t  <label class=\"control-label col-sm-2\" for=\"fname\">First Name:</label>\r\n");
      out.write("\t\t\t\t  <div class=\"col-sm-10\">          \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"fname\" placeholder=\"Enter First Name\" name=\"fname\">\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t  <label class=\"control-label col-sm-2\" for=\"lname\">Last Name:</label>\r\n");
      out.write("\t\t\t\t  <div class=\"col-sm-10\">          \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"lname\" placeholder=\"Enter Last Name\" name=\"lname\">\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t  <label class=\"control-label col-sm-2\" for=\"email\">Email:</label>\r\n");
      out.write("\t\t\t\t  <div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"email\">\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t  <label class=\"control-label col-sm-2\" for=\"comment\">Comment:</label>\r\n");
      out.write("\t\t\t\t  <div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t<textarea class=\"form-control\" rows=\"5\" id=\"comment\"></textarea>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">        \r\n");
      out.write("\t\t\t\t  <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
