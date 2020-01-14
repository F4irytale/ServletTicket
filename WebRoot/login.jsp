<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="mybean.data.*"  %>
       <jsp:useBean id="loginBean" class="mybean.data.Login" scope="session"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
	<style type="text/css">
		body{
			margin: 0;
			padding: 0;
		}
	</style>
</head>
<body>
<div style="width: 1370px;height: 80px; margin-left: 130px;">
		<img src="img/logo.png" style="width:200px; height:80px;">
	</div>
<div style="width: 1520px;height: 600px;position: relative; ">
	<div style="margin-left: 120px;">
	<img src="img/pinganchunyun.png" style="width: 600px;height: 300px;position: absolute;margin-top: 40px"><br>
	<img src="img/huijiaguonian.png" style="width: 600px;height: 300px;position: absolute;margin-top: 240px;">
	</div>
	<form action="loginServlet" Method="post" style="width: 350px;height: 500px;background-color: #66ccff;float: right; margin-right: 150px; margin-top: 40px; text-align: center; border-radius: 2px;">
		<div style="margin-top: 30px;">
		<input type="text" name="logname" style="width: 280px; height: 25px; border-radius: 3px; border:none;"placeholder="用户名">
		<br><br>
		<input type="password" name="password" style="width: 280px; height: 25px; border-radius: 3px; border:none;"placeholder="密码">
		<br><br>
		<input type="submit" name="" value="立即登陆" style="width: 280px; height: 25px;background-color: #ffff00;border-radius: 3px; border:none;">
		<br><br><br><br>
		<a href="register.jsp">没有密码？去注册</a><br><br><br><br><br>
		登录反馈信息:<br><jsp:getProperty name="loginBean" property="backNews"/><br><br>
		<hr>
	<label style="font-size:15px;color:#333;">
	1、抢票网网站每日06:00~23:30提供服务。<br>
	2、在抢票网网站购票、改签和退票须不晚于开车前25分钟；办理“变更到站”业务时，请不晚于开车前48小时。
	</label>
		</div>
	</form>
	
</div>
<div style="width: 1520px; height: 195px;">
	<div style="margin-left:1050px;">
	<img src="img/gongzhonghao.jpg" style="width:120px;height:120px; border-radius: 8px; ">
	<img src="img/xiaochengxu.png" style="width:120px;height:120px; border-radius: 8px;margin-left:50px;"><br>
	<label>&nbsp;&nbsp;官方公众号</label><label style="margin-left:88px;">&nbsp;&nbsp;官方小程序</label>
	</div>
</div>
<div style="width: 1520px;height: 100px; background-color: #333;">
	<div style="color: #ccc; text-align: center;padding-top: 50px;">
		<span>版权所有©2019-2020</span><br>
		<span>ICP备10000000-1号</span>
	</div>
</div>
</body>
</html>