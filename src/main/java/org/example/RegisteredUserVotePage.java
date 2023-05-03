package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisteredUserVotePage extends Utils {

    public void clicklOnVote(){
         String expectedResult="Your vot has cubmitted";
        //clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        clickOnElement(By.id("pollanswers-2"));
        //click on vote
        clickOnElement(By.xpath("//button[@id='vote-poll-1']"));
       String actualResult= getTextFromElement(By.xpath("//li[@class='answer'][2]"));
        Assert.assertEquals(actualResult,expectedResult,"Only Registered user can vote");
    }
}
