package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LMSHomePage {
	
	private WebDriver driver;

	public LMSHomePage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	    @FindBy(xpath = "//a[@href='/Home/HolidayList']")
	    private WebElement holidayList;
	    
	   //Method to get the title of the LMS home page
		public String getPageTitle()
		{
			//Title of the page
			String homepageTitle = driver.getTitle();
			return homepageTitle;
		}
		
		
		//Method to click on the Holiday List link
			public void openHolidayList()
			{
				//Click on the Holiday List link
				holidayList.click();
			}

}
