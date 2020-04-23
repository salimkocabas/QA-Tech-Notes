package com.practice.ud.basic;

import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.utils.CommonMethods.*;

public class _025_Scope {

	public static void main(String[] args) {

		String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
		String browser = "chrome";
		setUp(browser, url);

		// 1 : count of links in the page
		System.out.println("# of  links on home page              : " + driver.findElements(By.tagName("a")).size());

		// drill down to inside of driver
		// limiting WebDriver scope
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

		// 2: count of links in footer area
		System.out.println(
				"# of  links on footer                 : " + footerDriver.findElements(By.tagName("a")).size());

		// 3: count of links in first column in footer area
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(
				"# of  links on first columnt/foot page : " + columnDriver.findElements(By.tagName("a")).size());

		// 4: open links | footer area | first column|

		// first link refers to same page, we start 2nd element as index# is 1

		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
			waitSec(5);
			System.out.println(driver.getTitle());

		}

		//tearDown();

	}

}
