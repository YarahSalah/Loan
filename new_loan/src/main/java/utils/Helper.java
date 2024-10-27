package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Helper {

    private WebDriver driver;

    private WebDriverWait wait;
    private int defaultTimeout;

    public Helper(WebDriver driver, int defaultTimeout) {
        this.driver = driver;
        this.defaultTimeout = defaultTimeout;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(this.defaultTimeout));
    }

    public void clickButtonJS(WebElement button) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) this.driver;
        javascriptExecutor.executeScript("arguments[0].click();", button);

    }

    public void scrollToElementJS(WebElement webElement) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) this.driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", webElement);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void scroll(WebElement webElement) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) this.driver;
        javascriptExecutor.executeScript("window.scrollBy(0,250)", webElement);
    }
}
