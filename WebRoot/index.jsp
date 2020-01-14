<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@page import="mybean.data.*"  %>
       <jsp:useBean id="loginBean" class="mybean.data.Login" scope="session"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>火车订票系统</title>
	<style type="text/css">
		body{
		margin: 0;
		padding: 0;
	}
		#title{
			color:#66ccff;
			font-size: 35px;
			font-weight: 900;
		}
		#example td:hover{
		border:5px red solid;
		}
	</style>
</head>
<body>
	<div style="width: 1370px;height: 80px; margin-left: 130px;">
		<img src="img/logo.png" style="width:200px; height:80px;">
		<lable style="margin-left:900px;font-size: 24px;position:absolute;margin-top:30px;">当前登录用户为:<jsp:getProperty name="loginBean" property="logname"/></lable>
	</div>
	<div style="width:1520px;height:40px;background-color:#f9e9cd">
		<%@include file = "daohang.html" %>
	</div>
	<img src="img/gaotie.jpg" style="width: 1520px;height: 550px; z-index: 0;position: absolute;border-radius:5px;">
	<div style="margin: 50px; width: 400px; height: 350px; background-color: #ede3e7; z-index: 1;position: relative;margin-left:150px;">
		<form action="chaxun" method="post" style="margin: 20px;padding: 10px; border:5px;">
			<label style="font-size: 24px; margin-top: 20px;">车票查询</label>
			<br><br>
			<label style="font-size: 15px;">出发地&nbsp;&nbsp;&nbsp;&nbsp;</label>
			<input type="text" name="chufa"style="width: 180px;height: 23px;border-radius: 3px; border:none;"placeholder="汉字">
			<br><br>
			<label style="font-size: 15px;">到达地&nbsp;&nbsp;&nbsp;&nbsp;</label>
			<input type="text" name="daoda"style="width: 180px;height: 23px;border-radius: 3px; border:none;"
			placeholder="汉字">
			<br><br>
			<label style="font-size: 15px;">查询日期&nbsp;</label>
			<input type="text" name="time" style="width: 180px;height: 23px;border-radius: 3px; border:none;"placeholder="日期">
			
			<br><br><br><br>
			<input type="submit" name="submit" value="查询" style="width: 250px;height: 30px;background-color: #fa7e23;border-radius: 8px; color: white; border:none;">
		</form>
	</div>
	<div style="width:1520px;height: 300px;text-align: center;margin-top: 150px; background-color:#f8ebe6;">
		<label style="font-size:40px; text-shadow: 0 0 5px black;color:white">热销路线</label>
		<table id="example" style="width:1520px;height:300px;" >
			<tr>
				<td><img src="img/beijing.jpg" style="width:500px;height:300px;"></td>
				<td><img src="img/shuilifang.jpg" style="width:500px;height:300px;"></td>
				<td><img src="img/xihu.jpg" style="width:500px;height:300px;"></td>
			</tr>
			<tr style="">
				<td colspan="2"><img src="img/aomen.jpg" style="width:1010px;height:300px;"></td>
				<td><img src="img/shanghai.jpg" style="width:500px;height:300px;"></td>
			</tr>
		</table>
	</div>
</body>
</html>