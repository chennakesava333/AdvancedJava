<%@page import="java.util.Iterator" %>
<%@page import="pack1.EmployeeBean" %>
<%@page import="java.util.ArrayList" %>

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
    ArrayList <EmployeeBean>al=(ArrayList <EmployeeBean>) request.getAttribute("List");
    out.println("<h3>");
    out.println("<center>");
    if(al.size()==0)
    {
    	out.println("Employee data not available");
    }
    else
    {
    	Iterator<EmployeeBean> i=al.iterator();
    	while(i.hasNext())
    	{
    		EmployeeBean eb=i.next();
    		out.println("<table border=1x><tr><td>"+eb.getEmpid()+"</td>"+"<td colspan=2>"+eb.getEmpfname()+"</td>"+"<td colspan=2>"+eb.getEmplname()+"</td>"+"<td colspan=2>"+eb.getEmpsal()+"</td>"+"<td colspan=2>"+eb.getEmpAddress()+"</td></tr></table>");
    	}
    	out.println("<h3>");
	    out.println("<center>");
    }
%>
</body>
</html>