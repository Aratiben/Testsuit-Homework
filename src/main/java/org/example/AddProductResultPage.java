package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class AddProductResultPage extends Utils {
      private By _clickonElement=By.className("cart-lable");
   // private By _Email=By.name("Email");
    public void clickOnShoopingBasket(){
        String name1 = getTextFromElement(By.partialLinkText("Leica T Mirrorless Digital Camera"));
        System.out.println("Product name before adding to cart: " + name1);//
        String expectedResult="Your product has been added";
        //click on cart
        clickOnElement(By.className("cart-label"));
        String name2 = getTextFromElement(By.className("product-name"));
        System.out.println( "After Adding to the Basket " + name2);
        Assert.assertEquals(name2, expectedResult, "Only Register user can add ");
    }
}
