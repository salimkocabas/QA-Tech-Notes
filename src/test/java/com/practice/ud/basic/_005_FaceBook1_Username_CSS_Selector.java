package com.practice.ud.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _005_FaceBook1_Username_CSS_Selector {

	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver.get("http://facebook.com");

/*
 Facebook username & password html code 
 <input type="email"  class="inputtext login_form_input_box" name="email" id="email"  data-testid="royal_email">
 */



		// cssSelector tagname[attribute='value']
		WebElement userNameCss1= driver.findElement(By.cssSelector("input[type='email']"));
		userNameCss1.sendKeys("CSS.1....");
		System.out.println(userNameCss1.toString());
		Thread.sleep(1000);

		userNameCss1.clear();
		
		
		
		// cssSelector tagname#value
		WebElement userNameCss2 = driver.findElement(By.cssSelector("input#email"));
		userNameCss2.sendKeys("CSS.2....");
		System.out.println(userNameCss2.toString());
		Thread.sleep(1000);

		userNameCss2.clear();
		
		
		
		// cssSelector #value
		WebElement userNameCss3 = driver.findElement(By.cssSelector("#email"));
		userNameCss3.sendKeys("CSS.2....");
		System.out.println(userNameCss3.toString());
		Thread.sleep(1000);

	}

}
