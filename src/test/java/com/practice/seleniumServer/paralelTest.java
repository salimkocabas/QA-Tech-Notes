package com.practice.seleniumServer;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class paralelTest {

	@Test
	public static void testFirefox() throws MalformedURLException, InterruptedException {

		FirefoxOptions options = new FirefoxOptions();
		//options.setHeadless(true);
		DesiredCapabilities.firefox();

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		driver.get("http://www.mozilla.org");

		System.out.println("Current Title   : " + driver.getTitle());
		System.out.println("Current Browser : " + options.getBrowserName());

		driver.close();

	}

	@Test
	public static void testChrome() throws MalformedURLException, InterruptedException {

		ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		DesiredCapabilities.chrome();

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		driver.get("http://www.google.com");

		System.out.println("Current Title   : " + driver.getTitle());
		System.out.println("Current Browser : " + options.getBrowserName());

		driver.close();

	}

}
