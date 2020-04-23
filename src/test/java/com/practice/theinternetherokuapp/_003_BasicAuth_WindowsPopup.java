package com.practice.theinternetherokuapp;

import org.openqa.selenium.By;

import com.utils.MyBaseClass;

public class _003_BasicAuth_WindowsPopup extends MyBaseClass{

	public static void main(String[] args)  {

		
		setUp("chrome","https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		String message=driver.findElement(By.xpath("//h3[contains(text(),'Basic Auth')]")).getText();
		System.out.println(message);
		
		
		
	}

}
