package testCases;

import Utility.ReadJson;
import applicationPages.Flights;
import baseClass.Browsers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public class testFlight extends Browsers {
    String path=System.getProperty("user.dir")+ File.separator +"testData"+File.separator +"dataSet.json";

    Flights flights;

    private WebDriver driver;

    @BeforeClass
    public void testSearchFlight() throws IOException, ParseException, org.json.simple.parser.ParseException {
        String browserName = new ReadJson().Read_the_value_from_json(path,"Browser");
        String url = new  ReadJson().Read_the_value_from_json(path,"URL");
        String airport = new  ReadJson().Read_the_value_from_json(path,"airport");
        openBrowser(browserName,url);
     //   new Flights(airport);
    }

    @Test
    public void searchAgain(){

        flights.SearchFlight();
    }

    @Test
    public void test() throws IOException, org.json.simple.parser.ParseException, InterruptedException {
        String tt = new ReadJson().Read_the_value_from_json(path,"airport");
        System.out.println(tt);
        flights =new Flights(driver);

        flights.Book_one_way_ticket();
        flights.book_a_ticket(new ReadJson().Read_the_value_from_json(path,"text"));
        flights.Enter_Departure_date();
        flights.SearchFlight();

    }


}
