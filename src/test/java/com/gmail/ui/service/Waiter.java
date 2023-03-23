package com.gmail.ui.service;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {

    private final WebDriverWait wait;
    private final WebDriver driver;

    public Waiter(WebDriver driver) {
        this.driver = driver;
        Duration DEFAULT_WAITING_TIME_DURATION = Duration.ofSeconds(PropertiesHandler.getBaseTimeout());
        wait = new WebDriverWait(driver, DEFAULT_WAITING_TIME_DURATION);
    }

    public WebElement waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public WebElement waitUntilClickable(WebElement element, int timeOut) {
        new WebDriverWait(driver, Duration.ofSeconds(timeOut)).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }


    public WebElement waitUntilClickableLocator(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement waitUntilClickableLocator(By by, int timeOut) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitUntilVisible(WebElement element, int timeOut) {
        new WebDriverWait(driver, Duration.ofSeconds(timeOut)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public boolean isElementPresent(WebElement element) {
        try {
            waitUntilVisible(element);
            return true;
        } catch (TimeoutException | NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }
}
