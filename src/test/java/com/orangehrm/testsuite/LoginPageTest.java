package com.orangehrm.testsuite;

import com.orangehrm.pages.*;
import com.orangehrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by bhavesh patel
 */
public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    AdminPage adminPage = new AdminPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() throws InterruptedException {

        String actualText = loginPage.getWelcomeText();
        String expectedText = "Login";
        Assert.assertEquals(expectedText, actualText, "Login");

        loginPage.enterEmailId("Admin");
        loginPage.enterPassWord("admin123");
        loginPage.clickOnLoginButton();

        homePage.GetLogo();
        homePage.GetAdmin();
        homePage.ClickonAdmin();
        homePage.GetPIM();
        homePage.GetLeave();
        homePage.GetDashboard();

        dashboardPage.textDashboard();

        adminPage.clickOnAdmin();
        String actualText1 = adminPage.verifyUserManagementTab();
        String expectedText1 = "User Management";
        Assert.assertEquals(expectedText1,actualText1,"User Management");
       // adminPage.verifyUserManagementTab();
        adminPage.clickOnJobTab();
        adminPage.clickOnOrganizationTab();

        // homePage.ClickOnLogOut();

        String actualText2 = viewSystemUsersPage.getSystemUserText();
        String expectedText2 = "System Users";
        Assert.assertEquals(expectedText2,actualText2,"System Users");
        viewSystemUsersPage.clickOnUserNameField("Dhrupesh");
        viewSystemUsersPage.clickOnUserRollDropDown();
        viewSystemUsersPage.getAdminOne();
      viewSystemUsersPage.clickOnEmployeeField();
      viewSystemUsersPage.clickOnSearchButton();

        addUserPage.clickOnAddButton();
        addUserPage.clickOnUserRoleDropDown();
        addUserPage.getAdmin();
        addUserPage.clickOnEmployeeName("Goutam Ganesh");
        addUserPage.enterUserName("Dhrupesh");
        addUserPage.setStatusDropDown();
        addUserPage.setDisableTab();
        addUserPage.setPassword("D1234567@d");
        addUserPage.setConfirmPassword("D1234567@d");
        addUserPage.clickOnSaveButton();
       // addUserPage.clickOnCancelButton();


    }

}
