package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/OddEvenServlet")
public class OddEvenServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String numStr = request.getParameter("num");
	
		int num = Integer.parseInt(numStr);//method 2 
	
		if(num%2==0) {
			request.setAttribute("msg", "EVEN");
		}else {
			request.setAttribute("msg", "ODD");
		}
		
		request.setAttribute("num", num);
		
		RequestDispatcher rd = request.getRequestDispatcher("OddEvenOutput.jsp");
		rd.forward(request, response);
		
		
	}
}
