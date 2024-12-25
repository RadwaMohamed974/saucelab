package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    public void StartDriver( @Optional("chrome") String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            driver=new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("Firefox"))
        {
            driver=new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("Edge"))
        {
            driver=new EdgeDriver();
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @AfterClass
    public void StopDriver(){
        driver.quit();
    }


}

