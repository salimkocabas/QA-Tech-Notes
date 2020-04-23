package com.practice.ud.basic;

import org.openqa.selenium.chrome.ChromeDriver;

/* Initialize WebDriver
 *  get url
 *  
 */

public class _000_Chrome_Driver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/my.Codes/my.World/Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);

		driver.quit();

	}

}
