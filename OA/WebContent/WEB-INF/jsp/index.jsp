<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OA办公自动化主界面</title>
<link type="text/css" rel="stylesheet" href="/OA/css/index.css" />
<link type="text/css" rel="stylesheet" href="/OA/css/foot.css" />
<link type="text/css" rel="stylesheet" href="/OA/css/regs.css" />
<script src="/OA/js/img.js"></script>
<script type="text/javascript" src="/OA/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/OA/js/ajaxfileupload.js"></script>
<script type="text/javascript" src="/OA/js/index.js"></script>
<script type="text/javascript" src="/OA/js/foot.js"></script>
<script type="text/javascript" src="/OA/js/reg.js"></script>

</head>
<body>
	<div id="reg_reg">
		<div style="margin-top: 70px;width: 500px" class="form-w3ls">
		<div style="width: 20px;height: 20px;float: right;"><span id="dada">X</span></div>
		    <ul class="tab-group cl-effect-4">
		        <li class="tab active">
		       		<a>注册</a>
		       	</li>
		    </ul>
		
	    <div class="tab-content">
	        <div id="signin-agile" style="display: block;">   
				<form action="/OA/user_regDo" method="post" >
					<div><span>账号：</span><input style="height:21.11px " id="username" type="text" name="user.username"></div>
					<input id="name" type="hidden" name="user.name">
					<input id="superior" type="hidden" name="user.superior">
					<div><span>密码：</span><input id="password" type="password" name="user.password"></div>
					<div>
						<span>性别：</span>
						<input id="sex" type="radio" name="user.sex" value="男" checked="checked"><span>男</span>
						<input id="sex" type="radio" name="user.sex" value="女"><span>女</span>
					</div>
					<div><span>手机：</span><input id="phone" type="tel" name="user.phone"></div>
					<div><span>出生：</span><input id="birthday" type="date" name="user.birthday"></div>
					<input id="userphoto" type="hidden" value="/OA/img/HarryPotter.png" name="user.userphoto">
					<div>
						<span>职位：</span>
						<select id="position" name="user.admin">
							<option value="0" selected="selected">员工</option>
							<option value="1">管理员</option>
							<option value="2">总经理</option>
							<option value="3">项目经理</option>
						</select>
					</div>
					<div id="addresss"><span>地址：</span>
						<select id="sheng" onchange="ajaxaa(this.value,'shi')"></select>
						<select id="shi" onchange="ajaxaa(this.value,'qu')" ></select>
						<select id="qu" ></select><span>区/县</span>
					</div>
					<input id="adress" type="hidden" name="user.address"/>
					<input id="regss" type="button" class="sign-in" value="开始注册">
				</form>
			</div>
	    </div>
	</div>
	</div>
	<div id="bodyb"></div>
	<!-- 负责背景图蒙版 可以修改透明度 -->
	<div id="header">
		<div id="logoortime">
			<!-- 上部div负责logo和时间  -->
			<h1 id="logo">OA办公自动化系统</h1>
			<!-- 添加系统logo -->
			<div id="timeorday">
				<p id="time"></p>
				<!--时间显示  -->
				<p id="days"></p>
			</div>
		</div>
		<div id="nav">
			<!-- 显示导航工具 -->
			<img id="startmemu" width="30" height="30" src='/OA/img/menu26.png'/>
			<!-- 菜单图标 -->
			<p id="onnav">
				<span onclick="desktop()">桌面</span>
			</p>
			<!--跳转页面  -->
			<div id="con">
				<!-- 控制按钮图标 -->
				<a href='${pageContext.request.contextPath }/user_clean'>
					<img width="30" height="30" src='/OA/img/password_1.png'/>
				</a>
				<img width="30" height="30" src='/OA/img/speech-bubble.png'/>
				<img width="30" id="shezhi" height="30" src='/OA/img/wrench15.png'/>
				<img width="30" id="pifu" height="30" src='/OA/img/tshirt22.png'/>
				<img id="updown" width="30" height="30" src=''/>
			</div>
		</div>
	</div>
	<div id="iframecontent"><iframe id="pages" ></iframe></div>
	<div id="content">
		<div id="center">
			<div id="fileback">
				<!--添加应用  -->

			</div>
		</div>
	</div>
	<!--中心框架 负责功能卡显示 和页面显示  -->
	<div id="foot">
		<div id=down_remind>
			<div id=down_num>
				<span class="noc_iterm_num">共&nbsp; <span></span>&nbsp;条提醒</span>
			</div>
			<div id=down_infm>
				<div class=icon>
					<img id=icon1 src="/OA/img/music138.png">
				</div>
				<div class=icon>
					<img id=icon2 src="/OA/img/envelope.png">
				</div>
				<div class=icon>
					<img id=icon3 src="/OA/img/male69.png">
				</div>
				<div id="reg" class="icon">
					<img title="注册新员工" src="/OA/img/jiafriend.png">
				</div>
			</div>
		</div>
	</div>
	<div id=icon_news class=icon_img style="display: none">
		<div style="text-align: right;">
			<a id="icon_newsa" class="btn-white-big" href="javascript:;">X</a>
		</div>
		<div id="new_noc_title">
			<span class="noc_iterm_num">共&nbsp;<span>02</span>&nbsp;条提醒</span> 
			<span class="noc_iterm_history"> 
				<a id="check_remind_histroy" href="javascript:;" >查看历史记录</a>
			</span>
		</div>
		
		<div id="nocbox_tips"></div>
		<div id="new_noc_list"></div>
		<div class="button">
			<a id="ViewAllNoc" class="btn-white-big" href="javascript:;">全部已阅</a> 
			<a id="ViewDetail" class="btn-white-big" href="javascript:;">全部详情</a>
		</div>
	</div>
	
	<div id=icon_infm class=icon_img style="display: none">
		<div style="text-align: right;">
			<a id="icon_infma" class="btn-white-big" href="javascript:;">X</a>
		</div>
	</div>
	<div id=icon_pope class=icon_img style="display: none">
		<div style="text-align: right;">
			<a id="icon_popea" class="btn-white-big" href="javascript:;">X</a>
		</div>
		<div id=department ></div>
	</div>
	<!--页脚显示 显示在线人数、通知等  -->
	<div id="memu">
		<!--菜单div  -->
		<div id="username">
			<!-- 用户信息div -->
			<p id="nameid"></p>
				<!--用户名显示  -->
				<img id="userimg" width="50" height="50" src=''>
		</div>
		<!--用户头像显示  -->
		<div id="memuclass" style=" overflow-x:auto; overflow-y:auto;">
			<table id="allapps">
			
			</table>
		</div>
		<div id="memucenter">
			<ul>
				<li onclick="desktop()">我的桌面</li>
				<li><img src='/OA/img/1-4.png'/></li>
				<li>我的桌面</li>
				<li><img src='/OA/img/1-4.png'/></li>
				<li>我的桌面</li>
				<li><img src='/OA/img/1-4.png'/></li>
				<li>我的桌面</li>
				<li><img src='/OA/img/1-4.png'/></li>
			</ul>
		</div>
		<!--菜单栏主类  -->
	</div>
	<div id="mengban"></div>
	<!--网页使用蒙版  -->
	<div id="messge">
		<p id='closemessge'>X</p>
		<h2 id="titles"></h2>
		<div id="messgecon"></div>
	</div>
</body>
</html>