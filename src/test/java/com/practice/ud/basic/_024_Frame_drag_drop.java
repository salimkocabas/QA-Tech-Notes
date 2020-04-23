package com.practice.ud.basic;

import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _024_Frame_drag_drop {

	public static void main(String[] args) {

		String url = "https://jqueryui.com/droppable/";
		String browser = "chrome";
		setUp(browser, url);

		
		// we can go inside of frame 1. frame ID (no suggested, if developer add one more frame it doesn't work
		// WebElement as a frame selector is more usable
		
		
		//check how many frame exist in the page
		System.out.println("Frame # :"+driver.findElements(By.tagName("iframe")).size());
		
		//option 1:
		WebElement frame=driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		//option2:
		//driver.switchTo().frame(0);  // there is only one frame, it works - but not recommended
		
		
		//common for 2 of them
		driver.findElement(By.id("draggable")).click();
		Actions go=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		go.dragAndDrop(source, target).build().perform();;

		
		// back to home
		driver.switchTo().defaultContent();
		
		
		tearDown();
	}

}
