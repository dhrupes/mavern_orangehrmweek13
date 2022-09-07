package com.orangehrm.testbase;

import com.orangehrm.propertyreader.PropertyReader;
import com.orangehrm.utility.Utility;
import com.orangehrm.propertyreader.PropertyReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by bhavesh patel
 */
public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){

        //closeBrowser();
    }

}

