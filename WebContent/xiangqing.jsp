<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mybean.data.Chaxun" %>
<%@ page import="com.sun.rowset.*" %>
<jsp:useBean id="dataBean" class="mybean.data.Chaxun" scope="session"/>
 <%@page import="mybean.data.*"  %>
       <jsp:useBean id="loginBean" class="mybean.data.Login" scope="session"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>详情页</title>
<style type="text/css">
	body{
		margin: 0;
		padding: 0;
	}
	</style>
</head>
<body>
<div style="width: 1370px;;height: 80px; margin-left: 130px;">
		<img src="img/logo.png" style="width:200px; height:80px;">
	</div>
	<div style="width:1520px;height:40px;background-color:#f9e9cd">
		<%@include file = "daohang.html" %>
	</div>
	<div style="margin-left: 30px; margin-top: 20px;background-color: #66ccff;width: 1100px;">
		<label style="color: white; font-size: 26px;">您查询到的车票信息如下:</label>
	</div>
	<form action="xiadan" method="post">
	<div style="width: 400px;height: 500px; background-color: pink; position: fixed; margin-left:1095px;">
		<div style="padding: 55px;">
			<label style="font-size: 21px;">选择的车次:</label><br>
			<label></label>
			<input type="text" name="checi" style="width: 280px; height: 30px;border-radius: 5px; border:none;margin-top:10px;">
			<input type="hidden" name="logname" value=<jsp:getProperty name="loginBean" property="logname"/>>
			<input type="submit" name="" value="现在下单" style="width: 280px; height: 30px;background-color: #ffff00;border-radius: 5px; border:none;margin-top: 180px;">
		</div>
	</div>
	<div style="width: 1000px; height: 800px; background-color: #eee; margin-left: 60px; margin-top: 30px;">
  <table border=2>
  <tr>
    <th>车次</th>
    <th>时间</th>
    <th>出发地</th>
    <th>到达地</th>
  </tr>
<jsp:setProperty name="dataBean" property="pageSize" param="pageSize"/>
<jsp:setProperty name="dataBean" property="currentPage" param="currentPage"/>
<%    
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
%>
 </table>
  <BR>每页最多显示<jsp:getProperty name="dataBean" property="pageSize"/>条信息
 <BR>当前显示第<Font color=blue>
     <jsp:getProperty name="dataBean" property="currentPage"/>
   </Font>页,共有
   <Font color=blue><jsp:getProperty name="dataBean" property="totalPages"/>
   </Font>页。
<Table>
  <tr><td><FORM action="" method=post>
          <Input type=hidden name="currentPage" value=
         "<%=dataBean.getCurrentPage()-1 %>">
           <Input type=submit name="g" value="上一页"></FORM></td>
      <td><FORM action="" method=post>
          <Input type=hidden name="currentPage"
           value="<%=dataBean.getCurrentPage()+1 %>">
          <Input type=submit name="g" value="下一页"></FORM></td></tr>
 <tr><td> <FORM action="" method=post>
</Table>
</Center>
	</div>
	</form>
</body>
</html>