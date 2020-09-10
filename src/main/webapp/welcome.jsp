<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome</title>
</head>
<%@ include file="header.jsp" %>
<body>

<% Object email=session.getAttribute("email");

    if( email.equals(null))
	{
	response.sendRedirect("login.jsp");
	}
	else
	{
	String name=session.getAttribute("name").toString();%>
	
Welcome <%=name %> 

<%} %>
</body>
</html>