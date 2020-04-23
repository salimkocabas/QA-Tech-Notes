package com.practice.ud.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Initialize WebDriver
 *  get url
 *  
 */

public class _001_GetClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		driver.get("http://www.google.com");

		Thread.sleep(1000);

		System.out.println("\n:driver.getCurrentUrl()");
		System.out.println(driver.getCurrentUrl());

		System.out.println("\n:driver.getTitle()");
		System.out.println(driver.getTitle());

		System.out.println("\n:driver.getClass()");
		System.out.println(driver.getClass());
		
		System.out.println("\n:Current Class Name");

		System.out.println(_001_GetClass.class);


		System.out.println("\n:driver.getWindowHandle()");
		System.out.println(driver.getWindowHandle());


		System.out.println("\n:driver.getPageSource()");
		// print web page to console
		//System.out.println(driver.getPageSource());

		
		
		Thread.sleep(1000);
		driver.quit();
	}

}
