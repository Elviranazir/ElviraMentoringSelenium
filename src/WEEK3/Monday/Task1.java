package WEEK3.Monday;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement login = driver.findElement(By.xpath("//a[@href=\"/Login\"]"));
        login.click();

        WebElement username = driver.findElement(By.cssSelector("input[id='Username']"));
        username.sendKeys("jhdkhds");

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("21531sds");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@name='login']"));
        loginBtn.click();

        //Navigate to Auto test
        WebElement testOtomation = driver.findElement(By.xpath("//a[@href=\"/home/automation\"]"));
        testOtomation.click();

        WebElement female = driver.findElement(By.xpath("//input[@id='female']"));
        System.out.println("female.isDisplayed() --> " + female.isDisplayed()); //true
        System.out.println("female.isEnabled() --> "+female.isEnabled()); //true
        System.out.println("female.isSelected() --> "+female.isSelected()); //false
        System.out.println("......................................");
        female.click();
        System.out.println("female.isDisplayed() --> " + female.isDisplayed()); //true
        System.out.println("female.isEnabled() --> "+female.isEnabled()); //true
        System.out.println("female.isSelected() --> "+female.isSelected()); //false
        System.out.println(".........................................");

        WebElement other = driver.findElement(By.cssSelector("input#other"));
        other.click();
        System.out.println("other.isEnabled() = " + other.isEnabled());
        System.out.println("other.getText() = " + other.isDisplayed());


        WebElement dropDownMenu = driver.findElement(By.xpath("//select[@class=\"custom-select\"]"));
        Select select = new Select(dropDownMenu);
        MyFunctions.waitFunc(1);
        select.selectByIndex(2);
        MyFunctions.waitFunc(1);
        select.selectByValue("5");
        MyFunctions.waitFunc(1);
        select.selectByVisibleText("Norway");

        List<WebElement>optionList=driver.findElements(By.cssSelector(".custom-select>option"));
        for (int i = 0; i < optionList.size(); i++) {
            select.selectByIndex(i);
            System.out.println(optionList.get(i).getText()+" is selected ?= "+ optionList.get(i).isSelected());
            MyFunctions.waitFunc(2);

        }

        MyFunctions.waitFunc(3);
        driver.quit();



    }
}
