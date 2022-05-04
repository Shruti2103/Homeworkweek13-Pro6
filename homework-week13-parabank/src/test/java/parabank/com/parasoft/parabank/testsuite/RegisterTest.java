package parabank.com.parasoft.parabank.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.com.parasoft.parabank.pages.HomePage;
import parabank.com.parasoft.parabank.pages.Register;
import parabank.com.parasoft.parabank.testbase.TestBase;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    Register register = new Register();

    @Test
    public void verifyThatSigningUpPageDisplay(){
        homePage.clickOnRegisterLink();
        Assert.assertEquals(register.getSigningUpText(), "Signing up is easy!", "Not navigate to page");

    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        register.enterFirstName("dam");
        register.enterLastName("yam");
        register.enterAddress("ka");
        register.enterCity("berlin");
        register.enterState("dan");
        register.enterZip("100");
        register.enterPhoneNumber("200");
        register.enterSsnNumber("12");
        register.enterUserNameMail("op@ymail.com");
        register.enterPasswordRegister("123456");
        register.enterConfirmPassword("123456");
        register.clickOnRegisterButton();
        Assert.assertEquals(register.getAccountSuccessText(), "Your account was created successfully. You are now logged in.", "Not navigate to page");



    }






}
