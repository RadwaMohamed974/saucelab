package Tests;

import Data.JsonReader;
import Pages.AddToCartPage;
import Pages.HomePage;
import Pages.ProductsPage;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddToCartTest extends TestBase{
    ProductsPage productsObject;
    AddToCartPage addToCartObject;
    HomePage homeObject;

    @Test (priority = 1)
//To display in allura report

    @Severity(SeverityLevel.BLOCKER)
    @Description("Login")
    @Link(name="Saucelabd",url="http://saucelab.com")
    public void UserCanLoginsuccessfully() throws IOException, ParseException {
        homeObject=new HomePage(driver);
        String username = JsonReader.jsonData("Login","username") ;
        String password = JsonReader.jsonData("Login","password") ;
        homeObject.Login(username,password);
        Assert.assertTrue(homeObject.sucessLogin.getText().equals("Products"));
    }

@Test(priority = 2)
    public void ProductCanBeAddedToCart(){
        productsObject=new ProductsPage(driver);
        productsObject.AddProductToCart();
       addToCartObject=new AddToCartPage(driver);
        addToCartObject.OpenAddToCartPage();
        Assert.assertTrue(addToCartObject.productAddedSucessfully.getText().contains("Sauce Labs Backpack"));

    }
    @Test(priority = 3)
    public void UserCanRemoveProductFromCart(){
        addToCartObject.RemoveProductFromCart();


    }

}
