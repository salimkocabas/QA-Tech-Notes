package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _011_FaceBook_Name_WebElements {

	public static void main(String[] args) {

		String url = "https://www.facebook.com";
		String browser = "chrome";
		setUp(browser, url);

		List<WebElement> elements = driver.findElements(By.xpath(
				"//input[@data-type='text' and @name='firstname' or  @name='lastname' or @aria-label='Mobile number or email']"));

		System.out.println(elements.size());

		elements.get(0).sendKeys("FirstName");
		elements.get(1).sendKeys("LastName");
		elements.get(2).sendKeys("email@domain.com");

		driver.findElement(By.xpath("//input[@aria-label='Re-enter email']")).sendKeys("email@domain.com");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("xxxxx");


		
		tearDown();

	}

}
