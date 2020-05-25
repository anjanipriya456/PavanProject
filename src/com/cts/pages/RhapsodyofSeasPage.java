package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RhapsodyofSeasPage {
	public static By deckPlansLoc = By.xpath("//a[contains(text(),'DECK PLANS')]");
	
	public static void clickingDeckPlans(WebDriver driver) throws Exception
	{
		
	// click on DeckPlans
	driver.findElement(deckPlansLoc).click();

	// loading Time
	Thread.sleep(2000);
	}

}
