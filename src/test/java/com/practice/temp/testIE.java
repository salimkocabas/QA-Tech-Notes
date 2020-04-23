package com.practice.temp;

import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class testIE {

	public static void main(String[] args) {

		String url = "https://www.google.com";
		String browser = "IE";
		setUp(browser, url);
		
		WebElement tab = driver.findElement(By.xpath("//input[@name='q']"));
		tab.sendKeys("Hello World!!!");
		tab.submit();
		
		
		
	}

}
