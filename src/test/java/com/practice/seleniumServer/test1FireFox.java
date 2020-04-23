package com.practice.seleniumServer;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test1FireFox {
	
	@Test
	public static void ff() throws MalformedURLException {

		// DesiredCapabilities for RemoteNode
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.LINUX);
		// dc.setPlatform(Platform.WINDOWS);

		// remote web driver
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);

		driver.get("http://www.cnn.com");
		System.out.println(driver.getTitle());


		driver.close();

	}
}
