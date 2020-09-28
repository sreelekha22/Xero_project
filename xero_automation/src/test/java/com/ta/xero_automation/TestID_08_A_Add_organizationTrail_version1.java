package com.ta.xero_automation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ta.Pages.Add_another_organization_Trail_version_1;
import com.ta.Pages.Incorrect_Email;

public class TestID_08_A_Add_organizationTrail_version1 extends Xero_Utility{
	
	Add_another_organization_Trail_version_1 AddOrgTrial;
	
	public TestID_08_A_Add_organizationTrail_version1() {
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
		CreateTestScriptReport("Add another organization Trail version - 1");
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
	public void AddOrganizationtest() throws Exception {
		String[][] data = readXlData();
		AddOrgTrial.NewOrganization(data[3][0],data[4][0]);
	}
	@AfterSuite
	public void closingBrowser() throws Exception {
		CloseReport();
		teardown();
	}
}
