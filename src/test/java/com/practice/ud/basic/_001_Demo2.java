package com.practice.ud.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Initialize WebDriver
 *  
 *  navigate back to previouse url
 *  navigate.to(url);
 *  navigate forward
 *  
 */

public class _001_Demo2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		driver.get("http://www.google.com");
		Thread.sleep(1000);
		
		driver.navigate().to("http://www.apple.com");
		Thread.sleep(1000);
		
		driver.navigate().to("http://www.google.com");
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.quit();

	}

}
