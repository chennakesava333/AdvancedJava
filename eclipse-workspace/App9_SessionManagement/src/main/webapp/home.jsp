<%@page import="pack1.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home page</title>
</head>
<body>
<h1>
<center>
<%
UserBean bean=(UserBean) application.getAttribute("UBean");
out.println("Welcome :"+bean.getFirstname()+"<br><br>");
%>
<a href="view">view profile</a><br><br>
<a href="logout">Logout</a><br><br>
</center>
</h1>
</body>
</html>