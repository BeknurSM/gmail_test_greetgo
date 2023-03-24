package com.gmail.ui.pages;

import com.gmail.ui.service.PropertiesHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div/div")
    private WebElement writeTextButton;

    @FindBy(id = ":xw")
    private WebElement toWhom;

    @FindBy(id = ":nc")
    private WebElement textField;

    @FindBy(id = ":ov")
    private WebElement sendEmailButton;

    @FindBy(id = ":ov")
    private WebElement sentEmails;

    @FindBy(xpath = "(//*[contains(text(),'My text')])[2]")
    private WebElement lastSentEmail;

    @FindBy(xpath = "(//*[contains(text(),'My text')])[3]")
    private WebElement lastSentEmailText;

    @FindBy(xpath = "//*[@id=\'gb\']/div[2]/div[2]/div[3]/div[3]/a")
    private WebElement settingsButton;

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[3]/div[1]/div[1]/div[1]/div/button[2]")
    private WebElement allSettingsButton;

    @FindBy(id = ":q2")
    private WebElement createNewSignatureButton;

    @FindBy(id = ":1nl.in")
    private WebElement nameInSignatureField;

    @FindBy(xpath = "/html/body/div[51]/div[3]/button[1]")
    private WebElement createSignatureButton;

    @FindBy(id = ":q3")
    private WebElement textSignatureField;

    @FindBy(id = ":qa")
    private WebElement saveChangesButton;

    @FindBy(id = ":dd")
    private WebElement signatureButton;

    @FindBy(id = ":24w")
    private WebElement selectSignature;

    @FindBy(id = ":ps")
    private WebElement signatureText;


    public void sendEmail() {
        wait.waitUntilClickable(writeTextButton).click();
        wait.waitUntilVisible(toWhom).sendKeys(PropertiesHandler.getUserEmail());
        wait.waitUntilVisible(textField).sendKeys(PropertiesHandler.getText());
        wait.waitUntilClickable(sendEmailButton).click();
    }
    public String getSentText() {
        wait.waitUntilClickable(sentEmails).click();
        wait.waitUntilVisible(lastSentEmail).click();
        return wait.waitUntilVisible(lastSentEmailText).getText();
    }

    public void configureSignature() {
        wait.waitUntilClickable(settingsButton).click();
        wait.waitUntilClickable(allSettingsButton).click();
        wait.waitUntilClickable(createNewSignatureButton).click();
        wait.waitUntilVisible(nameInSignatureField).sendKeys(PropertiesHandler.getSignature());
        wait.waitUntilClickable(createSignatureButton).click();
        wait.waitUntilVisible(textSignatureField).sendKeys(PropertiesHandler.getSignature());
        wait.waitUntilClickable(saveChangesButton).click();
    }
    public void sendEmailWithSignature() {
        wait.waitUntilClickable(writeTextButton).click();
        wait.waitUntilVisible(toWhom).sendKeys(PropertiesHandler.getUserEmail());
        wait.waitUntilVisible(textField).sendKeys(PropertiesHandler.getText());
        wait.waitUntilClickable(signatureButton).click();
        wait.waitUntilClickable(selectSignature).click();
        wait.waitUntilClickable(sendEmailButton).click();
    }

    public String getSignatureText() {
        wait.waitUntilClickable(sentEmails).click();
        wait.waitUntilVisible(lastSentEmail).click();
        return wait.waitUntilVisible(signatureText).getText();
    }

}