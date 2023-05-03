package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {


    private By _firstName = By.id("FirstName");
    private By _LastName = By.id("LastName");
    private By _Email = By.name("Email");
    private By _Password = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");



        public void fillInRegisterDetails() {

            clickOnElement(By.className("ico-register"));


            //type your first name
            typeText(_firstName, "TestFirstName");
            //type your last name
            typeText(_LastName, "TestLastName");
            //type email address
            typeText(_Email,"testEmail" + timeStamp() + "@gmail.com");
            //type password
            typeText(_Password, "Test1234");
            //confirm password
            typeText(_ConfirmPassword, "Test1234");
            //click on register
            clickOnElement(By.id("register-button"));

        }
    }
