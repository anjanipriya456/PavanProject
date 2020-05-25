package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static By whaleWatchLoc = By.xpath("//a[contains(text(),'whale watching tour')]");
	public static By openButtonLoc = By
			.xpath("//button[@id='rciHeaderOpenSidenav']//figure[@class='header__buttonIcon']");
	public static By planCruiseLoc = By.xpath("//span[contains(text(),'Plan A Cruise')]");
	public static By closeButtonLoc = By.xpath("//button[@id='rciHeaderCloseSidenav']//img[@class='headerSidenav__buttonImage']");
	public static By shipsLoc = By.id("rciHeaderMenuItem-2");
	public static WebElement whaleWatchEle(WebDriver driver) {

		WebElement whaleWatchEle = driver.findElement(whaleWatchLoc);
		return whaleWatchEle;
	}

	public static void clickOnPlanACruise(WebDriver driver) throws InterruptedException {
		// click on plan a cruise
		driver.findElement(openButtonLoc).click();
		driver.findElement(planCruiseLoc).click();
		// loading Time
		Thread.sleep(2000);
	}

	public static void clickingShips(WebDriver driver) throws InterruptedException {
		// search by Ships
		driver.findElement(closeButtonLoc).click();
		driver.findElement(shipsLoc).click();
		// loading Time
		Thread.sleep(2000);
	}

	

}
