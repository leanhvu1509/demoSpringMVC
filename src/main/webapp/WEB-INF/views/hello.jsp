<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giới thiệu bản thân</title>
</head>
<body>
	<h1>Xin chao!</h1>
	<h2>Tôi tên là: ${myuser.fullName}</h2>
	<p>Địa chỉ: ${myuser.address }</p>
	<p>Ngày sinh: ${myuser.birth }</p>
	<p>SĐT: ${myuser.phone }</p>
	
</body>
</html>