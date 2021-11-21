package test.authentication;

import driver.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import model.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginTest {

    public static void main(String[] args) {

        DriverFactory.startAppiumServer();
        AndroidDriver<MobileElement> androidDriver = DriverFactory.getAndroidDriver();
        LoginPage loginPage = new LoginPage(androidDriver);
        loginPage.bottomNavComponent().clickOnLogin();
        loginPage.bottomNavComponent().formsLableElem().click();
        loginPage.bottomNavComponent().loginLableElem().click();

        //Fill login form
        loginPage.inputUserName("van@gmail.com").inputPassword("12345678").clickOnLoginBtn();
        
        String msgTitle = loginPage.loginDialogComponent().getMsgTitleElem();
        System.out.println(msgTitle);

    }
}

