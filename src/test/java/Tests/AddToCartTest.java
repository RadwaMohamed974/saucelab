package Tests;

import Pages.AddToCartPage;
import Pages.HomePage;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase{
    ProductsPage productsObject;
    AddToCartPage addToCartObject;
    HomePage homeObject;

    @Test(priority = 1)
    public void UserCanLoginsuccessfully(){
        homeObject=new HomePage(driver);
        homeObject.Login("standard_user","secret_sauce");
       // Assert.assertTrue(homeObject.sucessLogin.getText().equals("Products"));
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
