package com.moneylion.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.moneylion.base.base;

public class homePage_ML extends base {
	
	@FindBy(xpath="//a[@class='menu-link-blank' and text()='About Us']")
	WebElement AboutUsMenuOption;
	
	@FindBy(xpath="//div[@class='header-sub-menu']//a[text()='About Us']")
	WebElement AboutUsSubMenuOption;
	
	public homePage_ML()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void howeveroverAboutus()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(AboutUsMenuOption).build().perform();
	}
	
	public void clickAboutUsSubMenu()
	{
		AboutUsSubMenuOption.click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

}
