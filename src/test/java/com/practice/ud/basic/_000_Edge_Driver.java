package com.practice.ud.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _000_Edge_Driver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D:/my.Codes/my.World/Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.quit();

	}

}
