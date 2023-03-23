package com.gmail.ui.pages;

import com.gmail.ui.service.PropertiesHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage openPage() {
//        driver.navigate().to("google.com");
        driver.navigate().to(PropertiesHandler.getLoginPage());
        return this;
    }
}
