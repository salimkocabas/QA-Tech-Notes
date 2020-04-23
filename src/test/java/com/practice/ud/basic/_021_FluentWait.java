package com.practice.ud.basic;

import static com.utils.MyBaseClass.setUp;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import static com.utils.CommonMethods.*;

public class _021_FluentWait {

	public static void main(String[] args) {
/*
		String url = "https://the-internet.herokuapp.com/dynamic_loading/1";
		String browser = "chrome";
		setUp(browser, url);

		driver.findElement(By.cssSelector("[id='start'] button")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {

				WebElement element = driver.findElement(By.cssSelector("[id='finish'] h4"));

				if (element.isDisplayed())
					return element;

				else
					return null;
			}
		});

		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
*/
	}

}
