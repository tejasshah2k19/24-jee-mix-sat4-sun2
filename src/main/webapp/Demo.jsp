<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome JSP</h2>

<%
ArrayList<Integer> list = new ArrayList<Integer>();
int a=10;
		int b = 20;
		int c = a + b;
%>

ANS = <%=c %>

<br>

<%=a %> + <%=b %> = <%=c %>

<br>
c = <%out.print(c); %>

</body>
</html>