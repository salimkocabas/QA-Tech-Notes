package com.utils;

public class MyConstants {

	public static final String USER_PATH = System.getProperty("user.dir");
	public static final String OS_NAME = System.getProperty("os.name");
	public static final String USER_NAME = System.getProperty("user.name");

	public static String CHROME_DRIVER_PATH = USER_PATH + "/drivers/chromedriver";
	public static String GECKO_DRIVER_PATH = USER_PATH + "/drivers/geckodriver";
	public static String EDGE_DRIVER_PATH = USER_PATH + "/drivers/msedgedriver";
	public static String IE_DRIVER_PATH = USER_PATH + "/drivers/iEDriverServer";

	public static final int PAGE_LOAD_TIME = 30;
	public static final int IMPLICIT_LOAD_TIME = 10;
	public static final int EXPLICIT_LOAD_TIME = 30;

	public static final String CREDENTIALS_FILEPATH = USER_PATH
			+ "/src/test/resources/configs/Configuration.properties";
	public static final String XL_DATA_FILEPATH = USER_PATH + "/src/test/resources/testdata/HrmsTestData.xlsx";
	public static final String REPORT_FILEPATH = USER_PATH + "/target/report/Hrms.html";
	public static final String SCREENSHOTS_FILEPATH = USER_PATH + "/target/screenshots/";

}
