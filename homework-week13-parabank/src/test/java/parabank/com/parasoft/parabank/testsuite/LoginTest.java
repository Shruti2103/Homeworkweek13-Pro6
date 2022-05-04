package parabank.com.parasoft.parabank.testsuite;


import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.com.parasoft.parabank.pages.HomePage;
import parabank.com.parasoft.parabank.pages.Login;
import parabank.com.parasoft.parabank.pages.OverView;
import parabank.com.parasoft.parabank.testbase.TestBase;

public class LoginTest extends TestBase {

    HomePage homePage = new HomePage();
    Login login = new Login();
    OverView overView = new OverView();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.enterUserName("op@ymail.com");
        homePage.enterPassword("123456");
        homePage.clickOnLoginButton();
        Assert.assertEquals(overView.getAccountOverViewText(), "Accounts Overview", "Not navigate to page");

    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.enterUserName("ad@ymail.com");
        homePage.enterPassword("123456");
        homePage.clickOnLoginButton();
        Assert.assertEquals(login.getErrorMessageText(), "The username and password could not be verified.", "Not navigate to page");

    }
    @Test
    public void userShouldLogOutSuccessfully(){
        homePage.enterUserName("op@ymail.com");
        homePage.enterPassword("123456");
        homePage.clickOnLoginButton();
        login.clickOnLogOutButton();
        Assert.assertEquals(homePage.getCustomerText(), "Customer Login", "Not navigate to page");

    }




}
