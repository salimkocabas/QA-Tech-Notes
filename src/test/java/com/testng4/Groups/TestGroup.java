package com.testng4.Groups;

import org.testng.annotations.*;

/* Learn:   groups={"group name"}  | check XML
*			enabled=true  | test works
*			enabled=false | test doesn't work
*			timeOut=xxxms | wait for xxxms without responds not responding
*/


public class TestGroup {

	@BeforeTest(groups= {"Smoke"},enabled=true,timeOut=4000)
	public void setupDriver() {
		System.out.println();
		System.out.println("Before Test :" + new Throwable().getStackTrace()[0].getMethodName());
	}

	@AfterTest(groups= {"Smoke"},enabled=true)
	public void closeDriver() {
		System.out.println("After Test   :" + new Throwable().getStackTrace()[0].getMethodName());
		System.out.println();
	}

	@BeforeClass(groups= {"Smoke"})
	public void bfClass() {
		System.out.println("   Before Class:" + new Throwable().getStackTrace()[0].getMethodName());
	}

	@AfterClass(groups= {"Smoke"})
	public void afClass() {
		System.out.println("   After Class:" + new Throwable().getStackTrace()[0].getMethodName());
	}

	@Test(groups= {"Smoke"})
	public void Login() {
		System.out.println("        " + new Throwable().getStackTrace()[0].getMethodName());
	}

	@Test(dependsOnMethods = { "Login" })
	public void CreateUser() {
		System.out.println("        " + new Throwable().getStackTrace()[0].getMethodName());
	}

	@Test(dependsOnMethods = { "CreateUser" })
	public void CheckUser() {
		System.out.println("        " + new Throwable().getStackTrace()[0].getMethodName());
	}

	@Test(dependsOnMethods = { "CheckUser" })
	public void DeleteUser() {
		System.out.println("        " + new Throwable().getStackTrace()[0].getMethodName());
	}

}
