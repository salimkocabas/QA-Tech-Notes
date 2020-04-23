package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;
import static com.utils.CommonMethods.*;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class _012_Css {

	@Test
	public void test() {
	
	
	/*
	 * 
	 * xpath  	//tagname[@attribute='value']
	 * css		tagname[attribute='value']
	 * 			#value
	 * 			
	 * sample :
	 * css 		: div[class='identity first']
	 * xpath	: //div[@class='identity first'] --> find under the specified tag name that 'div'
	 * 			: //*[@class='identity first']   --> find anywhere
	 * 
	 */
	
	
	setUp("chrome","https://login.salesforce.com/");
	
	WebElement userName_1=driver.findElement(By.cssSelector("[id='username']"));
	userName_1.sendKeys("0000000000000000000000");
	waitSec(2);
	userName_1.clear();
	
	
	
	// #username = [id='username']
	WebElement userName_2=driver.findElement(By.cssSelector("#username"));
	userName_2.sendKeys("9999999999999999999999");
	
	
		
	
	
	
	tearDown();
	}
	
	
	
	
	
}
