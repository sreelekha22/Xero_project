package com.ta.xero_automation;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.Add_another_organization_Trail_version_1;

public class TestID_08_F_Quickbooks_user extends Xero_Utility{
	
Add_another_organization_Trail_version_1 AddOrgTrial;
	
	public TestID_08_F_Quickbooks_user() {
		super();
	}
	@BeforeSuite
	public void setUp() {
		initialization();
		createreport();
		AddOrgTrial = new Add_another_organization_Trail_version_1();
	}
	@Test(priority = 1)
	public void launchPageTest() throws Exception {
		CreateTestScriptReport("TestID_08_F_Quickbooks_user");
		AddOrgTrial.ValidateLaunchPage();
	}
	@Test(priority = 2)
	public void logintest() throws Exception {
		String[][] data = readXlData();
		AddOrgTrial.Login(data[2][0],data[2][1]);
	}
	@Test(priority = 3)
	public void MyXerotest() throws Exception {
		AddOrgTrial.MyXero();
	}
	@Test(priority = 4)
	public void Quickbooks_test() throws Exception {
		String[][] data = readXlData();
		AddOrgTrial.Quickbooks(data[3][0],data[4][0]);
	}
	@Test(priority = 4)
	public void validateQuickBooktest() throws Exception {
		AddOrgTrial.QuickBookValidation();
	}
	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}
	
}
