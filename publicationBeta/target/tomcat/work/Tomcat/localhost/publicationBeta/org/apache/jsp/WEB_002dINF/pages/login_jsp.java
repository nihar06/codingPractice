/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-22 15:54:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/pages/../../includes/Footer.html", Long.valueOf(1511205900794L));
    _jspx_dependants.put("/WEB-INF/pages/../../includes/header.html", Long.valueOf(1513265399069L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<body class=\"\">\r\n");
      out.write("\t");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Catalyst</title>\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/bootstrap.css\"\r\n");
      out.write("\trel=\"stylesheet\" type='text/css' media='all'>\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/simple-line-icons.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/landing-page.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/component.css\" />\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/KbaceStyles.css\"\r\n");
      out.write("\trel=\"stylesheet\" type='text/css' media='all'>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/favicon.ico\"\r\n");
      out.write("\ttype=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/dist/js/tether.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/jquery/jquery.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/popper/popper.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/bootstrap.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/modernizr.custom.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/KBACE-js.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"d-flex justify-content-between bg-banner\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"#\"> <img\r\n");
      out.write("\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/catalyst.gif\"\r\n");
      out.write("\t\t\tclass=\"d-inline-block align-top img-fluid\" alt=\"\">\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"\" style=\"margin-top: 1%;\">\r\n");
      out.write("\t\t<a class=\"navbar-brand \" href=\"#\"> <img\r\n");
      out.write("\t\t\tstyle=\"float: right; width: 40%;\"\r\n");
      out.write("\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/banner_image2.png\"\r\n");
      out.write("\t\t\tclass=\"d-inline-block align-top img-fluid\" alt=\"\">\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid KBACE-background KBACE-container\"\r\n");
      out.write("\t\tstyle=\"padding-bottom: 20px; padding-top: 10px; min-height: calc(100vh - 170px);\">\r\n");
      out.write("\t\t<div class=\"row justify-content-end\"\r\n");
      out.write("\t\t\tstyle=\"padding-right: 5px; padding-left: 5px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<form style=\"margin-bottom: 5px;\"\r\n");
      out.write("\t\t\t\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/j_spring_security_check\"\r\n");
      out.write("\t\t\t\t\tmethod='POST'>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"username\" id=\"username\" class=\"\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Username\" style=\"line-height: 1\"> <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"password\" style=\"line-height: 1\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\tid=\"password\" class=\"\" placeholder=\"Password\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"margin-bottom: 5px;\"> <input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn KBACE-btn-info btn-lg\" value=\"Login\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-1\">&nbsp;</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t<h3 class=\"font-white\">Welcome to Catalyst</h3>\r\n");
      out.write("\t\t\t\t<p class=\"font-white\">\r\n");
      out.write("\t\t\t\t\tCatalyst is a proprietary service offered by KBACE offering\r\n");
      out.write("\t\t\t\t\ttraining, education and change management solutions. The Catalyst\r\n");
      out.write("\t\t\t\t\tsystem is extremely easy to navigate and is accessible from any\r\n");
      out.write("\t\t\t\t\tdevice at work or at home, and allows immediate exposure and\r\n");
      out.write("\t\t\t\t\tfamiliarity with Oracle Cloud Applications <br> <br> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"font-KBACE-Green\">Transactional Training</span> - Access\r\n");
      out.write("\t\t\t\t\tstep-by-step instructions on performing specific actions in Oracle\r\n");
      out.write("\t\t\t\t\tCloud Applications\r\n");
      out.write("\t\t\t\t<hr class=\"KBACE-footer-hr\">\r\n");
      out.write("\t\t\t\t<span class=\"font-KBACE-Green\">Questions?</span><br>\r\n");
      out.write("\t\t\t\t<p class=\"font-white\">\r\n");
      out.write("\t\t\t\t\tEmail us at <span><a class=\"font-KBACE-Green\"\r\n");
      out.write("\t\t\t\t\t\thref=\"mailto:catalyst@kbace.com\">catalyst@kbace.com</a></span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-5  justify-content-center\"\r\n");
      out.write("\t\t\t\tstyle=\"display: inline-flex;\">\r\n");
      out.write("\t\t\t\t<div class=\"embed-responsive embed-responsive-70\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 60%;\">\r\n");
      out.write("\t\t\t\t\t<video class=\"embed-responsive-item\" controls\r\n");
      out.write("\t\t\t\t\t\tposter=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/Slide5.png\">\r\n");
      out.write("\t\t\t\t\t\t<source\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://transformation.kbace.com/training/Publishing%20Content/PlayerPackage/data/tpc/33cbda81-d7dc-4cdd-8108-7f80f14a0f68/Parts/KBACE_Methodology_Catalyst_Short.mp4\"\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"video/mp4\">\r\n");
      out.write("\t\t\t\t\t</video>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-1\">&nbsp;</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<footer id=\"KBACE-footer\"\r\n");
      out.write("\t\tclass=\"bg-footer container-fluid KBACE-footer-container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\" \">\r\n");
      out.write("\t\t\t<!-- \r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<p class=\"footer-p\">FEATURED OFFERING\r\n");
      out.write("\t\t\t\t\t<ul class=\"footer-ul\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Oracle Cloud Cloud</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Subscription Services</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Payroll and Time</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Compensation and Benefits</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Financials</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<p class=\"footer-p\">SUPPORT SERVICES\r\n");
      out.write("\t\t\t\t\t<ul class=\"footer-ul\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Cloud Subscription Services</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Managed Support</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">DBA Services</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Managed Hosting</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Customer Support</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<p class=\"footer-p\">LEARNING\r\n");
      out.write("\t\t\t\t\t<ul class=\"footer-ul\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Training</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Education</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<p class=\"footer-p\">ANALYTICS\r\n");
      out.write("\t\t\t\t\t<ul class=\"footer-ul\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">KBX</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">KBI</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">OBIEE</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<p class=\"footer-p\">POPULAR LINKS\r\n");
      out.write("\t\t\t\t\t<ul class=\"footer-ul\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Careers</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Mentor</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Oracle Cloud</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Cloud Subscription Services</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<p class=\"footer-p\">RELATED ORACLE SITES\r\n");
      out.write("\t\t\t\t\t<ul class=\"footer-ul\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Oracle UPK Product Page</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Oracle HCM Cloud</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Oracle ERP Cloud</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Oracle Taleo Cloud</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t -->\r\n");
      out.write("\t\t\t<div class=\"row\" style=\"margin-left: 0px;\">\r\n");
      out.write("\t\t\t\t<p class=\"font-white\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"font-KBACE-Green\">Catalyst </a>| <a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"font-KBACE-Green\">Contact Us</a> | <a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"font-KBACE-Green\">Safe Harbor Privacy</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\" style=\"margin-left: 0px;\">\r\n");
      out.write("\t\t\t\t<p style=\"color: white;\">© KBACE, A Cognizant Company</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- \t<hr class=\"KBACE-footer-hr\"> \r\n");
      out.write("\t\t<div class=\"row justify-content-center\">\r\n");
      out.write("\t\t\t<!-- <p align=\"center\" style=\"color: white;\">Unauthorized use of this\r\n");
      out.write("\t\t\t\tapplication is prohibited and may be subject to civil and criminal\r\n");
      out.write("\t\t\t\tprosecution.\r\n");
      out.write("\t\t</div> -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/pages/login.jsp(26,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.error == 'true'}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<div style=\"color: red; margin: 10px 0px;\">Login Invalid.\r\n");
        out.write("\t\t\t\t\t\tPlease verify your Username and Password.</div>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}