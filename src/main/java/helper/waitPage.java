package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class waitPage {

    WebDriverWait wait;
    WebDriver driver;
    public  waitPage(WebDriver driver){

        this.driver =driver;
    }
    public void waitForPresenceElement(int timeout, WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
