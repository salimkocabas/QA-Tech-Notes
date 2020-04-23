package com.testng;

import org.testng.annotations.Test;

public class A001 {

	// we need to @Test annotation for Test NG, if we use TestNG annotation we don't
	// need main method

	@org.testng.annotations.Test
	public void ATest1() {

		System.out.print(this.getClass().getName()+ " ");
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());

	}

	@Test
	public void ATest2() {
		
		System.out.print(this.getClass().getName()+ " ");
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());

	}

}
