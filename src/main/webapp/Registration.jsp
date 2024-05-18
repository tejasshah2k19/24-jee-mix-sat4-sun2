<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

</head>
<body>

	<div class="container-fluid">

		<div class="row">
			<div class="col-md-3"></div>

			<div class="col-md-6">
				<h2>Registration</h2>

				<%
				String firstNameError = (String) request.getAttribute("firstNameError");
				String genderError = (String) request.getAttribute("genderError");
				String cityError = (String) request.getAttribute("cityError");
				%>

				<form action="RegistrationServlet" method="post">
					FirstName : <input type="text" name="firstName"
						class="form-control" />
					<span class="text-danger"> 
					<%=firstNameError == null ? "" : firstNameError%>
					</span>
					<br> <br> Gender : Male <input type="radio" name="gender"
						value="male" /> Female <input type="radio" name="gender"
						value="female" />
					<%=genderError == null ? "" : genderError%>
					<br> <br> City : <select name="city" class="form-control">
						<option value="-1">Select City</option>
						<option value="ahd">Ahmedabad</option>
						<option value="gnr">Gandhinagar</option>
						<option value="srt">Surat</option>

					</select><%=cityError != null ? cityError : ""%>
					<br> <br> <input type="submit" value="Register"
						class="btn btn-primary" /> <input type="button" value="Cancel"
						class="btn btn-danger" />
				</form>

			</div>

			<div class="col-md-3"></div>

		</div>


	</div>


</body>
</html>