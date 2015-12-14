<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@include file="/WEB-INF/pages/common/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
	<br><br><br>
	<div class="container-fluid" >
		<form class="form-horizontal" role="form">
		   <div class="form-group">
		      <label for="firstname" class="col-sm-2 control-label">用户名</label>
		      <div class="col-sm-10">
		         <input type="text" style="width: 25%" class="form-control" id="firstname" 
		            placeholder="Loginname">
		      </div>
		   </div>
		   <div class="form-group">
		      <label for="password" class="col-sm-2 control-label">密码</label>
		      <div class="col-sm-10">
		         <input type="password" style="width: 25%" class="form-control" id="password" 
		            placeholder="Password">
		      </div>
		   </div>
		   <div class="form-group">
		      <div class="col-sm-offset-2 col-sm-10">
		         <div class="checkbox">
		            <label>
		               <input type="checkbox"> 请记住我
		            </label>
		         </div>
		      </div>
		   </div>
		   <div class="form-group">
		      <div class="col-sm-offset-2 col-sm-10">
		         <button type="submit" class="btn btn-default">登录</button>
		      </div>
		   </div>
		</form>
	</div>
</body>
</html>