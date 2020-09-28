package com.ta.xero_automation;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.Add_another_organization_StandardPlan;

public class TestID_08_D_Add_organization_StandardPlan extends Xero_Utility {
	
	Add_another_organization_StandardPlan standardTrial;
	
	public TestID_08_D_Add_organization_StandardPlan() {
		super();
	}
	@BeforeSuite
	public void setUp() {
		initialization();
		createreport();
		standardTrial = new Add_another_organization_StandardPlan();
	}
	@Test(priority = 1)
	public void launchPageTest() throws Exception {
		CreateTestScriptReport("Add_another_organization_StandardPlan");
		standardTrial.ValidateLaunchPage();
	}
	@Test(priority = 2)
	public void logintest() throws Exception {
		String[][] data = readXlData();
		standardTrial.Login(data[2][0],data[2][1]);
	}
	@Test(priority = 3)
	public void AddOrganizationtest() throws Exception {
		String[][] data = readXlData();
		standardTrial.StandardPlan(data[3][0],data[4][0]);
	}
	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}

	
}
