package com.testng;

import org.testng.annotations.Test;

public class B002 {

	// we need to @Test annotation for Test NG, if we use TestNG annotation we don't
	// need main method

	@org.testng.annotations.Test
	public void BTest3() {

		System.out.print(this.getClass().getName()+ " ");
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());

	}

	@Test
	public void BTest4() {

		System.out.print(this.getClass().getName()+ " ");
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());

	}

}
