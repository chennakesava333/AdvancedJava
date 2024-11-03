<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
<center>
<h1>
<%
    String data=(String)request.getAttribute("msg");
    String fname=(String)request.getAttribute("fname");
    out.println("thid Session belongs to:"+fname+"<br>");
    out.println(data+"<br>");
%>
<a href="view">view profile</a><br><br>
<a href="logout">Logout</a><br><br>
</h1>
</center>
</body>
</html>