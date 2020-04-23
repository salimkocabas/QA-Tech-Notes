package com.practice.ud.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _005_FaceBook2_UserName_xPath {

	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		driver.get("http://facebook.com");

		//same result : sadece input tagli yerde 'email' i arar
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mail_address@gmail.com");
		
		//same result : tum sayfada email'i arar, sadece bir tane oldugu durumda sorun yok. Browser`dan inspect edilip bakilmasi lazim
		driver.findElement(By.xpath("//*[@type='email']	")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@type='email']	")).sendKeys("mail_address@hotmail.com");
		Thread.sleep(1000);
		
		

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("*****");
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(1000);

		// Thread.sleep(1000);
		// driver.quit();
	}

}
