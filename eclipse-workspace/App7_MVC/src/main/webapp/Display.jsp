<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
<center>
<%
String name=(String)request.getAttribute("msg");
out.println(name);
%>
               <a href="emp.html">Add Employee Details</a><br><br>
               <a href ="view">View Employee Details</a>
</center>
</h1>
</body>
</html>