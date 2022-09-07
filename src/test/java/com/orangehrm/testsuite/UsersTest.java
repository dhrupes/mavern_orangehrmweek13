package com.orangehrm.testsuite;

import com.google.common.base.Verify;
import com.orangehrm.pages.*;
import com.orangehrm.testbase.TestBase;
import javafx.scene.control.Tab;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    DashboardPage dashboardPage = new DashboardPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        loginPage.enterEmailId("Admin");
        loginPage.enterPassWord("admin123");
        loginPage.clickOnLoginButton();
        adminPage.clickOnAdmin();
        String actualText1 = adminPage.verifyUserManagementTab();
        String expectedText1 = "User Management";
        Assert.assertEquals(expectedText1, actualText1, "User Management");

        addUserPage.clickOnAddButton();
        addUserPage.clickOnUserRoleDropDown();
        addUserPage.getAdmin();
        addUserPage.clickOnEmployeeName("Goutam Ganesh");
        addUserPage.enterUserName("Dhrupesh p");
        addUserPage.setStatusDropDown();
        addUserPage.setDisableTab();
        addUserPage.setPassword("D1234567@d");
        addUserPage.setConfirmPassword("D1234567@d");
        addUserPage.clickOnSaveButton();
    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() {
      /*  Login to Application
       Select Status
        Click on "Search" Button
        Verify the User should be in Result list.  */
        //loginPage.enterEmailId("Admin");
        loginPage.enterEmailId("Admin");
        //Enterpassword
        loginPage.enterPassWord("admin123");
        //click on login button
        loginPage.clickOnLoginButton();
        //click on admin tab
        adminPage.clickOnAdmin();
        //  Verify "System Users" Text
        String actualText2 = viewSystemUsersPage.getSystemUserText();
        String expectedText2 = "System Users";
        Assert.assertEquals(expectedText2, actualText2, "System Users");
        //  Enter Username
        viewSystemUsersPage.clickOnUserNameField("John.Smith");
        //Select User Role
        viewSystemUsersPage.clickOnUserRollDropDown();
        //Select admin from dropdown tab
        // viewSystemUsersPage.getAdminOne();
        //select status
        addUserPage.setStatusDropDown();
        //  addUserPage.setDisableTab();

        //Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();
        //Verify the User should be in Result list.
        String actualText3 = viewSystemUsersPage.verifyResultList();
        String expectedText3 = "John.Smith";
        Assert.assertEquals(actualText3, expectedText3, "John.Smith");
        viewSystemUsersPage.verifyResultList();
    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessfully() {
        // Login to Application
        //loginPage.enterEmailId("Admin");
        loginPage.enterEmailId("Admin");
        //Enter password
        loginPage.enterPassWord("admin123");
        //click on login button
        loginPage.clickOnLoginButton();
        //click on admin tab
        adminPage.clickOnAdmin();
        //  Verify "System Users" Text
        String actualText2 = viewSystemUsersPage.getSystemUserText();
        String expectedText2 = "System Users";
        Assert.assertEquals(expectedText2, actualText2, "System Users");
        //  Enter Username
        viewSystemUsersPage.clickOnUserNameField("Admin");
        //Select User Role
        viewSystemUsersPage.clickOnUserRollDropDown();
        //Select admin from dropdown tab
        // viewSystemUsersPage.getAdminOne();
        //select status
        addUserPage.setStatusDropDown();
        //  addUserPage.setDisableTab();
        //Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();
        //Verify the User should be in Result list.
        String actualText3 = viewSystemUsersPage.verifyResultList();
        String expectedText3 = "John.Smith";
        Assert.assertEquals(actualText3, expectedText3, "John.Smith");
        viewSystemUsersPage.verifyResultList();
       // Click on Check box
        viewSystemUsersPage.clickOnCheckBox();
        //Click on deleteButton
        viewSystemUsersPage.clickOnDeleteButton();
        /*
         Popup will display
         Click on Ok Button on Popup
         verify message "Successfully Deleted"*/

    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        //Login to Application
        //loginPage.enterEmailId("Admin");
        loginPage.enterEmailId("Admin");
        //Enterpassword
        loginPage.enterPassWord("admin123");
        //click on login button
        loginPage.clickOnLoginButton();
        //click on admin tab
        adminPage.clickOnAdmin();
        //  Verify "System Users" Text
        String actualText2 = viewSystemUsersPage.getSystemUserText();
        String expectedText2 = "System Users";
        Assert.assertEquals(expectedText2, actualText2, "System Users");
        //  Enter Username
        viewSystemUsersPage.clickOnUserNameField("Admin");
        //Select User Role
        viewSystemUsersPage.clickOnUserRollDropDown();

        addUserPage.setStatusDropDown();
        //Click on "Search" Button
        viewSystemUsersPage.clickOnSearchButton();

        // verify message "No Records Found" */

    }

}
