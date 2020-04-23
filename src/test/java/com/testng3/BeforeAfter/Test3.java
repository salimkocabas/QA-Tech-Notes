package com.testng3.BeforeAfter;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {

	// we need to @Test annotation for Test NG, if we use TestNG annotation we don't
	// need main method

	@BeforeSuite
	public void Start() {
		System.out.println("******   TEST STARTED *******");
	}

	@AfterSuite
	public void Finish() {
		System.out.println("******   TEST FINISHED *******");
	}

	@BeforeMethod
	public void Space() {
		System.out.println("-----------------------------------");
	}

	@Test(priority = 1)
	public void CheckMail() {
		System.out.println("CheckMail");
	}

	@Test(priority = 2)
	public void CreateAdmin() {
		System.out.println("Create Admin User");
	}

	@Test(priority = 3)
	public void CheckAdmin() {
		System.out.println("Check admin user, shown on web page");
	}

	@Test(priority = 4)
	public void deleteAdmin() {
		System.out.println("delete Admin");
	}

}
