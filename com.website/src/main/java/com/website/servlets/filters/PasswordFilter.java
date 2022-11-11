package com.website.servlets.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class PasswordFilter
 */
@WebFilter("/signup")
public class PasswordFilter extends HttpFilter implements Filter {
       
   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String pass = request.getParameter("pass");
		String password = request.getParameter("password");
		
		
		if(pass.equals(password))chain.doFilter(request, response);
		else {
			RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
			response.getWriter().println("<p class='"+"text-danger"+"' >Password does not match! try again</p>");
			rd.include(request, response);
		}
		
	}

}
