package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keys {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");


        driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys(Keys.TAB);
        driver.findElement(By.name("lastname")).sendKeys(Keys.TAB);
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email__")).sendKeys(Keys.TAB);
        Thread.sleep(2000);


        driver.findElement(By.name("reg_passwd__")).sendKeys(Keys.TAB);
        Thread.sleep(2000);

    }


}
