package com.gmail.ui.steps;

import com.gmail.ui.driver.DriverSingleton;
import com.gmail.ui.pages.LoginPage;
import org.testng.annotations.Test;

public class GmailSteps {


    @Test (description = "the user opens gmail website")
    public void openWebsitePage() {
        LoginPage loginPage = new LoginPage(DriverSingleton.getDriver())
                .openPage();
    }

}
