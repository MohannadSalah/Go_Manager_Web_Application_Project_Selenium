package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CreateStorePage extends PageBase {

private Faker faker = new Faker();
    public CreateStorePage(WebDriver driver) {
        super(driver);
    }
By CreateStore = By.cssSelector("div[class=\"MuiBox-root rtl-0\"] > button[tabindex=\"0\"]");
    WebElement CreateStoreButton;

    By Store = By.id("store_name");
    WebElement StoreName;

    By Country = By.id("country");
    WebElement CountryName;

    By City = By.name("city");
    WebElement CityName;

    By Street = By.id("street");
    WebElement StreetName;

    By Create = By.cssSelector("[type=\"submit\"]");
    WebElement CreateButton;

    By Ps4PriceSingle = By.xpath("(//input[@name=\"price\"])[1]");
    WebElement SinglePs4;

    By Ps4PriceMulti = By.xpath("(//input[@name=\"price\"])[2]");
    WebElement MultiPs4;

    By Ps4PriceRoomSingle = By.xpath("(//input[@name=\"price\"])[3]");
    WebElement RoomSinglePs4;

    By Ps4PriceRoomMulti = By.xpath("(//input[@name=\"price\"])[4]");
    WebElement RoomMultiPs4;

    By Create2 = By.xpath("(//button[@type=\"submit\"])");
    WebElement Create2Button;

    By Ps5PriceSingle = By.xpath("(//input[@type=\"text\"])[3]");
    WebElement SinglePs5;

    By Ps5PriceMulti = By.xpath("(//input[@type=\"text\"])[5]");
    WebElement MultiPs5;

    By Ps5PriceRoomSingle = By.xpath("(//input[@type=\"text\"])[7]");
    WebElement RoomSinglePs5;

    By Ps5PriceRoomMulti = By.xpath("(//input[@type=\"text\"])[9]");
    WebElement RoomMultiPs5;

    By Create3 = By.xpath("(//button[@type=\"submit\"])");
WebElement Create3Button;

    By IsTextDisblayed = By.xpath("//h5[text()='Your subscription is about to end']");
    WebElement TextDisblayed;



    public CreateStorePage ClickingOnCreateStoreButton(){
        CreateStoreButton = driver.findElement(CreateStore);
        Clicking(CreateStoreButton);
        new WebDriverWait(driver, Duration.ofSeconds(20));
        return this;
    }

    public CreateStorePage setCreateStoreFirstPage(String storeName , String country , String city ,String street ){
        String Store_Name = new Faker().company().name();
        String City_Name = new Faker().address().cityName();
        String Country_Name = new Faker().address().country();
        String Street_Name = new Faker().address().streetName();


        StoreName = driver.findElement(Store);
        SendText(StoreName,Store_Name);
        CountryName = driver.findElement(Country);
        SendText(CountryName , Country_Name);
        CityName = driver.findElement(City);
        SendText(CityName,City_Name);
        StreetName = driver.findElement(Street);
        SendText(StreetName,Street_Name);
        return this;

    }
public CreateStorePage ClickingOnCreate(){
        CreateButton = driver.findElement(Create);
        Clicking(CreateButton);
    new WebDriverWait(driver,Duration.ofSeconds(20));
    return this;

}
public CreateStorePage setCreateStoreSecondPage(String singlePs4 , String multiPs4 , String roomSinglePs4 , String roomMultiPs4){
        String Single_PS4 = new Faker().number().digits(2);
        String multi_PS4 = new Faker().number().digits(2);
        String roomSingle_PS4 = new Faker().number().digits(2);
        String roomMulti_PS4 = new Faker().number().digits(2);


       SinglePs4  = driver.findElement(Ps4PriceSingle);
       SendText( SinglePs4,Single_PS4);
       MultiPs4 = driver.findElement(Ps4PriceMulti);
       SendText(MultiPs4 , multi_PS4);
       RoomSinglePs4 = driver.findElement(Ps4PriceRoomSingle);
       SendText(RoomSinglePs4 , roomSingle_PS4);
       RoomMultiPs4 = driver.findElement(Ps4PriceRoomMulti);
       SendText(RoomMultiPs4 , roomMulti_PS4);
    return this;

}
public CreateStorePage ClickingOnCreate2(){
        Create2Button = driver.findElement(Create2);
        Clicking(Create2Button);
    new WebDriverWait(driver,Duration.ofSeconds(20));
    return this;

}
    public CreateStorePage setCreateStoreThirdPage(String singlePs5 , String multiPs5 , String roomSinglePs5 , String roomMultiPs5){
        String Single_PS5 = new Faker().number().digits(2);
        String multi_PS5 = new Faker().number().digits(2);
        String roomSingle_PS5 = new Faker().number().digits(3);
        String roomMulti_PS5 = new Faker().number().digits(3);


        SinglePs5  = driver.findElement(Ps5PriceSingle);
        SendText( SinglePs5,Single_PS5);
        MultiPs5 = driver.findElement(Ps5PriceMulti);
        SendText(MultiPs5,multi_PS5);
        RoomSinglePs5 = driver.findElement(Ps5PriceRoomSingle);
        SendText(RoomSinglePs5,roomSingle_PS5);
        RoomMultiPs5 = driver.findElement(Ps5PriceRoomMulti);
        SendText(RoomMultiPs5,roomMulti_PS5);
        new WebDriverWait(driver,Duration.ofSeconds(20));
        return this;

    }

    public CreateStorePage ClickingOnCreate3(){
        Create3Button = driver.findElement(Create3);
        Clicking(Create3Button);
        new WebDriverWait(driver,Duration.ofSeconds(20));
        return this;

    }
    public boolean IsTextDisblayed(){

        TextDisblayed = driver.findElement(IsTextDisblayed);
        return TextDisblayed.isDisplayed() ;

    }

}
