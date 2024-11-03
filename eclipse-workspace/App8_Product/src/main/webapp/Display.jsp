<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>
<center>
<%
      String pname=(String)request.getAttribute("msg");
      out.println(pname);
%>
        
        <a href="product.html">Add Product Details</a><br><br>
        <a href="view">View product Details</a>
</center> 
</h2>       
</body>
</html>