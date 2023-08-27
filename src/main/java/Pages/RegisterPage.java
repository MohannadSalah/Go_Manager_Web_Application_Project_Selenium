package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase{

Faker faker = new Faker();

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    By UserName = By.name("username");
    WebElement UsernameInput;

By Fname = By.name("first_name");
WebElement FirstName;

By Lname = By.name("last_name");
WebElement LastName;

By PhoneNumber = By.name("phone_number");
WebElement PhoneNumberInput;


By Email = By.name("email");
WebElement EmailInput;


By Password = By.name("password");
WebElement PasswordInput;

By ConfirmPassword = By.name("confirmPassword");
WebElement ConfirmPasswordInput;

By Register = By.xpath("//button[@type=\"submit\"]");
WebElement RegisterButton;

By GoToHomePage = By.xpath("//button[@aria-label=\"Go to home page\"]");
WebElement TextDisblayed;

By PhoneNumberMustBe11 = By.xpath("//p[text()='Phone Number field must contain 11 numbers']");

WebElement ErrorMassegeDisblayed;


    public RegisterPage setUserNameRegister(String userName){
       String User = new Faker().name().username();
        UsernameInput = driver.findElement(UserName);
        SendText(UsernameInput,User);
        return this;
    }
    public RegisterPage setFirstNameAndLastName(String First , String Last){
       String First_Name = new Faker().name().firstName();
        String Last_Name = new Faker().name().lastName();
        FirstName = driver.findElement(Fname);
        SendText(FirstName,First_Name);
        LastName = driver.findElement(Lname);
        SendText(LastName,Last_Name);
        return this;
    }

    public RegisterPage setPhoneNumber(String Phone){
        String Phone_Number = new Faker().phoneNumber().subscriberNumber(11);
        PhoneNumberInput = driver.findElement(PhoneNumber);
        SendText(PhoneNumberInput,Phone_Number);
        return this;
    }
    public RegisterPage setEmailInput(String EMail){
        String EMAIL = new Faker().internet().emailAddress();
        EmailInput = driver.findElement(Email);
        SendText(EmailInput,EMAIL);
        return this;
    }
    public RegisterPage setPasswordandConfirm(String pass , String Confirm){
        String PASSWORD = new Faker().internet().password();
        PasswordInput = driver.findElement(Password);
        SendText(PasswordInput,pass);
        ConfirmPasswordInput = driver.findElement(ConfirmPassword);
        SendText(ConfirmPasswordInput,pass);
        return this;
    }

    public RegisterPage ClickingOnRegisterButton(){
        RegisterButton = driver.findElement(Register);
        Clicking(RegisterButton);
        return this;
    }

    public  boolean IsTextDisblayed(){

        TextDisblayed = driver.findElement(GoToHomePage);
        return TextDisblayed.isDisplayed() ;


    }

    public boolean ErrorMassegeDisblayed(){
        ErrorMassegeDisblayed = driver.findElement(PhoneNumberMustBe11);
        return ErrorMassegeDisblayed.isDisplayed();

    }


}
