package com.comcast.orgtest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="smokeTest")
	public void createOrg1Test() {
		System.out.println("execute org 1");
		
	}
	@Test(groups="smokeTest")
	public void createOrg2Test() {
		System.out.println("execute org 2");
		
	}
	@Test(groups="regressionTest")
	public void createOrg3Test() {
		System.out.println("execute org 3");
		
	}

}
