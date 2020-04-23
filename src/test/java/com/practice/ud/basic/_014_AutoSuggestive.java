package com.practice.ud.basic;

import static com.utils.CommonMethods.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;



public class _014_AutoSuggestive {
	
	public static void main (String[] args) {
		
		
		setUp("chrome","https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement tab = driver.findElement(By.xpath("//input[@name='q']"));
		tab.sendKeys("Hello");
		waitSec(2);
		tab.sendKeys(Keys.ARROW_DOWN);
		tab.sendKeys(Keys.ARROW_DOWN);
		tab.sendKeys(Keys.ARROW_DOWN);
		waitSec(2);
		tab.sendKeys(Keys.ENTER);
		
		
		tearDown();
		
	}
	
	
	

}
