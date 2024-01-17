package org.evening;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class basePage {
    WebDriver driver;
     public  void openBrowser(){
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.salesforce.com/ap/form/signup/freetrial-sales/?d=topnav2-btn-ft");
}

 public void login_to_application() {
     driver.findElement(By.name("email")).sendKeys("abc@yopmail.com");
     driver.findElement(By.id("email")).sendKeys("password");
     driver.findElement(By.xpath("(//input[starts-with(@id,'BE_flight')])[12]")).click();
 }

 public void logout_from_application(){
     driver.findElement(By.xpath("//input[starts-with(@id,'BE_flight')])[12]")).click();
         driver.findElement(By.xpath("//input[starts-with(@id,'BE_flight')])[12]")).click();
     }

    public static void main(String[] args) {
        new basePage().openBrowser();
        new basePage().login_to_application();
        new basePage().logout_from_application();
    }



    }


