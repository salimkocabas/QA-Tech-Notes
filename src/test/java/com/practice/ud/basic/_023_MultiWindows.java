package com.practice.ud.basic;

import static com.utils.CommonMethods.waitSec;
import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class _023_MultiWindows {

	public static void main(String[] args) {

		String url = "https://demoqa.com/automation-practice-switch-windows-2/";
		String browser = "chrome";
		setUp(browser, url);

		// open | New Browser Windows | New Browser Tab|
		driver.findElement(By.cssSelector("button[onclick='newBrwWin()']")).click();
		driver.findElement(By.cssSelector("button[onclick='newBrwTab()']")).click();

		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();

		while (it.hasNext()) {
			String window = it.next();
			waitSec(3);
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());

		}

	}

}
