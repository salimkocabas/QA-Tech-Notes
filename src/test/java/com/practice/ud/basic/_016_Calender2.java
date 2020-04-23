package com.practice.ud.basic;

import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _016_Calender2 {

	public static void main(String[] args) {

		String url = "https://www.path2usa.com/travel-companions";
		String browser = "firefox";
		setUp(browser, url);

		String requestedMonth = "March 2020";
		String requestedDay = "25";

		System.out.printf("Requested flight date : %s, %s%n", requestedDay, requestedMonth);

		// click to calendar item
		driver.findElement(By.id("travel_date")).click();

		// find next month icon
		WebElement nextMonth = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']"));

		boolean condition = false;

		// find the requested month
		while (!condition) {

			WebElement monthWE = driver
					.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
			String month = monthWE.getText();

			// System.out.println(month);

			if (month.contentEquals(requestedMonth)) {
				//System.out.println(month);
				condition = true;
			}
			else {
				nextMonth.click();
			}

		}

		// get days from table
		List<WebElement> dayWE = driver.findElements(By.cssSelector("[class='datepicker-days']  [class='day']"));

		int size = dayWE.size();

		//System.out.println("Avaliable days in this month :" + size);

		// find the requested day
		for (int i = 0; i < size; i++) {
			String day = dayWE.get(i).getText();

			if (day.equalsIgnoreCase(requestedDay)) {
				//System.out.println("Selected day :" + day);
				dayWE.get(i).click();
				break;
			}
		}
		
		
		//check later it shows on screen but can not read selected date

		System.out.println(driver.findElement(By.cssSelector("#travel_date")).getText());		
		System.out.println(driver.findElement(By.cssSelector("#travel_date")).isDisplayed());		
		
		
		tearDown();

	}

}
