package com.gmail.ui.steps;

import com.gmail.ui.pages.HomePage;
import com.gmail.ui.pages.LoginPage;
import com.gmail.ui.service.PropertiesHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailSteps extends Hooks{

    private final HomePage homePage = new HomePage(driver);

    @Test (description = "the user opens gmail website and logs in")
    public void loginGmail() {
            new LoginPage(driver).openPage()
            .enterCredentials();
    }

    @Test (description = "the user sends a message with any text")
    public void sendEmail(){
            homePage.sendEmail();
    }

    @Test (description = "check whether email has been sent")
    public void checkSentEmail(){
        Assert.assertEquals(PropertiesHandler.getText(),  homePage.getSentText() ,"The email has not been sent");
    }

    @Test (description = "the user sends a message with signature")
    public void sendEmailWithSignature(){
            homePage.configureSignature();
            homePage.sendEmailWithSignature();
    }

    @Test (description = "check whether email has been sent with signature")
    public void checkSentEmailWithSignature(){
        Assert.assertEquals(PropertiesHandler.getSignature(),  homePage.getSignatureText() ,"The email has not been sent with signature");
    }
}
