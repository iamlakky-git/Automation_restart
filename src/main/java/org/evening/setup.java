package org.evening;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;


public class setup {
    public static void main(String[] args) throws InterruptedException {
      //  WebDriverManager.firefoxdriver().setup();
      //  WebDriver driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/ap/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        driver.manage().window().maximize();


      //  driver.findElement(By.id("email")).sendKeys("abc@yopmail.com");
     //   driver.findElement(By.xpath("//input[id='email']")).sendKeys("assdass@yopmail.com");
     //   driver.findElement(By.id("email")).sendKeys("test@yopmail.com");
     //   driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("ascjkascsa");

       // driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("test@yopmail.com");
       // driver.findElement(By.xpath("(//div[@class='be-container-snipe'])[2]/div/div/div[1]/div[3]/div[2]/div[1]/input")).click();
    //   driver.findElement(By.xpath("(//input[starts-with(@id,'BE_flight')])[12]")).click();

   //     driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
   //     Thread.sleep(5000);
     //   driver.findElement(By.cssSelector("input[name$='firstname']")).sendKeys("Laxman");
    //    driver.findElement(By.cssSelector("input[name*='lastname']")).sendKeys("Laxman");

      //  driver.findElement(By.xpath("//select[@name='CompanyCountry']/option"));

//        WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'Flights')])[1]"));
//        String text = element.getText();
//        System.out.println(text);

        List<WebElement> countryList = driver.findElements(By.xpath("//select[@name='CompanyCountry']/option"));
        int cc= countryList.size();
        System.out.println(cc);
        for (WebElement element: countryList){
            System.out.println(element.getText());
        }





    }
}
