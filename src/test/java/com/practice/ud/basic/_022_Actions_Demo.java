package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;
import static com.utils.CommonMethods.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _022_Actions_Demo {

	public static void main(String[] args) {

		String url = "https://www.amazon.com";
		String browser = "chrome";
		setUp(browser, url);
		
		Actions go=new Actions(driver);
		
		// write to search box SHIFT+iphone
		waitSec(2);
		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		go.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("iphone").build().perform();
		
		
		//double click
		waitSec(2);
		searchBox.clear();
		go.moveToElement(searchBox).click().sendKeys("hello").doubleClick().build().perform();
		
		
		
		//mouse right click
		waitSec(2);
		WebElement account=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		go.moveToElement(account).contextClick().build().perform();  //contextClick = mouse right click  
		
		
		

	}

}
