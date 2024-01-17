package selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class handlingAlert {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.id("alert1"));
        Thread.sleep(5000);
        Alert alert =driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        alert.dismiss();
    }

}
