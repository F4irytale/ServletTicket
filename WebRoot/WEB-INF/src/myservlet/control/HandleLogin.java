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
      String uri="jdbc:mysql://cdb-9pyzq6b2.cd.tencentcdb.com:10013/ticket?"+"user=root&password=da80912102&characterEncoding=utf-8";
      boolean boo=(logname.length()>0)&&(password.length()>0);  
      try{ 
           con=DriverManager.getConnection(uri);
           String weiqi="select * from user where logname = '"+logname+"' and password ='"+password+"'";
           sql=con.createStatement();  
           if(boo){
              ResultSet rs=sql.executeQuery(weiqi);
              boolean m=rs.next();
              if(m==true){ 
                  //���õ�¼�ɹ��ķ���:
                  success(request,response,logname,password); 
                  RequestDispatcher dispatcher=
                  request.getRequestDispatcher("index.jsp");//ת��
                  dispatcher.forward(request,response);
              }
              else{
                  String backNews="��������û��������ڣ������벻����";
                  //���õ�¼ʧ�ܵķ���:
                  fail(request,response,logname,backNews); 
              }
           }
           else{
                  String backNews="�������û���������";
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
	               loginBean=new Login();  //�����µ�����ģ�� 
	               session.setAttribute("loginBean",loginBean);
	               loginBean=(Login)session.getAttribute("loginBean");
	            }
	            String name =loginBean.getLogname();
	            if(name.equals(logname)) {
	               loginBean.setBackNews(logname+"�Ѿ���¼��");
	               loginBean.setLogname(logname);
	            }
	            else {  //����ģ�ʹ洢�µĵ�¼�û�
	                loginBean.setBackNews(logname+"��¼�ɹ�");
	                loginBean.setLogname(logname);
	            }
	      }
	      catch(Exception ee){
	            loginBean=new Login();  
	            session.setAttribute("loginBean",loginBean);
	            loginBean.setBackNews(logname+"��¼�ɹ�");
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
