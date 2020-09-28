package com.ta.xero_automation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.Navigate_to_XERO;



public class TestID_01_A_Navigate_to_XERO extends Xero_Utility{
	Navigate_to_XERO  NavigateToXERO;
	
	public TestID_01_A_Navigate_to_XERO() {
		super();
	}
	
	@BeforeSuite
	public void setUp() {
		initialization();
		createreport();
	}
	@BeforeMethod
	public void openUrl() {
		NavigateToXERO = new Navigate_to_XERO();
	}
	@Test(priority = 1)
	public void launchPageTest() throws Exception {
		CreateTestScriptReport("Navigate to XERO");
		NavigateToXERO.ValidateLaunchPage();
	}
	@Test(priority = 2)
	public void logintest() throws Exception {
		NavigateToXERO.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test(priority = 3)
	public void HomePageTest() throws Exception {
		NavigateToXERO.validateHomePage();
		
	}

	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}
	
}
