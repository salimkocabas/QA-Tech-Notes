package com.practice.ud.basic;

import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _024_Frame_Multiple_Frame {

	public static void main(String[] args) {

		String url = "https://the-internet.herokuapp.com/";
		String browser = "chrome";
		setUp(browser, url);

		driver.findElement(By.linkText("Nested Frames")).click();

		frameInfo();

		// drill down to Frame-1 (it has sub frames)
		driver.switchTo().frame("frame-top");
		frameInfo();
		driver.switchTo().frame("frame-middle"); 
		contentOfFrames();
		driver.switchTo().defaultContent();
		
		frameInfo();
		driver.switchTo().frame("frame-top"); 
		driver.switchTo().frame("frame-left"); 

		//back to main frame
		
		
		
		tearDown();
	}

	
	public static  void frameInfo() {
		
		int size = driver.findElements(By.tagName("frame")).size();
		System.out.println("Frame # :" + size);

		List<WebElement> frames = driver.findElements(By.tagName("frame"));

		for (int i = 0; i < size; i++) {
			System.out.println(i+ " : " +frames.get(i).getAttribute("name"));
		}
		
		
		
	}
	public static void contentOfFrames() {
		
		System.out.println(driver.findElement(By.id("content")).getText());
	
	} 
	
	
}
