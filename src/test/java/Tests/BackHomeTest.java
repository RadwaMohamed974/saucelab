package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BackHomeTest extends TestBase {
    CheckoutPage checkoutObject;
    ProductsPage productsObject;
    AddToCartPage addToCartObject;
    HomePage homeObject;
    OverviewPage overviewObject;

    @Test(priority = 1)
    public void UserCanLoginsuccessfully() {
        homeObject = new HomePage(driver);
        homeObject.Login("standard_user", "secret_sauce");
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
    public void UserCanCheckoutSuccessfully() {
        addToCartObject.OpenCheckoutPage();
        checkoutObject = new CheckoutPage(driver);
        checkoutObject.Checkout("jkd", "dddd", "000");
        overviewObject = new OverviewPage(driver);
        Assert.assertTrue(overviewObject.completeCheckout.getText().contains("Thank you for your order"));

    }
    @Test(priority = 4)
    public void UserCanReturnToHomePage(){
        overviewObject.ReturnToHomePage();
        Assert.assertTrue(homeObject.sucessLogin.getText().contains("Products"));
    }
}