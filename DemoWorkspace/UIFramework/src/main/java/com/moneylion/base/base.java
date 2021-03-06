package com.moneylion.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.moneylion.utils.utils;

public class base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public base()
	{
		try {
			prop = new Properties();
			FileInputStream input = new FileInputStream(System.getProperty("user.dir"+
			"/src/main/java/com/moneylion/config/config.properties"));
			prop.load(input);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();	
		}
		catch(IOException e) {
			e.printStackTrace();	
		}
		
	}

	public void browserinitialization()
	{
		 String browsername = prop.getProperty("browser");
		 if(browsername.equalsIgnoreCase("chrome"))
		 {
			   System.setProperty("webdriver.chrome.driver", "user.dir"+"/drivers/chromedriver.exe");
			   driver = new ChromeDriver();
		 }
		 else if(browsername.equalsIgnoreCase("edge"))
		 {
			   System.setProperty("webdriver.edge.driver", "user.dir"+"/drivers/msedgedriver.exe");
			   driver = new EdgeDriver();
		 }
		   driver.manage().deleteAllCookies();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().pageLoadTimeout(utils.PageloadTimeouts, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(utils.Implicitwait, TimeUnit.SECONDS);
		   driver.get(prop.getProperty("proxyurl"));
		   
	}
}
