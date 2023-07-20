package WEEK3.wednesday;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 extends BaseDriver {
   /** Example:1:
    1) Go to the "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver"
    2) Click to the "Change Text to Selenium WebDriver Button"
    3) Wait until "Selenium Webdriver" text is available
    4) Assert that texts match **/

   @Test
    public void Test1(){

       driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
       WebElement ChangeTexttoSeleniumWebDriverButton = driver.findElement(By.id("populate-text"));
       ChangeTexttoSeleniumWebDriverButton.click();

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h2[.='Selenium Webdriver']")));

       Assert.assertTrue("Selenium Webdriver",true);
   }

}
