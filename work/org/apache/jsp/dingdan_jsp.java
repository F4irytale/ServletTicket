package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import mybean.data.*;

public final class dingdan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("\r\n");
      mybean.data.Login loginBean = null;
      synchronized (session) {
        loginBean = (mybean.data.Login) _jspx_page_context.getAttribute("loginBean", PageContext.SESSION_SCOPE);
        if (loginBean == null){
          loginBean = new mybean.data.Login();
          _jspx_page_context.setAttribute("loginBean", loginBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>订单</title>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tmargin: 0;\r\n");
      out.write("\t\tpadding: 0;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"width: 100%;height: 80px; margin-left: 130px;\">\r\n");
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
      out.write("\t<div style=\"margin-left: 30px; margin-top: 20px;background-color: #66ccff;width: 1510px;\">\r\n");
      out.write("\t\t<label style=\"color: white; font-size: 26px;\">您购买到的车票信息如下:</label><br>\r\n");
      out.write("\t\t<label style=\"color: white; font-size: 20px;\">请注意出行时间</label>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width: 1450px; height:400px; background-color: #eee; margin-left: 60px; margin-top: 30px;\">\r\n");
 	

Connection con; 
Statement sql; 
ResultSet rs;
try{ 
    Class.forName("com.mysql.jdbc.Driver");
}
catch(Exception e){}
try{
	String uri="jdbc:mysql://cdb-9pyzq6b2.cd.tencentcdb.com:10013/ticket?"+"user=root&password=da80912102&characterEncoding=utf-8";
	con=DriverManager.getConnection(uri);
	sql=con.createStatement();
	String weiqi="select * from dingdan where logname='"+loginBean.getLogname()+"'";
	rs=sql.executeQuery(weiqi);
	out.print("<table border=2>");
		out.print("<tr>");
			out.print("<th width=100>"+"出发点");
			out.print("<th width=100>"+"到达点");
			out.print("<th width=100>"+"时间");
			out.print("<th width=100>"+"车次");
		out.print("</tr>");
	while(rs.next()){
		out.print("<tr>");
			out.print("<td>"+rs.getString(1)+"</td>");
			out.print("<td>"+rs.getString(2)+"</td>");
			out.print("<td>"+rs.getString(3)+"</td>");
			out.print("<td>"+rs.getString(4)+"</td>");
		out.print("</tr>");
	}
	out.print("</table>");
	con.close();
}
catch(SQLException e){
	out.print("e");
}
	     

      out.write("\r\n");
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
