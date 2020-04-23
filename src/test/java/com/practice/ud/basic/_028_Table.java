package com.practice.ud.basic;

import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;
import static com.utils.MyBaseClass.tearDown;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _028_Table {

	public static void main(String[] args) {

		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		String browser = "firefox";
		setUp(browser, url);

		WebElement myTable = driver.findElement(By.cssSelector("table[id='product']"));

		List<WebElement> rows = myTable.findElements(By.cssSelector("tbody tr"));
		List<WebElement> columnsHeader = myTable.findElements(By.cssSelector("table[id='product'] tbody tr:nth-child(1) th"));

		//instactur solutions : (myTable.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th"))
		
		
		int rowSize = rows.size();
		int colSize = columnsHeader.size();

		
		// create 2 dimension array then assign to table values to the array
		String[][] allTables = new String[rowSize][colSize];

		// Header
		for (int i = 0; i < colSize; i++) {
			System.out.printf("[%s]", columnsHeader.get(i).getText() + " \t");
			allTables[0][i] = columnsHeader.get(i).getText();

		}
		
		// All Table
		for (int j = 2; j <= rowSize; j++) {
			System.out.printf("%n[%s]", j);

			List<WebElement> columnData = myTable.findElements(By.cssSelector("table[id='product'] tbody tr:nth-child(" + j + ") td"));
			//intructor solution : driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"))
			

			for (int i = 0; i < colSize; i++) {
				System.out.printf("[%s]", columnData.get(i).getText() + " \t");
				allTables[j - 1][i] = columnData.get(i).getText();

			}

		}
		System.out.println();
		System.out.println();
		System.out.println("Print the Table as Array");
		System.out.println(Arrays.deepToString(allTables));
		
		
		tearDown();
	}

}
