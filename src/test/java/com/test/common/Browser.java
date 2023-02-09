package com.test.common;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();


	public WebDriver setupBrowser() {

		/*
		// Create a Scanner object
		Scanner myObj = new Scanner(System.in);
		// User input the browser on which the test needs to be run
		System.out.println("Choose the browser to run the tests: " + "\n Chrome" + "\n Edge" + "\n Firefox");

		String browserType = myObj.nextLine(); // Read user input
		System.out.println(browserType);
		if (browserType.toLowerCase().equalsIgnoreCase("chrome")) {

			// Set the Chrome driver path
			System.setProperty("webdriver.chrome.driver",
					"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browserType.toLowerCase().equalsIgnoreCase("edge")) {
*/
			// Set the Edge driver path
			System.setProperty("webdriver.edge.driver",
					"C:\\Drivers_New\\BrowserDrivers\\edgedriver_win64\\msedgedriver.exe");

			driver = new EdgeDriver();
	/*	
	} else if (browserType.toLowerCase().equalsIgnoreCase("firefox")) {
			// Set the Firefox driver path
			System.setProperty("webdriver.gecko.driver",
					"C:\\Drivers_New\\BrowserDrivers\\geckodriver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
*/
		driver.manage().window().maximize();
		return driver;
	}

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

}
