package WEEK2.Wednesday;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
1-Go to the amazon.com
2-Locate the menus: Gift cart, Registry and Sell. (Use only Css selector)
3-Get thetext of these webelements
 */
public class CssPractice extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.amazon.com/");



        WebElement giftCard = driver.findElement(By.cssSelector("a[data-csa-c-slot-id=\"nav_cs_14\"]"));
        System.out.println(giftCard.getText());
        giftCard.click();

        WebElement register = driver.findElement(By.cssSelector("a[href=\"/gp/browse.html?node=16115931011&ref_=nav_cs_registry\"]"));
        System.out.println(register.getText());
        register.click();


        MyFunctions.waitFunc(1);
        driver.quit();




    }
}
