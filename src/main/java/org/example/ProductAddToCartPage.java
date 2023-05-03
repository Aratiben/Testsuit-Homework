package org.example;

import org.openqa.selenium.By;

public class ProductAddToCartPage extends Utils {

    public void clickOnProudct(){
        //click on the product to add in cart
        clickOnElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]"));
    }
}
