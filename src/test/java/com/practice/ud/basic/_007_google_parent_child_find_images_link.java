package com.practice.ud.basic;

import org.openqa.selenium.*;
import static com.utils.MyBaseClass.*;

public class _007_google_parent_child_find_images_link {

	public static void main(String[] args) throws InterruptedException {

		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		//driver.get("http://google.com");
		
		setUp("chrome","http://google.com");
		
		driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div[1]/div[2]/a")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ocean"+Keys.ENTER);

		
		
		
		tearDown();

	}

}
