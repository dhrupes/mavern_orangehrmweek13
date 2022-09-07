package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * Created by Bhavesh Patel
 */
public class HomePage extends Utility {


    By Logo = By.xpath("//div[@class='oxd-brand-banner']/img");
    By TextAdmin = By.xpath("//a/span[text()='Admin']");
    By TextPIM = By.xpath("//ul[@class='oxd-main-menu']/li[2]/a/span");
    By TextLeave = By.xpath("//ul[@class='oxd-main-menu']/li[3]/a/span");
    By TextDashboard = By.xpath("//ul[@class='oxd-main-menu']/li[8]/a/span");
    //By WelcomeText = By.xpath("");
    // By LogOut = By.xpath("//a[text()='Logout']");

    By ProfileLogo = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
    By LogoutButton = By.xpath("//a[@href='/web/index.php/auth/logout']");

    public String GetLogo() {
        return getTextFromElement(Logo);
    }

    public String GetAdmin() {
        return getTextFromElement(TextAdmin);
    }

    public void ClickonAdmin() {
        clickOnElement(TextAdmin);
    }

    public String GetPIM() {
        return getTextFromElement(TextPIM);
    }

    public String GetLeave() {
        return getTextFromElement(TextLeave);
    }

    public String GetDashboard() {
        return getTextFromElement(TextDashboard);
    }
    //public void ClickOnLogOut(){
    //  clickOnElement(LogOut);
    // }

    public void clickOnProfileLogo() {
        clickOnElement(ProfileLogo);
    }

    public void clickOnLogoutButton(){
        clickOnElement(LogoutButton);
    }
}
