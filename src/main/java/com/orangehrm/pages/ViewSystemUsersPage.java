package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {

    By systemUserText = By.xpath("//h5[text()='System Users']");
    By userNameField = By.xpath("//div[@class='oxd-form-row']/div/div/div/div[2]/input");
    By userRollDropDown = By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i");
    By adminOne =By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    //By statusDropdownTab1 = By.xpath("");
    //By SelectDisable1 =By.xpath("");
     By searchButton = By.xpath("//button[text()=' Search ']");

     By ResultList = By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']/div[3]/div[text()='John.Smith']");

     By CheckBox = By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']/div/div/div/div/label/span/i");
     By DeleteButton = By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']/div/button/i[@class='oxd-icon bi-trash']");
     public String getSystemUserText() {
        return getTextFromElement(systemUserText);
    }

    public void clickOnUserNameField(String namefield) {
        sendTextToElement(userNameField,namefield);
    }
    public void clickOnUserRollDropDown(){
        clickOnElement(userRollDropDown);
    }
    public void getAdminOne(){
        clickOnElement(adminOne);
    }
    public void clickOnEmployeeField(){
        clickOnElement(employeeNameField);
    }

    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }

    public String verifyResultList()
    {
   return   getTextFromElement(ResultList);
    }
    public void clickOnCheckBox(){
        clickOnElement(CheckBox);
    }
    public void clickOnDeleteButton(){
         clickOnElement(DeleteButton);
    }


}

