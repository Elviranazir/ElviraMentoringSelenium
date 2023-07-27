package WEEK4.Wednesday;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.openqa.selenium.Dimension;



public class Dimensions extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://itera-qa.azurewebsites.net/");
        Dimension dimension= new Dimension(1200,844);
        driver.manage().window().setSize(dimension);
        MyFunctions.waitFunc(3);
        driver.quit();
    }
}