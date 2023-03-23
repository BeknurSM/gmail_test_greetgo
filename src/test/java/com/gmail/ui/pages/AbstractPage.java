package com.gmail.ui.pages;

import com.gmail.ui.service.Waiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract class AbstractPage {

    protected WebDriver driver;
    protected Waiter wait;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waiter(driver);
        PageFactory.initElements(driver, this);
    }

    protected AbstractPage openPage() {
        return this;
    }
}
