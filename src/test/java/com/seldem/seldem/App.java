package com.seldem.seldem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class App {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");

        // Using Locators in Selenium
        /*
        // id
        long start = System.currentTimeMillis();
        driver.findElement(By.id("js-link-box-en"));
        long end = System.currentTimeMillis();

        System.out.println("Time spent using id " + (end-start));

        // xpath
        start = System.currentTimeMillis();
        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]/div[2]"));
        end = System.currentTimeMillis();

        System.out.println("Time 2 spent using xpath " + (end-start));

        // css selector
        start = System.currentTimeMillis();
        driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-featured > div.central-featured-lang.lang2"));
        end = System.currentTimeMillis();

        System.out.println("Time 3 spent using css selector" + (end-start));*/

        // Retrieving text from webpage
        /*WebElement titleOfWebPage = driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span"));
        String titleText = titleOfWebPage.getText();
        String expectedText = "Wikipedia";
        if(titleText.equals(expectedText)){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
            driver.close();
            throw new Exception();
        }*/

        // Clicking on a webpage
        /*WebElement englishButton =  driver.findElement(By.id("js-link-box-en"));
        englishButton.click();
        String expectedTitle = "Welcome to Wikipedia,";
        WebElement titleOfEnglishButton = driver.findElement(By.id("mp-welcome"));
        if(titleOfEnglishButton.getText().equals(expectedTitle)){
            System.out.println("Test passed!");
        }
        else{
            System.out.println("Test failed!");
            driver.close();
            throw new Exception();
        }*/

        // Sending text to Selenium driver
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        String searchStr = "Selenium";
        searchBox.sendKeys(searchStr);
        WebElement searchButton = driver.findElement(By.cssSelector("#search-form > fieldset > button"));
        searchButton.click();

        driver.close();
    }
}
