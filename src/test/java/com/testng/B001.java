package com.testng;

import org.testng.annotations.Test;

public class B001 {

	// we need to @Test annotation for Test NG, if we use TestNG annotation we don't
	// need main method

	@org.testng.annotations.Test
	public void BTest1() {

		System.out.print(this.getClass().getName() + " ");
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());

	}

	@Test
	public void BTest2() {

		System.out.print(this.getClass().getName() + " ");
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());

	}

	@Test
	public void CTest1() {

		System.out.print(this.getClass().getName() + " ");
		System.out.println(new Throwable().getStackTrace()[0].getMethodName());

	}

}
