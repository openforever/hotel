<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<script type="text/javascript" src="${basePath }static/js/jquery/jquery-1.9.1.js"></script>
<script type="text/javascript">
	$(function(){
		$("#testJson").click(function(){
			var url = this.href;
			var args = {};
			$.post(url, args, function(data){//发送post请求  返回所有的employee
				for(var i = 0; i < data.length; i++){
					var id = data[i].id;
					var lastName = data[i].lastName;
					
					alert(id + ": " + lastName );
				}
			});
			return false;
		});
	})
</script>
</head>
<body>
	hello world
	<a href="user/add">add user</a> <br>
	<a href="user/del/0">delete user</a> <br>
	<a href="user/login">登录</a> <br>
	<a href="user/register">注册</a>
</body>
</html>