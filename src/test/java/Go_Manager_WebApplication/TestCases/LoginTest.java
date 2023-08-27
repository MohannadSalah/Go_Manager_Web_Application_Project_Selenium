package Go_Manager_WebApplication.TestCases;

import Go_Manager_WebApplication.Base.BaseTest;
import Pages.LoginPage;
import Utils.ConfigUtils;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Feature("Login Feature")
public class LoginTest extends BaseTest {

private LoginPage loginPage;


@DataProvider(name = "LoginData")
public static Object[][] userData(){

    return new Object[][]{
            {"Mohanad" , "Mohannadsalah.9"},//Valid Username and Password
            {"MsN" , "Mohanna.9"}, // Valid Username and Invalid Password
            {"MM","Mohannadsalah.9"}, // Invalid Username and Valid Password
            {"sa" , "Mohannadsal.9"}, // Invalid Username and Password
            {"MsN" , ""}, // Valid Username and Empty Password
            {"" ,""} // Empty Username and Password
    };
}



    @Story("Login With Valid Data")
    @Test(dataProvider="LoginData" , description = "Should Be Able To Login With Valid Username And Password" , priority = 3)
    public void ShouldBeAbleToLoginWithValidUsernameAndPassword(String UserName , String Password){
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://gomanager.app/");
        boolean IsDisblayed=loginPage
                .setUserName(UserName, Password)
               .ClickingOnLogin()
                .IsTextDisblayed();
        Assert.assertTrue(IsDisblayed);
    }
    @Story("Login With Invalid Name")
    @Test (description = "Verify Login With Invalid UserName" , priority = 3)
    public void VerifyLoginWithInvalidUserName(){
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://gomanager.app/");
        boolean IsDisblayed=loginPage
                .setUserName(ConfigUtils.getInstance().getEmail(), ConfigUtils.getInstance().getPassword())
                .ClickingOnLogin()
                .IncorrectUsernameOrPasswordMessage();

        Assert.assertTrue(IsDisblayed);
    }
    @Story("Login With Invalid Password")
    @Test (description = "Verify Login With Invalid Password" , priority = 3)
    public void VerifyLoginWithInvalidPassword(){
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://gomanager.app/");
        boolean IsDisblayed=loginPage
                .setUserName(ConfigUtils.getInstance().getEmail(), ConfigUtils.getInstance().getPassword())
                .ClickingOnLogin()
                .IncorrectUsernameOrPasswordMessage();

        Assert.assertTrue(IsDisblayed);


    }
}
