<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <jsp:useBean id="userBean" class="mybean.data.Register" scope="request"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
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
	<div style="width:1520px;height:40px;background-color:#f9e9cd">
		<%@include file = "daohang.html" %>
	</div>
<div style="height: 850px;background-color:#baccd9;width:1520px;">
	<form action="helpRegister" method="post" name="form" style="">
		<div style="width: 900px;height: 600px; margin-left:290px;padding: 20px; border:5px #681752 solid; background-color:#c3d7df;">
			<div style="height: 30px; margin-bottom: 10px;background-color:pink;">
				账户信息
			</div>
			<div style="padding-left: 25%; margin-top: 50px;">
			<label style="color: red;">*</label>用户名：&nbsp;&nbsp;&nbsp;<input type="text" name="logname"style="width: 280px; height: 25px; border-radius: 3px; border:none;"><br><br>
			<label style="color: red;">*</label>密码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password"style="width: 280px; height: 25px; border-radius: 3px; border:none;"><br><br>
			<label style="color: red;">*</label>重复密码:&nbsp;&nbsp;<input type="password" name="again_password"style="width: 280px; height: 25px; border-radius: 3px; border:none;"><br><br>
			<label style="color: red;">*</label>手机号:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="telephone"style="width: 280px; height: 25px; border-radius: 3px; border:none;margin-left: 2px;"><br><br>
			<label style="color: red;">*</label>注册反馈:&nbsp;&nbsp;<jsp:getProperty property="backNews" name="userBean"/><br>
			<input type="submit" name="" value="注册" style="width: 180px; height: 35px;background-color: #ff0000;border-radius: 3px; border:none; margin-left: 21%;margin-top:50px;color:white;">
			</div>
		</div>
	</form>
</div>
<div style="width: 1520px;height: 100px; background-color: #333;">
	<div style="color: #ccc; text-align: center;padding-top: 50px;">
		<span>版权所有©2019-2020</span><br>
		<span>ICP备10000000-1号</span>
	</div>
</div>
</body>
</html>