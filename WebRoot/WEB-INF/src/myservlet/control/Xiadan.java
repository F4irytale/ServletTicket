package myservlet.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mybean.data.Chaxun;

import com.sun.rowset.CachedRowSetImpl;

public class Xiadan extends HttpServlet {
	 public void init(ServletConfig config) throws ServletException{
	      super.init(config);
	      
	      try {  Class.forName("com.mysql.jdbc.Driver");
	      }
	      catch(Exception e){} 
	   }
	   public void doPost(HttpServletRequest request,HttpServletResponse response) 
	                        throws ServletException,IOException{
		   String checi= request.getParameter("checi");
		   String condition="";
	        condition = "SELECT * FROM train WHERE checi='"+checi+"'"; 
	        HttpSession session=request.getSession(true); 
	        Connection con=null; 
	        	String time = null ;
		       String chufa = null ;
		       String daoda = null ;
		       String logname=null;
		    	logname = request.getParameter("logname");
	        String uri = "jdbc:mysql://127.0.0.1:3306/ticket?"+"user=root&password=&characterEncoding=utf-8";
	        try{ 
	        	
	             con=DriverManager.getConnection(uri);
	             Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
	                                                  ResultSet.CONCUR_READ_ONLY);
	             ResultSet rs=sql.executeQuery(condition);
	             while(rs.next()){
	             time = rs.getString(2);
	             chufa = rs.getString(3);
	             daoda = rs.getString(4);}
	             con.close();                     //关闭连接
	        }
	        catch(SQLException exp){}
	        if ( logname == null||logname.length()==0){
	        	response.setContentType("text/html;charset=GB2312");
	            try {
	             PrintWriter out=response.getWriter();
	             out.println("<html><body style='text-align:center;'>");
	             out.println("<script>alert('请返回登陆')</script>");
	             out.println("<script>window.location='login.jsp'</script>");
	             out.println("</body></html>");
	            }
	            catch(IOException exp){}
	        
	        }else{
	        	insert(request,response,chufa,daoda,time,checi,logname);
	        }	
		   } 
	   public void insert(HttpServletRequest request,HttpServletResponse response,
	           String chufa,String daoda,String time,String checi,String logname) throws IOException {
		      String condition="";
		      condition = "INSERT INTO dingdan VALUES('"+logname+"','"+chufa+"','"+daoda+"','"+time+"','"+checi+"')"; 
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
		      String uri = "jdbc:mysql://cdb-9pyzq6b2.cd.tencentcdb.com:10013/ticket?"+"user=root&password=da80912102&characterEncoding=utf-8";
		      try{ 
		           con=DriverManager.getConnection(uri);
		           Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
		                                                ResultSet.CONCUR_READ_ONLY);
		           int rs=sql.executeUpdate(condition);
		           
		           con.close();                     //关闭连接
		      }
		      catch(SQLException exp){}
		      response.sendRedirect("dingdan.jsp");//重定向到byPageShow.jsp
	   }	   
}
