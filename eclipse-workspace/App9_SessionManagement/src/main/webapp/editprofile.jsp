<%@page import="pack1.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update details</title>
<style type="text/css">

body{
 display: flex;
 justify-content: center;
 align-items: center;
 font-family: cursive;
 flex-direction: column;
 margin: 0;
 line-height: 2.0;
 font-weight: bold;
 
 }
 
 .main2{
 text-align: center;
 width:500px;
 border-radius: 15px;
 padding: 10px 20px;
 border-color: black;
 border: 5px;
 border-style: solid;
 }
input{

 display: block;
 border-radius: 10px;
 text-align:left;
 font-weight: 600;
 font-size: small;
 width:75%;
 font-style: italic;
 box-sizing: border-box;
 margin-bottom: 15px;
 border-color: black;
 padding: 10px
 }
 lable{
 display: flex;
 margin: 0;
 
 }
 button {
 display:flex;
 justify-content:center;
 margin:0;
 width:100%;
 padding: 15px;
 cursor:pointer;
 border-radius: 10px;
 color:white;
 font-weight: bold;
 background-color: navy;
 }
  .button:hover {
	background-color:green;
	color: black;
	font-weight: bold;
}
</style>
</head>
<body>


<%
  UserBean bean=(UserBean)application.getAttribute("UBean");
String fname=(String)request.getAttribute("fname");
out.println("this Session belongs to :"+fname+"<br>");
%>
<div class="main2">
<form action="update" method="post">
    <lable for="fname">First Name:</lable>
    <input type="text" name="ufname" value=<%= bean.getFirstname() %>>
    <lable for="lname">Last Name:</lable>
    <input type="text" name="ulname" value=<%= bean.getLastname() %>>
    <lable for="age">age:</lable>
    <input type="text" name="uag"  value=<%= bean.getAge() %>>
    <lable for="mid">Mail Id:</lable>
    <input type="text" name="umail" value=<%= bean.getMail_id() %>>
    <lable for="pnum">Phone Number:</lable>
    <input type="text" name="uponum" value=<%= bean.getPhone_no() %>>
    
    <button type="submit" class="button">update</button>
 
</form>
</div>
</body>
</html>