package com.practice.ud.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _003_Sales_Force_Com3 {
	static WebDriver driver = new ChromeDriver();

	/*
	 * 
	 * driver.findElement(By.cssSelector(<parameter>))
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		driver.get("http://login.salesforce.com");

		driver.findElement(By.cssSelector("#username")).sendKeys("username");
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#Login")).click();

		// Thread.sleep(1000);
		// driver.quit();
	}

}
