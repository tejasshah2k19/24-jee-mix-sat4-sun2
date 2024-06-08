package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieLoginServlet")
public class CookieLoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String userName = request.getParameter("userName");
		String password = request.getParameter("password"); 
		
		
		if(password.equals("admin")) {
			//userName ---> cookie
			
			//dataName : dataValue 
			Cookie c = new Cookie("userName", userName); //create 
			response.addCookie(c);//1 year expired 
			
			response.sendRedirect("CookieHome.jsp");
		}else {
			//invalid credentials 
			response.sendRedirect("CookieLogin.jsp");
		}
		System.out.println("hi...");
		System.out.println("bye....");
	
	}
}
