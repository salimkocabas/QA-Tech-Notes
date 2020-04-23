package com.practice.ud.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _000_FireFoxDriver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Udemy/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.quit();

	}

}
