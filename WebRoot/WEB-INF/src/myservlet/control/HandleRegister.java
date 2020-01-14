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
		String uri="jdbc:mysql://cdb-9pyzq6b2.cd.tencentcdb.com:10013/ticket?"+"user=root&password=da80912102&characterEncoding=utf-8";
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
			userBean.setBackNews("�������벻ͬ��ע��ʧ��");
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
					backNews="ע��ɹ�,�뷵�ص�¼��";
					userBean.setBackNews(backNews);
					userBean.setLogname(logname);
					userBean.setTelephone(handleString(telephone));
				}
			}
			else{
				backNews="��Ϣ��д����������ڷǷ��ַ�";
				userBean.setBackNews(backNews);
			}
			con.close();
		} catch (Exception exp) {
			backNews="�û����Ѵ���";
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
