package com.testng2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest2_Dependency {

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

	@Test
	public void Login() {

		System.out.println("Login Web Page");

	}

	@Test(dependsOnMethods={"Login"})
	public void CreateUser() {

		System.out.println("CreateUser");

	}

	@Test(dependsOnMethods={"CreateUser"})
	public void CheckUser() {

		System.out.println("Check user, shown on web page");

	}

	@Test(dependsOnMethods={"CheckUser"})
	public void deleteUser() {

		System.out.println("delete User");

	}

}
