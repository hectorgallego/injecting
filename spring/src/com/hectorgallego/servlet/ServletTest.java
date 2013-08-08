package com.hectorgallego.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.hectorgallego.service.ServiceTest;

public class ServletTest implements HttpRequestHandler {

	private ServiceTest serviceTest;
	
	public void setServiceTest(ServiceTest serviceTest) {
		this.serviceTest = serviceTest;
	}


	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().write((serviceTest.sayHello()));
		
	}

}
