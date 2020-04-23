package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;
import static com.utils.CommonMethods.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _008_demoQA_find_Tab_ccs_absoluteXpath_relativeXpath {

	public static void main(String[] args) {

		String url = "https://demoqa.com/tabs/";
		String browser = "chrome";
		setUp(browser, url);

		// css
		driver.findElement(By.cssSelector("#ui-id-1")).click();
		waitSec(2);
		driver.findElement(By.cssSelector("#ui-id-2")).click();
		waitSec(2);
		driver.findElement(By.cssSelector("#ui-id-3")).click();
		waitSec(2);

		// relatitive path
		driver.findElement(By.xpath("//a[@id='ui-id-1']")).click();
		waitSec(2);
		driver.findElement(By.xpath("//a[@id='ui-id-2']")).click();
		waitSec(2);
		driver.findElement(By.xpath("//a[@id='ui-id-3']")).click();
		waitSec(2);

		// absolute path
		driver.findElement(By.xpath("//body[1]/div/div[2]/div/div[2]/div[2]/div/ul/li[1]")).click();
		waitSec(2);
		driver.findElement(By.xpath("//body[1]/div/div[2]/div/div[2]/div[2]/div/ul/li[2]")).click();
		waitSec(2);
		driver.findElement(By.xpath("//body[1]/div/div[2]/div/div[2]/div[2]/div/ul/li[3]")).click();
		waitSec(2);

		List<WebElement> tabs = driver.findElements(By.xpath("//body[1]/div/div[2]/div/div[2]/div[2]/div/ul"));

		tabs.size();

		tearDown();

	}

}
