package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListCookieServlet")
public class ListCookieServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// read cookie->

		// request
		Cookie c[] = request.getCookies();

		PrintWriter out = response.getWriter(); 
		response.setContentType("text/html");
		
		out.print("<Html>");
		out.print("<body>");
		
		for (Cookie x : c) {
			System.out.println(x.getName()+" ===> "+x.getValue());
			 out.println(x.getName()+" ===> "+x.getValue()+"<Br>");

		}
		out.print("</body>");
		out.print("</Html>");
		
		// response

	}
}
