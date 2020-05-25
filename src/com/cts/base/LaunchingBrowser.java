package com.cts.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchingBrowser {
	public WebDriver driver;
	
	@BeforeMethod
	public void browserOpening()
	{
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.royalcaribbean.com/alaska-cruises");
	}
	
	@AfterMethod
	public void browserClosing()
	{
		driver.close();
	}
}
