package org.evening;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LearnAutomation {

   static WebDriver driver;

    public void  openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }

    public void creatAccount() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
        //  Thread.sleep(4);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    public void handlingDropDown(){
        WebElement element = driver.findElement(By.xpath("//select[@id='month']"));
        Select select = new Select(element);
      //  select.selectByIndex(11);
      //  select.selectByValue(5);
          select.selectByVisibleText("Dec");
    }

    public void handlingBootstrap(){
        String text = "Nepal";
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='c-scrollable dropdown c-dropdrown__scrollable']/a"));


    }



    public void wait_till_element(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE']")));

    }

    public static void main(String[] args) throws InterruptedException {
        LearnAutomation learnAutomation = new LearnAutomation();
        learnAutomation.openBrowser();
        learnAutomation.creatAccount();
        learnAutomation.handlingDropDown();
    }


    }


