package com.ta.Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.ta.xero_automation.Xero_Utility;

public class Add_another_organization_PremiumPlan extends Xero_Utility{
	
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
	
	@FindBy(xpath= "//li[@id='CNTRY/GB']//span[@class='xui-pickitem--text']")
	WebElement CountryUK;
	
	@FindBy(xpath= "//span[@class='trigger-text__18E4o']")
	WebElement TIME;
	
	@FindBy(xpath= "//span[contains(text(),'(UTC+00:00) Dublin, Edinburgh, Lisbon, London')]")
	WebElement SetTime;
	
	@FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/div[2]/label[1]/span[1]")
	WebElement NoBtn;
	
	@FindBy(xpath= "//div[@class='xui-padding-top xui-padding-left plancard-popular']//div[@class='xui-styledcheckboxradio--radio xui-styledcheckboxradio--radio-medium']")
	WebElement StandardTrial;
	
	@FindBy(xpath= "//button[@class='xui-button xui-actions--secondary button__2_4F- xui-button-standard xui-button-medium xui-button-fullwidth']")
	WebElement BuyNow;
	
	@FindBy(xpath = "//section[@id='Established']//div[@class='xui-styledcheckboxradio--radio xui-styledcheckboxradio--radio-medium']")
	WebElement EstablishedPlan;
	
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
	
	String sPathOFScreenshot1 = System.getProperty("user.dir")+"//screenshot/screenshot_Add_another_organization_PremiumPlan.png";
	
	public Add_another_organization_PremiumPlan() {
		PageFactory.initElements(driver,this);
	}
	public String ValidateLaunchPage() {
		WebElement title =  driver.findElement(By.tagName("title"));
		if(title.isEnabled()) {
			logger.log(LogStatus.PASS," Xero application page is displayed ");
		}else {
			logger.log(LogStatus.FAIL, " Xero application page is not displayed ");
			logger.log(LogStatus.FAIL, "Standard plan is not there.");
		}
		return driver.getTitle();
	}
	public void Login(String un,String pwd) throws Exception {
		
		clickObj(login, "login");
		enterText(username, un , "UserName");
		enterText(password, pwd , "PassWord");
		clickObj(submit, "Submit");
	}
	public void PremiumPlan(String bname , String iname) throws Exception {
		clickObj(MyXero, "MyXero ");
		clickObj(ChangeOrg, "ChangeOrg ");
		clickObj(NewOrg, "Add New Organization ");
		enterText(Industry, iname, "Industry ");
		enterText(BusinessNAme, bname, "BusinessNAme ");
		
		clickObj(NoBtn, "NoBtn ");
		
		scroll();
		clickObj(BuyNow, "BuyNow ");
		if(EstablishedPlan.isDisplayed()) {
			logger.log(LogStatus.FAIL, "Standard plan is not there.");
			takeSnapShot(driver, sPathOFScreenshot1);
		}else {
			logger.log(LogStatus.INFO, "Proceed with other plan.");
		}
	}
}
