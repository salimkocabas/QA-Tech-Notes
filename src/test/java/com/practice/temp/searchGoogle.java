package com.practice.temp;

import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class searchGoogle {

	public static void main(String[] args) {

		String url = "https://google.com";
		String browser = "firefox";
		setUp(browser, url);

		WebElement tab = driver.findElement(By.xpath("//input[@name='q']"));
		tab.sendKeys("Hello World!!!");
		tab.submit();
		
		
		tearDown();

	}

}
