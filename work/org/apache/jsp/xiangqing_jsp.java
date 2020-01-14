package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mybean.data.Chaxun;
import com.sun.rowset.*;
import mybean.data.*;

public final class xiangqing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      mybean.data.Chaxun dataBean = null;
      synchronized (session) {
        dataBean = (mybean.data.Chaxun) _jspx_page_context.getAttribute("dataBean", PageContext.SESSION_SCOPE);
        if (dataBean == null){
          dataBean = new mybean.data.Chaxun();
          _jspx_page_context.setAttribute("dataBean", dataBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write(" \r\n");
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
      out.write("<title>详情页</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tmargin: 0;\r\n");
      out.write("\t\tpadding: 0;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"width: 1370px;;height: 80px; margin-left: 130px;\">\r\n");
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
      out.write("\t<div style=\"margin-left: 30px; margin-top: 20px;background-color: #66ccff;width: 1100px;\">\r\n");
      out.write("\t\t<label style=\"color: white; font-size: 26px;\">您查询到的车票信息如下:</label>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<form action=\"xiadan\" method=\"post\">\r\n");
      out.write("\t<div style=\"width: 400px;height: 500px; background-color: pink; position: fixed; margin-left:1095px;\">\r\n");
      out.write("\t\t<div style=\"padding: 55px;\">\r\n");
      out.write("\t\t\t<label style=\"font-size: 21px;\">选择的车次:</label><br>\r\n");
      out.write("\t\t\t<label></label>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"checi\" style=\"width: 280px; height: 30px;border-radius: 5px; border:none;margin-top:10px;\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"logname\" value=");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((mybean.data.Login)_jspx_page_context.findAttribute("loginBean")).getLogname())));
      out.write(">\r\n");
      out.write("\t\t\t<input type=\"submit\" name=\"\" value=\"现在下单\" style=\"width: 280px; height: 30px;background-color: #ffff00;border-radius: 5px; border:none;margin-top: 180px;\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width: 1000px; height: 800px; background-color: #eee; margin-left: 60px; margin-top: 30px;\">\r\n");
      out.write("  <table border=2>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>车次</th>\r\n");
      out.write("    <th>时间</th>\r\n");
      out.write("    <th>出发地</th>\r\n");
      out.write("    <th>到达地</th>\r\n");
      out.write("  </tr>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("dataBean"), "pageSize", request.getParameter("pageSize"), request, "pageSize", false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("dataBean"), "currentPage", request.getParameter("currentPage"), request, "currentPage", false);
      out.write('\r');
      out.write('\n');
    
      CachedRowSetImpl rowSet=dataBean.getRowSet();
      if(rowSet==null) {
         out.print("没有查询到结果，无法浏览");
         return;  
      }
      rowSet.last(); 
      int totalRecord=rowSet.getRow();
      out.println("全部记录数"+totalRecord); //全部记录数
      int pageSize=dataBean.getPageSize();  //每页显示的记录数
      int totalPages = dataBean.getTotalPages();
      if(totalRecord%pageSize==0)
           totalPages = totalRecord/pageSize;//总页数
      else
           totalPages = totalRecord/pageSize+1;
      dataBean.setPageSize(pageSize);
      dataBean.setTotalPages(totalPages);
      if(totalPages>=1) {
         if(dataBean.getCurrentPage()<1)
              dataBean.setCurrentPage(dataBean.getTotalPages());
         if(dataBean.getCurrentPage()>dataBean.getTotalPages())
              dataBean.setCurrentPage(1);
         int index=(dataBean.getCurrentPage()-1)*pageSize+1;
         rowSet.absolute(index);  //查询位置移动到currentPage页起始位置
         boolean boo=true;
         for(int i=1;i<=pageSize&&boo;i++) { 
            String checi=rowSet.getString(1);
            String time=rowSet.getString(2);
            String chufa=rowSet.getString(3);
            String daoda=rowSet.getString(4);
            String id=rowSet.getString(5);
            out.print("<tr>");
            out.print("<td>"+checi+"</td>");
            out.print("<td>"+time+"</td>");
            out.print("<td>"+chufa+"</td>");
            out.print("<td>"+daoda+"</td>");
            out.print("</tr>");
            boo=rowSet.next();
         }
     }

      out.write("\r\n");
      out.write(" </table>\r\n");
      out.write("  <BR>每页最多显示");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((mybean.data.Chaxun)_jspx_page_context.findAttribute("dataBean")).getPageSize())));
      out.write("条信息\r\n");
      out.write(" <BR>当前显示第<Font color=blue>\r\n");
      out.write("     ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((mybean.data.Chaxun)_jspx_page_context.findAttribute("dataBean")).getCurrentPage())));
      out.write("\r\n");
      out.write("   </Font>页,共有\r\n");
      out.write("   <Font color=blue>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((mybean.data.Chaxun)_jspx_page_context.findAttribute("dataBean")).getTotalPages())));
      out.write("\r\n");
      out.write("   </Font>页。\r\n");
      out.write("<Table>\r\n");
      out.write("  <tr><td><FORM action=\"\" method=post>\r\n");
      out.write("          <Input type=hidden name=\"currentPage\" value=\r\n");
      out.write("         \"");
      out.print(dataBean.getCurrentPage()-1 );
      out.write("\">\r\n");
      out.write("           <Input type=submit name=\"g\" value=\"上一页\"></FORM></td>\r\n");
      out.write("      <td><FORM action=\"\" method=post>\r\n");
      out.write("          <Input type=hidden name=\"currentPage\"\r\n");
      out.write("           value=\"");
      out.print(dataBean.getCurrentPage()+1 );
      out.write("\">\r\n");
      out.write("          <Input type=submit name=\"g\" value=\"下一页\"></FORM></td></tr>\r\n");
      out.write(" <tr><td> <FORM action=\"\" method=post>\r\n");
      out.write("</Table>\r\n");
      out.write("</Center>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
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
