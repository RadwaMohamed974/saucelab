package Tests;

import Data.JsonReader;
import Pages.*;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class CheckoutTest extends TestBase{
   CheckoutPage checkoutObject;
    ProductsPage productsObject;
    AddToCartPage addToCartObject;
    HomePage homeObject;
    OverviewPage overviewObject;

    @Test(priority = 1)
    public void UserCanLoginsuccessfully() throws IOException, ParseException {
        homeObject=new HomePage(driver);
        String username = JsonReader.jsonData("Login","username") ;
        String password = JsonReader.jsonData("Login","password") ;
        homeObject.Login("standard_user","secret_sauce");
        Assert.assertTrue(homeObject.sucessLogin.getText().equals("Products"));
    }

    @Test(priority = 2)
    public void ProductCanBeAddedToCart() {
        productsObject = new ProductsPage(driver);
        productsObject.AddProductToCart();
        addToCartObject = new AddToCartPage(driver);
        addToCartObject.OpenAddToCartPage();
        Assert.assertTrue(addToCartObject.productAddedSucessfully.getText().contains("Sauce Labs Backpack"));
    }
@Test(priority = 3)
        public void UserCanCheckoutSuccessfully() throws IOException, ParseException {
    addToCartObject.OpenCheckoutPage();
 checkoutObject=new CheckoutPage(driver);
    String firstname = JsonReader.jsonData("checkout","firstname") ;
    String lastname = JsonReader.jsonData("checkout","lastname") ;
    String postalcode = JsonReader.jsonData("checkout","postalCode") ;
 checkoutObject.Checkout("jkd","dddd","000");
 overviewObject=new OverviewPage(driver);
 Assert.assertTrue(overviewObject.completeCheckout.getText().contains("Thank you for your order"));






        }

    }

