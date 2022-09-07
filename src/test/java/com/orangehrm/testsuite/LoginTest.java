package com.orangehrm.testsuite;

import com.google.common.base.Verify;
import com.orangehrm.pages.*;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {
    LoginPage loginPage = new   LoginPage();
    HomePage homePage = new HomePage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();
    DashboardPage dashboardPage = new DashboardPage();
@Test
    public void verifyUserShouldLoginSuccessfully() {
        //verify welcome message
        loginPage.getWelcomeText();
        //loginPage.enterEmailId("Admin");
        loginPage.enterEmailId("Admin");
        //Enter password
        loginPage.enterPassWord("admin123");
        //click on login button
        loginPage.clickOnLoginButton();
    }
@Test
    public void verifyThatTheLogoDisplayOnHomePage() {

        //loginPage.enterEmailId("Admin");
        loginPage.enterEmailId("Admin");
        //Enter password
        loginPage.enterPassWord("admin123");
        //click on login button
        loginPage.clickOnLoginButton();
        //verify logo is displayed
        homePage.GetLogo();

    }
@Test
    public void verifyUserShouldLogOutSuccessFully() {
        //loginPage.enterEmailId("Admin");
        loginPage.enterEmailId("Admin");
        //Enter password
        loginPage.enterPassWord("admin123");
        //click on login button
        loginPage.clickOnLoginButton();
        homePage.clickOnProfileLogo();
        homePage.clickOnLogoutButton();
        loginPage.getWelcomeText();



    }
}
