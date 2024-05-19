package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");

		// validation

		boolean isError = false;

		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		}else {
			request.setAttribute("firstNameValue", firstName);
		}

		if (gender == null) {
			isError = true;
			request.setAttribute("genderError", "Please Select Gender");
		}else {
			request.setAttribute("genderValue", gender);
		}

		if (city.equals("-1")) {
			isError = true;
			request.setAttribute("cityError", "Please Select City");
		}else {
			request.setAttribute("cityValue", city);
		}

		if (isError == true) {
			// go back to Registration.jsp
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request, response);
		} else {
			// send to Home.jsp
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
			
		}
	}
}





