package Go_Manager_WebApplication.TestCases;

import Go_Manager_WebApplication.Base.BaseTest;
import Pages.EditProfilePage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Feature("Profile Feature")
public class EditProfileTest extends BaseTest {


    private EditProfilePage editProfilePage;

  @Story("Edit Profile")
    @Test (description = "Should Be Able To Edit Profile Data Successfully" , priority = 1)
    public void ShouldBeAbleToEditProfileDataSuccessfully(){
        EditProfilePage editProfilePage = new EditProfilePage(driver);
      SoftAssert softAssert = new SoftAssert();
       boolean EditingSuccessMessageIsDisblayed = editProfilePage.EditProfileData(
                  ""
                , ""
                , "")
                .ProfileUpdatedSuccessfullyMessage();
      softAssert.assertTrue(EditingSuccessMessageIsDisblayed);

    }

@Story("Change Password")
    @Test (description = "Should Be Able To Change Password Successfully" , priority = 1)
   public void ShouldBeAbleToChangePasswordSuccessfully(){
       EditProfilePage editProfilePage = new EditProfilePage(driver);
      boolean PasswordChangedMessage = editProfilePage.ChangePassword(
               "Mohannadsalah.9"
              ,""
              ,"")
              .PasswordChangedSuccessfullyMessage();
      Assert.assertTrue(PasswordChangedMessage);
   }



}
