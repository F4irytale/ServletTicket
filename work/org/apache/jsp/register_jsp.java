package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/daohang.html");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("       ");
      mybean.data.Register userBean = null;
      synchronized (request) {
        userBean = (mybean.data.Register) _jspx_page_context.getAttribute("userBean", PageContext.REQUEST_SCOPE);
        if (userBean == null){
          userBean = new mybean.data.Register();
          _jspx_page_context.setAttribute("userBean", userBean, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>注册</title>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tmargin: 0;\r\n");
      out.write("\t\tpadding: 0;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"width: 1370px;height: 80px; margin-left: 130px;\">\r\n");
      out.write("\t\t<img src=\"img/logo.png\" style=\"width:200px; height:80px;\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width:1520px;height:40px;background-color:#f9e9cd\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<table cellSpacing=\"1\" cellPadding=\"1\" width=\"660\" align=\"center\" border=\"0\" style=\"\">\r\n");
      out.write("<tr valign=\"bottom\">\r\n");
      out.write("<td ><a href=\"index.jsp\" style=\"text-decoration:none;\"><font size=5>首页&nbsp;&nbsp;&nbsp;&nbsp;</font></a></td>\r\n");
      out.write("<td><a href=\"chaxun\" style=\"text-decoration:none;\"><font size=5>更多路线</font></a></td>\r\n");
      out.write("<td><a href=\"\" style=\"text-decoration:none;\"><font size=5>特色优惠</font></a></td>\r\n");
      out.write("<td><a href=\"login.jsp\" style=\"text-decoration:none;\"><font size=5>登陆注册</font></a></td>\r\n");
      out.write("<td><a href=\"dingdan.jsp\" style=\"text-decoration:none;\"><font size=5>我的订单</font></a></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("<div style=\"height: 850px;background-color:#baccd9;width:1520px;\">\r\n");
      out.write("\t<form action=\"helpRegister\" method=\"post\" name=\"form\" style=\"\">\r\n");
      out.write("\t\t<div style=\"width: 900px;height: 600px; margin-left:290px;padding: 20px; border:5px #681752 solid; background-color:#c3d7df;\">\r\n");
      out.write("\t\t\t<div style=\"height: 30px; margin-bottom: 10px;background-color:pink;\">\r\n");
      out.write("\t\t\t\t账户信息\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"padding-left: 25%; margin-top: 50px;\">\r\n");
      out.write("\t\t\t<label style=\"color: red;\">*</label>用户名：&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"logname\"style=\"width: 280px; height: 25px; border-radius: 3px; border:none;\"><br><br>\r\n");
      out.write("\t\t\t<label style=\"color: red;\">*</label>密码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"password\" name=\"password\"style=\"width: 280px; height: 25px; border-radius: 3px; border:none;\"><br><br>\r\n");
      out.write("\t\t\t<label style=\"color: red;\">*</label>重复密码:&nbsp;&nbsp;<input type=\"password\" name=\"again_password\"style=\"width: 280px; height: 25px; border-radius: 3px; border:none;\"><br><br>\r\n");
      out.write("\t\t\t<label style=\"color: red;\">*</label>手机号:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"telephone\"style=\"width: 280px; height: 25px; border-radius: 3px; border:none;margin-left: 2px;\"><br><br>\r\n");
      out.write("\t\t\t<label style=\"color: red;\">*</label>注册反馈:&nbsp;&nbsp;");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((mybean.data.Register)_jspx_page_context.findAttribute("userBean")).getBackNews())));
      out.write("<br>\r\n");
      out.write("\t\t\t<input type=\"submit\" name=\"\" value=\"注册\" style=\"width: 180px; height: 35px;background-color: #ff0000;border-radius: 3px; border:none; margin-left: 21%;margin-top:50px;color:white;\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"width: 1520px;height: 100px; background-color: #333;\">\r\n");
      out.write("\t<div style=\"color: #ccc; text-align: center;padding-top: 50px;\">\r\n");
      out.write("\t\t<span>版权所有©2019-2020</span><br>\r\n");
      out.write("\t\t<span>ICP备10000000-1号</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
