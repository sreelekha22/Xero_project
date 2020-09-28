package com.ta.xero_automation;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.Add_another_organization_PremiumPlan;
import com.ta.Pages.Add_another_organization_StandardPlan;

public class TestID_08_E_Add_another_organization_PremiumPlan extends Xero_Utility{
	
	Add_another_organization_PremiumPlan premiumTrial;
	
	public TestID_08_E_Add_another_organization_PremiumPlan() {
		super();
	}
	@BeforeSuite
	public void setUp() {
		initialization();
		createreport();
		premiumTrial = new Add_another_organization_PremiumPlan();
	}
	@Test(priority = 1)
	public void launchPageTest() throws IOException {
		CreateTestScriptReport("Add_another_organization_PremiumPlan");
		premiumTrial.ValidateLaunchPage();
	}
	@Test(priority = 2)
	public void logintest() throws Exception {
		String[][] data = readXlData();
		premiumTrial.Login(data[2][0],data[2][1]);
	}
	@Test(priority = 3)
	public void AddOrganizationtest() throws Exception {
		String[][] data = readXlData();
		premiumTrial.PremiumPlan(data[3][0],data[4][0]);
	}
	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}



}
