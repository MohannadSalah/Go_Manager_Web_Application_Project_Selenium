package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

    protected static WebDriver driver;

    public PageBase(WebDriver driver) {
        PageBase.driver = driver;
    }

    public static void Clicking(WebElement element) {
        element.click();
    }

   public static void  Clear(WebElement element){
       Actions actions = new Actions(driver);
       actions.click(element).keyDown(Keys.CONTROL)
               .sendKeys("a").keyUp(Keys.CONTROL)
               .sendKeys(Keys.BACK_SPACE)
               .build()
               .perform();
   }
    public static void SendText(WebElement element, String text) {
        element.sendKeys(text);
    }
   public static void Selecting(WebElement element , String type){
       Select select = new Select(element);
       select.selectByValue(type);

   }

}