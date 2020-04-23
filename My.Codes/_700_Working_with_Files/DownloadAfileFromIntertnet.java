package _700_Working_with_Files;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadAfileFromIntertnet {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		String baseUrl = "http://demo.guru99.com/test/yahoo.html";
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		WebElement downloadButton = driver.findElement(By.id("messenger-download"));
		String sourceLocation = downloadButton.getAttribute("href");
		String wget_command = "powershell /c wget.exe -P D: --no-check-certificate " + sourceLocation;

		Process exec = Runtime.getRuntime().exec(wget_command);
		
		//driver.close();
	}

}