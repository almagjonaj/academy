package com.akademia.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.akademia.entities.UserEntity;

@WebFilter
public class UserAuth implements Filter {

	private UserEntity sessionUser;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String root = req.getContextPath();
		String uri = req.getRequestURI();
		HttpSession session=req.getSession();

		boolean loggined = true;

		try {

			sessionUser = (UserEntity) req.getSession().getAttribute("");
			if (sessionUser.getUsername().isEmpty()) {
				loggined = false;
			}
			chain.doFilter(request, response);

		} catch (Exception e) {
			e.getMessage();
			loggined = false;
		}

		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
