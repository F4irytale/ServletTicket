package myservlet.control;
import mybean.data.*;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HandleRegister extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (Exception e) {}
	}
	public String handleString(String s){
		try {
			byte bb[]=s.getBytes("ISO-8859-1");
			s=new String(bb);
		} catch (Exception e) {}
		return s;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri="jdbc:mysql://127.0.0.1:3306/ticket?"+"user=root&password=&characterEncoding=utf-8";
		Connection con;
		PreparedStatement sql;
		Register userBean=new Register();
		request.setAttribute("userBean", userBean);
		String logname=request.getParameter("logname").trim();
		String password=request.getParameter("password").trim();
		String telephone=request.getParameter("telephone").trim();
		String again_password=request.getParameter("again_password").trim();
		if(logname==null)
			logname="";
		if(password==null)
			password="";
		if(!password.equals(again_password)){
			userBean.setBackNews("两次密码不同，注册失败");
		RequestDispatcher dispatcher=request.getRequestDispatcher("register.jsp");
		dispatcher.forward(request,response);
		return;
		}
		boolean isLD=true;
		for(int i=0;i<logname.length();i++){
			char c=logname.charAt(i);
			if(!((c<='z'&&c>='a')||(c<='Z'&&c>='A')||(c<='9'&&c>='0')))
				isLD=false;
		}
		boolean boo=logname.length()>0&&password.length()>0&&isLD;
		String backNews="";
		try {
			con=DriverManager.getConnection(uri);
			String insertCondition="INSERT INTO user VALUES(?,?,?)";
			sql=con.prepareStatement(insertCondition);
			if(boo){
				sql.setString(1,handleString(logname));
				sql.setString(2,handleString(password));
				sql.setString(3,handleString(telephone));
				int m=sql.executeUpdate();
				if(m!=0){
					backNews="注册成功,请返回登录！";
					userBean.setBackNews(backNews);
					userBean.setLogname(logname);
					userBean.setTelephone(handleString(telephone));
				}
			}
			else{
				backNews="信息填写不完整或存在非法字符";
				userBean.setBackNews(backNews);
			}
			con.close();
		} catch (Exception exp) {
			backNews="用户名已存在";
			userBean.setBackNews(backNews);
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("register.jsp");
		dispatcher.forward(request,response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
