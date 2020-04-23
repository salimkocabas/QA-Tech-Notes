package com.practice.ud.basic;

import static com.utils.CommonMethods.waitSec;
import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class _0132_DropDownHidden {

	public static void main(String[] args) {

		String url = "https://ksrtc.in/oprs-web/guest/home.do";
		String browser = "chrome";
		setUp(browser, url);

		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");

		// be careful its hidden text you can not see it
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText()); // null

		// Java Script DOM can extract hidden elements
		// because Selenium cannot identify hidden elements (AJAK implementation)
		// investigate the properties of object if it have any hidden text

		// We Need Java Script Executer

		// more https://www.w3schools.com/js/js_htmldom_document.asp

		// write this command to browser
		// console: document.getElementById('fromPlaceName').value or
		// document.getElementById("fromPlaceName").value
		// but when use this code in Java change " = '
		// it prints the text on that place

		// Java Script Executer
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById('fromPlaceName').value"; // << add "return" get data
		String getText = null;

		Boolean found = false;

		for (int i = 0; i < 10; i++) { // try 10 times
			waitSec(1);
			getText = (String) js.executeScript(script);
			System.out.println(getText);

			if (getText.contentEquals("BENGALURU INTERNATION AIRPORT")) {
				System.out.println("Found");
				found = true;
				break;
			} else {
				driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			}

		}

		System.out.println("Result : " + found);

		tearDown();
	}

}
