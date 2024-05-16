package QAevening;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.yatra.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).sendKeys("l");
        Thread.sleep(3000);

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ac_results origin_ac']/ul/div/div/div/li/div/p"));
        for (WebElement e : elements){
            System.out.println(e.getText());
        }
        
    }

}
