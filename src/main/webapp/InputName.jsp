<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<% 
		String firstNameError = (String)request.getAttribute("firstNameError");//null
	
	%>
	<form action="FirstNameServlet" method="post">
		First Name : <input type="text" name="firstName"/>
		<span style="color: red"> 
			<%=firstNameError==null?"":firstNameError %> 
		</span>
		 <br><br>
		<input type="submit" value="Process"/>  
	</form>
</body>
</html>