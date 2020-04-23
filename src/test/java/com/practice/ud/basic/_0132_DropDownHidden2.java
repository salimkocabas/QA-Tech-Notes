package com.practice.ud.basic;

import static com.utils.CommonMethods.waitSec;
import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class _0132_DropDownHidden2 {

	public static void main(String[] args) {

		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		String browser = "firefox";
		setUp(browser, url);

		WebElement x = driver.findElement(By.id("autocomplete"));
		x.sendKeys("US");
		String expectedCountry="Cyprus";

		// Java Script Executor

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById('autocomplete').value";
		String getValue;

		Boolean result = false;

		for (int i = 0; i < 10; i++) {
			waitSec(1);
			getValue = (String) js.executeScript(script);
			System.out.println(getValue);
			if (getValue.contentEquals(expectedCountry)) {
				result = true;
				System.out.println("Found");
				break;
			} else {
				x.sendKeys(Keys.DOWN);				
			}

		}
		x.sendKeys(Keys.ENTER);
		
		System.out.println("Result : " + result);

		tearDown();
	}

}
