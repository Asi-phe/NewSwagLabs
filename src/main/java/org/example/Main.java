package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Digi_WS\\Downloads\\chromedriver_win32 (7).zip");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.quit();
    }

}