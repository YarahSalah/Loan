package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Helper;

import java.time.Duration;

public class PrivacyPoints {

    private final By welcomeText = By.className("header");
    private final By checkBox1 = By.id("03159a01-c537-4f5c-b4fc-8f2763379bea");
    private final By checkBox2 = By.id("14a69c6d-4dc7-4622-a168-f361e1dccf18");
    private final By checkBox3 = By.id("a94a64c4-a238-475d-b82d-a2b631fc1273");
    private final By checkBox4 = By.id("bdbbbf62-7d9f-43ca-a738-95e097365b37");
    private final By englishVersion = By.className("lang-en-relative-padding");
    private final By confirmBtn = By.className("btn-agree");
    private final By cancelBtn = By.className("btn-notagree");

    private final int DEFAULTTIMEOUT = 30;


    private WebDriver driver;
    private WebDriverWait wait;
    private Helper helper;
    private JavascriptExecutor js = (JavascriptExecutor) driver;


    public PrivacyPoints(WebDriver driver) {
        this.driver = driver;
    }

    public void getPrivacyPoints(boolean isChecked1, boolean isChecked2, boolean isChecked3, boolean isChecked4,
                                 boolean confirmBtnClicked) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULTTIMEOUT));

        WebElement welcomeTextElem = wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeText));
        welcomeTextElem.isDisplayed();

        WebElement englishVersionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(englishVersion));
        englishVersionElem.click();


       /* if (isChecked1) {
            WebElement point1Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(checkBox1));
            point1Elem.click();
        }

        if (isChecked2) {
            WebElement point2Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(checkBox2));
            point2Elem.click();
        }

        if (isChecked3) {
            js.executeScript("arguments[0].scrollIntoView();", confirmBtn);
            WebElement point3Elem = driver.findElement(checkBox3);
            point3Elem.click();
        }

        if (isChecked4) {
            WebElement point4Elem = wait.until(ExpectedConditions.visibilityOfElementLocated(checkBox4));
            point4Elem.click();
        }

        if (confirmBtnClicked) {
            WebElement confirmBtnElem = driver.findElement(confirmBtn);
            confirmBtnElem.click();
        }
        else {
            WebElement cancelBtnElem = driver.findElement(cancelBtn);
            cancelBtnElem.click();

        }*/

    }
}
