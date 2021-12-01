package com.moneylion.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.moneylion.base.base;

public class proxypage extends base {
	
	@FindBy(xpath="//input[@id='input']")
	WebElement Searchbox;
	
	@FindBy(xpath="//input[@value='Surf anonymously']")
	WebElement SurfAnonymousBtn;
	
	public proxypage()
	{
		PageFactory.initElements(driver, this);
	}
	public void openproxysite()
	{
		driver.navigate().to("https://hidester.com/proxy/");
	}
	
	public void searchsite()
	{
		Searchbox.sendKeys("moneylion.com");
	}
	
	public void SurfAnonymous()
	{
		SurfAnonymousBtn.click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

}
