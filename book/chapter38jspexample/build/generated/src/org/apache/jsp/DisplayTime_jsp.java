package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import chapter43.TimeBean;

public final class DisplayTime_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=GB18030");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!-- DisplayTime.jsp -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      chapter43.TimeBean timeBeanId = null;
      synchronized (application) {
        timeBeanId = (chapter43.TimeBean) _jspx_page_context.getAttribute("timeBeanId", PageContext.APPLICATION_SCOPE);
        if (timeBeanId == null){
          timeBeanId = new chapter43.TimeBean();
          _jspx_page_context.setAttribute("timeBeanId", timeBeanId, PageContext.APPLICATION_SCOPE);
          out.write('\r');
          out.write('\n');
        }
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("timeBeanId"), request);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>\r\n");
      out.write("      Display Time\r\n");
      out.write("    </title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  <h3>Choose locale and time zone</h3>\r\n");
      out.write("    Current time is \r\n");
      out.write("      ");
      out.print( timeBeanId.currentTimeString(timeBeanId.getLocaleIndex(), 
        timeBeanId.getTimeZoneIndex()) );
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("<html>\r\n");
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
