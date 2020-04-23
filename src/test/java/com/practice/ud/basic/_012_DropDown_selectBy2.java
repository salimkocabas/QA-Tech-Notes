package com.practice.ud.basic;

import static com.utils.CommonMethods.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _012_DropDown_selectBy2 {

	public static void main(String[] args) {

		String url = "https://www.spicejet.com/";
		String browser = "chrome";
		setUp(browser, url);
		
		
		driver.findElement(By.cssSelector("#divpaxinfo")).click();

		WebElement adult = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"));
		WebElement child = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Child"));
		WebElement baby = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Infant"));

		Select selectAdult = new Select(adult); selectAdult.selectByIndex(4);
		Select selectChild = new Select(child); selectChild.selectByIndex(2);
		Select selectBaby = new Select(baby); selectBaby.selectByIndex(1);

		
		/*
		
 		List<WebElement> options = select.getOptions();

		System.out.println("Options list :");
		for (WebElement x : options)
			System.out.println("\t"+x.getText());

*/
		tearDown();

	}

}
