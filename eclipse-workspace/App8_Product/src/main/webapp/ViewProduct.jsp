<%@ page import="java.util.Iterator" %>
<%@ page import="pack1.ProductBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   ArrayList <ProductBean>al=(ArrayList <ProductBean>)request.getAttribute("List");
    out.println("<h5>");
    out.println("<center>");
    if(al.size()==0)
    {
    	out.println("product details are NOT available...!");
    }
    else
    {
    	Iterator<ProductBean> i=al.iterator();
    	while(i.hasNext())
    	{
    		ProductBean pb=i.next();
    		out.println(pb.getPid()+" "+pb.getPname()+" "+pb.getPprice()+" "+pb.getPqty());
    	}
    	out.println("</h5>");
        out.println("</center>");
    }
%>
</body>
</html>