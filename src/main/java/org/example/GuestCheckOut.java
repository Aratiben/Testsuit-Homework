package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class GuestCheckOut extends Utils {
    public void guestCheckout() {
        //click on processor
        selectelementByIndex(By.id("product_attribute_1"), 1);
        //click on ram
        selectelementByIndex(By.xpath("//select[@data-attr='2']"), 3);
        //click on Hdd
        clickOnElement(By.id("product_attribute_3_6"));
        //click on os

        clickOnElement(By.id("product_attribute_5_10"));
        clickOnElement(By.id("product_attribute_5_11"));
        clickOnElement(By.id("product_attribute_5_12"));
        clickOnElement(By.id("add-to-cart-button-1"));
        clickOnElement(By.xpath("//span[text()='Shopping cart']"));
        clickOnElement(By.id("termsofservice"));
        clickOnElement(By.id("checkout"));
    }
}