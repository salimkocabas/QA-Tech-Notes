package com.practice.ud.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _004_Sales_Force_get_error_message {
	static WebDriver driver = new ChromeDriver();

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		driver.get("http://login.salesforce.com");

		WebElement userName=driver.findElement(By.cssSelector("#username"));
		WebElement password=driver.findElement(By.cssSelector("#password"));
		
		
		userName.sendKeys("apple");   //dummy username
		password.sendKeys("456456");   // dummy password
		Thread.sleep(1000);
		
		WebElement loginButton=driver.findElement(By.cssSelector("#Login"));
		loginButton.click();

		
		Thread.sleep(2000);
		
		//Option-1a: CSS
		// catch error message with wrong username+password
		WebElement errorMessageCSS=driver.findElement(By.cssSelector("div#error.loginError"));
		System.out.println(errorMessageCSS.toString());
		System.out.println(errorMessageCSS.getText());
		
		System.out.println();
		
		//Option-1b: CSS
		WebElement errorMessageCSS2=driver.findElement(By.cssSelector("#error"));
		System.out.println(errorMessageCSS2.toString());
		System.out.println(errorMessageCSS2.getText());
		
		System.out.println();
		
			
		
		//Option-2: XPATH
		// catch error message with wrong username+password
		WebElement errorMessageXpath=driver.findElement(By.xpath("//div[@id='error']"));
		System.out.println(errorMessageXpath.toString());
		System.out.println(errorMessageXpath.getText());
		
		
		System.out.println("done");

	}

}
