package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class FillDetailsAsAGuest extends Utils{
    public void fillDetailsAsAGuest() {
        clickOnElement(By.xpath("//button[text()='Checkout as Guest']"));
        //type first name
        typeText(By.id("BillingNewAddress_FirstName"), "Raj");
        //last name
        typeText(By.id("BillingNewAddress_LastName"), "Patel");
        typeText(By.xpath("(//input[@type='email'])[1]"), "abc@yahoo.com");
        selectelementByIndex(By.xpath("//select[@data-trigger='country-select']"), 79);
        typeText(By.id("BillingNewAddress_City"), "London");
        //Address
        typeText(By.id("BillingNewAddress_Address1"), "10 Watford");
        typeText(By.id("BillingNewAddress_ZipPostalCode"), "IG5)RN");
        //type phone number
        typeText(By.xpath("//input[@type='tel']"), "07574632173");
        clickOnElement(By.name("save"));
        String expectedResult="Your order has been successfully processed! ";

        clickOnElement(By.cssSelector("input#shippingoption_1"));
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
        clickOnElement(By.xpath("(//label[@for='paymentmethod_1'])[2]"));
        clickOnElement(By.xpath("(//*[text()='Continue'])[4]"));
        //card details
        selectelementByIndex(By.id("CreditCardType"),1);
        typeText(By.id("CardholderName"),"MASTERCARD");
        //card number
        typeText(By.id("CardNumber"),"5267659384088142");
        selectelementByIndex(By.id("ExpireMonth"),3);
        selectelementByIndex(By.id("ExpireYear"),3);
        //short code
        typeText(By.id("CardCode"),"304");
        clickOnElement(By.xpath("(//*[text()='Continue'])[5]"));
        //click on confirm order
        clickOnElement(By.xpath("//button[text()='Confirm']"));
        String actualResult=getTextFromElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        Assert.assertEquals(actualResult,expectedResult);

    }
}
