package com.test.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.test.common.Browser;
import com.test.pages.LMSHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LMSHomePageSteps {
	
	
	// Variable for browser URL
	static String url = "https://lms.ey.net/";
	
	@Given("user enters valid url")
	public void user_enters_valid_url() {
	    
		//Enter the URL to open the web page for LMS
		Browser.setupBrowser().get(url);
	}

	@Then("LMS homepage is displayed")
	public void lms_homepage_is_displayed() 
	{
		LMSHomePage homepage  = new LMSHomePage(Browser.setupBrowser());
		System.out.println(Browser.setupBrowser());
	    //To check if the title of the page is as expected
		String actualPageTitle = homepage.getPageTitle();
		
		//Compare the page title with the expected Page title
		String expectedPageTitle = "LMS | Leave Management System- Home";
		Assert.assertEquals(expectedPageTitle,actualPageTitle);	
	}

}
