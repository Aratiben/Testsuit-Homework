package org.example;

import org.openqa.selenium.By;

public class MacBook extends Utils{
    public void clickOnSendEmail(){
        clickOnElement(By.xpath("//button[@class='button-2 email-a-friend-button']"));
    }
}
