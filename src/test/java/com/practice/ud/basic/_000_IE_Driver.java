package com.practice.ud.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class _000_IE_Driver {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.ie.driver", "D:/my.Codes/my.World/Drivers/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

		
		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.quit();

	}

}
