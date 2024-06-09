<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%
			//get all cookies 
			
			//forEach x -> getName().equasls("userName") -> true | false
			
			//response.sendRedirect(arg0)
		%>

	<c:if test="${cookie.userName  == null}">
 		<c:redirect url="CookieLogin.jsp"></c:redirect>
 	</c:if>
	 
	<h2>Cookie Home</h2>





	Welcome , ${cookie.userName.value }
	<Br>
	<Br>

	
	 
	
 
</body>
</html>