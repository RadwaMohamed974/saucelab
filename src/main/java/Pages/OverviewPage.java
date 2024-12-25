package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends PageBase {
    public OverviewPage (WebDriver driver){
        super(driver);
    }

    @FindBy(className = "complete-header")
   public WebElement completeCheckout;
    @FindBy(id = "back-to-products")
    WebElement homePageBtn;

    public void ReturnToHomePage(){
        clickButton(homePageBtn);
    }




}
