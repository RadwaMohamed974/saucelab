package Tests;

import Data.JsonReader;
import Pages.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserLoginTest extends TestBase{
    HomePage homeObject;

@Test
//To display in allura report
@Severity(SeverityLevel.BLOCKER)
@Description("Login")
@Link(name="Saucelabd",url="http://saucelab.com")
    public void UserCanLoginsuccessfully() throws IOException, ParseException {
       homeObject=new HomePage(driver);
    String username = JsonReader.jsonData("Login","username") ;
    String password = JsonReader.jsonData("Login","password") ;
       homeObject.Login("standard_user","secret_sauce");
    Assert.assertTrue(homeObject.sucessLogin.getText().equals("Products"));
    }
}
