package Go_Manager_WebApplication.TestCases;

import Go_Manager_WebApplication.Base.BaseTest;
import Pages.RegisterPage;
import com.github.javafaker.Faker;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("Register Feature")
public class RegisterTest extends BaseTest {

private RegisterPage registerPage;
Faker faker = new Faker();
@Story("Register Valid Data")
@Test(description = "Should Be Able To Register With Valid Data" , priority = 3)
    public void ShouldBeAbleToRegisterWithValidData(){

        RegisterPage registerPage = new RegisterPage(driver);
        driver.get("https://gomanager.app/register/");
        boolean IsDisblayed = registerPage.setUserNameRegister("")
      .setFirstNameAndLastName("" , "")
      .setPhoneNumber("")
      .setEmailInput("")
      .setPasswordandConfirm("" , "")
      .ClickingOnRegisterButton()
      .IsTextDisblayed();
       Assert.assertTrue(IsDisblayed);

    }
    @Story("Register invalid Phone")
    @Test (description = "Verify Register With Invalid Phone Number" , priority = 4)
    public void VerifyRegisterWithInvalidPhoneNumber(){
        RegisterPage registerPage = new RegisterPage(driver);
        driver.get("https://gomanager.app/register/");
        boolean IsDisblayed = registerPage.setUserNameRegister("")
                .setFirstNameAndLastName("" , "")
                .setPhoneNumber("")
                .setEmailInput("")
                .setPasswordandConfirm("Mohannadsalah.9" , "MohannadSalah.9")
                .ClickingOnRegisterButton()
                .ErrorMassegeDisblayed();
        Assert.assertTrue(IsDisblayed);
    }

}
