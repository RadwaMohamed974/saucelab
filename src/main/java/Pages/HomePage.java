package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage (WebDriver driver){
        super(driver);
    }
    @FindBy(id = "user-name")
    WebElement userNameTxtBox;
    @FindBy(id = "password")
    WebElement passwordTxtBox;
    @FindBy (id="login-button")
    WebElement loginBtn;
    @FindBy(className = "title")
    public WebElement sucessLogin;

    public void Login(String username,String password){
        setTextElemnetText(userNameTxtBox,username);
        setTextElemnetText(passwordTxtBox,password);
        clickButton(loginBtn);
    }





}
