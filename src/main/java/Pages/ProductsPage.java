package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase{
    public  ProductsPage (WebDriver driver){
        super(driver);
    }
    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartBtn;




    public void AddProductToCart(){
        clickButton(addToCartBtn);
    }
}
