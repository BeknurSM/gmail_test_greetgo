//package com.gmail.ui.pages;
//
//import com.gmail.ui.service.PropertiesHandler;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class HomePage extends AbstractPage {
//
//    public HomePage(WebDriver driver) {
//        super(driver);
//    }
//
//    @FindBy(xpath = "//span[@id='email-collection-tooltip-id']/span/span")
//    private WebElement userLogInText;
//
//    @FindBy(xpath = "//a[text()='Log In']")
//    private WebElement logInButton;
//
//    @FindBy(xpath = "//iframe[contains(@src, '/login/')]")
//    private WebElement loginFormFrame;
//
//    @FindBy(id = "loginUsername")
//    private WebElement loginFormUsernameInput;
//
//    @FindBy(id = "loginPassword")
//    private WebElement loginFormPasswordInput;
//
//    @FindBy(xpath = "//button[@type='submit' and normalize-space()='Log In']")
//    private WebElement loginFormSubmitButton;
//
//    @FindBy(xpath = "//div[@class='_2vkeRJojnV7cb9pMlPHy7d a35Fm2MurU14xdNybLiZp']")
//    private WebElement headerToolBar;
//
//    @FindBy(xpath = "//div[@class='_1G4yU68P50vRZ4USXfaceV ']")
//    private WebElement redditPremiumRightSideBar;
//
//    @FindBy(xpath = "//div[@class='_1G4yU68P50vRZ4USXfaceV _2QeqBqfT5UbHBoViZUt-wX']")
//    private WebElement homeRightSideBar;
//
//    @FindBy(className = "_1vYrJH5uc57mZQJPN4l34E")
//    private WebElement redditRightsRightSideBar;
//
//    @FindBy(className = "_2jJNpBqXMbbyOiGCElTYxZ")
//    private WebElement createPostFrontBar;
//
//    @FindBy(className = "wBtTDilkW_rtT2k5x3eie")
//    private WebElement postsFilterFrontBar;
//
//    @FindBy(className = "rpBJOHq2PR60pnwJlUyP0")
//    private WebElement postsFrontBar;
//
//    @FindBy(xpath = "//button[@id='USER_DROPDOWN_ID']//i[contains(@class, 'icon-caret_down')]")
//    private WebElement accountDropdownMenu;
//
//    @FindBy(xpath = "//a[@href='/settings/']")
//    private WebElement accountSettingsMenuItem;
//
//    @FindBy(xpath = "//button[@aria-label='Close']")
//    private WebElement popupCloseButton;
//
//    public String getUserNameText() {
//        return wait.waitUntilVisible(userLogInText).getText();
//    }
//
//    @Override
//    public HomePage openPage() {
//        driver.navigate().to(PropertiesHandler.getHomePage());
//        return this;
//    }
//
//    public void clickLoginButton() {
//        wait.waitUntilClickable(logInButton).click();
//    }
//
//    public void enterCredentials(User user) {
//        driver.switchTo().frame(loginFormFrame);
//        wait.waitUntilVisible(loginFormUsernameInput).sendKeys(user.userName());
//        wait.waitUntilVisible(loginFormPasswordInput).sendKeys(user.userPassword());
//    }
//
//    public void loginSubmit() {
//        wait.waitUntilVisible(loginFormSubmitButton).click();
//    }
//
//    public boolean isHeaderToolBarDisplayed() {
//        return wait.isElementPresent(headerToolBar);
//    }
//
//    public boolean isRedditPremiumRightSideBarDisplayed() {
//        return wait.isElementPresent(redditPremiumRightSideBar);
//    }
//
//    public boolean isHomeRightSideBarDisplayed() {
//        return wait.isElementPresent(homeRightSideBar);
//    }
//
//    public boolean isRedditRightsRightSideBarDisplayed() {
//        return wait.isElementPresent(redditRightsRightSideBar);
//    }
//
//    public boolean isCreatePostFrontBarDisplayed() {
//        return wait.isElementPresent(createPostFrontBar);
//    }
//
//    public boolean isPostsFilterFrontBarDisplayed() {
//        return wait.isElementPresent(postsFilterFrontBar);
//    }
//
//    public boolean isPostsFrontBarDisplayed() {
//        return wait.isElementPresent(postsFrontBar);
//    }
//
//    public void openAccountMenu() {
//        wait.waitUntilClickable(accountDropdownMenu).click();
//    }
//
//    public void openAccountSettings() {
//        wait.waitUntilClickable(accountSettingsMenuItem, 15).click();
//    }
//
//    public void closePopupWindow() {
//        wait.waitUntilClickable(popupCloseButton).click();
//    }
//}