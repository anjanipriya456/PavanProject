package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DeckPlansPage {
	public static By deckDropDownLoc = By.xpath("//select[@id='deckDropdown']");
	public static By royalSuiteLoc = By.xpath("//h4[contains(text(),'Royal Suite - 1 Bedroom')]");

	public static void selectingDeck(WebDriver driver) throws InterruptedException {
		// Change to Deck Eight
		WebElement deckDropDownEle = driver.findElement(deckDropDownLoc);
		Select selectDeckDropDown = new Select(deckDropDownEle);
		selectDeckDropDown.selectByVisibleText("Deck Eight");
		
		// loading Time
				Thread.sleep(2000);
	}
	
			public static WebElement royalSuiteEle(WebDriver driver)
			{
				// presence of royal suite
				WebElement royalSuiteEle = driver.findElement(royalSuiteLoc);
				return royalSuiteEle;
			}

}
