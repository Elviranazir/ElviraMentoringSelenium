package WEEK4.Thursday;

import Utilities.MyFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UsualSetup {
    /**
     * Usual SetUp with Basic Annotations:
     * Create one usual test by using BeforeMethod, AfterMethod and Test annotations.
     * Create the driver with BeforeMethod, close the driver with AfterMethod
     * Test: Go to the google.com and verify that title is "Google"
     **/
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void clean(){
        driver.quit();
    }

    @Test
    public void Test1(){
        driver.get("https://www.google.com/");
        MyFunctions.waitFunc(3);

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
