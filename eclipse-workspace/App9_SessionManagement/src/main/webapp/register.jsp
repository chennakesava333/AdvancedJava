<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registration</title>
</head>
<body>
<center>
<h2>
<%
  String data=(String)request.getAttribute("msg");
  out.println(data);

%>
</h2>
</center>

<jsp:include page="index.html" />

</body>
</html>