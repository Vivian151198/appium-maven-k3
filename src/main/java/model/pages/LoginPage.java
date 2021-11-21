package model.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import model.components.authentication.LoginDialogComponent;
import model.components.global.BottomNavComponent;
import org.openqa.selenium.By;

public class LoginPage {

    private final AppiumDriver<MobileElement> appiumDriver;
    private By usernameSel = MobileBy.AccessibilityId("input-email");
    private By passwordSel = MobileBy.AccessibilityId("input-password");
    private By loginBtnSel = MobileBy.AccessibilityId("button-LOGIN");
    private BottomNavComponent bottomNavComponent;
    private LoginDialogComponent loginDialogComponent;

    public LoginPage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public MobileElement usernameElem(){
        return appiumDriver.findElement(usernameSel);
    }

    public LoginPage inputUserName(String username){
        appiumDriver.findElement(usernameSel).sendKeys(username);
        return this;
    }

    public MobileElement passwordElem(){
        return appiumDriver.findElement(passwordSel);
    }

    public LoginPage inputPassword(String password){
        appiumDriver.findElement(passwordSel).sendKeys(password);
        return this;
    }

    public MobileElement loginBtnElem(){
        return appiumDriver.findElement(loginBtnSel);
    }

    public LoginPage clickOnLoginBtn(){
        appiumDriver.findElement(loginBtnSel).click();
        return this;
    }

    public BottomNavComponent bottomNavComponent(){
        return new BottomNavComponent(appiumDriver);
    }

    public LoginDialogComponent loginDialogComponent(){
        return new LoginDialogComponent(appiumDriver);
    }
}
