package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mybean.data.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \r\n");
      out.write("       ");
      mybean.data.Login loginBean = null;
      synchronized (session) {
        loginBean = (mybean.data.Login) _jspx_page_context.getAttribute("loginBean", PageContext.SESSION_SCOPE);
        if (loginBean == null){
          loginBean = new mybean.data.Login();
          _jspx_page_context.setAttribute("loginBean", loginBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<title>火车订票系统</title>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\tbody{\r\n");
      out.write("\t\tmargin: 0;\r\n");
      out.write("\t\tpadding: 0;\r\n");
      out.write("\t}\r\n");
      out.write("\t\t#title{\r\n");
      out.write("\t\t\tcolor:#66ccff;\r\n");
      out.write("\t\t\tfont-size: 35px;\r\n");
      out.write("\t\t\tfont-weight: 900;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#example td:hover{\r\n");
      out.write("\t\tborder:5px red solid;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"width: 1370px;height: 80px; margin-left: 130px;\">\r\n");
      out.write("\t\t<img src=\"img/logo.png\" style=\"width:200px; height:80px;\">\r\n");
      out.write("\t\t<lable style=\"margin-left:900px;font-size: 24px;position:absolute;margin-top:30px;\">当前登录用户为:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((mybean.data.Login)_jspx_page_context.findAttribute("loginBean")).getLogname())));
      out.write("</lable>\r\n");
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
      out.write("\t<img src=\"img/gaotie.jpg\" style=\"width: 1520px;height: 550px; z-index: 0;position: absolute;border-radius:5px;\">\r\n");
      out.write("\t<div style=\"margin: 50px; width: 400px; height: 350px; background-color: #ede3e7; z-index: 1;position: relative;margin-left:150px;\">\r\n");
      out.write("\t\t<form action=\"chaxun\" method=\"post\" style=\"margin: 20px;padding: 10px; border:5px;\">\r\n");
      out.write("\t\t\t<label style=\"font-size: 24px; margin-top: 20px;\">车票查询</label>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t<label style=\"font-size: 15px;\">出发地&nbsp;&nbsp;&nbsp;&nbsp;</label>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"chufa\"style=\"width: 180px;height: 23px;border-radius: 3px; border:none;\"placeholder=\"汉字\">\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t<label style=\"font-size: 15px;\">到达地&nbsp;&nbsp;&nbsp;&nbsp;</label>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"daoda\"style=\"width: 180px;height: 23px;border-radius: 3px; border:none;\"\r\n");
      out.write("\t\t\tplaceholder=\"汉字\">\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t<label style=\"font-size: 15px;\">查询日期&nbsp;</label>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"time\" style=\"width: 180px;height: 23px;border-radius: 3px; border:none;\"placeholder=\"日期\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<br><br><br><br>\r\n");
      out.write("\t\t\t<input type=\"submit\" name=\"submit\" value=\"查询\" style=\"width: 250px;height: 30px;background-color: #fa7e23;border-radius: 8px; color: white; border:none;\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width:1520px;height: 300px;text-align: center;margin-top: 150px; background-color:#f8ebe6;\">\r\n");
      out.write("\t\t<label style=\"font-size:40px; text-shadow: 0 0 5px black;color:white\">热销路线</label>\r\n");
      out.write("\t\t<table id=\"example\" style=\"width:1520px;height:300px;\" >\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><img src=\"img/beijing.jpg\" style=\"width:500px;height:300px;\"></td>\r\n");
      out.write("\t\t\t\t<td><img src=\"img/shuilifang.jpg\" style=\"width:500px;height:300px;\"></td>\r\n");
      out.write("\t\t\t\t<td><img src=\"img/xihu.jpg\" style=\"width:500px;height:300px;\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr style=\"\">\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><img src=\"img/aomen.jpg\" style=\"width:1010px;height:300px;\"></td>\r\n");
      out.write("\t\t\t\t<td><img src=\"img/shanghai.jpg\" style=\"width:500px;height:300px;\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
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
