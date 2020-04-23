package com.practice.ud.basic;

import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;
import static com.utils.CommonMethods.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _027_Assigment {

	public static void main(String[] args) {

		String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
		String browser = "chrome";
		setUp(browser, url);

		// click 'Option2'
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String optionName = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]")).getText();


		// Select dropdown 'Option2'
		WebElement dropDown = driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select s = new Select(dropDown);
		s.selectByVisibleText(optionName);

		// Switch to Alert Example
		// write down the 'Options'
		driver.findElement(By.cssSelector("#name")).sendKeys(optionName);
		waitSec(2);
		driver.findElement(By.cssSelector("#alertbtn")).click();

		String alertMessage = driver.switchTo().alert().getText();

		if (alertMessage.contains(optionName))
			System.out.println("'Options 2' displayed on alert message");

		else
			System.out.println("Something wrong, 'Option 2' ' is not displayed on alert-message");
		
		
		//accept alert
		driver.switchTo().alert().accept();
		
		
		tearDown();
		

	}

}
