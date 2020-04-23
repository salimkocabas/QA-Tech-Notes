package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _009_tabTest_FireFoxGivesError {

	public static void main(String[] args) {

		// FIREFOX web elementi bulamiyor

		String url = "https://www.rahulshettyacademy.com/#/index";
		String browser = "firefox";
		setUp(browser, url);

		// xPath firefox couldn't find the element
		WebElement regButtonXpath=driver.findElement(By.xpath("//a[@class='theme-btn register-btn']"));
		System.out.println(regButtonXpath);
		
		


	}

}
