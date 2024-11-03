<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  //====Sctiptlet  tag========
//=====java code=========
  String name=request.getParameter("pname");  
  String id=request.getParameter("pid"); 
  String qty=request.getParameter("pqty"); 
  String price=request.getParameter("pprice"); 
  
  
  //========html code===========
  out.println("<center>");
  out.println("<h5> Product Name is :"+name+"</h5>");
  out.println("<h5> Product Id is :"+id+"</h5>");
  out.println("<h5> Product Quantity is :"+qty+"</h5>");
  out.println("<h5> Product Price is :"+price+"</h5>");
  out.println("</center>");
%>
</body>
</html>