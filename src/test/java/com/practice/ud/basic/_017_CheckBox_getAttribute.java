package com.practice.ud.basic;

import static com.utils.CommonMethods.waitSec;
import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _017_CheckBox_getAttribute {

	public static void main(String[] args) {

		String url = "https://www.spicejet.com/";
		String browser = "chrome";
		setUp(browser, url);

		driver.manage().window().maximize();
		waitSec(1);

		WebElement oneWayTripBtn = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		WebElement roundTripBtn = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));

		System.out.println("One way trip selected default : " + oneWayTripBtn.isSelected());
		checkDate2();

		roundTripBtn.click();
		System.out.println("Round trip selected   : " + roundTripBtn.isSelected());
		checkDate2();

		oneWayTripBtn.click();
		System.out.println("One way trip selected : " + oneWayTripBtn.isSelected());
		checkDate2();

		roundTripBtn.click();
		System.out.println("Round trip selected   : " + roundTripBtn.isSelected());
		checkDate2();

		tearDown();

	}

	public static void checkDate2() {
		boolean displayed = false;

		if (driver.findElement(By.id("spclearDate")).getAttribute("style").contains("block")) {
			displayed = true;
			Assert.assertTrue(displayed);
		}

		if (driver.findElement(By.id("spclearDate")).getAttribute("style").contains("none")) {
			displayed = false;
			Assert.assertFalse(displayed);
		}

		System.out.println("Date 2 table  status  :" + displayed);

		System.out.println();
		waitSec(1);

	}

}
