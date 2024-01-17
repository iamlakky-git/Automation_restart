package applicationPages;

import basePages.Base_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Flights extends Base_page {
    private WebDriver driver;

    public Flights(WebDriver driver){
        super(driver);
        this.driver = driver;

    }

    public By SearchFlight = By.xpath("//input[@value='Search Flights']");
    public By departFrom = By.xpath("//input[@id='BE_flight_origin_city']");
    public By goingTo = By.xpath("//input[@id='BE_flight_arrival_city']");

    public By name_of_airpots = By.xpath("//div[@class='ac_results origin_ac']/ul/div/div/div/li/div[1]/p[2]");

    public By goingToList = By.xpath("//div[@class='viewport']/div/div/li/div[1]/p[2]");

    public By departureDate = By.id("BE_flight_origin_date");

    public By date = By.xpath("//td[@id='02/01/2024']");

    public By searchAgain = By.xpath("//span[contains(text(),'Search Again')]");


    public void Book_one_way_ticket() throws InterruptedException {
        click(departFrom);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void book_a_ticket(String text2) throws InterruptedException {
        Thread.sleep(5000);
        String text = "new";
        String text1 = "Indira Gandhi International";
        click(departFrom);
        Thread.sleep(2000);
        send_keys(departFrom, text);
        int count_of_airpots = getEl(name_of_airpots).size();
        System.out.println("count of Airpots:-- " + count_of_airpots);

        for (WebElement element : getEl(name_of_airpots)) {
            if (element.getText().contains(text1)) {
                element.click();
                break;
            }
        }


        String text3 = "jk";
        String text4 = "All airports";
        click(goingTo);
        Thread.sleep(2000);
        send_keys(goingTo, text3);
        int count_of_airpots1 = getEl(goingToList).size();
        System.out.println("count of Airpots:-- " + count_of_airpots);
        Thread.sleep(4000);

        for (WebElement element : getEl(goingToList)) {
            if (element.getText().contains(text4)) {
                element.click();
                break;
            }
        }
    }

    public void Enter_Departure_date() throws InterruptedException {
        Thread.sleep(2000);
        click(departureDate);
        Thread.sleep(2000);
        click(date);

    }

    public void SearchFlight(){
        click(SearchFlight);
    }

    public void again_search(){

    }



}
