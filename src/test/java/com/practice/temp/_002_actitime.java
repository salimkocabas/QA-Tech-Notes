package com.practice.temp;

import static com.utils.CommonMethods.waitSec;
import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class _002_actitime {

	// public static void main (String[] args) {

	@Test
	public void test() {

		String url = "https://www.actitime.com/";
		String browser = "chrome";
		setUp(browser, url);

		driver.findElement(By.xpath("//a[@class='button button--header']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Albert");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Einstein");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("albert@gmail.com");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("None");

		
		
		waitSec(2);

		tearDown();

	}

}
