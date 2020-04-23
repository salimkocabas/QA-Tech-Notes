package com.practice.ud.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _003_Sales_Force_Com {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		driver.get("http://login.salesforce.com");
		
		
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.name("pw")).sendKeys("password");
		Thread.sleep(1000);
		
		//System.out.println(driver.findElement(By.className("button r4 wide primary")).toString());  
		//gives error because there is spaces  className="button r4 wide primary"

		driver.findElement(By.name("Login")).click();
		

		// Thread.sleep(1000);
		// driver.quit();
	}

}
