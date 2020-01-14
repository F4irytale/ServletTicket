<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"  %>
<%@page import="mybean.data.*"  %>
<jsp:useBean id="loginBean" class="mybean.data.Login" scope="session"></jsp:useBean>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单</title>
	<style type="text/css">
	body{
		margin: 0;
		padding: 0;
	}
	</style>
</head>
<body>
<div style="width: 100%;height: 80px; margin-left: 130px;">
		<img src="img/logo.png" style="width:200px; height:80px;">
	</div>
	<div style="width:1520px;height:40px;background-color:#f9e9cd">
		<%@include file = "daohang.html" %>
	</div>
	<div style="margin-left: 30px; margin-top: 20px;background-color: #66ccff;width: 1510px;">
		<label style="color: white; font-size: 26px;">您购买到的车票信息如下:</label><br>
		<label style="color: white; font-size: 20px;">请注意出行时间</label>
	</div>
	<div style="width: 1450px; height:400px; background-color: #eee; margin-left: 60px; margin-top: 30px;">
<% 	

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
	     
%>
	</div>
</body>
</html>