package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SessionsPage extends PageBase {


    public SessionsPage(WebDriver driver) {
        super(driver);}

        By AddCard = By.xpath("//button[text()='+']");
        WebElement AddCardButton;

        By Title = By.id("title");
        WebElement TitleInput;

        By Submit = By.xpath("//button[@type=\"submit\"]");
        WebElement SubmitNewCard;


        By Device =By.xpath("(//div[@role=\"button\"])[1]");
        WebElement device;


        By DeviceType = By.xpath("//li[@data-value=\"ps4\"]");
        WebElement SelectDeviceType ;

        By SessionType = By.xpath("(//div[@role=\"button\"])[2]");
        WebElement ClickingOnSessionsType ;

        By SelectSessionType = By.xpath("//li[@data-value=\"multi\"]");
        WebElement  SessionsTypeSelecting;



        By Time = By.name("time");
        WebElement SetTime;

        By Price = By.name("price");
        WebElement SetPrice;

        By Note = By.name("note");
        WebElement Notes;

        By Start = By.xpath("(//button[@type=\"button\"])[4]");
        WebElement ClickingOnStart;

        By AssertingCard = By.xpath("//button[text() = 'End']");
        WebElement EndButtonDisblayed;

       /* By GetSidebarMenu = By.cssSelector("div[class=\"MuiToolbar-root MuiToolbar-regular rtl-1vnwtzf\"] > button[class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium rtl-jwd9ht\"]");
        WebElement SidebarMenu;*/
        By MenuButton = By.cssSelector("li[class=\"MuiListItem-root MuiListItem-padding rtl-17v15ox\"] > a[href=\"/menu/\"]");
        WebElement Menu;
        By AddMenu = By.xpath("//button[@aria-label=\"Add\"]");
        WebElement AddMenuButton;

        By Category = By.name("cat");
        WebElement TypeCategory;

        By CategoryPrice = By.name("price");
        WebElement MenuCategoryPrice;

        By NameCard = By.name("title");
        WebElement CardName;

        By SubmitCategory = By.cssSelector("button[type=\"submit\"]");
        WebElement SubmitCategoryButton;

        By AddItemDisblayed = By.xpath("//button[@aria-label=\"Add Item\"]");
        WebElement AddItemIsDisblayed;




        public SessionsPage ClickingOnPlusButton(){

            AddCardButton = driver.findElement(AddCard);
            Clicking(AddCardButton);
            return this;
        }
        public SessionsPage AddTitle(String title){
            TitleInput = driver.findElement(Title);
            SendText( TitleInput,title);
            return this;
        }

        public SessionsPage ClickingOnSubmitButton(){
            SubmitNewCard = driver.findElement(Submit);
            Clicking(SubmitNewCard);
            return this;
        }

        public SessionsPage SelectingDeviceType(){
            new WebDriverWait(driver, Duration.ofSeconds(20));
            device = driver.findElement(Device);
            Clicking(device);
            new WebDriverWait(driver, Duration.ofSeconds(20));
       SelectDeviceType = driver.findElement(DeviceType);
            Clicking(SelectDeviceType);
            return this;
        }

        public SessionsPage SessionsType(){
            ClickingOnSessionsType = driver.findElement(SessionType);
            Clicking(ClickingOnSessionsType);
            new WebDriverWait(driver, Duration.ofSeconds(20));
            SessionsTypeSelecting = driver.findElement(SelectSessionType);
            Clicking(SessionsTypeSelecting);
            return this;
        }

        public SessionsPage SetUserTime(String setTime){
            new WebDriverWait(driver, Duration.ofSeconds(20));
            SetTime = driver.findElement(Time);
            SendText(SetTime , setTime);
            return this;
        }

        public SessionsPage SetHourPrice(String setPrice){
            SetPrice = driver.findElement(Price);
            SendText(SetPrice , setPrice);
            return this;
        }

        public SessionsPage WritingNote(String WriteNote){
            Notes = driver.findElement(Note);
            SendText(Notes,WriteNote);
            return this;
        }

        public SessionsPage ClickingOnStartButton(){
            ClickingOnStart = driver.findElement(Start);
            Clicking(ClickingOnStart);
            return this;
        }

        public boolean EndButtonIsDisblayed(){
            new WebDriverWait(driver, Duration.ofSeconds(20));
            EndButtonDisblayed = driver.findElement(AssertingCard);
            return EndButtonDisblayed.isDisplayed();
        }

        public SessionsPage AddOrders(String CategoryName , String CategoryPriceMenu , String MenuCardName){
           /* SidebarMenu = driver.findElement(GetSidebarMenu);
            Clicking(SidebarMenu);*/
            Menu = driver.findElement(MenuButton);
            Clicking(Menu);
            new WebDriverWait(driver, Duration.ofSeconds(20));
            AddMenuButton = driver.findElement(AddMenu);
            Clicking(AddMenuButton);
            TypeCategory = driver.findElement(Category);
            SendText(TypeCategory ,CategoryName);
            MenuCategoryPrice = driver.findElement(CategoryPrice);
            SendText(MenuCategoryPrice , CategoryPriceMenu);
            CardName = driver.findElement(NameCard);
            SendText(CardName , MenuCardName);
            SubmitCategoryButton = driver.findElement(SubmitCategory);
            Clicking(SubmitCategoryButton);
            return this;
        }
       public boolean AddItemIsDsblayed(){
            AddItemIsDisblayed = driver.findElement(AddItemDisblayed);
            return AddItemIsDisblayed.isDisplayed();
       }



}
