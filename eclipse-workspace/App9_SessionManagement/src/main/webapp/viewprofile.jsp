<%@page import="pack1.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view profile</title>
<style type="text/css">
p{
text-align:center;
font-size: 600;
font-weight: bold;
font-style: italic;
color: green;
background-color: orange;
font-size: x-large;
}
table {
justify-content:center;
border-color: black;
text-align: center
}
</style>
</head>
<body>
<h1>
<center>
<%
   String fname=(String)request.getAttribute("fname");
   UserBean bean=(UserBean)application.getAttribute("UBean");
   out.println("<p>this Session belongs to: "+fname+"</p><br>");
   out.println("<table border=1x>");
   out.println("<th >FIRSTNAME</th>");
   out.println("<th >LASTNAME</th>");
   out.println("<th >MAIL_ID</th>");
   out.println("<th >PHONENUMBER</th>");
   out.println("<th >AGE</th>");
   out.println("<tr><td>"+bean.getFirstname()+"</td><td>"+bean.getLastname()+"</td><td>"+bean.getMail_id()+"</td><td>"+bean.getPhone_no()+"</td><td>"+bean.getAge()+"</td></tr>");
   out.println("</table><br>");
%>
<a href="edit">Edit Profile</a><br><br>
<a href="logout">Logout</a>
</center>
</h1>
</body>
</html>