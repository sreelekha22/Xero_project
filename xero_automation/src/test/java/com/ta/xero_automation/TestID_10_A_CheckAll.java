package com.ta.xero_automation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.CheckAll;
import com.ta.Pages.Navigate_to_XERO;

public class TestID_10_A_CheckAll extends Xero_Utility{
	
	Navigate_to_XERO  NavigateToXERO;
	CheckAll check;
	
	public TestID_10_A_CheckAll() {
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
		CreateTestScriptReport("TestID_10_A_CheckAll");
		NavigateToXERO.ValidateLaunchPage();
	}
	@Test(priority = 2)
	public void logintest() throws Exception {
		NavigateToXERO.Login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(2000);
		assertEquals(driver.findElement(By.xpath("//h1[@class='xui-pageheading--title']")).isDisplayed(), true);
	}
	@Test(priority = 3)
	public void HomePageTest() throws Exception {
		NavigateToXERO.validateHomePage();
		
	}
	@Test(priority = 4)
	public void PurchsesTest() throws Exception {
		check = new CheckAll();
		check.validatePurchases();
	}
	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}

	
}
