package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    By adminButton = By.xpath("//span[text()='Admin']");
    By userManagementTabText = By.xpath("//h6[text()='User Management']");
    By jobTab = By.xpath("//span[text()='Job ']");
    By organizationTab = By.xpath("//span[text()='Organization ']");

    public void clickOnAdmin() {
        clickOnElement(adminButton);
    }

    public String verifyUserManagementTab() {
        return getTextFromElement(userManagementTabText);

    }

    public void clickOnJobTab() {
        clickOnElement(jobTab);
    }

    public void clickOnOrganizationTab() {
        clickOnElement(organizationTab);
    }

}





