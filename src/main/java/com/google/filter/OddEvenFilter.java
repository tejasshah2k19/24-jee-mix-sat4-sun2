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
public class OddEvenFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// HttpServletRequest req = (HttpServletRequest)request;
		// validation
		String numStr = request.getParameter("num");

		boolean isError = false;

		if (numStr == null || numStr.trim().length() == 0) {
			isError = true;
			request.setAttribute("numError", "Please Enter Number");
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

	public void init(FilterConfig arg0) throws ServletException {

	}

}
