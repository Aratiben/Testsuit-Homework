package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Timestamp;

public class Utils extends BasePage {
    //protected static WebDriver driver;
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }


    public static void typeText(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timeStamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

}
