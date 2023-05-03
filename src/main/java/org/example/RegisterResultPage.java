package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class RegisterResultPage extends Utils {

    public void userShouldSeeTheMessage(){
        String expectedMessage = "Thank you for registration ";
        String message = getTextFromElement(By.xpath("//div[@class='result']"));
        //comparing message actual to expected
        Assert.assertEquals(message,expectedMessage,"Something Wrong");
    }
}
