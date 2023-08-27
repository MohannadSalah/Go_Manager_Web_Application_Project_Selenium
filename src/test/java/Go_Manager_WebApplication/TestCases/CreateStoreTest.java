package Go_Manager_WebApplication.TestCases;

import Go_Manager_WebApplication.Base.BaseTest;
import Pages.CreateStorePage;
import com.github.javafaker.Faker;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("Create Store Feature")
public class CreateStoreTest extends BaseTest {

private CreateStorePage createStorePage;
    private Faker faker = new Faker();
  @Story("Create New Store")
    @Test (description = "Should Be Able To Create Store" , priority = 2)
    public void ShouldBeAbleToCreateStore(){
        CreateStorePage createStorePage = new CreateStorePage(driver);

      boolean SessionsText = createStorePage.ClickingOnCreateStoreButton()

        .setCreateStoreFirstPage("" , "" , "" , "")
        .ClickingOnCreate()

        .setCreateStoreSecondPage("", "" , "" , "")
        .ClickingOnCreate2()

        .setCreateStoreThirdPage("" , "" , "" , "")
        .ClickingOnCreate3()

        .IsTextDisblayed();
      Assert.assertTrue(SessionsText);
    }
}
