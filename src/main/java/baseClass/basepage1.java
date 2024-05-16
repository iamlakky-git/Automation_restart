package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basepage1 {

    WebDriver driver;

    public void sendkeys(By by_locators,String Text){
        driver.findElement(by_locators).sendKeys(Text);

    }

    public void click(By by_locators) {
        driver.findElement(by_locators).click();

    }

}
