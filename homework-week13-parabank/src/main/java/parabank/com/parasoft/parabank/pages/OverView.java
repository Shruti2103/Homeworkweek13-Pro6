package parabank.com.parasoft.parabank.pages;

import org.openqa.selenium.By;
import parabank.com.parasoft.parabank.utility.Utility;

public class OverView extends Utility {
    By accountOverViewText = By.xpath("//h1[text()='Accounts Overview']");


    public String getAccountOverViewText(){
        return getTextFromElement(accountOverViewText);
    }
}
