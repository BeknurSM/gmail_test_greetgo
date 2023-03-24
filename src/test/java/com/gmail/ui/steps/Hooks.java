package com.gmail.ui.steps;

import com.gmail.ui.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class Hooks {

    public WebDriver driver;

    @BeforeSuite
    public void setUp()
    {
        driver = DriverSingleton.getDriver();
    }

    @AfterSuite
    public void stopBrowser()
    {
        DriverSingleton.closeDriver();
    }
}
