package com.hectorgallego.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.hectorgallego.logic.SimpleLogicTest;
import com.hectorgallego.service.ServiceTest;

public class ServletTest extends GenericServlet {


	private static final long serialVersionUID = -8282741007202862062L;

	private ServiceTest serviceTest;
	
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		
		
		serviceTest = new ServiceTest(); //here is the problem, this code is going to be repeated in all the classes
		
		response.getWriter().write(serviceTest.SayHello());
		
	}

}
