package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _008_demoQA_find_Tab_ccs {

	public static void main(String[] args) {

		String url = "https://demoqa.com/tabs/";
		String browser = "chrome";
		setUp(browser, url);

		// css
		WebElement tab1=driver.findElement(By.cssSelector("#ui-id-1"));
				
		System.out.println(tab1.getTagName());
		System.out.println(tab1.getText());
		System.out.println(tab1.isDisplayed());
		
		
		
		//driver.findElement(By.cssSelector("#ui-id-2")).click();
		//driver.findElement(By.cssSelector("#ui-id-3")).click();


	

		tearDown();

	}

}
