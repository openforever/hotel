<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@include file="/WEB-INF/pages/common/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Page</title>
    <!-- iCheck -->
    <link rel="stylesheet" href="${basePath}static/AdminLTE-2.3/plugins/iCheck/square/blue.css">
</head>
<body class="hold-transition register-page">
    <div class="register-box">
      <div class="register-logo">
        <a href="../../index2.html"><b>Hotel</b>service</a>
      </div>

      <div class="register-box-body">
        <p class="login-box-msg">Register a new membership</p>
        <form action="../../index.html" method="post">
          <div class="form-group has-feedback">
            <input type="text" class="form-control" placeholder="Full name">
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <input type="email" class="form-control" placeholder="Email">
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <input type="password" class="form-control" placeholder="Password">
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <input type="password" class="form-control" placeholder="Retype password">
            <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
          </div>
          <div class="row">
            <div class="col-xs-8">
              <div class="checkbox icheck">
                <label>
                  <input type="checkbox"> I agree to the <a href="#">terms</a>
                </label>
              </div>
            </div><!-- /.col -->
            <div class="col-xs-4">
              <button type="submit" class="btn btn-primary btn-block btn-flat">Register</button>
            </div><!-- /.col -->
          </div>
        </form>

        <div class="social-auth-links text-center">
          <p>- OR -</p>
          <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-facebook"></i> Sign up using WeChat</a>
          <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-google-plus"></i> Sign up using QQ</a>
        </div>

        <a href="login.jsp" class="text-center">I already have a membership</a>
      </div><!-- /.form-box -->
    </div><!-- /.register-box -->

    <!-- iCheck -->
     <script src="${basePath}static/AdminLTE-2.3/plugins/iCheck/icheck.min.js"></script>
    <script>
      $(function () {
        $('input').iCheck({
          checkboxClass: 'icheckbox_square-blue',
          radioClass: 'iradio_square-blue',
          increaseArea: '20%' // optional
        });
      });
    </script>
  </body>
 <!-- <body>
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
		      <label for="email" class="col-sm-2 control-label">邮箱</label>
		      <div class="col-sm-10">
		         <input type="email" style="width: 25%" class="form-control" id="email" 
		            placeholder=email@example.com>
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
		      <label for="password" class="col-sm-2 control-label">确认密码</label>
		      <div class="col-sm-10">
		         <input type="password" style="width: 25%" class="form-control" id="passwordConfirm" 
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
		   
		   <div class="col-sm-offset-2">
			   <label class="checkbox-inline">
			      <input type="radio" name="optionsRadiosinline" id="optionsRadios3" 
			         value="option1" checked> 买家
			   </label>
			   <label class="checkbox-inline">
			      <input type="radio" name="optionsRadiosinline" id="optionsRadios4" 
			         value="option2"> 卖家
			   </label>
		   </div>
		   <div class="form-group">
		      <div class="col-sm-offset-2 col-sm-10">
		         <button type="submit" class="btn btn-default">注册</button>
		      </div>
		   </div>
		</form>
	</div>
</body> -->
</html>