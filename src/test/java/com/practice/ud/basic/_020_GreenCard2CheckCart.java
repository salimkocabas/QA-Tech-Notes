package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;
import static com.utils.CommonMethods.*;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _020_GreenCard2CheckCart {

	
	public static void main(String[] args) {

		String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
		String browser = "chrome";
		setUp(browser, url);

		String[] shoppingList = { "Cucumber", "Brocolli", "Beetroot", "Beans", "Potato", "Pumpkin" };

		addCart(shoppingList);
		checkTheCart();
		
		

	}

	public static void addCart(String[] shoppingList) {

		int count = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] productName = products.get(i).getText().split("-");
			String formattedProductName = productName[0].trim();

			List<String> order = Arrays.asList(shoppingList);
			if (order.contains(formattedProductName)) {
				count++;
				System.out.printf("%-15s [%s] %n", formattedProductName, i);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (count == shoppingList.length) // dont wast time, if there is number of item that you want to add,
													// after it break
					break;
			}
		}

		takeScreenshot("green_cart_add_the_card_");
	}

	public static void checkTheCart() {

		driver.findElement(By.className("cart-icon")).click(); // check the cart
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		WebElement promoCode=driver.findElement(By.cssSelector("input.promoCode"));
		
		waitForVisibility(promoCode);
		takeScreenshot("green_cart_check_the_card_before_discount");
		
		promoCode.sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		String promoAplied = driver.findElement(By.cssSelector("span.promoInfo")).getText();

		Assert.assertEquals(promoAplied, "Code applied ..!");
		
		takeScreenshot("green_cart_check_the_card_after_discount");

	}

	

}
