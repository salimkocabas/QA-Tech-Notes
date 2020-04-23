package com.practice.ud.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _005_FaceBook3_Username_All {

	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver.get("http://facebook.com");

/*
 Facebook username & password html code 
 <input type="email"  class="inputtext login_form_input_box" name="email" id="email"  data-testid="royal_email">
 */

		// xPath //tagname[@attribute='value']
		WebElement userNameXpath = driver.findElement(By.xpath("//input[@type='email']"));
		System.out.println(userNameXpath.toString());
		userNameXpath.sendKeys("xPath....");
		Thread.sleep(1000);

		userNameXpath.clear();

		// cssSelector tagname[attribute='value']
		WebElement userNameCss = driver.findElement(By.cssSelector("input[type='email']"));
		userNameCss.sendKeys("CSS....");
		System.out.println(userNameCss.toString());
		Thread.sleep(1000);

		userNameCss.clear();


		// only value (id=value)
		WebElement userNameById = driver.findElement(By.id("email"));
		userNameById.sendKeys("by.id");
		System.out.println(userNameById.toString());
		Thread.sleep(1000);

		userNameById.clear();

		// only value (name=value)
		WebElement userNameByName = driver.findElement(By.name("email"));
		userNameByName.sendKeys("by.name");
		System.out.println(userNameByName.toString());


		// we can not find element with class name because class name inclufes <space>

		// Thread.sleep(1000);
		// driver.quit();
	}

}
