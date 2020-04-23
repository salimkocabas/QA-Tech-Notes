package com.practice.ud.basic;

import static com.utils.CommonMethods.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _012_DropDown_selectBy3 {

	public static void main(String[] args) {

		String url = "https://www.aa.com/homePage.do";
		String browser = "chrome";
		setUp(browser, url);
		
		

		WebElement numberOfPasenger = driver.findElement(By.xpath("//select[@id='flightSearchForm.adultOrSeniorPassengerCount']"));

		Select number = new Select(numberOfPasenger); number.selectByIndex(4);

		
		
 		List<WebElement> options = number.getOptions();

		System.out.println("Options list :");
		for (WebElement x : options)
			System.out.println("\t"+x.getText());

		tearDown();

	}

}
