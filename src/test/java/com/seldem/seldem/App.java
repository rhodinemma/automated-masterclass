package com.seldem.seldem;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("file:///F:/Workspace/Omnitech/Learning-Grails/seldem/alerts.html");

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
        /*WebElement searchBox = driver.findElement(By.id("searchInput"));
        String searchStr = "Selenium";
        searchBox.sendKeys(searchStr);
        WebElement searchButton = driver.findElement(By.cssSelector("#search-form > fieldset > button"));
        searchButton.click();*/

        // Working with tables
        /*System.out.println(driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[2]/td[1]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[1]/th[1]")).getText());*/

        /*List<WebElement> listOfWebElements = driver.findElements(By.xpath("/html/body/table/tbody[1]/tr"));
        for(WebElement element : listOfWebElements){
            System.out.println(element.getText());
        }*/

        WebElement basicAlertButton = driver.findElement(By.cssSelector("body > button:nth-child(2)"));
        WebElement confirmationAlertButton = driver.findElement(By.cssSelector("body > button:nth-child(5)"));
        WebElement promptAlertButton = driver.findElement(By.cssSelector("body > button:nth-child(8)"));

        //Basic Alert Demo
        basicAlertButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert basicAlert = driver.switchTo().alert();
        basicAlert.accept();

        //Confirmation Alert Demo
        confirmationAlertButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.dismiss();

        //Prompt Alert Demo
        promptAlertButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert promptAlert = driver.switchTo().alert();

        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Laurentiu");
        promptAlert.accept();

        //driver.close();
    }
}
