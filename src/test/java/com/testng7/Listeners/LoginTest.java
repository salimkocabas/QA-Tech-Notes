package com.testng7.Listeners;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

	@Parameters({ "URL", "browser" })
	@BeforeTest()
	public void startDriver(String URL, String browser) {
		System.out.printf("%n%n>Initialize driver   [%s] with [%s] browser %n", URL, browser);
	}

	@AfterTest()
	public void closeDriver() {
		System.out.println(">Close driver");
	}

	@Test(dataProvider = "getData")
	public void Login(String username, String password) {
		System.out.printf("   >>> Login Test    >  Username : %-20s Password : %-10s %n", username, password);

		// if (username=="") { Assert.assertTrue(true);} fake faile

	}

	@Test()
	public void fakeError() {
		System.out.println(0 / 0);
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[4][2];

		// first row
		data[0][0] = "angel";
		data[0][1] = "correctPassword";

		// second row
		data[1][0] = "angel";
		data[1][1] = "wrongPassword";

		// third row
		data[2][0] = "angel";
		data[2][1] = ""; // empty password

		// forth row
		data[3][0] = ""; // empty username
		data[3][1] = ""; // empty password

		return data;
	}

}
