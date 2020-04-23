package com.practice.ud.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Initialize WebDriver
 *  
 *  get url
 *  get title
 *  
 */

public class _001_Demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());


		Thread.sleep(1000);
		driver.quit();

	}

}
