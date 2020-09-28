package com.ta.xero_automation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.SignUp_to_XDC;

public class TestID_02_C_SignUp_to_XDC extends Xero_Utility{
	
	SignUp_to_XDC SignUp;
	
	public TestID_02_C_SignUp_to_XDC() {
		super();
	}
	@BeforeSuite
	public void setUp() {
		initialization();
		createreport();
		SignUp = new SignUp_to_XDC();
	}
	@Test(priority = 1)
	public void launchPageTest() throws Exception {
		CreateTestScriptReport("Sign Up to XDC 2C");
		SignUp.ValidateLaunchPage();
	}
	@Test(priority = 2)
	public void FreeTrialPageTest() throws Exception {
		SignUp.ValidateFreeTrialPage();
	}
	@Test(priority = 3)
	public void TermsPageTest() throws Exception {
		SignUp.ValidateTermsLink();
	}
	@Test(priority = 4)
	public void PrivacyPageTest() throws Exception {
		SignUp.ValidatePrivacyLink();
	}
	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}
}
