package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;
import static com.utils.CommonMethods.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _012_DropDown_selectBy {

	public static void main(String[] args) {

		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		String browser = "chrome";
		setUp(browser, url);

		// xPath
		WebElement element = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		// CSS
		// WebElement element = driver.findElement(By.cssSelector("#dropdown-class-example"));

		Select select = new Select(element);
		select.selectByValue("option1");
		select.selectByVisibleText("Option3");
		select.selectByIndex(0);

		List<WebElement> options = select.getOptions();

		System.out.println("Options list :");
		for (WebElement x : options)
			System.out.println("\t"+x.getText());

		// call from CommonClass
		selectDropddownValue(element, "Option2");

		tearDown();

	}

}
