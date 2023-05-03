package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    public void userLogin() {
        clickOnElement(By.className("ico-login"));
        //type your email addres
        typeText(By.id("Email"), "testemail@gmail.com");
        //type your password
        typeText(By.id("Password"), "Test1234");

        //click on login
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
    }
}