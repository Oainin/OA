window.onload = function() {
	ajaxaa(0,"sheng");//加载页面时加载地区
	
}
/**
 * 执行注册
 * @returns
 */
function reg(){
	
	$.ajax({
		type : "POST",
		url : '${pageContext.request.contextPath }/user_regDo',
		data : {
			"user.username":$("#username").val(),
			"user.name":$("#name").val(),
			"user.superior":$("#superior").val(),
			"user.password":$("#password").val(),
			"user.sex":$('input:radio[name="user.sex"]:checked').val(),
			"user.phone":$("#phone").val(),
			"user.birthday":$("#birthday").val(),
			"user.userphoto":$("#userphoto").val(),
			"user.admin":$("#position").val(),
			"user.address":$("#adress").val(),
		},
		dataType : "json",
		success : function(msg) {
			if(msg){
				alert("注册成功");
				$("#reg_reg").css("display","none");
			}else{
				alert("注册失败");
			}
		}
	});
}
$(function(){
	$("#dada").css({//设置css
		"font-size": "16px",
		"cursor":"pointer"
	});
	$("#dada").click(function(){//添加点击事件
		$("#reg_reg").css("display","none");//隐藏
		$('#mengban').slideUp();
	});
	$("#reg").click(function(){
		if($("#reg_reg").css("display")!="block"){
			$('#mengban').slideDown();
			$("#reg_reg").css("display","block");//显示
		}else{
			$("#reg_reg").css("display","none");
			$('#mengban').slideUp();
		}
	});

	$("#username").change(function(){//值改变时给赋值
		$("#name").val($("#username").val());
	});
	
	$.ajax({
		type : "POST",
		url : '${pageContext.request.contextPath }/user_messge',
		data : {},
		dataType : "json",
		success : function(msg) {//获取当前登陆人的id
			$("#superior").val(msg.t.uid);
		}
	});
	
	$("#regss").click(function(){//注册
		reg();
	});
	//alert($("#signin-agile div input").val());
})

/**
 * 所在地区
 * @param parent_id
 * @param selectid
 * @returns
 */
function ajaxaa(parent_id, selectid) {
	$.ajax({
		url : "/OA/area_select",
		type : "post",
		data : {
			"area.id" : parent_id
		},
		dataType : "json",
		async : true,
		success : function(data) {
			var select = $("#" + selectid);
			select.empty();
			for (var i = 0; i < data.length; i++) {
				var option = $("<option></option>");
				option.val(data[i].id);
				option.text(data[i].name);
				select.append(option);
			}
			var nid = select.val();
			if (selectid =="qu") {
				var adresss=$("#adress");
				var i=$("#sheng option:selected").text()+$("#shi option:selected").text()+$("#qu option:selected").text();
				adresss.val(i);
			}
			if (selectid == 'sheng') {
				ajaxaa(nid, 'shi');
			} else if (selectid == 'shi') {
				ajaxaa(nid, 'qu');
			}
		}
	});
}