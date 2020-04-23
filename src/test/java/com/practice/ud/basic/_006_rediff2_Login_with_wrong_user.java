package com.practice.ud.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _006_rediff2_Login_with_wrong_user {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver.get("http://rediff.com");

		// ******************* Link Text *****************
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("userName");;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("*******");;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(1000);
		
		//wrong password message
		WebElement errorMessage=driver.findElement( By.xpath("//div[@class='div_login_error']"));
		System.out.print("Error Message : ");
		System.out.println(errorMessage.getText());
		
		
		//wrong password message  xPath contains
		WebElement errorMessage2=driver.findElement( By.xpath("//div[contains(@class,'login_error')]"));
		System.out.print("Error Message : ");
		System.out.println(errorMessage2.getText());
		
		driver.close();

	}

}
