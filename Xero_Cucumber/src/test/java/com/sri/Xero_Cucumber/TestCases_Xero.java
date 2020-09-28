package com.sri.Xero_Cucumber;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCases_Xero extends Xero_Utility{
	@Given("^launch browser and open url$")
	public void launch_browser_and_open_url() throws Throwable {
		
		initialization();
	}

	@When("^enter username and password and click on login button$")
	public void enter_username_and_password_and_click_on_login_button() throws Throwable {
		
		WebElement login = findElement(By.partialLinkText("Login"),"login");
		clickObj(login,"login");
		
		WebElement username = findElement(By.name("Username"),"username");
		enterText(username,prop.getProperty("username"),"username");
		
		WebElement password = findElement(By.id("xl-form-password"),"password");
		enterText(password,prop.getProperty("password"),"password");
		
		WebElement submit = findElement(By.id("xl-form-submit"),"submit");
		clickObj(submit,"submit");
	}

	@Then("^verify success or failure$")
	public void verify_success_or_failure() throws Throwable {
		
		WebElement HomePage = findElement(By.xpath("//h1[@class='xui-pageheading--title']"),"HomePage ");
		if(HomePage.isDisplayed()) {
			System.out.println(" User's Home Page is displayed ,login success");
		}else {
			System.out.println(" User's Home Page is not displayed ");
		}
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		
	    teardown();
	}
	@When("^Login with incorrect password$")
	public void login_with_incorrect_password() throws Throwable {
		
		WebElement login = findElement(By.partialLinkText("Login"),"login");
		clickObj(login,"login");
		
		WebElement username = findElement(By.name("Username"),"username");
		enterText(username,prop.getProperty("username"),"username");
		
		String[][] data = readXlData();
		WebElement password = findElement(By.id("xl-form-password"),"password");
		enterText(password,data[0][1],"password ");
		
		WebElement submit = findElement(By.id("xl-form-submit"),"submit");
		clickObj(submit,"submit");
		
	}

	@Then("^verify error message$")
	public void verify_error_message() throws Throwable {
		
		WebElement ErrorMsg = findElement(By.xpath("//li[contains(text(),'Your email or password is incorrect')]"),"errorMsg");
		if(ErrorMsg.isDisplayed()) {
			System.out.println(" error message is displayed ");
		}else {
			System.out.println( " error message is not displayed ");
			
		}
	}
	@When("^Login with incorrect username$")
	public void login_with_incorrect_username() throws Throwable {
		
		WebElement login = findElement(By.partialLinkText("Login"),"login");
		clickObj(login,"login");
		
		String[][] data = readXlData();
		WebElement username = findElement(By.name("Username"),"username");
		enterText(username,data[1][0],"username");
		
		WebElement password = findElement(By.id("xl-form-password"),"password");
		enterText(password,prop.getProperty("password"),"password ");
		
		WebElement submit = findElement(By.id("xl-form-submit"),"submit");
		clickObj(submit,"submit");
	}

	@Then("^verify error message(\\d+)$")
	public void verify_error_message(int arg1) throws Throwable {
		
		WebElement ErrorMsg = findElement(By.xpath("//li[contains(text(),'Your email or password is incorrect')]"),"errorMsg");
		if(ErrorMsg.isDisplayed()) {
			System.out.println(" error message is displayed ");
		}else {
			System.out.println( " error message is not displayed ");
		}
	}
	@When("^forgotPassword$")
	public void forgotpassword() throws Throwable {
		
		WebElement login = findElement(By.partialLinkText("Login"),"login");
		clickObj(login,"login");
		
		WebElement forgotPwd = findElement(By.linkText("Forgot password?"),"forgotPwd");
		clickObj(forgotPwd,"forgotPwd");
		
		WebElement Email = findElement(By.id("Email"),"Email");
		enterText(Email,prop.getProperty("username"),"Email ");
		
		WebElement SendLink = findElement(By.id("submit-reset-password"),"SendLink");
		clickObj(SendLink,"SendLink");
	}

	@Then("^verify reset message$")
	public void verify_reset_message() throws Throwable {
		
		assertEquals(findElement(By.tagName("title"),"ReserMsg").isEnabled(),true);
		System.out.println("error message1 is displayed");
	}
	@When("^start free trial and fill page$")
	public void start_free_trial_and_fill_page() throws Throwable {
		
		WebElement Freetrial = findElement(By.linkText("Free trial"),"Freetrial");
		clickObj(Freetrial,"Freetrial");
		
		WebElement FirstName = findElement(By.name("FirstName"),"FirstName");
		enterText(FirstName,prop.getProperty("FirstName"),"FirstName");
		
		WebElement LastName = findElement(By.name("LastName"),"LastName");
		enterText(LastName, prop.getProperty("LastName") , "LastName ");
		
		WebElement EmailAddress = findElement(By.name("EmailAddress"),"EmailAddress");
		enterText(EmailAddress, prop.getProperty("EmailAddress") , "EmailAddress ");
		
		WebElement PhoneNumber = findElement(By.name("PhoneNumber"),"PhoneNumber");
		enterText(PhoneNumber, prop.getProperty("PhoneNumber") , "PhoneNumber ");
		
		WebElement Country = findElement(By.name("LocationCode"),"Country");
		clickObj(Country, "Country");
		selectByVisibleText(Country,"Uganda");
		
		WebElement TermsAccepted = findElement(By.name("TermsAccepted"),"TermsAccepted");
		clickObj(TermsAccepted, "TermsAccepted ");
		
		WebElement submit = findElement(By.xpath("//span[@class='g-recaptcha-submit']"),"submit");
		clickObj(submit, "submit ");
		
		WebElement robotBtn = findElement(By.xpath("//body[@class='xero is-live-mode']"),"robotBtn");
		clickObj(robotBtn, "robotBtn");
		
		if(robotBtn.isSelected()) {
			System.out.println(" Inbox page is displayed. ");
		}else {
			System.out.println( "Inbox page is not displayed.");
		}
	}

	@When("^start free trial without fill the page$")
	public void start_free_trial_without_fill_the_page() throws Throwable {
		
		WebElement Freetrial = findElement(By.linkText("Free trial"),"Freetrial");
		clickObj(Freetrial,"Freetrial");
		
		WebElement submit = findElement(By.xpath("//span[@class='g-recaptcha-submit']"),"submit");
		clickObj(submit, "submit ");
		
		WebElement errorMsg3 = findElement(By.id("signup-form-error-message-3"),"errorMsg3");
		if(errorMsg3.isDisplayed()) {
			System.out.println(" Error Message \"First name,Last name,Email address, Phone number can't be empty\" is dispalyed\r\n" + 
				" ");
		}else {
			System.out.println( "Error message is not displayed");
		}
		
		WebElement EmailAddress = findElement(By.name("EmailAddress"),"EmailAddress");
		enterText(EmailAddress, prop.getProperty("wrongFormat") , "EmailAddress ");
		
		WebElement errorMsg4 = findElement(By.id("signup-form-error-message-3"),"errorMsg4 ");
		if(errorMsg4.isDisplayed()) {
			System.out.println(" Error Message \"First name,Last name,Email address, Phone number can't be empty\" is dispalyed\r\n" + 
				" ");
		}else {
			System.out.println( "Error message is not displayed");
		}
		
		WebElement submit1 = findElement(By.xpath("//span[@class='g-recaptcha-submit']"),"submit");
		clickObj(submit1, "submit ");
		
		WebElement TermsAccepted = findElement(By.name("TermsAccepted"),"TermsAccepted");
		boolean notHighLight = TermsAccepted.isSelected();
		if(notHighLight == false) {
			System.out.println(" Term and Policy checkbox highlight. ");
		}else {
			System.out.println(" Term and Policy checkbox is not highlight. ");
		}
	}

	@When("^terms and privacy check$")
	public void terms_and_privacy_check() throws Throwable {
		WebElement Terms = findElement(By.xpath("//a[contains(text(),'terms')]"),"Terms");
		clickObj(Terms, "Terms ");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		assertEquals(findElement(By.xpath("//title[contains(text(),'Terms of Use | Xero US')]"),"Termstitle").isEnabled(),true);
		
		driver.switchTo().window(tabs.get(0));
		
		WebElement privacy = findElement(By.xpath("//a[contains(text(),'privacy')]"),"privacy");
		clickObj(privacy, "privacy ");
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(2));

		assertEquals(findElement(By.xpath("//title[contains(text(),'Privacy Notice | Xero US')]"),"Privacytitle").isEnabled(),true);
	}

	@When("^see full offer details$")
	public void see_full_offer_details() throws Throwable {
		WebElement OfferDetails = findElement(By.xpath("//a[contains(text(),'offer details')]"),"OfferDetails");
		clickObj(OfferDetails, "OfferDetails ");
		assertEquals(findElement(By.xpath("//a[contains(text(),'offer details')]"),"OfferTitle").isEnabled(),true);
		WebElement bookKeeper = findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"),"bookKeeper");
		clickObj(bookKeeper, "bookKeeper ");
		assertEquals(findElement(By.xpath("//title[contains(text(),'Sign up for the Xero Partner Program | Xero US')]"),"bookKeeperTitle").isEnabled(),true);
	}

	@When("^check all tabs$")
	public void check_all_tabs() throws Throwable {
		WebElement DashBoard = findElement(By.xpath("//a[@name='navigation-menu/dashboard']"),"DashBoard");
		clickObj(DashBoard, "DashBoard ");
		assertEquals(findElement(By.xpath("//title[contains(text(),'Xero | Dashboard | abc.com')]"),"DashBoardTitle").isEnabled(),true);
		
		WebElement Accounts = findElement(By.xpath("//button[@name='navigation-menu/accounting']"),"Accounts");
		clickObj(Accounts, "Accounts ");
		assertEquals(findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-nav--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionleft']"),"AccountsDropDown").isEnabled(),true);
		
		WebElement Reports = findElement(By.linkText("Reports"),"Reports");
		clickObj(Reports, "Reports ");
		assertEquals(findElement(By.xpath("//title[contains(text(),'Xero | Reports | abc.com')]"),"ReportsPage").isEnabled(),true);
		
		WebElement Contacts = findElement(By.name("navigation-menu/contacts"),"Contacts");
		clickObj(Contacts, "Contacts ");
		assertEquals(findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-nav--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionleft']//div[@class='xrh-dropdown--body']"),"ContactsDropDown").isEnabled(),true);
		
		WebElement appBtn = findElement(By.xpath("//div[@class='xrh-appbutton--body']"),"appBtn");
		clickObj(appBtn, "appBtn ");
		WebElement Settings = findElement(By.xpath("//a[contains(text(),'Settings')]"),"Settings");
		clickObj(Settings, "Settings ");
		assertEquals(findElement(By.xpath("//title[contains(text(),'Xero | Organization settings | abc.com')]"),"SettingsTitle").isEnabled(),true);
		
		WebElement newBtn = findElement(By.xpath("//li[1]//button[1]//div[1]"),"newBtn");
		clickObj(newBtn, "newBtn ");
		assertEquals(findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//div[@class='xrh-dropdown--panel']"),"newDropDown").isEnabled(),true);
		
		clickObj(appBtn, "appBtn ");
		WebElement Files = findElement(By.xpath("//a[contains(text(),'Files')]"),"Files");
		clickObj(Files, "Files ");
		assertEquals(findElement(By.xpath("//title[contains(text(),'Files | abc.com | Xero')]"),"FilesTitle").isEnabled(),true);
		
		WebElement notifications = findElement(By.xpath("//li[3]//button[1]//div[1]"),"notifications");
		clickObj(notifications, "notifications ");
		assertEquals(findElement(By.xpath("//iframe[@id='post_office_frame']"),"notificationsPage").isEnabled(),true);
		
		WebElement search = findElement(By.xpath("//li[2]//button[1]//div[1]"),"search");
		clickObj(search, "search ");
		assertEquals(findElement(By.xpath("//iframe[@id='GlobalSearchApp']"),"searchBar").isEnabled(),true);
		
		WebElement help = findElement(By.xpath("//li[4]//button[1]//div[1]"),"help");
		clickObj(help, "help ");
		assertEquals(findElement(By.xpath("//div[@class='xn-h-task-list xn-h-task-list-narrow']"),"helpArea").isEnabled(),true);
	}

	@When("^logout$")
	public void logout() throws Throwable {
		WebElement AccountBtn = findElement(By.xpath("//img[@class='xrh-avatar']"),"AccountBtn");
		clickObj(AccountBtn, "AccountBtn ");
		WebElement logout = findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]"),"logout");
		clickObj(logout, "logout ");
		assertEquals(findElement(By.xpath("//div[@class='form-container']"),"WelcomePage").isDisplayed(),true);
		assertEquals(findElement(By.xpath("//fieldset//div[1]"),"userNameField").isDisplayed(),true);
	}

	@When("^upload profile picture$")
	public void upload_profile_picture() throws Throwable {
		WebElement AccountBtn = findElement(By.xpath("//img[@class='xrh-avatar']"),"AccountBtn");
		clickObj(AccountBtn, "AccountBtn ");
		
		WebElement Profile = findElement(By.xpath("//li[@class='xrh-addon xrh-addon-lastvisible']//li[1]"),"Profile");
		clickObj(Profile, "Profile ");
		
		WebElement UploadImageBtn = findElement(By.xpath("/html[1]/body[1]/div[4]/form[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"),"UploadImageBtn");
		clickObj(UploadImageBtn, "UploadImageBtn ");
		
		WebElement Browse = findElement(By.xpath("//div[@id='filefield-1174-button']"),"Browse");
		clickObj(Browse, "Browse ");
		
		Robot robot = new Robot();
		robot.mouseMove(100,220);
		//Navigating through mouse hover. Note that the coordinates might differ,
		//kindly check the coordinates of x and y axis and update it accordingly.
		Thread.sleep(2000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseMove(200,190);
		Thread.sleep(2000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(4000);
		
		WebElement Upload = findElement(By.xpath("//a[@id='button-1178-btnEl']"),"Upload");
		clickObj(Upload, "Upload ");
		
		WebElement Save = findElement(By.xpath("//div[@id='button-1164']"),"Save");
		clickObj(Save, "Save ");
		
		WebElement imageDisp = findElement(By.xpath("//img[@class='your-logo']"),"imageDisp");
		if(imageDisp.isDisplayed()) {
			System.out.println( "Uploaded Image is displayed");
		}else {
			System.out.println( "Uploaded Image is not displayed");
		}
	}
	@When("^enter with master login$")
	public void enter_with_master_login() throws Throwable {
		
		WebElement login = findElement(By.partialLinkText("Login"),"login");
		clickObj(login,"login");
		
		String[][] data = readXlData();
		WebElement username = findElement(By.name("Username"),"username");
		enterText(username,data[2][0],"username");
		
		WebElement password = findElement(By.id("xl-form-password"),"password");
		enterText(password,data[2][1],"password");
		
		WebElement submit = findElement(By.id("xl-form-submit"),"submit");
		clickObj(submit,"submit");
	
	}

	@Then("^Add another organization Trail version$")
	public void add_another_organization_Trail_version() throws Throwable {
		
		WebElement MyXero = findElement(By.xpath("//div[@class='xrh-appbutton--body']"),"MyXero");
		clickObj(MyXero, "MyXero ");
		
		WebElement ChangeOrg = findElement(By.xpath("//button[@class='xrh-button xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"),"ChangeOrg");
		clickObj(ChangeOrg, "ChangeOrg ");
		
		WebElement NewOrg = findElement(By.xpath("//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"),"NewOrg");
		clickObj(NewOrg, "Add New Organization ");
		
		WebElement NoBtn = findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/div[2]/label[1]/span[1]"),"NoBtn");
		clickObj(NoBtn, "NoBtn ");
		
		String[][] data = readXlData();
		WebElement Industry = findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"),"Industry");
		enterText(Industry,data[4][0] , "Industry ");
		
		WebElement BusinessNAme = findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"),"BusinessNAme");
		enterText(BusinessNAme, data[3][0], "BusinessNAme ");
		scroll();
		
		WebElement StartTrial = findElement(By.xpath("//button[@class='xui-button xui-actions--primary button__2_4F- xui-actions--button-spacing xui-button-create xui-button-medium xui-button-fullwidth']"),"StartTrial");
		clickObj(StartTrial, "StartTrial ");
	    
	}

	@Then("^Add another organization - Paid version$")
	public void add_another_organization_Paid_version() throws Throwable {
		
		WebElement MyXero = findElement(By.xpath("//div[@class='xrh-appbutton--body']"),"MyXero");
		clickObj(MyXero, "MyXero ");
		
		WebElement ChangeOrg = findElement(By.xpath("//button[@class='xrh-button xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"),"ChangeOrg");
		clickObj(ChangeOrg, "ChangeOrg ");
		
		WebElement NewOrg = findElement(By.xpath("//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"),"NewOrg");
		clickObj(NewOrg, "Add New Organization ");
		
		WebElement NoBtn = findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/div[2]/label[1]/span[1]"),"NoBtn");
		clickObj(NoBtn, "NoBtn ");
		
		String[][] data = readXlData();
		WebElement Industry = findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"),"Industry");
		enterText(Industry,data[4][0] , "Industry ");
		
		WebElement BusinessNAme = findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"),"BusinessNAme");
		enterText(BusinessNAme, data[3][0], "BusinessNAme ");
		scroll();
		WebElement BuyNow = findElement(By.xpath("//button[@class='xui-button xui-actions--secondary button__2_4F- xui-button-standard xui-button-medium xui-button-fullwidth']"),"BuyNow");
		clickObj(BuyNow, "BuyNow ");
	    
	}

	@Then("^Add another organization - Starter Plan$")
	public void add_another_organization_Starter_Plan() throws Throwable {
	    
		WebElement EarlyPlan = findElement(By.xpath("//section[@id='Early']//div[@class='xui-styledcheckboxradio--radio xui-styledcheckboxradio--radio-medium']"),"EarlyPlan");
		
		if(EarlyPlan.isDisplayed()) {
			System.out.println( "Starter plan is not there.");
		}else {
			System.out.println( "Proceed with other plan.");
		}
		
	}
	@Then("^Add another organization - Standard Plan$")
	public void add_another_organization_Standard_Plan() throws Throwable {
	    
		WebElement growingTrial = findElement(By.xpath("//div[@class='xui-padding-top xui-padding-left plancard-popular']//div[@class='xui-styledcheckboxradio--radio xui-styledcheckboxradio--radio-medium']"),"growingTrial");
		
		if(growingTrial.isDisplayed()) {
			System.out.println("Standard plan is not there.");
		}else {
			System.out.println("Proceed with other plan.");
		}
	}

	@Then("^Add another organization - Premium Plan$")
	public void add_another_organization_Premium_Plan() throws Throwable {
		
		WebElement EstablishedPlan = findElement(By.xpath("//section[@id='Established']//div[@class='xui-styledcheckboxradio--radio xui-styledcheckboxradio--radio-medium']"),"EstablishedPlan");
		
		if(EstablishedPlan.isDisplayed()) {
			System.out.println("Standard plan is not there.");
		}else {
			System.out.println("Proceed with other plan.");
		}
	}

	@Then("^fill half page$")
	public void fill_half_page() throws Throwable {
		
		WebElement MyXero = findElement(By.xpath("//div[@class='xrh-appbutton--body']"),"MyXero");
		clickObj(MyXero, "MyXero ");
		
		WebElement ChangeOrg = findElement(By.xpath("//button[@class='xrh-button xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"),"ChangeOrg");
		clickObj(ChangeOrg, "ChangeOrg ");
		
		WebElement NewOrg = findElement(By.xpath("//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"),"NewOrg");
		clickObj(NewOrg, "Add New Organization ");

		String[][] data = readXlData();
		WebElement Industry = findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"),"Industry");
		enterText(Industry,data[4][0] , "Industry ");
		
		WebElement BusinessNAme = findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"),"BusinessNAme");
		enterText(BusinessNAme, data[3][0], "BusinessNAme ");
		scroll();
		WebElement BuyNow = findElement(By.xpath("//button[@class='xui-button xui-actions--secondary button__2_4F- xui-button-standard xui-button-medium xui-button-fullwidth']"),"BuyNow");
		clickObj(BuyNow, "BuyNow ");
		
	}

	@Then("^Add another organization with current Quickbooks user$")
	public void add_another_organization_with_current_Quickbooks_user() throws Throwable {

		WebElement XeroTitle = findElement(By.xpath("//title[contains(text(),'Xero')]"),"XeroTitle");
		if(XeroTitle.isEnabled()) {
			System.out.println(" 'currently using quickbooks' checkbox is not displayed.");
		}else {
			System.out.println("proceed with further process.");
		}
	}

	@Then("^Check for subscription and billing$")
	public void check_for_subscription_and_billing() throws Throwable {
		
		WebElement accounting = findElement(By.xpath("//button[@name='navigation-menu/accounting']"),"accounting");
		WebElement accountsDropDown = findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-nav--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionleft']//div[@class='xrh-dropdown--body']"),"accountsDropDown");
		clickObj(accounting, "accounting ");
		if(accountsDropDown.isDisplayed()) {
			System.out.println("Purchases option is not there.");
		}else {
			System.out.println("Check for the further information to proceed.");
		}
		
	}

}
