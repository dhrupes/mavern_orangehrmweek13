package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    By TextDashBoard = By.xpath("//span[text()='Dashboard']");

    public void textDashboard(){
        getTextFromElement(TextDashBoard);
    }
}
