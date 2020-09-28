package com.ta.xero_automation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.LogOutPage;
import com.ta.Pages.Navigate_to_XERO;

public class TestID_04_A_Test_Logout_Functionality extends Xero_Utility{
	
	LogOutPage Loggingout;
	
	Navigate_to_XERO NavigateToXERO;
	
	public TestID_04_A_Test_Logout_Functionality() {
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
		CreateTestScriptReport("TestID_04_A_Test_Logout_Functionality");
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
	@Test(priority = 4)
	public void LogOutTest() throws Exception {
		Loggingout = new  LogOutPage();
		Loggingout.logout();
	}
	@Test(priority = 5)
	public void UserNameFieldTest() throws Exception {
		Loggingout.UserNameFieldValidation();
	}
	
	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}
}
