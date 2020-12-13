package myservlet.control;
import mybean.data.Chaxun;
import com.sun.rowset.*;
import java.sql.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
public class HandleChaxun extends HttpServlet{
   CachedRowSetImpl rowSet=null;
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
      try {  Class.forName("com.mysql.jdbc.Driver");
      }
      catch(Exception e){} 
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      request.setCharacterEncoding("utf-8");
      
      String chufa= request.getParameter("chufa");
      String daoda= request.getParameter("daoda");
      String time= request.getParameter("time");
      if((chufa==null||chufa.length()==0)&&(daoda==null||daoda.length()==0)&&(time==null||time.length()==0)) {
         fail(request,response,"查询所有车次");
         return; 
      }else if((chufa==null||chufa.length()==0)&&(daoda==null||daoda.length()==0)) {
    	  time(request,response,time);
      }
      else if((daoda==null||daoda.length()==0)&&(time==null||time.length()==0)) {
    	  chufa(request,response,chufa);
      }
      else if((chufa==null||chufa.length()==0&&time==null||time.length()==0)) {
    	  daoda(request,response,daoda);
      }
      else if(time==null||time.length()==0) {
    	  chudao(request,response,chufa,daoda);
      }
      else
      {
      String condition="";
      condition = "SELECT * FROM train WHERE chufa='"+chufa+"'&&daoda='"+daoda+"'&&time='"+time+"'"; 
      HttpSession session=request.getSession(true); 
      Connection con=null; 
      Chaxun dataBean=null;
      try{ 
           dataBean=(Chaxun)session.getAttribute("dataBean");
           if(dataBean==null){
              dataBean=new Chaxun();  
              session.setAttribute("dataBean",dataBean);
           }
      }
      catch(Exception exp){
           dataBean=new Chaxun();  
           session.setAttribute("dataBean",dataBean);
      } 
      String uri = "jdbc:mysql://127.0.0.1:3307/ticket?"+"user=root&password=123456&characterEncoding=utf-8";
      try{ 
           con=DriverManager.getConnection(uri);
           Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                ResultSet.CONCUR_READ_ONLY);
           ResultSet rs=sql.executeQuery(condition);
           rowSet=new CachedRowSetImpl();   //鍒涘缓琛岄泦瀵硅薄
           rowSet.populate(rs);
           dataBean.setRowSet(rowSet);      //琛岄泦鏁版嵁瀛樺偍鍦╠ataBean涓�  
           con.close();                     //鍏抽棴杩炴帴
      }
      catch(SQLException exp){}
      response.sendRedirect("xiangqing.jsp");//閲嶅畾鍚戝埌byPageShow.jsp
   } }
   public void doGet(HttpServletRequest request,
              HttpServletResponse response) 
                        throws ServletException,IOException{
       doPost(request,response);
   }
   public void fail(HttpServletRequest request,HttpServletResponse response,
                      String backNews) throws IOException {
        String condition="";
        condition = "SELECT * FROM train"; 
        HttpSession session=request.getSession(true); 
        Connection con=null; 
        Chaxun dataBean=null;
        try{ 
             dataBean=(Chaxun)session.getAttribute("dataBean");
             if(dataBean==null){
                dataBean=new Chaxun();  
                session.setAttribute("dataBean",dataBean);
             }
        }
        catch(Exception exp){
             dataBean=new Chaxun();  
             session.setAttribute("dataBean",dataBean);
        } 
        String uri = "jdbc:mysql://127.0.0.1:3307/ticket?"+"user=root&password=123456&characterEncoding=utf-8";
        try{ 
             con=DriverManager.getConnection(uri);
             Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                  ResultSet.CONCUR_READ_ONLY);
             ResultSet rs=sql.executeQuery(condition);
             rowSet=new CachedRowSetImpl();   //鍒涘缓琛岄泦瀵硅薄
             rowSet.populate(rs);
             dataBean.setRowSet(rowSet);      //琛岄泦鏁版嵁瀛樺偍鍦╠ataBean涓�  
             con.close();                     //鍏抽棴杩炴帴
        }
        catch(SQLException exp){}
        response.sendRedirect("xiangqing.jsp");//閲嶅畾鍚戝埌byPageShow.jsp
     
    }
   public void time(HttpServletRequest request,HttpServletResponse response,
           String time) throws IOException {
String condition="";
condition = "SELECT * FROM train WHERE time='"+time+"'"; 
HttpSession session=request.getSession(true); 
Connection con=null; 
Chaxun dataBean=null;
try{ 
  dataBean=(Chaxun)session.getAttribute("dataBean");
  if(dataBean==null){
     dataBean=new Chaxun();  
     session.setAttribute("dataBean",dataBean);
  }
}
catch(Exception exp){
  dataBean=new Chaxun();  
  session.setAttribute("dataBean",dataBean);
} 
String uri = "jdbc:mysql://127.0.0.1:3307/ticket?"+"user=root&password=123456&characterEncoding=utf-8";
try{ 
  con=DriverManager.getConnection(uri);
  Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                       ResultSet.CONCUR_READ_ONLY);
  ResultSet rs=sql.executeQuery(condition);
  rowSet=new CachedRowSetImpl();   //鍒涘缓琛岄泦瀵硅薄
  rowSet.populate(rs);
  dataBean.setRowSet(rowSet);      //琛岄泦鏁版嵁瀛樺偍鍦╠ataBean涓�  
  con.close();                     //鍏抽棴杩炴帴
}
catch(SQLException exp){}
response.sendRedirect("xiangqing.jsp");//閲嶅畾鍚戝埌byPageShow.jsp

}
   public void chufa(HttpServletRequest request,HttpServletResponse response,
           String chufa) throws IOException {
String condition="";
condition = "SELECT * FROM train WHERE chufa='"+chufa+"'"; 
HttpSession session=request.getSession(true); 
Connection con=null; 
Chaxun dataBean=null;
try{ 
  dataBean=(Chaxun)session.getAttribute("dataBean");
  if(dataBean==null){
     dataBean=new Chaxun();  
     session.setAttribute("dataBean",dataBean);
  }
}
catch(Exception exp){
  dataBean=new Chaxun();  
  session.setAttribute("dataBean",dataBean);
} 
String uri = "jdbc:mysql://127.0.0.1:3307/ticket?"+"user=root&password=123456&characterEncoding=utf-8";
try{ 
  con=DriverManager.getConnection(uri);
  Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                       ResultSet.CONCUR_READ_ONLY);
  ResultSet rs=sql.executeQuery(condition);
  rowSet=new CachedRowSetImpl();   //鍒涘缓琛岄泦瀵硅薄
  rowSet.populate(rs);
  dataBean.setRowSet(rowSet);      //琛岄泦鏁版嵁瀛樺偍鍦╠ataBean涓�  
  con.close();                     //鍏抽棴杩炴帴
}
catch(SQLException exp){}
response.sendRedirect("xiangqing.jsp");//閲嶅畾鍚戝埌byPageShow.jsp

}
   public void daoda(HttpServletRequest request,HttpServletResponse response,
           String daoda) throws IOException {
String condition="";
condition = "SELECT * FROM train WHERE daoda='"+daoda+"'"; 
HttpSession session=request.getSession(true); 
Connection con=null; 
Chaxun dataBean=null;
try{ 
  dataBean=(Chaxun)session.getAttribute("dataBean");
  if(dataBean==null){
     dataBean=new Chaxun();  
     session.setAttribute("dataBean",dataBean);
  }
}
catch(Exception exp){
  dataBean=new Chaxun();  
  session.setAttribute("dataBean",dataBean);
} 
String uri = "jdbc:mysql://127.0.0.1:3307/ticket?"+"user=root&password=123456&characterEncoding=utf-8";
try{ 
  con=DriverManager.getConnection(uri);
  Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                       ResultSet.CONCUR_READ_ONLY);
  ResultSet rs=sql.executeQuery(condition);
  rowSet=new CachedRowSetImpl();   //鍒涘缓琛岄泦瀵硅薄
  rowSet.populate(rs);
  dataBean.setRowSet(rowSet);      //琛岄泦鏁版嵁瀛樺偍鍦╠ataBean涓�  
  con.close();                     //鍏抽棴杩炴帴
}
catch(SQLException exp){}
response.sendRedirect("xiangqing.jsp");//閲嶅畾鍚戝埌byPageShow.jsp

}
   public void chudao(HttpServletRequest request,HttpServletResponse response,
           String chufa,String daoda) throws IOException {
String condition="";
condition = "SELECT * FROM train WHERE chufa='"+chufa+"'&&daoda='"+daoda+"'"; 
HttpSession session=request.getSession(true); 
Connection con=null; 
Chaxun dataBean=null;
try{ 
  dataBean=(Chaxun)session.getAttribute("dataBean");
  if(dataBean==null){
     dataBean=new Chaxun();  
     session.setAttribute("dataBean",dataBean);
  }
}
catch(Exception exp){
  dataBean=new Chaxun();  
  session.setAttribute("dataBean",dataBean);
} 
String uri = "jdbc:mysql://127.0.0.1:3307/ticket?"+"user=root&password=123456&characterEncoding=utf-8";
try{ 
  con=DriverManager.getConnection(uri);
  Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                       ResultSet.CONCUR_READ_ONLY);
  ResultSet rs=sql.executeQuery(condition);
  rowSet=new CachedRowSetImpl();   //鍒涘缓琛岄泦瀵硅薄
  rowSet.populate(rs);
  dataBean.setRowSet(rowSet);      //琛岄泦鏁版嵁瀛樺偍鍦╠ataBean涓�  
  con.close();                     //鍏抽棴杩炴帴
}
catch(SQLException exp){}
response.sendRedirect("xiangqing.jsp");//閲嶅畾鍚戝埌byPageShow.jsp

}
}

