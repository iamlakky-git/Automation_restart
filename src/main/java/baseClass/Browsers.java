package baseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;

import static selenium.getWindow.driver;

public class Browsers {

    public void openBrowser(String browser, String url){
        String environment = System.getProperty("os.name");
        System.out.println("Automation  script run on ==="+environment);

        switch (browser.toLowerCase(Locale.ROOT)){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "safari":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "firefox":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;

        }

        driver.manage().window().maximize();
        driver.get(url);
    }

}
