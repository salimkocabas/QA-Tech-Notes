package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _010__010_click_tab_ {

	public static void main(String[] args) {

		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		String browser = "firefox";
		setUp(browser, url);

		WebElement tab = driver.findElement(By.xpath("//a[@id='opentab']"));
		tab.click();

		tearDown();

	}

}
