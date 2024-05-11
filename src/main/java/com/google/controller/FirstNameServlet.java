package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstNameServlet")
public class FirstNameServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		boolean isError = false;
		
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		}else {
			request.setAttribute("firstNameValue", firstName);
		}

		RequestDispatcher rd = null;
		if (isError == true) {
			// go back -- previous jsp
			
			
			rd = request.getRequestDispatcher("InputName.jsp");
			rd.forward(request, response);//
		} else {
			// next jsp
			rd = request.getRequestDispatcher("PrintName.jsp");
			rd.forward(request, response);

		}

	}
}
