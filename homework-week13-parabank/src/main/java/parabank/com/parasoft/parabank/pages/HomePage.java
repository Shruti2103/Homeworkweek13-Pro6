package parabank.com.parasoft.parabank.pages;

import org.openqa.selenium.By;
import parabank.com.parasoft.parabank.utility.Utility;

public class HomePage extends Utility {

    By userName = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By registerLink = By.xpath("//a[text()='Register']");
    By loginButton = By.xpath("//input[@value='Log In']");
    By customerText = By.xpath("//div[@id='leftPanel']//h2[text()='Customer Login']");

    public void enterUserName(String nam){
        sendTextToElement(userName, nam);
    }
    public void enterPassword(String pass){
        sendTextToElement(password, pass);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getCustomerText(){
        return getTextFromElement(customerText);
    }





}
