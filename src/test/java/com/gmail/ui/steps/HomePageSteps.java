package com.gmail.ui.steps;


import org.testng.Assert;

//public class HomePageSteps extends BaseSteps {

//    private final HomePage homePage = new HomePage(driver);
//    private final User userWithPositiveKarma = User.withPositiveKarma();
//
//    @Given("the user opens reddit website")
//    public void openWebsitePage() {
//        homePage.openPage();
//    }
//
//    @When("the user clicks on login button")
//    public void clickLoginButton() {
//        homePage.clickLoginButton();
//    }
//
//    @Then("the user enters the credentials")
//    public void enterCredentials() {
//        homePage.enterCredentials(userWithPositiveKarma);
//    }
//
//    @And("the user clicks submit button")
//    public void loginSubmit() {
//        homePage.loginSubmit();
//    }
//
//    @Then("the correct username appears")
//    public void usernameAppears() {
//        Assert.assertEquals(homePage.getUserNameText(), userWithPositiveKarma.userName());
//    }
//
//    @Then("the header tool bar is displayed correctly")
//    public void isHeaderToolBarDisplayedCorrectly() {
//        Assert.assertTrue(homePage.isHeaderToolBarDisplayed());
//    }
//
//    @And("the reddit premium right side bar is displayed correctly")
//    public void isRedditPremiumRightSideBarDisplayedCorrectly() {
//        Assert.assertTrue(homePage.isRedditPremiumRightSideBarDisplayed());
//    }
//
//    @And("the home right side bar is displayed correctly")
//    public void isHomeRightSideBarDisplayedCorrectly() {
//        Assert.assertTrue(homePage.isHomeRightSideBarDisplayed());
//    }
//
//    @And("the reddit rights right side bar is displayed correctly")
//    public void isRedditRightsRightSideBarDisplayedCorrectly() {
//        Assert.assertTrue(homePage.isRedditRightsRightSideBarDisplayed());
//    }
//
//    @And("create post front bar is displayed correctly")
//    public void isCreatePostFrontBarDisplayedCorrectly() {
//        Assert.assertTrue(homePage.isCreatePostFrontBarDisplayed());
//    }
//
//    @And("posts filter front bar is displayed correctly")
//    public void isPostsFilterFrontBarDisplayedCorrectly() {
//        Assert.assertTrue(homePage.isPostsFilterFrontBarDisplayed());
//    }
//
//    @And("posts front bar is displayed correctly")
//    public void isPostsFrontBarDisplayedCorrectly() {
//        Assert.assertTrue(homePage.isPostsFrontBarDisplayed());
//    }
//
//    @And("the user opens account settings")
//    public void theUserOpensAccountSettings(){
//        homePage.openAccountMenu();
//        homePage.openAccountSettings();
//    }
//
//    @And("the user closes interests window")
//    public void theUserClosesInterestsWindow() {
//        homePage.closePopupWindow();
//    }
//}
