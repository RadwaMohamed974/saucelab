package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase{
    public CheckoutPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "first-name")
    WebElement fistNameTxtBox;
    @FindBy(id ="last-name")
    WebElement lastName;
    @FindBy(id = "postal-code")
    WebElement postalCode;
    @FindBy(id = "continue")
    WebElement continueBtn;
    @FindBy (id = "finish")
    WebElement finishBtn;

    public void Checkout(String firstname,String lastname ,String code){
        setTextElemnetText(fistNameTxtBox,firstname);
        setTextElemnetText(lastName,lastname);
        setTextElemnetText(postalCode,code);
        clickButton(continueBtn);
        clickButton(finishBtn);
    }
}
