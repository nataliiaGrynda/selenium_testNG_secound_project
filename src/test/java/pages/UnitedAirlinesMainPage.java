package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnitedAirlinesMainPage {

  public UnitedAirlinesMainPage(WebDriver driver){
    PageFactory.initElements(driver, this);
  }
   // 1test case
  @FindBy(xpath = "//div[@role='tablist']/a")
  public WebElement mainMenuNavigationItems;

  @FindBy(id = "headerNav0")
  public WebElement bookHeading;

  @FindBy(id = "headerNav1")
  public WebElement myTripsHeading;

  @FindBy(id = "headerNav2")
  public WebElement travelInfoHeading;

  @FindBy(id = "headerNav3")
  public WebElement milagePlusHeading;

  @FindBy(id = "headerNav4")
  public WebElement dealsHeading;

  @FindBy(id = "headerNav5")
  public WebElement helpHeading;

  // 2test case
  @FindBy(css = "ul[class='app-components-BookTravel-bookTravel__travelNav--3RNBj'] li")
  public WebElement bookTravelMenu;

  @FindBy(xpath = "//li[@id='travelTab']")
  public WebElement bookHeading2;

  @FindBy(xpath = "//li[@id='statusTab']")
  public WebElement flightStatus;

  @FindBy(xpath = "//li[@id='checkInTab']")
  public WebElement checkIn;

  @FindBy(xpath = "//li[@id='tripsTab']")
  public WebElement myTrips;

  @FindBy(css = "label[for='roundtrip']")
  public WebElement roundTripButtonText;

  @FindBy(id = "roundtrip")
  public WebElement roundTripButton;

  @FindBy(css = "label[for='oneway']")
  public WebElement oneWayButtonText;

  @FindBy(id = "oneway")
  public WebElement oneWayButton;

  //4 test case
  @FindBy(css = "label[for='award']")
  public WebElement bookWithMilesCheckBox;

  @FindBy(id = "flexDatesLabel")
  public WebElement flexibleDates;

  @FindBy(id = "bookFlightOriginInput")
  public WebElement fromInputBox;

  @FindBy(id = "bookFlightDestinationInput")
  public WebElement toInputBox;

  @FindBy(css = "#autocomplete-item-0")
  public WebElement confirmToFly;

  @FindBy(id = "DepartDate")
  public WebElement datesInputBox;

  @FindBy(xpath = "//button[@class=\"app-components-PassengerSelector-passengers__passengerButton--w8CX7 app-components-BookFlightForm-bookFlightForm__animatedButton--1UzDj\"]")
  public WebElement travelersButton;

  @FindBy(xpath = "//input[contains(@aria-label, 'Adults')]")
  public WebElement numbersOfTravelersInput;

  @FindBy(id = "cabinType")
  public WebElement cabinDropDown;

  @FindBy(id = "cabinType_item-2")
  public WebElement businessOrFirstClass;

  @FindBy(css = "button[aria-label=\"Find flights\"]")
  public WebElement findFlightsButton;

}
