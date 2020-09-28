package com.ta.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.ta.xero_automation.Xero_Utility;

public class Add_another_organization_Trail_version_1 extends Xero_Utility{
	
	@FindBy(xpath = "//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']")
	WebElement login;
	
	@FindBy(name = "Username")
	WebElement username;
	
	@FindBy(id = "xl-form-password")
	WebElement password;
	
	@FindBy(id = "xl-form-submit")
	WebElement submit;
	
	@FindBy(xpath= "//div[@class='xrh-appbutton--body']")
	WebElement MyXero;
	
	@FindBy(xpath= "//div[@class='xrh-appmenu--body xrh-appmenu--body-is-open xrh-appmenu--body-downshift-for-banner']")
	WebElement MyXeroBody;
	
	@FindBy(xpath = "//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']")
	WebElement NewOrg;
	
	@FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement BusinessNAme;
	
	@FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement Industry;
	
	@FindBy(xpath= "//div[@class='xui-textinput--sideelement xui-textinput--sideelement-align-center xui-textinput--sideelement-icon']")
	WebElement ChangeCountry;
	
	@FindBy(xpath= "//li[@id='CNTRY/US']//span[@class='xui-pickitem--text']")
	WebElement CountryUS;
	
	@FindBy(xpath= "//span[@class='trigger-text__18E4o']")
	WebElement TIME;
	
	@FindBy(xpath= "//span[@class='xui-pickitem--text']//span[contains(text(),'(UTC-05:00) Eastern Time (US & Canada)')]")
	WebElement SetTime;
	
	@FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/div[2]/label[1]/span[1]")
	WebElement NoBtn;
	
	@FindBy(xpath= "//button[@class='xui-button xui-actions--primary button__2_4F- xui-actions--button-spacing xui-button-create xui-button-medium xui-button-fullwidth']")
	WebElement StartTrial;
	
	@FindBy(xpath= "//button[@class='xui-button xui-actions--secondary button__2_4F- xui-button-standard xui-button-medium xui-button-fullwidth']")
	WebElement BuyNow;
	
	@FindBy(xpath= "//section[@id='Early']//div[@class='xui-styledcheckboxradio--radio xui-styledcheckboxradio--radio-medium']")
	WebElement EarlyPlan;
	
	@FindBy(xpath= "//button[@class='xrh-button xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']")
	WebElement ChangeOrg;
	
	@FindBy(xpath= "//button[@id='continueButton']")
	WebElement ContinueBtn;
	
	@FindBy(xpath= "//input[@id='contactAddress']")
	WebElement Street;
	
	@FindBy(xpath= "//input[@id='contactCity']")
	WebElement City;
	
	@FindBy(xpath= "//div[@id='postalAddress']//button[@class='xui-button xui-select--button xui-u-fullwidth xui-button-standard xui-button-medium']")
	WebElement state;
	
	@FindBy(xpath= "//li[@id='California']")
	WebElement California;
	
	@FindBy(xpath= "//input[@id='contactPostalCode']")
	WebElement Zipcode;
	
	@FindBy(xpath= "//button[@id='stepAccountCreate']")
	WebElement ContinueAndPay;
	
	@FindBy(xpath= "//span[@id='accountPaymentTypeCc']")
	WebElement Creditcard;
	
	@FindBy(xpath= "//div[@id='stripe-card-number']")
	WebElement CardNumber;
	
	@FindBy(xpath= "//div[@id='stripe-card-expiry']")
	WebElement CardExpiry;
	
	@FindBy(xpath= "//div[@id='stripe-card-cvc']")
	WebElement CardCvc;
	
	@FindBy(xpath= "//input[@id='stripe-cardholder-name']")
	WebElement CardHolderName;
	
	@FindBy(xpath= "//button[@id='continueButton']")
	WebElement Payment;
	
	@FindBy(xpath= "//title[contains(text(),'Xero')]")
	WebElement XeroTitle;
	
	String sPathOFScreenshot1 = System.getProperty("user.dir")+"//screenshot/screenshot_Add_another_organization_Trail_version_1.png";
	
	public Add_another_organization_Trail_version_1() {
		PageFactory.initElements(driver,this);
	}
	public String ValidateLaunchPage() throws Exception {
		WebElement title =  driver.findElement(By.tagName("title"));
		if(title.isEnabled()) {
			logger.log(LogStatus.PASS," Xero application page is displayed ");
		}else {
			logger.log(LogStatus.FAIL, " Xero application page is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
		return driver.getTitle();
	}
	public void Login(String un,String pwd) throws Exception {
		
		clickObj(login, "login");
		enterText(username, un , "UserName");
		enterText(password, pwd , "PassWord");
		clickObj(submit, "Submit");
	}
	
	public void MyXero() throws Exception {
		clickObj(MyXero, "MyXero ");
		
		if(MyXeroBody.isDisplayed()) {
			logger.log(LogStatus.PASS,"organization details banner is displayed ");
		}else {
			logger.log(LogStatus.FAIL, " organization details banner is not displayed ");
			takeSnapShot(driver, sPathOFScreenshot1);
		}
	}
	public void Quickbooks(String bname , String iname) throws Exception {
		clickObj(ChangeOrg, "ChangeOrg ");
		clickObj(NewOrg, "Add New Organization ");
		enterText(BusinessNAme, bname, "BusinessNAme ");
	
		clickObj(ChangeCountry, "ChangeCountry");
		clickObj(CountryUS, "CountryUS ");

		clickObj(TIME , "TIME ");
		clickObj(SetTime, "SetTime ");
		
		clickObj(NoBtn, "NoBtn ");
		enterText(Industry, iname, "Industry ");

	}
	public void QuickBookValidation() throws Exception {
		scroll();
		if(XeroTitle.isEnabled()) {
			logger.log(LogStatus.FAIL, " 'currently using quickbooks' checkbox is not displayed.");
			takeSnapShot(driver, sPathOFScreenshot1);
		}else {
			logger.log(LogStatus.INFO, "proceed with further process.");
			clickObj(BuyNow, "BuyNow ");
		}
	}
	public void NewOrganization(String bname , String iname) throws Exception {
		clickObj(ChangeOrg, "ChangeOrg ");
		clickObj(NewOrg, "Add New Organization ");
	
		clickObj(TIME , "TIME ");
		clickObj(SetTime, "SetTime ");
		clickObj(ChangeCountry, "ChangeCountry");
		clickObj(CountryUS, "CountryUS ");
		
		enterText(Industry, iname, "Industry ");
		enterText(BusinessNAme, bname, "BusinessNAme ");
		clickObj(NoBtn, "NoBtn ");
		scroll();
		clickObj(StartTrial, "StartTrial ");
		//Thread.sleep(5000);
	}
	public void BuyOrganization(String bname , String iname) throws Exception {
		clickObj(ChangeOrg, "ChangeOrg ");
		clickObj(NewOrg, "Add New Organization ");
		enterText(BusinessNAme, bname, "BusinessNAme ");
		
		clickObj(ChangeCountry, "ChangeCountry");
		clickObj(CountryUS, "CountryUS ");
	
		clickObj(TIME , "TIME ");
		clickObj(SetTime, "SetTime ");
		clickObj(NoBtn, "NoBtn ");
		enterText(Industry, iname, "Industry ");
		scroll();
		clickObj(BuyNow, "BuyNow ");
		
		//Thread.sleep(5000);
	}
	public void PaidOrganization(String bname , String iname) throws Exception {
		clickObj(ChangeOrg, "ChangeOrg ");
		clickObj(NewOrg, "Add New Organization ");
		enterText(Industry, iname, "Industry ");
		enterText(BusinessNAme, bname, "BusinessNAme ");
		
		clickObj(NoBtn, "NoBtn ");
		
		scroll();
		clickObj(BuyNow, "BuyNow ");
		//Thread.sleep(5000);
		if(EarlyPlan.isDisplayed()) {
			logger.log(LogStatus.FAIL, "Starter plan is not there.");
			takeSnapShot(driver, sPathOFScreenshot1);
		}else {
			logger.log(LogStatus.INFO, "Proceed with other plan.");
		}
	}
		
}
