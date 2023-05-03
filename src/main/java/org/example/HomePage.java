package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    By _registerButton = By.className("ico-register");

    public void clickOnRegisterButton() {
        clickOnElement(_registerButton);
    }
    public void clcikOnMacbook(){
        clickOnElement(By.xpath("(//button[contains(@title,'Add to compare list')])[1]"));
    }
    public void compareItems(){
        clickOnElement(By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[3]"));
        //click on Add to compare list on $25 Virtual Gift Card
        clickOnElement(By.xpath("//img[@src='https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png']"));

        clickOnElement(By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[4]"));
        //click on product comparison list
        clickOnElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a"));
}}
