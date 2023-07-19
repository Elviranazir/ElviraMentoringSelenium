package WEEK3.wednesday;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task2 extends BaseDriver {
    @Test
    public void Test1(){

        /**Example:2:
         1) Go to the "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver"
         2) Click to the alert button
         3) Wait until alert is displayed
         4) Switch to the alert and accept it**/

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        MyFunctions.waitFunc(2);

        WebElement allertButton = driver.findElement(By.xpath("//button[.='Click me, to Open an alert after 5 seconds']"));
        allertButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        MyFunctions.waitFunc(4);

        driver.switchTo().alert().accept();
    }
}
