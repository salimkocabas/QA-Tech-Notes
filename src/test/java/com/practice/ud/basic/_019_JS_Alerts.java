package com.practice.ud.basic;

import static com.utils.CommonMethods.*;
import static com.utils.MyBaseClass.driver;

import org.openqa.selenium.By;

public class _019_JS_Alerts {

	public static void main(String[] args) {

		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		String browser = "chrome";
		setUp(browser, url);

		driver.manage().window().maximize();

		
		driver.findElement(By.cssSelector("#name")).sendKeys("James");
		takeScreenshot("alert01");
		driver.findElement(By.id("alertbtn")).click();
		

		System.out.println("Alert message :\n" + driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();

		tearDown();

	}
}
