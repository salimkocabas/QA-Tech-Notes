package com.practice.ud.basic;

import static com.utils.MyBaseClass.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _010_Amazon_Find_Name_get_a_product_price {

	
	@Test
	public void test() {
		

		String url = "https://www.amazon.com";
		String browser = "chrome";
		setUp(browser, url);

		String searchProduct="Apple iPhone X";
		
		WebElement searchAmazon = driver.findElement(By.name("field-keywords"));
		searchAmazon.sendKeys(searchProduct);
		searchAmazon.submit();

		
		
		WebElement product = driver.findElement(By.partialLinkText(searchProduct));
		product.click();
		
		WebElement productTitle = driver.findElement(By.id("productTitle"));
		String productNameOnAmazon=productTitle.getText();
		System.out.println("Product    : "+productNameOnAmazon);

		
		WebElement findProductPrice = driver.findElement(By.id("priceblock_ourprice"));
		String productPrice=findProductPrice.getText();

		System.out.println("Price      : "+productPrice);
		
		tearDown();

	}

}
