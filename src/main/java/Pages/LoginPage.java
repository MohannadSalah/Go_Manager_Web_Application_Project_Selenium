package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By UserName = By.name("username");
     WebElement UserNameInput;

     By Password = By.name("password");
     WebElement PasswordInput;

     By Login = By.xpath("//button[@type=\"submit\"]");
     WebElement LoginButton;

    By IsDisblayed = By.xpath("//button[@aria-label=\"Go to home page\"]");
    WebElement TextDisblayed;

    By ErrorMessageIncorrectUsernameOrPassword = By.xpath("//div[text()='Incorrect username or password']");
    WebElement IncorrectError;




  public LoginPage setUserName(String userName , String passWord){

      UserNameInput = driver.findElement(UserName);
      SendText( UserNameInput , userName);
      PasswordInput = driver.findElement(Password);
      SendText( PasswordInput,passWord);
      return this;
  }


  public LoginPage ClickingOnLogin(){
LoginButton = driver.findElement(Login);
Clicking(LoginButton);
return this;
  }

    public boolean IsTextDisblayed(){

        TextDisblayed = driver.findElement(IsDisblayed);
        return TextDisblayed.isDisplayed() ;

    }
    public boolean IncorrectUsernameOrPasswordMessage(){
        IncorrectError = driver.findElement(ErrorMessageIncorrectUsernameOrPassword);
        return IncorrectError.isDisplayed();
    }

}
