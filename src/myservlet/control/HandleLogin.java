package myservlet.control;
import mybean.data.*;

import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;
public class HandleLogin extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
      try{ 
           Class.forName("com.mysql.jdbc.Driver");
      }
      catch(Exception e){} 
   }
   public String handleString(String s){
      try{  byte bb[]=s.getBytes("iso-8859-1");
            s=new String(bb);
      }
      catch(Exception ee){} 
      return s;  
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      Connection con; 
      Statement sql; 
      String logname=request.getParameter("logname").trim(),
      password=request.getParameter("password").trim();
      logname=handleString(logname);
      password=handleString(password);
      String uri = "jdbc:mysql://127.0.0.1:3307/ticket?"+"user=root&password=123456&characterEncoding=utf-8";
      boolean boo=(logname.length()>0)&&(password.length()>0);  
      try{ 
           con=DriverManager.getConnection(uri);
           String weiqi="select * from user where logname = '"+logname+"' and password ='"+password+"'";
           sql=con.createStatement();  
           if(boo){
              ResultSet rs=sql.executeQuery(weiqi);
              boolean m=rs.next();
              if(m==true){ 
                  //璋冪敤鐧诲綍鎴愬姛鐨勬柟娉�:
                  success(request,response,logname,password); 
                  RequestDispatcher dispatcher=
                  request.getRequestDispatcher("index.jsp");//杞彂
                  dispatcher.forward(request,response);
              }
              else{
                  String backNews="鎮ㄨ緭鍏ョ殑鐢ㄦ埛鍚嶄笉瀛樺湪锛屾垨瀵嗙爜涓嶈埇閰�";
                  //璋冪敤鐧诲綍澶辫触鐨勬柟娉�:
                  fail(request,response,logname,backNews); 
              }
           }
           else{
                  String backNews="璇疯緭鍏ョ敤鎴峰悕鍜屽瘑鐮�";
                  fail(request,response,logname,backNews);
           }
           con.close();
      }
      catch(SQLException exp){
          String backNews=""+exp;
          fail(request,response,logname,backNews);
      }
   }
   public  void  doGet(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      doPost(request,response);
   }
   public void success(HttpServletRequest request,HttpServletResponse response
                      ,String logname,String password) {
	   Login loginBean=null;
	      HttpSession session=request.getSession(true);
	      try{  loginBean=(Login)session.getAttribute("loginBean");
	            if(loginBean==null){
	               loginBean=new Login();  //鍒涘缓鏂扮殑鏁版嵁妯″瀷 
	               session.setAttribute("loginBean",loginBean);
	               loginBean=(Login)session.getAttribute("loginBean");
	            }
	            String name =loginBean.getLogname();
	            if(name.equals(logname)) {
	               loginBean.setBackNews(logname+"宸茬粡鐧诲綍浜�");
	               loginBean.setLogname(logname);
	            }
	            else {  //鏁版嵁妯″瀷瀛樺偍鏂扮殑鐧诲綍鐢ㄦ埛
	                loginBean.setBackNews(logname+"登录成功");
	                loginBean.setLogname(logname);
	            }
	      }
	      catch(Exception ee){
	            loginBean=new Login();  
	            session.setAttribute("loginBean",loginBean);
	            loginBean.setBackNews(logname+"登录成功");
	            loginBean.setLogname(logname);
	      }
   }
    public void fail(HttpServletRequest request,HttpServletResponse response
                      ,String logname,String backNews) {
        response.setContentType("text/html;charset=GB2312");
        try {
         PrintWriter out=response.getWriter();
         out.println("<html><body style='text-align:center;'>");
         out.println("<script>alert('"+backNews+"')</script>");
         out.println("<script>window.location='login.jsp'</script>");
         out.println("</body></html>");
        }
        catch(IOException exp){}
    }
}
