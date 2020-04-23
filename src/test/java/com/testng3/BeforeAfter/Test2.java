package com.testng3.BeforeAfter;

import org.testng.annotations.*;

public class Test2 {

	@BeforeClass
	public void bfClass() {
		System.out.println(">>>>>>> Before Classs <<<<<<<<<");
	}

	@AfterClass
	public void afClass() {
		System.out.println(">>>>>>> After Classs <<<<<<<<<");
	}

	@BeforeTest
	public void setupDriver() {
		System.out.println(">>>>>>> Before Test <<<<<<<<<");
		System.out.println("Setup Web Driver");

	}

	// do before test but do after setUpDriver
	@BeforeTest(dependsOnMethods = { "setupDriver" })
	public void deleteCookies() {
		System.out.println(">>>>>>> Before Test <<<<<<<<<");
		System.out.println("Delete Cookies");
	}

	@AfterTest
	public void closeDriver() {
		System.out.println(">>>>>>> After Test <<<<<<<<<");

		System.out.println("Close Driver");

	}

	@Test
	public void Login() {

		System.out.println("Login Web Page");

	}

	@Test(dependsOnMethods = { "Login" })
	public void CreateUser() {

		System.out.println("CreateUser");

	}

	@Test(dependsOnMethods = { "CreateUser" })
	public void CheckUser() {

		System.out.println("Check user, shown on web page");

	}

	@Test(dependsOnMethods = { "CheckUser" })
	public void deleteUser() {

		System.out.println("delete User");

	}
	
	
	@AfterSuite
	public void ByBy() {

		System.out.println("By By");

	}
	

}
