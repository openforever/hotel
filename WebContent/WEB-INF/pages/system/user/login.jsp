<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@include file="/WEB-INF/pages/common/header.jsp"%>
<!DOCTYPE html>
<html>

<head>

  <meta charset="UTF-8">

  <title>登录</title>

  <link rel="stylesheet" href="${basePath}static/css/font-awesome.min.css">

  <link rel='stylesheet' href='${basePath}static/css/jquery-ui.css'>
<link rel='stylesheet prefetch' href='${basePath}static/bootstrap/css/bootstrap.min.css'>

    <link rel="stylesheet" href="${basePath}static/css/style.css" media="screen" type="text/css" />

    <script src="${basePath}static/js/modernizr.js"></script>

</head>

<body>

  <body class="login-page">
<div class="login-form">

		<div class="login-content">

			<div class="form-login-error">
				<h3>Invalid login</h3>
				<p>Enter <strong>demo</strong>/<strong>demo</strong> as login and password.</p>
			</div>

			<form method="post" role="form" id="form_login">

				<div class="form-group">

					<div class="input-group">
						<div class="input-group-addon">
							<i>Username</i>
						</div>

						<input type="text" class="form-control" name="username" id="username" autocomplete="off" />
					</div>

				</div>

				<div class="form-group">

					<div class="input-group">
						<div class="input-group-addon">
							<i>Password</i>
						</div>

						<input type="password" class="form-control" name="password" id="password" autocomplete="off" />
					</div>

				</div>

				<div class="form-group">
					<button type="submit" class="btn btn-primary btn-block btn-login">
						Login In
					</button>
				</div>

				<!-- Implemented in v1.1.4 -->				<div class="form-group">
					<em>- or -</em>
				</div>

				<div class="form-group">

					<button type="button" class="btn btn-default btn-lg btn-block facebook-button" style="text-align:center">
                    忘记密码?
					</button>

				</div>

				<!-- 

				You can also use other social network buttons
				<div class="form-group">

					<button type="button" class="btn btn-default btn-lg btn-block btn-icon icon-left twitter-button">
						Login with Twitter
						<i class="entypo-twitter"></i>
					</button>

				</div>

				<div class="form-group">

					<button type="button" class="btn btn-default btn-lg btn-block btn-icon icon-left google-button">
						Login with Google+
						<i class="entypo-gplus"></i>
					</button>

				</div> -->				
			</form>

			<div style="text-align:center;clear:both;">
</div>

		</div>
 </div>

</body>

</html>