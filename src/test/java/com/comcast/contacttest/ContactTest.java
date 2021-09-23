package com.comcast.contacttest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups="regressionTest")
	public void createContatc1Test() {
		System.out.println("execute 1");
		
	}
	@Test(groups="regressionTest")
	public void createContatc2Test() {
		System.out.println("execute 2");
		
	}
	@Test(groups="smokeTest")
	public void createContatc3Test() {
		System.out.println("execute 3");
		
	}

}
