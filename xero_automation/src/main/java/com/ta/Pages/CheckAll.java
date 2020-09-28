package com.ta.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.ta.xero_automation.Xero_Utility;

public class CheckAll extends Xero_Utility{
	
	String sPathOFScreenshot1 = System.getProperty("user.dir")+"//screenshot/screenshot_CheckAll.png";
	
	@FindBy(xpath = "//button[@name='navigation-menu/accounting']")
	WebElement accounting;
	
	@FindBy(xpath = "//div[@class='xrh-dropdown-layout xrh-nav--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionleft']//div[@class='xrh-dropdown--body']")
	WebElement accountsDropDown;
	public CheckAll() {
		PageFactory.initElements(driver,this);
	}
	public void validatePurchases() throws Exception {
		clickObj(accounting, "accounting ");
		if(accountsDropDown.isDisplayed()) {
			logger.log(LogStatus.FAIL, "Purchases option is not there.");
			takeSnapShot(driver, sPathOFScreenshot1);
		}else {
			logger.log(LogStatus.INFO, "Check for the further information to proceed.");
		}
	}
}
