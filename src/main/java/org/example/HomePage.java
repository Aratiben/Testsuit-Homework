package org.example;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Utils {
    By _registerButton = By.className("ico-register");

    public void clickOnRegisterButton() {
        clickOnElement(_registerButton);
    }

    public void clcikOnMacbook() {
        clickOnElement(By.xpath("(//button[contains(@title,'Add to compare list')])[1]"));
    }

    public void compareItems() {
        clickOnElement(By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[3]"));
        //click on Add to compare list on $25 Virtual Gift Card
        clickOnElement(By.xpath("//img[@src='https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png']"));

        clickOnElement(By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[4]"));
        //click on product comparison list
        clickOnElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a"));
    }

    public void printProductName() {
        List<WebElement> productlist = driver.findElements(By.cssSelector("div.product-grid h2"));
        for (WebElement e : productlist) {
            System.out.println(e.getText());
        }

    }

    public void clickOnOkButton() {
        clickOnElement(By.xpath("(//button[@type='submit'])[1]"));
        String alert = driver.switchTo().alert().getText();
        //System.out.println(alert);
        driver.switchTo().alert().accept();
        String expectedResult = "Please enter some search keyword";
        Assert.assertEquals(alert, expectedResult, "");


    }

    public void clickOnNewRelease() {
        clickOnElement(By.xpath("(//a[@class='news-title'])[2]"));
    }


    public void clickOnVote() {
        String expectedResult = "Please select an answer  ";
        clickOnElement(By.xpath("//button[text()='Vote']"));
        String alert = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(alert, expectedResult, "");


    }

    public void clickOnSearchButton(String searchText) {

        typeText(By.xpath("//input[contains(@type,'text')]"), searchText);

        clickOnElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));


        List<WebElement> collection_product_links =
                driver.findElements(By.cssSelector("div.product-grid h2"));

        //Validate if Search result is displayed corresponding
        //to the string which was searched
        for (int i = 0; i < collection_product_links.size(); i++) {
            String temp = collection_product_links.get(i).getText();

            if ((temp.toLowerCase().contains(searchText.toLowerCase()))) {
                Assert.assertTrue(true, searchText + " is displayed on product title Product Title: " + temp);
            } else {
                Assert.assertTrue(false, searchText + " is not displayed on product title Product Title: " + temp);

            }

        }

    }

    public void clcikOncurrency() {
        selectelementByIndex(By.name("customerCurrency"), 0);
        // store all products with the dollar

        List<WebElement> currency = driver.findElements(By.cssSelector("span.price"));
        //fetch all products with the same currency using the loopSystem.
        System.out.println("Products when currency chosen as US Dollar: ");
        {
            for (WebElement e : currency) {
                System.out.println(e.getText());
                //select currency from the currency selector
                selectelementByIndex(By.name("customerCurrency"), 1);
            }
        }

        {// store all products with the dollar currency
            List<WebElement> currency1 = driver.findElements(By.cssSelector("span.price"));
            // fetch all products with the same currency using the loop
            System.out.println("Products when currency chosen as Euro: ");
            for (WebElement e1 : currency1) {
                System.out.println(e1.getText());
            }
        }
    }

    public void clickOnProduct() {
        clickOnElement(By.xpath("(//button[contains(@type,'button')])[1]"));
    }

    public void clickOnFacebook() {
        clickOnElement(By.xpath("//*[text()='Facebook']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitForNumberOfWindows(2,10);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        clickOnElement(By.xpath("(//*[text()='Allow all cookies'])[2]"));
        //checking thw element is there or not

        boolean isEmailDisplayed = isDisplayed(By.xpath("(//input[@dir='ltr'])[1]"));
        if (isEmailDisplayed) {
            System.out.println("Email address is displayed ");
        } else {
            System.out.println("element is not present");}
        //checking password element is ther or not
            boolean isPasswordDisplayed=isDisplayed(By.xpath("(//input[@type='password'])[2]"));
         if (isPasswordDisplayed){
             System.out.println("Password is Displayed");}
         else {
             System.out.println("Password is not Displayed");
        }
         //login element
          boolean logInDisplayed=isDisplayed(By.xpath("(//*[text()='Log in'])[3]"));
        if (logInDisplayed) {
            System.out.println("Login is Displayed");
        }
        else {
            System.out.println("Login is not Displayed");}
        driver.close();

           //changing window
        for (String mainwindow : driver.getWindowHandles()) {
            driver.switchTo().window(mainwindow);


        String expectedResult="Welcome to Our Page";
        String actual=getTextFromElement(By.xpath("//*[text()='Welcome to our store']"));
        Assert.assertEquals(actual,expectedResult);
}}}