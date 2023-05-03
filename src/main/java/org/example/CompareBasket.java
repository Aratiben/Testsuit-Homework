package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareBasket extends Utils{
    public void clickOnCompareBasket(){
        String ExpectedResult = "You have no product to compare";
        String name1 = driver.findElement(By.partialLinkText("$25 Virtual Gift Card")).getText();
        System.out.println("First Product is: " + name1);

        String name2 = driver.findElement(By.partialLinkText("HTC One M8 Android L 5.0 Lollipop")).getText();
        //get text
        System.out.println("Second Product is: " + name2);
        //click on clear list WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(By.className("clear-list")).click();
        //get text
        String message = driver.findElement(By.className("no-data")).getText();
        System.out.println(message);
        Assert.assertEquals(message,ExpectedResult,"You have no items to compare");
    }
}
