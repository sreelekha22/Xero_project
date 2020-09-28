package com.ta.xero_automation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.Navigate_to_XERO;
import com.ta.Pages.Test_Upload_profile_image;

public class TestID_06_A_Test_Upload_profile_image extends Xero_Utility{
	
	Navigate_to_XERO  NavigateToXERO;
	Test_Upload_profile_image UploadPic;
	
	public TestID_06_A_Test_Upload_profile_image() {
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
		CreateTestScriptReport("Test_Upload_profile_image");
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
	public void NavigationBoxTest() throws Exception {
		UploadPic = new Test_Upload_profile_image();
		UploadPic.NavigationBoxValidation();
	}
	@Test(priority = 5)
	public void ProfilePageTest() throws Exception {
		UploadPic.ProfilePageValidation();
	}
	@Test(priority = 6)
	public void UploadPictureTest() throws Exception {
		UploadPic.UploadPicture();
	}
	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}


}
