package parabank.com.parasoft.parabank.pages;

import org.openqa.selenium.By;
import parabank.com.parasoft.parabank.utility.Utility;

public class Register extends Utility {
    By signingUpText = By.xpath("//h1[text()='Signing up is easy!']");
    By firstName = By.xpath("//input[@name='customer.firstName']");
    By lastName = By.xpath("//input[@name='customer.lastName']");
    By address = By.xpath("//input[@id='customer.address.street']");
    By city = By.xpath("//input[@id='customer.address.city']");
    By state = By.xpath("//input[@id='customer.address.state']");
    By zip = By.xpath("//input[@id='customer.address.zipCode']");
    By phoneNumber = By.xpath("//input[@name='customer.phoneNumber']");
    By ssnNumber = By.xpath("//input[@name='customer.ssn']");
    By userNameMail = By.xpath("//input[@name='customer.username']");
    By passwordRegister = By.xpath("//input[@name='customer.password']");
    By confirmPassword = By.xpath("//input[@name='repeatedPassword']");
    By registerButton = By.xpath("//input[@value='Register']");
    By accountSuccessText = By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");

    public String getSigningUpText(){
        return getTextFromElement(signingUpText);
    }
    public void enterFirstName(String firstNam){
        sendTextToElement(firstName, firstNam);
    }
    public void enterLastName(String lastNam){
        sendTextToElement(lastName, lastNam);
    }
    public void enterAddress(String add){
        sendTextToElement(address, add);
    }
    public void enterCity(String cityName){
        sendTextToElement(city, cityName);
    }
    public void enterState(String stt){
        sendTextToElement(state, stt);
    }
    public void enterZip(String zp){
        sendTextToElement(zip, zp);
    }
    public void enterPhoneNumber(String pn){
        sendTextToElement(phoneNumber, pn);
    }
    public void enterSsnNumber(String ssn){
        sendTextToElement(ssnNumber, ssn);
    }
    public void enterUserNameMail(String userNm){
        sendTextToElement(userNameMail, userNm);
    }
    public void enterPasswordRegister(String password){
        sendTextToElement(passwordRegister, password);
    }
    public void enterConfirmPassword(String confirmPass){
        sendTextToElement(confirmPassword, confirmPass);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getAccountSuccessText(){
        return getTextFromElement(accountSuccessText);
    }





}
