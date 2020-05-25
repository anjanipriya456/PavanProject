package com.cts.tests;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.cts.base.LaunchingBrowser;
import com.cts.pages.DeckPlansPage;
import com.cts.pages.HomePage;
import com.cts.pages.RhapsodyofSeasPage;
import com.cts.pages.ShipsPage;

public class ExploreTest extends LaunchingBrowser {

	@Test
	public void exploreCruisesToAlaskaTest() throws Exception {

		// presence of whale watching Link
		String whaleWatchText = HomePage.whaleWatchEle(driver).getText();
		whaleWatchText = whaleWatchText.substring(0, 14);
		System.out.println(whaleWatchText);

		// Getting Page source
		String pageSource = driver.getPageSource();

		if (pageSource.toLowerCase().contains(whaleWatchText)) {
			System.out.println("Whale watch Link is present");
		} else {
			System.out.println("Whale watch Link is not  present");
		}

		// click on plan a cruise
		HomePage.clickOnPlanACruise(driver);

		// search by Ships
		HomePage.clickingShips(driver);

		// clicking Rhapsody of the Seas
		ShipsPage.clickingRhapsody(driver);

		// clicking Deck Plans
		RhapsodyofSeasPage.clickingDeckPlans(driver);

		// Change to Deck Eight
		DeckPlansPage.selectingDeck(driver);

		// presence of royal suite
		String royalSuiteText = DeckPlansPage.royalSuiteEle(driver).getText();
		royalSuiteText = royalSuiteText.substring(0, 11);
		System.out.println(royalSuiteText);

		// Getting Page source
		// String pageSource = driver.getPageSource();

//Assertion
		if ((whaleWatchText.equals("whale watching")) && (royalSuiteText.equals("Royal Suite"))) {
			System.out.println("Whale watch Link and Royal Suite Text is present");
		} else {
			Assert.fail("Does not meet my requirements");
		}

	}

}
