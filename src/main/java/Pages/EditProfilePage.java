package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditProfilePage extends PageBase {
    private Faker faker = new Faker();

    public EditProfilePage(WebDriver driver) {
        super(driver);
    }

    By ProfileSetting = By.xpath("//button[@aria-label=\"Profile/Settings\"]");
    WebElement ProfileSettingButton;

    By Profile = By.xpath("(//li[@tabindex=\"-1\"])[3]");
    WebElement ProfileButton;

    By UserName = By.id("username");
    WebElement ChangeUserName;

    By Email = By.id("email");
    WebElement ChangeEmail;
    By PhoneNumber = By.id("phone_number");
    WebElement ChangePhoneNumber;

    By Edit = By.xpath("//button[text()='Edit']");
    WebElement ClickingOnEdit;

    By ChangePassword = By.xpath("//button[text()='Change Password']");
    WebElement ChangePasswordButton;

    By OldPassword = By.name("oldPassword");
    WebElement WriteOldPassword;
    By NewPassword = By.name("newPassword");
    WebElement SetNewPassword;

    By ConfirmPassword = By.name("confirmPassword");
    WebElement SetConfirmPassword;

    By AfterChangePassword = By.xpath("(//button[text()='Change Password'])[2]");
    WebElement AfterChangePasswordButton;

    By ProfileUpdatedSuccessfully = By.xpath("//div[text()='Profile updated Successfully']");
  WebElement ProfileUpdatedSuccessfullyIsDisblayed;
    By PasswordChangedSuccessfully = By.xpath("//div[text()='Password Changed Successfully']");
    WebElement PasswordChangedSuccessfullyIsDisblayed;


    public EditProfilePage EditProfileData(String changeUsername , String changeEMail , String changePhonenumber){
        ProfileSettingButton = driver.findElement(ProfileSetting);
        Clicking(ProfileSettingButton);
        ProfileButton = driver.findElement(Profile);
        Clicking(ProfileButton);
        String User = new Faker().name().username();
        ChangeUserName = driver.findElement(UserName);
        Clear(ChangeUserName);
        SendText(ChangeUserName ,User );
        String EMAIL = new Faker().internet().emailAddress();
        ChangeEmail = driver.findElement(Email);
        Clear(ChangeEmail);
        SendText(ChangeEmail ,EMAIL);
        String Phone_Number = new Faker().phoneNumber().subscriberNumber(11);
        ChangePhoneNumber = driver.findElement(PhoneNumber);
        Clear(ChangePhoneNumber);
        SendText(ChangePhoneNumber , Phone_Number);
        ClickingOnEdit = driver.findElement(Edit);
        Clicking(ClickingOnEdit);
      return this;
    }

    public EditProfilePage ChangePassword(String oldPassword , String newPassword , String confirmNewPassword){
        ProfileSettingButton = driver.findElement(ProfileSetting);
        Clicking(ProfileSettingButton);
        ProfileButton = driver.findElement(Profile);
        Clicking(ProfileButton);
        ChangePasswordButton = driver.findElement(ChangePassword);
        Clicking(ChangePasswordButton);
        WriteOldPassword = driver.findElement(OldPassword);
        SendText(WriteOldPassword , oldPassword);
        String PASSWORD = new Faker().internet().password();
        SetNewPassword = driver.findElement(NewPassword);
        SendText(SetNewPassword , PASSWORD);
        SetConfirmPassword = driver.findElement(ConfirmPassword);
        SendText(SetConfirmPassword , PASSWORD);
        AfterChangePasswordButton = driver.findElement(AfterChangePassword);
        Clicking(AfterChangePasswordButton);
        new WebDriverWait(driver, Duration.ofSeconds(20));
       return this;
    }

    public boolean ProfileUpdatedSuccessfullyMessage(){

        ProfileUpdatedSuccessfullyIsDisblayed  = driver.findElement(ProfileUpdatedSuccessfully);
        return ProfileUpdatedSuccessfullyIsDisblayed.isDisplayed();
    }
    public boolean PasswordChangedSuccessfullyMessage(){
        PasswordChangedSuccessfullyIsDisblayed = driver.findElement(PasswordChangedSuccessfully);
        return PasswordChangedSuccessfullyIsDisblayed.isDisplayed();
    }



}
