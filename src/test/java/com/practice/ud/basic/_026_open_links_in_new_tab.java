package com.practice.ud.basic;

import static com.utils.CommonMethods.getTitles;
import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class _026_open_links_in_new_tab {

	public static void main(String[] args) {

		String url = "https://www.facebook.com";
		String browser = "chrome";
		setUp(browser, url);

		System.out.println("total links    # :" + driver.findElements(By.tagName("a")).size());

		// goto footer
		WebElement footer = driver.findElement(By.id("pageFooterChildren"));

		System.out.println("footer links   # :" + footer.findElements(By.tagName("a")).size());

		String clickNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		footer.findElements(By.tagName("a")).get(0).sendKeys(clickNewTab);
		footer.findElements(By.tagName("a")).get(1).sendKeys(clickNewTab);
		footer.findElements(By.tagName("a")).get(2).sendKeys(clickNewTab);

		
		// getTitles is my own method
		System.out.println("Title List :");
		System.out.println(new ArrayList<>(getTitles()));

		
		tearDown();
	}
	

	

}
