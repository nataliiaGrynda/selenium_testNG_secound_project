package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.UnitedAirlinesConfirmingPage;
import pages.UnitedAirlinesMainPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Base {


   WebDriver driver;
  WebDriverWait explicitWait;
  UnitedAirlinesMainPage unitedAirlinesMainPage;
  Wait fluentWait;
  UnitedAirlinesConfirmingPage unitedAirlinesConfirmingPage;


  @BeforeTest
  public void setUp(){
   driver = Driver.getDriver();
   explicitWait = new WebDriverWait(driver, 30);
   unitedAirlinesMainPage = new UnitedAirlinesMainPage(driver);
   fluentWait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
   unitedAirlinesConfirmingPage = new UnitedAirlinesConfirmingPage(driver);
  }



  @AfterTest
  public void tearDown(){
   driver.quit();
  }


}
