package com.ta.xero_automation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.Test_all_tabs_page;

public class TestID_03_A_Test_all_tabs_page extends Xero_Utility{
	
	Test_all_tabs_page TestAllPages;
	
	public TestID_03_A_Test_all_tabs_page() {
		super();
	}
	
	@BeforeSuite
	public void setUp() {
		initialization();
		createreport();
	}
	@BeforeMethod
	public void openUrl() {
		TestAllPages = new Test_all_tabs_page();
	}
	@Test(priority = 1)
	public void launchPageTest() throws Exception {
		CreateTestScriptReport("Test all tabs page");
		TestAllPages.ValidateLaunchPage();
	}
	@Test(priority = 2)
	public void logintest() throws Exception {
		TestAllPages.Login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(2000);
		assertEquals(driver.findElement(By.xpath("//h1[@class='xui-pageheading--title']")).isDisplayed(), true);
	}
	@Test(priority = 3)
	public void HomePageTest() throws Exception {
		TestAllPages.validateHomePage();
		
	}
	@Test(priority = 4)
	public void DashBoardPageTest() throws Exception {
		TestAllPages.ValidateDashBoardPage();
	}
	@Test(priority = 5)
	public void AccountingPageTest() throws Exception {
		TestAllPages.validateAccountsDropDown();
	}
	@Test(priority = 6)
	public void ReportsPageTest() throws Exception {
		TestAllPages.ReportsPageValidation();
	}
	@Test(priority = 7)
	public void contactsPageTest() throws Exception {
		TestAllPages.ContactPageDropDown();
	}
	@Test(priority = 8)
	public void SettingsPageTest() throws Exception {
		TestAllPages.Settings();
	}
	@Test(priority = 9)
	public void NewDropDownTest() throws Exception {
		TestAllPages.NewDropDownvalidation();
	}
	@Test(priority = 10)
	public void FilesPageTest() throws Exception {
		TestAllPages.FilesValidation();
	}
	@Test(priority = 11)
	public void NotificationPageTest() throws Exception {
		TestAllPages.Notification();
	}
	@Test(priority = 12)
	public void SearchBarTest() throws Exception {
		TestAllPages.ValidateSearch();
	}
	@Test(priority = 13)
	public void HelpAreaTest() throws Exception {
		TestAllPages.HelpAreavalidation();
	}
	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}
}
