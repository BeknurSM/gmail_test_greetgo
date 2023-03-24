package com.gmail.ui.pages;

import com.gmail.ui.service.PropertiesHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "identifierId")
    private WebElement emailInputField;

    @FindBy(id = "identifierNext")
    private WebElement identifierNextButton;

    @FindBy(id = "password")
    private WebElement passowrdInputField;

    @FindBy(id = "passwordNext")
    private WebElement passwordNextButton;

    public LoginPage enterCredentials() {
        wait.waitUntilVisible(emailInputField).sendKeys(PropertiesHandler.getUserEmail());
        wait.waitUntilClickable(identifierNextButton).click();
        wait.waitUntilVisible(passowrdInputField).sendKeys(PropertiesHandler.getUserPassword());
        wait.waitUntilClickable(passwordNextButton).click();
        return this;
    }

    @Override
    public LoginPage openPage() {
        driver.navigate().to(PropertiesHandler.getLoginPage());
        return this;
    }
}
