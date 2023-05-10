package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;

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


    public static void selectelementByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public static void selectelementsByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public static void selectelementByText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public void waitForClickable(By by, int timeInSec) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void searchText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static boolean isDisplayed(By by) {
        return driver.findElement(by).isDisplayed();
    }

    public static void waitForNumberOfWindows(int num, int timeInSec) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.numberOfWindowsToBe(num));
    }
    public static void waituntilthetext(By by,int timeInsec){
        //WebDriverWait wait=new WebDriverWait((driver,Duration.ofSeconds(timeInsec));
        //wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}




