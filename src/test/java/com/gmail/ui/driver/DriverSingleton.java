package com.gmail.ui.driver;

import com.gmail.ui.service.PropertiesHandler;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleton {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        final String[] driverOptions = {"--remote-allow-origins=*", "ignore-certificate-errors", "--disable-notifications"};
        if (null == driver){
            var browser = PropertiesHandler.getBrowser();
            switch (browser){
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                case "edge" -> {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }
                case "chrome" -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().addArguments(driverOptions));
                }
                default -> throw new IllegalArgumentException("Please, set the browser");

            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
