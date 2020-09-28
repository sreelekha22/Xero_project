package com.sri.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features\\Xero.feature", glue = {"com.sri.Xero_Cucumber"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
		"pretty","html:target/cucumber","json:target/cucumber.json"})
public class Xero_runner {

}
