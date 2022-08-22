import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class CountWorldPopulation {

    static WebDriver driver;
    public static void main(String[] args) {
         String populationLocator = "//div[@class='maincounter-number']/span[@class='rts-counter']";
         String todayBirthdayPop = "//div[text()='Today']//parent::div//span[@class='rts-counter']";
         String todayDeathsdayPop = "";
         String todayGrowthPop = "";


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.worldometers.info/world-population/");
        System.out.println("********World current population******");
        printPopulationData(populationLocator);

        System.out.println("TodayBirthday");
        printPopulationData(todayBirthdayPop);
       // System.out.println("TodayDeaths");
        //System.out.println("Today Population Growth");


        System.out.println("this year Birthday");
        System.out.println("This year Deaths");
        System.out.println("This year Population Growth");


        }
        public static void printPopulationData(String Locator) {
            List<WebElement> currentPop = driver.findElements(By.xpath(Locator));

            for(WebElement wb : currentPop) {
                System.out.println(wb.getText());
            }

        }
}
