package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.bouncycastle.util.Store;
import org.openqa.selenium.By;

/**
 * Created by bhavesh patel
 */
public class LoginPage extends Utility {

    //verify Login message
    By welcomeText = By.xpath("//h5[text()='Login']");
    //Store username,
    By emailField = By.xpath("//input[@name='username']");
    //password
    By passwordField = By.xpath("//input[@name='password']");
    //click on login button
    By loginButton = By.xpath("//button[@type='submit']");

    public String getWelcomeText() {

        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassWord(String pass) {
        sendTextToElement(passwordField, pass);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }




}
