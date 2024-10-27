package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {

    WebDriver driver;

    @BeforeTest
    public void LaunchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://newloan.tayseerme.com/loan");
    }

    @AfterMethod
    void quit() {
        driver.close();
        driver.quit();
    }
}
