<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false" isELIgnored="false"%>

<%@page import="java.util.Date" import="java.util.Scanner"%>
<%@page import="java.util.*"%>

<%@page autoFlush="true" buffer="8kb" errorPage="MyError.jsp"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>${error}

	<%=new Date()%>

	<%
	int a = 10;
	int b = 0;
	int c = a / b;
	%>

</body>
</html>