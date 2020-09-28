package com.ta.xero_automation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.Incorrect_Email;

public class TestID_01_C_Incorrect_Email extends Xero_Utility{
	
	Incorrect_Email incorrectUserName;
	
	
	public TestID_01_C_Incorrect_Email() {
		super();
	}
	@BeforeSuite
	public void setUp() {
		initialization();
		createreport();
		incorrectUserName = new Incorrect_Email();
	}
	@Test(priority = 1)
	public void launchPageTest() throws Exception {
		CreateTestScriptReport("Navigate to XERO");
		incorrectUserName.ValidateLaunchPage();
	}
	@Test(priority = 2)
	public void logintest() throws Exception {
		String[][] data = readXlData();
		incorrectUserName.Login(data[1][0],data[1][1]);
	}
	@Test(priority = 3)
	public void ErrorMsgTest() throws Exception {
		incorrectUserName.validateErrorMsg();
	}
	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}


}
