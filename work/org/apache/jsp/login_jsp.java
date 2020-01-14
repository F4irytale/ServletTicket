package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mybean.data.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      out.write("    \r\n");
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
      out.write("<title>登陆</title>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\tbody{\r\n");
      out.write("\t\t\tmargin: 0;\r\n");
      out.write("\t\t\tpadding: 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"width: 1370px;height: 80px; margin-left: 130px;\">\r\n");
      out.write("\t\t<img src=\"img/logo.png\" style=\"width:200px; height:80px;\">\r\n");
      out.write("\t</div>\r\n");
      out.write("<div style=\"width: 1520px;height: 600px;position: relative; \">\r\n");
      out.write("\t<div style=\"margin-left: 120px;\">\r\n");
      out.write("\t<img src=\"img/pinganchunyun.png\" style=\"width: 600px;height: 300px;position: absolute;margin-top: 40px\"><br>\r\n");
      out.write("\t<img src=\"img/huijiaguonian.png\" style=\"width: 600px;height: 300px;position: absolute;margin-top: 240px;\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<form action=\"loginServlet\" Method=\"post\" style=\"width: 350px;height: 500px;background-color: #66ccff;float: right; margin-right: 150px; margin-top: 40px; text-align: center; border-radius: 2px;\">\r\n");
      out.write("\t\t<div style=\"margin-top: 30px;\">\r\n");
      out.write("\t\t<input type=\"text\" name=\"logname\" style=\"width: 280px; height: 25px; border-radius: 3px; border:none;\"placeholder=\"用户名\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<input type=\"password\" name=\"password\" style=\"width: 280px; height: 25px; border-radius: 3px; border:none;\"placeholder=\"密码\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<input type=\"submit\" name=\"\" value=\"立即登陆\" style=\"width: 280px; height: 25px;background-color: #ffff00;border-radius: 3px; border:none;\">\r\n");
      out.write("\t\t<br><br><br><br>\r\n");
      out.write("\t\t<a href=\"register.jsp\">没有密码？去注册</a><br><br><br><br><br>\r\n");
      out.write("\t\t登录反馈信息:<br>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((mybean.data.Login)_jspx_page_context.findAttribute("loginBean")).getBackNews())));
      out.write("<br><br>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t<label style=\"font-size:15px;color:#333;\">\r\n");
      out.write("\t1、抢票网网站每日06:00~23:30提供服务。<br>\r\n");
      out.write("\t2、在抢票网网站购票、改签和退票须不晚于开车前25分钟；办理“变更到站”业务时，请不晚于开车前48小时。\r\n");
      out.write("\t</label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"width: 1520px; height: 195px;\">\r\n");
      out.write("\t<div style=\"margin-left:1050px;\">\r\n");
      out.write("\t<img src=\"img/gongzhonghao.jpg\" style=\"width:120px;height:120px; border-radius: 8px; \">\r\n");
      out.write("\t<img src=\"img/xiaochengxu.png\" style=\"width:120px;height:120px; border-radius: 8px;margin-left:50px;\"><br>\r\n");
      out.write("\t<label>&nbsp;&nbsp;官方公众号</label><label style=\"margin-left:88px;\">&nbsp;&nbsp;官方小程序</label>\r\n");
      out.write("\t</div>\r\n");
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
