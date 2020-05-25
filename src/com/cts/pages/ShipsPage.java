package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShipsPage {

	public static By rhapsodyLoc = By.xpath("//p[contains(text(),'Rhapsody of the Seas')]");

	public static void clickingRhapsody(WebDriver driver) throws InterruptedException {
		// clicking Rhapsody of the Seas
		driver.findElement(rhapsodyLoc).click();

		// loading Time
		Thread.sleep(2000);
}
}

