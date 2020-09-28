package com.ta.xero_automation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.Incorrect_Password;

public class TestID_01_B_Incorrect_Password extends Xero_Utility {
	
	Incorrect_Password incorrectPwd;
	
	
	public TestID_01_B_Incorrect_Password() {
		super();
	}
	@BeforeSuite
	public void setUp() {
		initialization();
		createreport();
		incorrectPwd = new Incorrect_Password();
	}
	@Test(priority = 1)
	public void launchPageTest() throws Exception {
		CreateTestScriptReport("Navigate to XERO");
		incorrectPwd.ValidateLaunchPage();
	}
	@Test(priority = 2)
	public void logintest() throws Exception {
		String[][] data = readXlData();
		incorrectPwd.Login(data[0][0],data[0][1]);
	}
	@Test(priority = 3)
	public void ErrorMsgTest() throws Exception {
		incorrectPwd.validateErrorMsg();
	}
	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}
}
