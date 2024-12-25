package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends PageBase{
    public AddToCartPage(WebDriver driver){
        super(driver);
    }
    @FindBy(className = "shopping_cart_link")
    WebElement cartBtn;

    @FindBy(className = "inventory_item_name")
    public WebElement productAddedSucessfully;
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeBtn;
    @FindBy(id="checkout")
    WebElement checkoutBtn;


    public void OpenAddToCartPage(){
        clickButton(cartBtn);

    }
    public void RemoveProductFromCart(){
        clickButton(removeBtn);
    }
    public void OpenCheckoutPage(){
        clickButton(checkoutBtn);
    }
}
