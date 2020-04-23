package com.practice.misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.MyBaseClass;

public class _01_userName extends MyBaseClass{

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome","http://demo.guru99.com/test/newtours/");
		
		WebElement u_css1=driver.findElement(By.cssSelector("input[name='userName']"));
		u_css1.sendKeys("css1"); Thread.sleep(1000);u_css1.clear();
		
		
		WebElement u_xpath=driver.findElement(By.xpath("//input[@name='userName']"));
		u_xpath.sendKeys("xpath");
		
		
		
		
		
		tearDown();
		
		
		
		
		
	}

}
