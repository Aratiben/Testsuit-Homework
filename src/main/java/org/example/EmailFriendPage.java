package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailFriendPage extends Utils {

    public void sendEmailToFriend() {
        String B = "Only Registered user can refer a product to a friend";


        typeText(By.className("friend-email"), "abc@yahoo.com");
        driver.findElement(By.className("your-email")).sendKeys("testEmail@gmail.com");
        clickOnElement(By.name("send-email"));
        String Answer = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']/ul/li"));
        // System.out.println(Answer);
        Assert.assertEquals(Answer, B, "Your Message has been sent");

    }

    public void registertredUserCanEmail() {
        String B = "Only Registered user can refer a product to a friend";
        typeText(By.className("friend-email"), "abc@yahoo.com");
        // driver.findElement(By.className("your-email")).sendKeys("testEmail@gmail.com");
        clickOnElement(By.name("send-email"));
        String Answer = getTextFromElement(By.className("result"));
        // System.out.println(Answer);
        Assert.assertEquals(Answer, B, "Your Message has been sent");
    }
}