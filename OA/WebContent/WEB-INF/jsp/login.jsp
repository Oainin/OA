<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>企业OA登录界面</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Eminent Login Form Widget Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<link href="css/style.css" rel='stylesheet' type='text/css' media="all" />


</head>
<body>
<div style="margin-top: 70px;" class="form-w3ls">
    <ul class="tab-group cl-effect-4">
        <li class="tab active"><a href="#signin-agile">登录</a></li>
		       
    </ul>
    <div class="tab-content">
        <div id="signin-agile">   
			<form action="${pageContext.request.contextPath }/user_loginDo"   method="post">
				
				<p class="header">用户名</p>
				<input type="text" style="font-family: '行书'" name="user.username" placeholder="请输入账号"  >
				<p class="header">密码</p>
				<input type="password" name="user.password" placeholder="请输入密码" >
				
				
				
				<input type="submit" class="sign-in" value="确认登录">
				
				
			</form>
		</div>
		 <div id="signin-agile">
		 </div>   
    </div><!-- tab-content -->
</div> <!-- /form -->	  
<p class="copyright">&copy; 2017 OA 为便捷而生</p>
<!-- js files -->
<script src='js/jquery.min.js'></script>
<script src="js/userlogin.js"></script>
</body>
</html>