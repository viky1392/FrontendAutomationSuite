package com.moneylion.utils;

import org.openqa.selenium.WebDriver;

public class CommonFunctions {
	WebDriver driver = null;
	
	/*public webelementselection(String locator ,String locValue)
	{
		try {
			switch (locator) {
			case CLASSNAME:
				return driver.findElement(By.className(locValue));
			case CSS:
				return driver.findElement(By.cssSelector(locValue));
			case ID:
				return driver.findElement(By.id(locValue));
			case LINKTETXT:
				return driver.findElement(By.linkText(locValue.trim()));
			case NAME:
				return driver.findElement(By.name(locValue));
			case XPATH:
				return driver.findElement(By.xpath(locValue));
			case PARTIALLINK:
				return driver.findElement(By.partialLinkText(locValue));
			case TAGNAME:
				return driver.findElement(By.tagName(locValue));
			case BUTTONTEXT:
				return driver.findElement(By.xpath("//button[text()='" + locValue + "']"));
			case PARTIALBUTTONTEXT:
				return driver.findElement(By.xpath("//button[contains(text(),'" + locValue + "')]"));
			default:
				break;
			}
		} catch (NoSuchElementException e) {
			throw new RuntimeException();
		}
		return null;
	}
		
	}*/

}
