package com.practice.ud.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _003_Sales_Force_Com2 {
	static WebDriver driver = new ChromeDriver();

	/*
	 * 
	 * driver.findElement(By.xpath(<parameter>))
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		driver.get("http://login.salesforce.com");

		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("username");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("password");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();

		// Thread.sleep(1000);
		// driver.quit();
	}

}
