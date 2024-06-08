package com.google.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/OddEvenServlet")
public class OddEvenFilterRegex implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String numStr = request.getParameter("num");
		System.out.println("OddEvenFilterRegEx::doFilter()");

		boolean isError = false;

		if ( numStr.matches("[0-9]+") == false) {
			isError = true;
			request.setAttribute("numError", "Please Enter Valid Number");
		}
		//
		//
		//

		if (isError == true) {
			// go back
			System.out.println("ERROR");
			RequestDispatcher rd = request.getRequestDispatcher("OddEvenInput.jsp");
			rd.forward(request, response);
		} else {
			// go ahead
			System.out.println("SUCCESS");
			chain.doFilter(request, response);// go to the next filter or requested resource
		}

	}

	public void destroy() {
		// TODO Auto-generated method stub

	}
}
