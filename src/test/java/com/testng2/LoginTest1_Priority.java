package com.testng2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest1_Priority {

	// we need to @Test annotation for Test NG, if we use TestNG annotation we don't
	// need main method

	@BeforeTest 
	public void setupDriver() {

		System.out.println("Setup Web Driver");

	}

	//do before test but do after setUpDriver
	@BeforeTest(dependsOnMethods={"setupDriver"})
	public void deleteCookies() {

		System.out.println("Delete Cookies");

	}

	@AfterTest
	public void closeDriver() {

		System.out.println("Close Driver");

	}

	@Test (priority=1)
	public void Login() {

		System.out.println("Login Web Page");

	}

	@Test(priority=2)
	public void CreateUser() {

		System.out.println("CreateUser");

	}

	@Test(priority=3)
	public void CheckUser() {

		System.out.println("Check user, shown on web page");

	}

	@Test(priority=4)
	public void deleteUser() {

		System.out.println("delete User");

	}

}
