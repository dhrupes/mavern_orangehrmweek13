package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {

    By addButton = By.xpath("//div[@class='orangehrm-paper-container']/div/button/i");
    By userRoleDropDown =By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By admin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By userName = By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[4]/div/div[2]/input");
    By statusDropDown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[3]/div/div[2]/div/div");
    By disableTab = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By password = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']/div/div[2]/input");
    By confirmPassword = By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[2]/div/div[2]/input");
    By saveButton = By.xpath("//button[@type='submit']");
    By cancelButton = By.xpath("//div[@class='oxd-form-actions']/button[@type='button']");

    /*  //*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]
         //div[text()='Admin']
         //div//div[text()='Enabled']
     */
    //div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i */
    public void clickOnAddButton() {
        clickOnElement(addButton);
    }

    public void clickOnUserRoleDropDown() {
        clickOnElement(userRoleDropDown);
    }
  public void getAdmin(){
        clickOnElement(admin);
  }
    public void clickOnEmployeeName(String empName) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(employeeName,empName);
    }

    public void enterUserName(String username) {
        sendTextToElement(userName, username);
    }

    public void setStatusDropDown() {
        clickOnElement(statusDropDown);
    }
public void setDisableTab(){
        clickOnElement(disableTab);
}
    public void setPassword(String password1) {
        sendTextToElement(password, password1);

    }
    public void setConfirmPassword(String confirmPassword1){
        sendTextToElement(confirmPassword,confirmPassword1);
    }
    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }
     public void clickOnCancelButton(){
        clickOnElement(cancelButton);
     }
}














