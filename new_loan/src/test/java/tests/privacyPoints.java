package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PrivacyPoints;

public class privacyPoints {

    PrivacyPoints privacyPoints;
    WebDriver driver;

    @BeforeTest
    public void LaunchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://newloan.tayseerme.com/loan");
    }

    @Test
    public void test() {
        privacyPoints = new PrivacyPoints(driver);
        privacyPoints.getPrivacyPoints(true, true,true, true, true);
    }

    @AfterMethod
    void quit() {
        driver.close();
        driver.quit();
    }
}
