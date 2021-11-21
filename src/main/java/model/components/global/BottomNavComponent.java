package model.components.global;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BottomNavComponent {

    private AppiumDriver<MobileElement> appiumDriver;
    private By loginLabelSel = MobileBy.AccessibilityId("Login");
    private By formsLabelSel = MobileBy.AccessibilityId("Forms");
    private By swipeLabelSel = MobileBy.AccessibilityId("Swipe");


    public BottomNavComponent(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public MobileElement loginLableElem(){
        return appiumDriver.findElement(loginLabelSel);
    }

    public MobileElement formsLableElem(){
        return appiumDriver.findElement(formsLabelSel);
    }

    public MobileElement swipeLableElem(){
        return appiumDriver.findElement(swipeLabelSel);
    }

    public void clickOnLogin(){
        appiumDriver.findElement(loginLabelSel).click();
    }
}
