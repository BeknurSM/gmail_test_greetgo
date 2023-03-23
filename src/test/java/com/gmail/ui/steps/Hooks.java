package com.gmail.ui.steps;

import com.gmail.ui.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Hooks {

    @BeforeMethod
    public void setUp()
    {
        DriverSingleton.getDriver();
    }

    @AfterMethod
    public void stopBrowser()
    {
        DriverSingleton.closeDriver();
    }
}
