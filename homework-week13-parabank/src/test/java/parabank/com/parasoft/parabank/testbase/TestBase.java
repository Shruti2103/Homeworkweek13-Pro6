package parabank.com.parasoft.parabank.testbase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import parabank.com.parasoft.parabank.propertyreader.PropertyReader;
import parabank.com.parasoft.parabank.utility.Utility;

public class TestBase extends Utility {
    String browser= PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }



}
