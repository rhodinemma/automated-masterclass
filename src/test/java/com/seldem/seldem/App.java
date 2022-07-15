package com.seldem.seldem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.wikipedia.org/");

        // Using Locators in Selenium

        // id
        long start = System.currentTimeMillis();
        driver.findElement(By.id("js-link-box-en"));
        long end = System.currentTimeMillis();

        System.out.println("Time spent " + (end-start));

        // xpath
        start = System.currentTimeMillis();
        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]/div[2]"));
        end = System.currentTimeMillis();

        System.out.println("Time 2 spent " + (end-start));

        // css selector
        start = System.currentTimeMillis();
        driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-featured > div.central-featured-lang.lang2"));
        end = System.currentTimeMillis();

        System.out.println("Time 3 spent " + (end-start));

        driver.close();
    }
}
