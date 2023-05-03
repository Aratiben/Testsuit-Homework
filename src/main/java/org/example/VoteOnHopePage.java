package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class VoteOnHopePage extends Utils {

    public void userCanNotVoteWithoutRegistration() {
        String A = "Only Registered User can vote ";
        //click on poll answers
        clickOnElement(By.id("pollanswers-2"));
        clickOnElement(By.xpath("//button[@id='vote-poll-1']"));
        //get text
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String b = getTextFromElement(By.xpath("//div[@class='poll-vote-error']"));
        System.out.println(b);
        Assert.assertEquals(b, A, "Registered user can vote");
    }

}

