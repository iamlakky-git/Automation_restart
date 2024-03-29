package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class getWindow {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yatra.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

//        String  currentHandle = driver.getWindowHandle();
//        System.out.println(currentHandle);
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//span[normalize-space()='Visa']")).click();

        String parentTab = driver.getWindowHandle();
        System.out.println("tHE Id of parent window =="+parentTab);
        driver.findElement(By.xpath("//span[normalize-space()='Visa']")).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        ArrayList<String> childTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(childTab.get(1));
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(childTab.get(0));


    }
}
