package com.practice.ud.basic;

import static com.utils.MyBaseClass.driver;
import static com.utils.MyBaseClass.setUp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class _030_ScreenShot {

	public static void main(String[] args) throws IOException {
		String url = "https://www.cnn.com";
		String browser = "chrome";
		setUp(browser, url);
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("d:/screenShot.png"));
		
		
		
		

	}
		
		
		
		

}

