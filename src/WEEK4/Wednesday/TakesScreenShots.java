package WEEK4.Wednesday;

import Utilities.BaseDriver;
import Utilities.MyFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;



import java.io.File;
import java.io.IOException;

public class TakesScreenShots extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://itera-qa.azurewebsites.net/");
        //Login test
        WebElement login= driver.findElement(By.xpath("//a[@href=\"/Login\"]"));
        login.click();
        WebElement userName= driver.findElement(By.xpath("//input[@id='Username']"));
        userName.sendKeys("wreweddf");
        WebElement loginBtn= driver.findElement(By.xpath("//input[@name='login']"));
        loginBtn.click();
        WebElement errorMsg= driver.findElement(By.xpath("//label[.='Wrong username or password']"));

        //  String randomName= RandomStringUtils.randomAlphabetic(6);
        String fileName=errorMsg.getText();
        if (errorMsg.isDisplayed()){
            MyFunctions.takeScreenShots(driver,fileName);
        }

    }
}