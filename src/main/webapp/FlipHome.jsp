<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include> 

<h2>Home</h2>

<a href="FlipCart.jsp">Cart</a> <br> 

<a href="FlipPayment.jsp">Payment</a><br>

<%@include file="Footer.jsp" %>

<%=headerAns %>
<%=footerAns %>

</body>
</html>