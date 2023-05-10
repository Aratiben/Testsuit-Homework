package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void setUp() {
        driverManager.openBrowser();
    }

   @AfterMethod
   public void teardown() {
        driverManager.closeBrowser();
    }
}
