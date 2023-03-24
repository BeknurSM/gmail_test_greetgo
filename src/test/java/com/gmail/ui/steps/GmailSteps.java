package com.gmail.ui.steps;

import com.gmail.ui.pages.HomePage;
import com.gmail.ui.pages.LoginPage;
import com.gmail.ui.service.PropertiesHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailSteps extends Hooks{

    @Test (priority = 1, description = "the user opens gmail website and logs in")
    public void loginGmail() {
            new LoginPage(driver).openPage()
            .enterCredentials();
    }

    @Test (priority = 2, description = "the user sends a message with any text")
    public void sendEmail(){
        new HomePage(driver).sendEmail();
    }

    @Test (priority = 3, description = "check whether email has been sent")
    public void checkSentEmail(){
        Assert.assertEquals(PropertiesHandler.getText(),  new HomePage(driver).getSentText() ,"The email has not been sent");
    }

    @Test (priority = 4, description = "the user sends a message with signature")
    public void sendEmailWithSignature(){
        new HomePage(driver).configureSignature();
        new HomePage(driver).sendEmailWithSignature();
    }

    @Test (priority =  5, description = "check whether email has been sent with signature")
    public void checkSentEmailWithSignature(){
        Assert.assertEquals(PropertiesHandler.getSignature(),  new HomePage(driver).getSignatureText() ,"The email has not been sent with signature");
    }
}
