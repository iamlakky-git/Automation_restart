package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class handling_tabs {

   static WebDriver driver;

    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yatra.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);

    }
    public void go_to_visa_tabs(){
        driver.findElement(By.xpath("//span[contains(text(),'Visa')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//span[contains(text(),'Holidays')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void switch_to_tab() throws InterruptedException {
        ((JavascriptExecutor)driver).executeAsyncScript("window.open");
        ArrayList<String>tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(5);
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(5);
    }

    public static void main(String[] args) throws InterruptedException {
        new handling_tabs().setup();
        new handling_tabs().go_to_visa_tabs();
        new handling_tabs().switch_to_tab();
    }
}
