/**
 * Requirements: Selenium and Chromedriver.
 *
 * Opens http://www.quantbet.com/quiz/dev
 * Pulls challenge as String from QuantBet Developer Challenge
 * Submits String to class which return solution to Greatest Common Divisor (GCD)
 * Inputs GCD into web page
 *
 * @author Nathaniel Gjoderum-Symons
 *
 */

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // In this case driver location is obviously specific to individual user.
        System.setProperty("webdriver.chrome.driver",
                "/Users/nathanielgjoderum-symons/IdeaProjects/webscraper/lib/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.quantbet.com/quiz/dev");
        driver.navigate().refresh();

        String name = driver.findElement(By.id("quiz")).getText();

        int finalValue = GetGCD.GetGCD(name);

        String finalString = Integer.toString(finalValue);

        WebElement element = driver.findElement(By.id("calchainput"));
        element.sendKeys(finalString);

        driver.findElement(By.xpath("//button[contains(@class,'btn btn--wide push-top--20')]")).click();

    }
}

