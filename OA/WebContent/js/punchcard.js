$(function() {
	messgeindex();
	bmap();
	cardimg();
	$('table').css("background","#fff");
	$('table tr:odd').css("background","#eee");
	$.ajax({//获取用户相关所有信息包括是否登录判断
		type : "POST",
		url : '${pageContext.request.contextPath }/user_dcard',
		data : "",
		success : function(msg) {
			var str=JSON.parse(msg);
			if(!str.flag){
			
			$('#upbutton').attr("disabled","disabled");
			
			}
		}
});
});
function messgeindex(){
	$.ajax({//获取用户相关所有信息包括是否登录判断
		type : "POST",
		url : '${pageContext.request.contextPath }/user_messge',
		data : "",
		success : function(msg) {
		//	alert(msg);
           var str=JSON.parse(msg);
           $('#name').text(str.t.name);
           $('#name').attr("uid",str.t.uid);
           $('table').css("background","#fff");
	      // $('#nowtime').text(str.t.logintime);
	      setInterval(function() {
			
	       times();
		}, 1000);
		}
		
	});
}
function times() {//时间方法体
	var timer = new Date();
	var h = timer.getHours();
	var m = timer.getMinutes();
	var s = timer.getSeconds();
	var y = timer.getFullYear();
	var M = timer.getMonth() + 1;
	var D = timer.getDate();
	$('#nowtime').text(fom(h) + ":" + fom(m) + ":" + fom(s));
	$('#cardtime').val(fom(h) + ":" + fom(m) + ":" + fom(s));
	if(parseInt(h)>11){
	    $('#upbutton').attr("disabled","disabled");
	    
	}
}
function fom(a) {//判断时间是否单数
	if (a < 10) {
		a = "0" + a;
		return a;
	} else {
		return a;
	}
}
function getLocation()
{
if (navigator.geolocation)
  {
  navigator.geolocation.getCurrentPosition(showPosition);
  }

}
function showPosition(position)
{
//alert("Latitude: " + position.coords.latitude + "\nLongitude111: " + position.coords.longitude);
var a=position.coords.longitude;
var b=position.coords.latitude;
alert(a+b);
//$('#location').text("经度为"+a+"纬度为"+b);
}
function bmap(){
    var map, geolocation;
    //加载地图，调用浏览器定位服务
    map = new AMap.Map('container', {
        resizeEnable: true
    });
    map.plugin('AMap.Geolocation', function() {
        geolocation = new AMap.Geolocation({
            enableHighAccuracy: true,//是否使用高精度定位，默认:true
            timeout: 10000,          //超过10秒后停止定位，默认：无穷大
            buttonOffset: new AMap.Pixel(10, 20),//定位按钮与设置的停靠位置的偏移量，默认：Pixel(10, 20)
            zoomToAccuracy: true,      //定位成功后调整地图视野范围使定位位置及精度范围视野内可见，默认：false
            buttonPosition:'RB'
        });
        map.addControl(geolocation);
        geolocation.getCurrentPosition();
        AMap.event.addListener(geolocation, 'complete', onComplete);//返回定位信息
        AMap.event.addListener(geolocation, 'error', onError);      //返回定位出错信息
    });
}
    //解析定位结果
    function onComplete(data) {
        var str=['定位成功'];
        str.push('经度：' + data.position.getLng()+'&nbsp;纬度：' + data.position.getLat());
             $('#local').val(data.position.getLng()+'-'+data.position.getLat());
        if(data.accuracy){
             str.push('精度：' + data.accuracy + ' 米');
        }//如为IP精确定位结果则没有精度信息
       // str.push('是否经过偏移：' + (data.isConverted ? '是' : '否'));
        document.getElementById('location').innerHTML = str.join('<br>');
    }
    //解析定位错误信息
    function onError(data) {
        document.getElementById('location').innerHTML = '定位失败';
    }
    function cardimg() {
    	var timer = new Date();
    	var h = timer.getHours();
    	var m = timer.getMinutes();
    	var s = timer.getSeconds();
    	var hh=parseInt(h);
    	if(hh<=9 && hh>5){
    		var img6="<img src='/OA/img/1119222.png' />";
        	var p3="<span style='font-size:30px;color:#bbb;'>按时签到加油加油！！！</span>";
        	$('#imgsco').append(img6);
        	$('#imgsco').append(p3);
        	var p3="<span style='font-size:30px;color:#bbb;'>！！！哦饭早吃要</span>";
        	var img6="<img src='/OA/img/1119244.png' />";
        	$('#imgsco1').append(img6);
        	$('#imgsco1').append(p3);
    	}else if(hh>9 && hh<11){
    	var img4="<img src='/OA/img/1119242.png' />";
    	var p1="<span style='font-size:30px;color:#aaa;'>你迟到了哟！！！</span>";
    	var p2="<span style='font-size:30px;color:#bbb;'>！！！了样这别次下</span>";
    	var img5="<img src='/OA/img/1119219.png' />";
    	$('#imgsco').append(img4);
    	$('#imgsco').append(p1);
    	$('#imgsco1').append(p2);
    	$('#imgsco1').append(img5);
    }else{
    	var p4="<span style='font-size:30px;color:#bbb;'>！！！哟好不可这</span>";
    	var img8="<img src='/OA/img/1119245.png' />";
    	var p5="<span style='font-size:30px;color:#bbb;'>今天可没有来哟！！！</span>";
    	var img7="<img src='/OA/img/1119238.png' />";
    	$('#imgsco').append(img8);
    	$('#imgsco').append(p5);
    	$('#imgsco1').append(p4);
    	$('#imgsco1').append(img7);
    	
    }
    	}
 function upcard() {
 
	$.ajax({
		type:"post",
		url:"${pageContext.request.contextPath }/user_cardDo",
		data:"location="+$('#location').text()+"&local="+$('#local').val(),
		success:function(msg){
            var str=JSON.parse(msg);
            if(str.flag){
                $('#upbutton').attr("disabled","disabled");
            	$('#mengban').slideDown();
            	$('#messge').slideDown();
            	$('#messgecon').html("<p>今天已打卡成功</p>");
            	$('#closemessge').click(function() {//关闭显示信息界面
            		$('#mengban').slideUp();
            		$('#messge').slideUp();
            	});
            }
		}
	});
}
