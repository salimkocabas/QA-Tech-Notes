package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class _005_FaceBook4 {
	
	@Test
	public void test() {
		
		String url = "https://www.facebook.com";
		String browser = "chrome";
		setUp(browser, url);
		
		
		WebElement firstName= driver.findElement(By.xpath("//*[contains(@name,'firstname')]"));
		firstName.sendKeys("UserName");
				
		WebElement lastName= driver.findElement(By.xpath("//*[contains(@aria-label,'Last name')]"));
		lastName.sendKeys("LastName");
		
		
		
		
		
		
	}

}
