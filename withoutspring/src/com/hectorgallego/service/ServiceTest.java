package com.hectorgallego.service;

import com.hectorgallego.logic.SimpleLogicTest;

public class ServiceTest {
	
	private SimpleLogicTest simpleLogic;
	
	public ServiceTest(){ 
		this.simpleLogic = new SimpleLogicTest();
	}
	
	public String SayHello(){
		return simpleLogic.SayHello();
	}

}
