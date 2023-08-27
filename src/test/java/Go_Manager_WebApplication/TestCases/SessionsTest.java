package Go_Manager_WebApplication.TestCases;

import Go_Manager_WebApplication.Base.BaseTest;
import Pages.SessionsPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
 @Feature( "Sessions Feature" )
public class SessionsTest extends BaseTest {
    private SessionsPage sessionsPage;

  @Story("Add New Card")
    @Test (description = "Should Be Able To Add New Card " , priority = 1)
    public void ShouldBeAbleToAddNewCard(){
        SessionsPage sessionsPage = new SessionsPage(driver);
        boolean EndButtonIsDisblayed = sessionsPage
                .ClickingOnPlusButton()
                .AddTitle("Dummy")
                .ClickingOnSubmitButton()
                .SelectingDeviceType()
                .SessionsType()
                .SetUserTime("5")
                .SetHourPrice("23")
                .WritingNote("Good Work")
                .ClickingOnStartButton()
                .EndButtonIsDisblayed();
        Assert.assertTrue(EndButtonIsDisblayed);
    }
  @Story("Add Order")
    @Test(description = "Should Be Able To Add Orders To Menu" , priority = 2)
public void ShouldBeAbleToAddOrdersToMenu(){
        SessionsPage sessionsPage = new SessionsPage(driver);
        boolean AddItemDisblayed = sessionsPage.AddOrders(
                 "Ice Coffe"
                ,"22"
                ,"Dummy")
                .AddItemIsDsblayed();
        Assert.assertTrue(AddItemDisblayed);
    }
}
