<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>上传和保存用户的信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/usermessage_upexcelDo" method="POST" enctype="multipart/form-data">
    <input type="file" name="upload" multiple="multiple">
    <!--<input type="text" name="filesName">-->
    <input type="submit" value="上传">
</form>
</body>
</html>