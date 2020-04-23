package com.practice.ud.basic;

import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _020_GreenCard {

	public static void main(String[] args) {

		String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
		String browser = "chrome";
		setUp(browser, url);
		
		

		int count=0;
		String[] shoppingList = { "Cucumber", "Brocolli", "Beetroot","Beans","Potato","Pumpkin" };

		
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] productName = products.get(i).getText().split("-"); // product name is = Brocolli - 1 Kg get only
																			// Brocolli
			String formattedProductName = productName[0].trim(); // there one space charecter, delete it

			
			List<String> order = Arrays.asList(shoppingList);
			if (order.contains(formattedProductName)) {
				count++;
				System.out.printf("%-15s [%s] %n",formattedProductName,i);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();;
				
				if (count==shoppingList.length)
					break;
			}
		}

		driver.findElement(By.className("cart-icon")).click();
		
		
	}

}
