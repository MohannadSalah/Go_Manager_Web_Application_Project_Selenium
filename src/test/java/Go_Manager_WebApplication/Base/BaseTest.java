package Go_Manager_WebApplication.Base;


import Pages.RegisterPage;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

public class BaseTest {
protected WebDriver driver;
private RegisterPage registerPage;
SoftAssert softAssert = new SoftAssert();


    @BeforeMethod
    public void SetUp (){
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://gomanager.app/register/");
        RegisterPage registerPage = new RegisterPage(driver);
        boolean IsDisblayed = registerPage.setUserNameRegister("")
                .setFirstNameAndLastName("" , "")
                .setEmailInput("")
                .setPhoneNumber("")
                .setPasswordandConfirm("Mohannadsalah.9" , "Mohannadsalah.9")
                .ClickingOnRegisterButton()
                .IsTextDisblayed();
        softAssert.assertTrue(IsDisblayed);
    }



    @AfterMethod
    public void Close(ITestResult result){
         String TestCaseName = result.getMethod().getMethodName();
         File destFile = new File("target" + File.separator + "screenshots" + File.separator +TestCaseName + ".png" );
         TakeScreenShots(destFile);
        driver.quit();
    }

    public void TakeScreenShots(File destFile){
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file , destFile);
            InputStream Is = new FileInputStream(destFile);
            Allure.addAttachment("screenshots" ,Is );
        } catch (IOException e) {
            throw new RuntimeException("Can't Find File Path");
        }
    }
}
