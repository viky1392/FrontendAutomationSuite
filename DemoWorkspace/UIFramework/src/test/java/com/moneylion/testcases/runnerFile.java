package com.moneylion.testcases;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features",glue= {"com.moneylion.testcases"},
	monochrome=true,
			plugin = { "pretty", "html:target/Reports/HtmlReports/index.html", 
					"json:target/Reports/JSONReports/report.json",
	                "junit:target/Reports/JunitReports/report.xml"},
	tags="@functional"
	
	)
	
	public class runnerFile {
		
	}

