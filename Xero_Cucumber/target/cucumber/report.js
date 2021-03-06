$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Xero.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#comments. Author: sreelekha"
    },
    {
      "line": 2,
      "value": "#Xero test cases 1 to 10"
    }
  ],
  "line": 4,
  "name": "Xero test cases feature",
  "description": "",
  "id": "xero-test-cases-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "TC01_A:Navigate to XERO with correct username and password",
  "description": "",
  "id": "xero-test-cases-feature;tc01-a:navigate-to-xero-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "enter username and password and click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "verify success or failure",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 7722555400,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.enter_username_and_password_and_click_on_login_button()"
});
formatter.result({
  "duration": 18235697900,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.verify_success_or_failure()"
});
formatter.result({
  "duration": 44655300,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "duration": 596032900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "TC01_B:Navigate to XERO with correct username and incorrect password",
  "description": "",
  "id": "xero-test-cases-feature;tc01-b:navigate-to-xero-with-correct-username-and-incorrect-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Login with incorrect password",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "verify error message",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 6356753600,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.login_with_incorrect_password()"
});
formatter.result({
  "duration": 13800320500,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.verify_error_message()"
});
formatter.result({
  "duration": 28384500,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "duration": 614806700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "TC01_C:Navigate to XERO with incorrect username and correct password",
  "description": "",
  "id": "xero-test-cases-feature;tc01-c:navigate-to-xero-with-incorrect-username-and-correct-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Login with incorrect username",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "verify error message1",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 7002244100,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.login_with_incorrect_username()"
});
formatter.result({
  "duration": 14608638000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "TestCases_Xero.verify_error_message(int)"
});
formatter.result({
  "duration": 66847900,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "duration": 616207900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "TC01_D:Navigate to XERO forgot password",
  "description": "",
  "id": "xero-test-cases-feature;tc01-d:navigate-to-xero-forgot-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "forgotPassword",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "verify reset message",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 6749233800,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.forgotpassword()"
});
formatter.result({
  "duration": 8375039700,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.verify_reset_message()"
});
formatter.result({
  "duration": 22853000,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "duration": 635697400,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "TC02_A:Sign Up to XDC",
  "description": "",
  "id": "xero-test-cases-feature;tc02-a:sign-up-to-xdc",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "start free trial and fill page",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 6392454400,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.start_free_trial_and_fill_page()"
});
formatter.result({
  "duration": 19085635600,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "duration": 615879600,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "TC02_B:Sign Up to XDC",
  "description": "",
  "id": "xero-test-cases-feature;tc02-b:sign-up-to-xdc",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "start free trial without fill the page",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 6406263100,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.start_free_trial_without_fill_the_page()"
});
formatter.result({
  "duration": 7208230900,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "duration": 640143200,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "TC02_C:Sign Up to XDC",
  "description": "",
  "id": "xero-test-cases-feature;tc02-c:sign-up-to-xdc",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "terms and privacy check",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 7027490100,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.terms_and_privacy_check()"
});
formatter.result({
  "duration": 6998814200,
  "error_message": "java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2\r\n\tat java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)\r\n\tat java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)\r\n\tat java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)\r\n\tat java.base/java.util.Objects.checkIndex(Objects.java:373)\r\n\tat java.base/java.util.ArrayList.get(ArrayList.java:426)\r\n\tat com.sri.Xero_Cucumber.TestCases_Xero.terms_and_privacy_check(TestCases_Xero.java:228)\r\n\tat ✽.When terms and privacy check(Features/Xero.feature:42)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 45,
  "name": "TC02_D:Sign Up to XDC",
  "description": "",
  "id": "xero-test-cases-feature;tc02-d:sign-up-to-xdc",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "see full offer details",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 6739475400,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.see_full_offer_details()"
});
formatter.result({
  "duration": 1234826200,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "duration": 605346300,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "TC03_A:Test all tabs page",
  "description": "",
  "id": "xero-test-cases-feature;tc03-a:test-all-tabs-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 51,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 52,
  "name": "enter username and password and click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "check all tabs",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 6661166900,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.enter_username_and_password_and_click_on_login_button()"
});
formatter.result({
  "duration": 14841407100,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.check_all_tabs()"
});
formatter.result({
  "duration": 21919729700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//title[contains(text(),\u0027Xero | Dashboard | abc.com\u0027)]\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SJNPATC\u0027, ip: \u0027192.168.0.25\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\dolby\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57694}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 48f1d33f48b9c130de65a76ced9760d3\n*** Element info: {Using\u003dxpath, value\u003d//title[contains(text(),\u0027Xero | Dashboard | abc.com\u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.sri.Xero_Cucumber.Xero_Utility.findElement(Xero_Utility.java:77)\r\n\tat com.sri.Xero_Cucumber.TestCases_Xero.check_all_tabs(TestCases_Xero.java:247)\r\n\tat ✽.When check all tabs(Features/Xero.feature:53)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 56,
  "name": "TC04_A:Test Logout Functionality",
  "description": "",
  "id": "xero-test-cases-feature;tc04-a:test-logout-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 57,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 58,
  "name": "enter username and password and click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "logout",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 6797107800,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.enter_username_and_password_and_click_on_login_button()"
});
formatter.result({
  "duration": 16675507800,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.logout()"
});
formatter.result({
  "duration": 5828342800,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "duration": 610224200,
  "status": "passed"
});
formatter.scenario({
  "line": 62,
  "name": "TC06_A:Test Upload profile image",
  "description": "",
  "id": "xero-test-cases-feature;tc06-a:test-upload-profile-image",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 63,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 64,
  "name": "enter username and password and click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "upload profile picture",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 7583245700,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.enter_username_and_password_and_click_on_login_button()"
});
formatter.result({
  "duration": 16938449100,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.upload_profile_picture()"
});
formatter.result({
  "duration": 19114143800,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cdiv class\u003d\"x-btn green skip x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon\" style\u003d\"margin: 0px; border-width: 1px; width: 100px; right: auto; left: 753px; top: 0px;\" id\u003d\"button-1164\" data-automationid\u003d\"saveButton\"\u003e...\u003c/div\u003e is not clickable at point (1093, 696). Other element would receive the click: \u003cdiv class\u003d\"x-mask x-modal-mask\" style\u003d\"height: 1193px; width: 1519px; z-index: 19006; right: auto; left: 0px; top: 0px;\" id\u003d\"ext-gen1362\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d85.0.4183.121)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SJNPATC\u0027, ip: \u0027192.168.0.25\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\dolby\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57934}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: c767a4584403eb54c0ef52720e6fae10\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.sri.Xero_Cucumber.Xero_Utility.clickObj(Xero_Utility.java:129)\r\n\tat com.sri.Xero_Cucumber.TestCases_Xero.upload_profile_picture(TestCases_Xero.java:334)\r\n\tat ✽.When upload profile picture(Features/Xero.feature:65)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 68,
  "name": "TC08_A:Add another organization Trail version - 1",
  "description": "",
  "id": "xero-test-cases-feature;tc08-a:add-another-organization-trail-version---1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 69,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "enter with master login",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "Add another organization Trail version",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 7091512900,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.enter_with_master_login()"
});
formatter.result({
  "duration": 18609327600,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.add_another_organization_Trail_version()"
});
formatter.result({
  "duration": 17773439200,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton class\u003d\"xui-button xui-actions--primary button__2_4F- xui-actions--button-spacing xui-button-create xui-button-medium xui-button-fullwidth\" tabindex\u003d\"0\" type\u003d\"button\" data-automationid\u003d\"NewOrgProv-StartTrial\"\u003e...\u003c/button\u003e is not clickable at point (861, 411). Other element would receive the click: \u003cspan class\u003d\"xui-pickitem--text\"\u003e...\u003c/span\u003e\n  (Session info: chrome\u003d85.0.4183.121)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SJNPATC\u0027, ip: \u0027192.168.0.25\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\dolby\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58070}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 4c2279e239fe59be8b04ca023583931c\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.sri.Xero_Cucumber.Xero_Utility.clickObj(Xero_Utility.java:129)\r\n\tat com.sri.Xero_Cucumber.TestCases_Xero.add_another_organization_Trail_version(TestCases_Xero.java:385)\r\n\tat ✽.Then Add another organization Trail version(Features/Xero.feature:71)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 74,
  "name": "TC08_B:Add another organization - Paid version 1",
  "description": "",
  "id": "xero-test-cases-feature;tc08-b:add-another-organization---paid-version-1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 75,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 76,
  "name": "enter with master login",
  "keyword": "When "
});
formatter.step({
  "line": 77,
  "name": "Add another organization - Paid version",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 6531514800,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.enter_with_master_login()"
});
formatter.result({
  "duration": 16322327600,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.add_another_organization_Paid_version()"
});
formatter.result({
  "duration": 15601026800,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton class\u003d\"xui-button xui-actions--secondary button__2_4F- xui-button-standard xui-button-medium xui-button-fullwidth\" tabindex\u003d\"0\" type\u003d\"button\" data-automationid\u003d\"NewOrgProv-BuyNow\"\u003e...\u003c/button\u003e is not clickable at point (657, 411). Other element would receive the click: \u003cspan class\u003d\"xui-pickitem--text\"\u003e...\u003c/span\u003e\n  (Session info: chrome\u003d85.0.4183.121)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SJNPATC\u0027, ip: \u0027192.168.0.25\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\dolby\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58209}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 97cdc49189bdceac04e7f4052e3a0b8f\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.sri.Xero_Cucumber.Xero_Utility.clickObj(Xero_Utility.java:129)\r\n\tat com.sri.Xero_Cucumber.TestCases_Xero.add_another_organization_Paid_version(TestCases_Xero.java:412)\r\n\tat ✽.Then Add another organization - Paid version(Features/Xero.feature:77)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 80,
  "name": "TC08_C:Add another organization - Starter Plan",
  "description": "",
  "id": "xero-test-cases-feature;tc08-c:add-another-organization---starter-plan",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 81,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 82,
  "name": "enter with master login",
  "keyword": "When "
});
formatter.step({
  "line": 83,
  "name": "Add another organization - Paid version",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "Add another organization - Starter Plan",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 8418061800,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.enter_with_master_login()"
});
formatter.result({
  "duration": 16422287000,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.add_another_organization_Paid_version()"
});
formatter.result({
  "duration": 18011554800,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton class\u003d\"xui-button xui-actions--secondary button__2_4F- xui-button-standard xui-button-medium xui-button-fullwidth\" tabindex\u003d\"0\" type\u003d\"button\" data-automationid\u003d\"NewOrgProv-BuyNow\"\u003e...\u003c/button\u003e is not clickable at point (657, 411). Other element would receive the click: \u003cspan class\u003d\"xui-pickitem--text\"\u003e...\u003c/span\u003e\n  (Session info: chrome\u003d85.0.4183.121)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SJNPATC\u0027, ip: \u0027192.168.0.25\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\dolby\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58334}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 2af44b124fe2fe97e00ed663693943ad\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.sri.Xero_Cucumber.Xero_Utility.clickObj(Xero_Utility.java:129)\r\n\tat com.sri.Xero_Cucumber.TestCases_Xero.add_another_organization_Paid_version(TestCases_Xero.java:412)\r\n\tat ✽.Then Add another organization - Paid version(Features/Xero.feature:83)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCases_Xero.add_another_organization_Starter_Plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 87,
  "name": "TC08_D:Add another organization - Standard Plan",
  "description": "",
  "id": "xero-test-cases-feature;tc08-d:add-another-organization---standard-plan",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 88,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 89,
  "name": "enter with master login",
  "keyword": "When "
});
formatter.step({
  "line": 90,
  "name": "Add another organization - Paid version",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "Add another organization - Standard Plan",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 6988220800,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.enter_with_master_login()"
});
formatter.result({
  "duration": 15796203600,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.add_another_organization_Paid_version()"
});
formatter.result({
  "duration": 14332256000,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton class\u003d\"xui-button xui-actions--secondary button__2_4F- xui-button-standard xui-button-medium xui-button-fullwidth\" tabindex\u003d\"0\" type\u003d\"button\" data-automationid\u003d\"NewOrgProv-BuyNow\"\u003e...\u003c/button\u003e is not clickable at point (657, 411). Other element would receive the click: \u003cspan class\u003d\"xui-pickitem--text\"\u003e...\u003c/span\u003e\n  (Session info: chrome\u003d85.0.4183.121)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SJNPATC\u0027, ip: \u0027192.168.0.25\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\dolby\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58470}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 285e318b3d9da79a061409af85a75c80\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.sri.Xero_Cucumber.Xero_Utility.clickObj(Xero_Utility.java:129)\r\n\tat com.sri.Xero_Cucumber.TestCases_Xero.add_another_organization_Paid_version(TestCases_Xero.java:412)\r\n\tat ✽.Then Add another organization - Paid version(Features/Xero.feature:90)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCases_Xero.add_another_organization_Standard_Plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 94,
  "name": "TC08_E:Add another organization - Premium Plan",
  "description": "",
  "id": "xero-test-cases-feature;tc08-e:add-another-organization---premium-plan",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 95,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 96,
  "name": "enter with master login",
  "keyword": "When "
});
formatter.step({
  "line": 97,
  "name": "Add another organization - Paid version",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "Add another organization - Premium Plan",
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 7111009300,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.enter_with_master_login()"
});
formatter.result({
  "duration": 14153412000,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.add_another_organization_Paid_version()"
});
formatter.result({
  "duration": 14505386600,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton class\u003d\"xui-button xui-actions--secondary button__2_4F- xui-button-standard xui-button-medium xui-button-fullwidth\" tabindex\u003d\"0\" type\u003d\"button\" data-automationid\u003d\"NewOrgProv-BuyNow\"\u003e...\u003c/button\u003e is not clickable at point (657, 411). Other element would receive the click: \u003cspan class\u003d\"xui-pickitem--text\"\u003e...\u003c/span\u003e\n  (Session info: chrome\u003d85.0.4183.121)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SJNPATC\u0027, ip: \u0027192.168.0.25\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\dolby\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58610}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: e2fc81b569b596c08472f04f64811f3b\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.sri.Xero_Cucumber.Xero_Utility.clickObj(Xero_Utility.java:129)\r\n\tat com.sri.Xero_Cucumber.TestCases_Xero.add_another_organization_Paid_version(TestCases_Xero.java:412)\r\n\tat ✽.Then Add another organization - Paid version(Features/Xero.feature:97)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCases_Xero.add_another_organization_Premium_Plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 101,
  "name": "TC08_F:Add another organization with current Quickbooks user",
  "description": "",
  "id": "xero-test-cases-feature;tc08-f:add-another-organization-with-current-quickbooks-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 102,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 103,
  "name": "enter with master login",
  "keyword": "When "
});
formatter.step({
  "line": 104,
  "name": "fill half page",
  "keyword": "Then "
});
formatter.step({
  "line": 105,
  "name": "Add another organization with current Quickbooks user",
  "keyword": "Then "
});
formatter.step({
  "line": 106,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 6700343400,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.enter_with_master_login()"
});
formatter.result({
  "duration": 15995471000,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.fill_half_page()"
});
formatter.result({
  "duration": 20046146200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SJNPATC\u0027, ip: \u0027192.168.0.25\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\dolby\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58736}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 6e698c8e2526c797de6d64ff8fd7db82\n*** Element info: {Using\u003dxpath, value\u003d/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.sri.Xero_Cucumber.Xero_Utility.findElement(Xero_Utility.java:77)\r\n\tat com.sri.Xero_Cucumber.TestCases_Xero.fill_half_page(TestCases_Xero.java:456)\r\n\tat ✽.Then fill half page(Features/Xero.feature:104)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCases_Xero.add_another_organization_with_current_Quickbooks_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 108,
  "name": "TC10_A:Check for subscription and billing",
  "description": "",
  "id": "xero-test-cases-feature;tc10-a:check-for-subscription-and-billing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 109,
  "name": "launch browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 110,
  "name": "enter username and password and click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 111,
  "name": "Check for subscription and billing",
  "keyword": "Then "
});
formatter.step({
  "line": 112,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases_Xero.launch_browser_and_open_url()"
});
formatter.result({
  "duration": 6416069600,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.enter_username_and_password_and_click_on_login_button()"
});
formatter.result({
  "duration": 15652677400,
  "status": "passed"
});
formatter.match({
  "location": "TestCases_Xero.check_for_subscription_and_billing()"
});
formatter.result({
  "duration": 20039866500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027xrh-dropdown-layout xrh-nav--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionleft\u0027]//div[@class\u003d\u0027xrh-dropdown--body\u0027]\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-SJNPATC\u0027, ip: \u0027192.168.0.25\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\dolby\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58857}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 8b6f85897ff7afb0775897c4b568d700\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027xrh-dropdown-layout xrh-nav--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionleft\u0027]//div[@class\u003d\u0027xrh-dropdown--body\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.sri.Xero_Cucumber.Xero_Utility.findElement(Xero_Utility.java:77)\r\n\tat com.sri.Xero_Cucumber.TestCases_Xero.check_for_subscription_and_billing(TestCases_Xero.java:482)\r\n\tat ✽.Then Check for subscription and billing(Features/Xero.feature:111)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCases_Xero.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});