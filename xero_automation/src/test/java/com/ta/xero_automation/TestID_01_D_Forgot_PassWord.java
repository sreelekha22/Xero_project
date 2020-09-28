package com.ta.xero_automation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.Forgot_PassWord;

public class TestID_01_D_Forgot_PassWord extends Xero_Utility{
	
	Forgot_PassWord ForgotPW;
	
	public TestID_01_D_Forgot_PassWord() {
		super();
	}
	@BeforeSuite
	public void setUp() {
		initialization();
		createreport();
		ForgotPW = new Forgot_PassWord();
	}
	@Test(priority = 1)
	public void launchPageTest() throws Exception {
		CreateTestScriptReport("Navigate to XERO");
		ForgotPW.ValidateLoginPage();
	}
	@Test(priority = 2)
	public void ResetPasswordTest() throws Exception {
		ForgotPW.ForgotPassword();
	}
	@Test(priority = 3)
	public void ResetMsgTest() throws Exception {
		String[][] data = readXlData();
		ForgotPW.ResetMessage(data[0][0]);
	}
	@Test(priority = 3)
	public void ResetMsgValidation() throws Exception {
		ForgotPW.validateResetMsg();
	}
	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}
}
