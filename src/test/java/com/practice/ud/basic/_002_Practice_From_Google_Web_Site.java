package com.practice.ud.basic;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class _002_Practice_From_Google_Web_Site {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver"); // chromedriver.exe in Windows PATH

		driver.get("http://www.google.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();
		Thread.sleep(5000);
		driver.quit();
	}
}
