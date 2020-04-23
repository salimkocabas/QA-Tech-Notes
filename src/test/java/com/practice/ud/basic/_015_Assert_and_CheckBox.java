package com.practice.ud.basic;

import static com.utils.CommonMethods.waitSec;
import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _015_Assert_and_CheckBox {

	@Test
	public void test() {

		String url = "https://www.spicejet.com/";
		String browser = "chrome";
		setUp(browser, url);

		driver.manage().window().maximize();
		waitSec(1);

		// check citizen discount and display status
		WebElement citizenDiscountBtn = driver
				.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount"));
		Boolean isSelected = citizenDiscountBtn.isSelected();
		System.out.println("Citizen Discount : " + isSelected);
		
		//click to Senior Discount button
		citizenDiscountBtn.click();
		Assert.assertFalse(isSelected);  //check to conditions is Citizen not selected yet  test OK

		
		//check to status of Citizen discount is selected
		isSelected = citizenDiscountBtn.isSelected();
		System.out.println("Citizen Discount : " + isSelected);
		Assert.assertTrue(isSelected);  //check to conditions is Citizen selected test OK


		// select 4 adult
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		WebElement adult = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"));
		Select selectAdult = new Select(adult);
		selectAdult.selectByIndex(3);

		String nuOfAdult=driver.findElement(By.cssSelector("#divpaxinfo")).getText();
		System.out.println(nuOfAdult);
		
		Assert.assertEquals(nuOfAdult, "4 Adult"); // if 4 Adult selected test OK
		
		
		// select departure
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();

		waitSec(1);

		// select arrivial
		driver.findElement(By.xpath("(//a[@value='TIR'])[2]")).click();

		tearDown();

	}

}
