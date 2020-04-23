package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _008_demoQA_find_Tab_xpath_web_elements {
	
	public static void main (String[] args ) {
		
			
			
			String url="https://demoqa.com/tabs/";
			String browser="chrome";
			setUp(browser,url);
			
			
			List<WebElement> tabs=driver.findElements(By.xpath("//body[1]/div/div[2]/div/div[2]/div[2]/div/ul/li"));
			
			System.out.println(tabs.size());
			
			
			tearDown();
			
	
		
	}
	

}
