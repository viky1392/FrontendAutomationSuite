package com.moneylion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.moneylion.base.base;

public class aboutUSPage_ML extends base{
	
	@FindBy(xpath="//div//h1[text()='Our Mission']")
	WebElement VerifyPage;
	
	@FindBy(xpath="//div[@class='about-us-locations-grid']//p")
	WebElement Verifylocaletext;
	
	public void aboutUSPage_ML()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyNavigatedPage()
	{
		String Pagetext = VerifyPage.getText();
		if(Pagetext.equals("OUR MISSION"))
		{
			System.out.println("user is in AboutUS page");
		}
		else
		{
			System.out.println("user is Not in AboutUS page");
		}
	}
	
	public void verifylocales(String officelocation)
	{
	String locales = Verifylocaletext.getText();
	System.out.println(locales);
	if(officelocation.equals(locales))
	{
		System.out.println("Expected locations are found");
	}
	else
	{
		System.out.println("Expected locations are Not found");
	}
	}
	

}
