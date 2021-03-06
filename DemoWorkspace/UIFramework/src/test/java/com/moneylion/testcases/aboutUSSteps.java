package com.moneylion.testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.moneylion.pages.proxypage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class aboutUSSteps {
	
	WebDriver driver = null;
	proxypage proxypg = new proxypage();

@Given("^browser is open$")
	public void browser_is_open() {
	
	String Projectpath = System.getProperty("user.dir");
		
	   System.setProperty("webdriver.chrome.driver", Projectpath+"/drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	}


	@When("user searches for moneylion site")
	public void user_searches_for_moneylion_site() {
		
		proxypg.openproxysite();
		proxypg.searchsite();
		driver.findElement(By.xpath("//input[@value='Surf anonymously']")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		    
	}
	
	@When("user however over AboutUS menu option")
	public void user_however_over_about_us_menu_option() {
		
		WebElement ele =driver.findElement(By.xpath("//a[@class='menu-link-blank' and text()='About Us']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();   
	}

	@When("Clicks on AboutUS submenu option")
	public void clicks_on_about_us_submenu_option() {
		
		driver.findElement(By.xpath("//div[@class='header-sub-menu']//a[text()='About Us']")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	   
	}

	@Then("User is navigated to AboutUS page")
	public void user_is_navigated_to_about_us_page() {
		
		String Pagetext = driver.findElement(By.xpath("//div//h1[text()='Our Mission']")).getText();
		System.out.println(Pagetext);
		if(Pagetext.equals("OUR MISSION"))
		{
			System.out.println("user is in AboutUS page");
		}
		else
		{
			System.out.println("user is Not in AboutUS page");
		}
	    
	}

	@And("^validate if (.*) are displayed$")
	public void validate_if_office_new_york_are_displayed(String officelocation) {
		
		String locales = driver.findElement(By.xpath("//div[@class='about-us-locations-grid']//p")).getText();
		System.out.println(locales);
		if(officelocation.equals(locales))
		{
			System.out.println("Expected locations are found");
		}
		else
		{
			System.out.println("Expected locations are Not found");
		}
		driver.quit();
	   
	}

	
}
