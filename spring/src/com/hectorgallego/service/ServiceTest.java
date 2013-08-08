package com.hectorgallego.service;

import com.hectorgallego.logic.SimpleLogicTest;

public class ServiceTest {

	private SimpleLogicTest simpleLogicTest;
	
	public void setSimpleLogicTest(SimpleLogicTest simpleLogic) {
		this.simpleLogicTest = simpleLogic;
	}
	
	public String sayHello(){
		
		return simpleLogicTest.sayHello();
	}
	
}
