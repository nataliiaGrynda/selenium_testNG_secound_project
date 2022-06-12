package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitedAirlinesTest extends Base {

  /*
    Test Case 1: Validate "Main menu" navigation items
    Given user is on "https://www.united.com/en/us"
    Then user should see “Main menu” navigation items
      |BOOK                              |
      |MY TRIPS                          |
      |TRAVEL INFO                       |
      |MILEAGEPLUS® PROGRAM              |
      |DEALS                             |
      |HELP
    */
  @Test(priority = 1, description = "validate if menu bar is visible")
  public void mainMenuNavigationItems() {
    driver.get("https://www.united.com/en/us");
    Assert.assertTrue(unitedAirlinesMainPage.mainMenuNavigationItems.isDisplayed());
    Assert.assertEquals(unitedAirlinesMainPage.bookHeading.getText(), "BOOK");
    Assert.assertEquals(unitedAirlinesMainPage.myTripsHeading.getText(), "MY TRIPS");
    Assert.assertEquals(unitedAirlinesMainPage.travelInfoHeading.getText(), "TRAVEL INFO");
    Assert.assertEquals(unitedAirlinesMainPage.milagePlusHeading.getText(), "MILEAGEPLUS® PROGRAM");
    Assert.assertEquals(unitedAirlinesMainPage.dealsHeading.getText(), "DEALS");
    Assert.assertEquals(unitedAirlinesMainPage.helpHeading.getText(), "HELP");
  }

  @Test(priority = 2, description = "validate if book travel menu is visible")
  public void bookTravelMenu() {
    driver.get("https://www.united.com/en/us");
    Assert.assertTrue(unitedAirlinesMainPage.bookTravelMenu.isDisplayed());
    Assert.assertEquals(unitedAirlinesMainPage.bookHeading2.getText(), "Book");
    Assert.assertEquals(unitedAirlinesMainPage.flightStatus.getText(), "Flight status");
    Assert.assertEquals(unitedAirlinesMainPage.checkIn.getText(), "Check-in");
    Assert.assertEquals(unitedAirlinesMainPage.myTrips.getText(), "My trips");
  }

  @Test(priority = 3, description = "validate radio button")
  public void radioButton() throws InterruptedException {
    driver.get("https://www.united.com/en/us");
    Assert.assertTrue(unitedAirlinesMainPage.roundTripButtonText.isDisplayed());
    Assert.assertTrue(unitedAirlinesMainPage.oneWayButtonText.isDisplayed());
    Assert.assertTrue(unitedAirlinesMainPage.roundTripButton.isSelected());
    Assert.assertTrue(unitedAirlinesMainPage.roundTripButton.isEnabled());
    Assert.assertTrue(unitedAirlinesMainPage.oneWayButton.isEnabled());
    Assert.assertFalse(unitedAirlinesMainPage.oneWayButton.isSelected());
    unitedAirlinesMainPage.oneWayButton.click();
    Assert.assertFalse(unitedAirlinesMainPage.roundTripButton.isSelected());
    Assert.assertTrue(unitedAirlinesMainPage.oneWayButton.isSelected());
  }


  @Test(priority = 4, description = "validate book with miles and flexibale dates check boxes")
  public void bookWithMilesAndFlexibleDatesCheckBoxes() {
    driver.get("https://www.united.com/en/us");

    Assert.assertTrue(unitedAirlinesMainPage.bookWithMilesCheckBox.isDisplayed());
    Assert.assertTrue(unitedAirlinesMainPage.bookWithMilesCheckBox.isEnabled());
    Assert.assertFalse(unitedAirlinesMainPage.bookWithMilesCheckBox.isSelected());
    Assert.assertTrue(unitedAirlinesMainPage.flexibleDates.isDisplayed());
    Assert.assertTrue(unitedAirlinesMainPage.flexibleDates.isEnabled());
    Assert.assertFalse(unitedAirlinesMainPage.flexibleDates.isSelected());
    unitedAirlinesMainPage.bookWithMilesCheckBox.click();
    unitedAirlinesMainPage.flexibleDates.click();
    Assert.assertFalse(unitedAirlinesMainPage.bookWithMilesCheckBox.isSelected());
    Assert.assertFalse(unitedAirlinesMainPage.flexibleDates.isSelected());
  }

  @Test(priority = 5, description = "validate one way ticket search result")
  public void oneWayTicketSearchResult() {
    driver.get("https://www.united.com/en/us");
    unitedAirlinesMainPage.oneWayButton.click();
    unitedAirlinesMainPage.fromInputBox.clear();
    unitedAirlinesMainPage.fromInputBox.sendKeys("Chicago, IL, US (ORD");
    unitedAirlinesMainPage.toInputBox.clear();
    unitedAirlinesMainPage.toInputBox.sendKeys("Miami, FL, US (MIA");
    unitedAirlinesMainPage.confirmToFly.click();
    unitedAirlinesMainPage.datesInputBox.clear();
    unitedAirlinesMainPage.datesInputBox.sendKeys("Jan 30");
    unitedAirlinesMainPage.travelersButton.click();
    unitedAirlinesMainPage.numbersOfTravelersInput.sendKeys("2");
    unitedAirlinesMainPage.cabinDropDown.click();
    unitedAirlinesMainPage.businessOrFirstClass.click();
    unitedAirlinesMainPage.findFlightsButton.click();

    //Assert.assertEquals(unitedAirlinesConfirmingPage.departureConfirmation.getText(),"Depart: Chicago, IL, US to Miami, FL, US");
  }
}



















