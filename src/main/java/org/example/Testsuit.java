package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class Testsuit {
    protected static WebDriver driver;

    // static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    public static void clickonElement(By byElement) {
        driver.findElement(byElement).click();
    }


    public static void typeText(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timeStamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }




    @BeforeMethod
    public static void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public static void closeBrowser() {
        driver.close();
    }

    @Test
    public static void compareProduct() {
        String s = "You have no product to compare ";
        clickonElement(By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[3]"));
        //click on Add to compare list on $25 Virtual Gift Card
        driver.findElement(By.xpath("//img[@src='https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png']")).click();
        clickonElement(By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[4]"));
        //click on product comparison list
        clickonElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a"));
        //get text
        String name1 = driver.findElement(By.partialLinkText("$25 Virtual Gift Card")).getText();
        System.out.println("First Product is: " + name1);
        String name2 = driver.findElement(By.partialLinkText("HTC One M8 Android L 5.0 Lollipop")).getText();
        //get text
        System.out.println("Second Product is: " + name2);
        //click on clear list
        clickonElement(By.className("clear-list"));
        //get text
        String message = getTextFromElement(By.className("no-data"));
        System.out.println(message);
        assertEquals(message, s, "Product name is Different");
    }

    @Test
    public static void toVeryfyUserShouldBeLoggedInSuccessFully() {
        String expectedMessage = "Thank you for registration ";
        //click ok register
        clickonElement(By.className("ico-register"));
        //type your first name
        typeText(By.id("FirstName"), "TestFirstName");
        //type your last name
        typeText(By.id("LastName"), "TestLastName");
        //type email address
        typeText(By.name("Email"), "testEmail" + timeStamp() + "@gmail.com");
        //type password
        typeText(By.id("Password"), "Test1234");
        //confirm password
        typeText(By.id("ConfirmPassword"), "Test1234");
        //click on register
        clickonElement(By.id("register-button"));
        String message = getTextFromElement(By.xpath("//div[@class='result']"));
        //comparing message actual to expected
        assertEquals(message, expectedMessage, "Registration is not completed");
    }

    @Test
    public static void toVeryFyRegisteredUserShouldBeAbleToReferProductToAFriend() {
        //public static void toVeryfyUserShouldBeLoggedInSuccessFully
        String A = "Yor message has been sent";
        //clcik on login button
        clickonElement(By.className("ico-register"));
        //add your first name
        typeText(By.id("FirstName"), "TestFirstName1");
        //type your last name
        typeText(By.id("LastName"), "TestLastName");
        //type email address
        typeText(By.name("Email"), "testEmail12345@gmail.com");
        //type password
        typeText(By.id("Password"), "Test1234");
        //confirm password
        typeText(By.id("ConfirmPassword"), "Test1234");
        //click on register button
        clickonElement(By.id("register-button"));
        clickonElement(By.className("ico-login"));
        //type your email addres
        typeText(By.id("Email"), "testemail12345@gmail.com");
        //type your password
        typeText(By.id("Password"), "Test1234");
        //click on login
        clickonElement(By.xpath("//button[@class='button-1 login-button']"));
        clickonElement(By.xpath("(//a[@href='/build-your-own-computer'])[2]"));
        clickonElement(By.xpath("(//button[@type='button'])[4]"));
        typeText(By.className("friend-email"), "abc@yahoo.com");
        //driver.findElement(By.className("your-email")).sendKeys("testEmail1234@gmail.com");
        clickonElement(By.name("send-email"));
        String Answer = getTextFromElement(By.className("result"));
        System.out.println(Answer);
        assertEquals(Answer, A, "Your Message has been sent");

    }


    @Test
    public static void toVerifyUserShouldBeAbleToSendEmail() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open the browser
        String B = "Only Registered user can refer a product to a friend";
        clickonElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]"));
        //click on send email
        clickonElement(By.xpath("//button[@class='button-2 email-a-friend-button']"));
        //type friend's email
        typeText(By.className("friend-email"), "friends123@gmail.com");
        //type your email
        typeText(By.className("your-email"), "myemail@gmail.com");
        //click on send email
        clickonElement(By.name("send-email"));

        String s = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']/ul/li"));
        System.out.println(s);
        assertEquals(s, B, "You have to Register First");
    }
    @Test
    public static void toVeryFyRegisteredUserShouldBeAbleToVote() {
        String A = "You vot Has benn submitted";
        //click on login button
        clickonElement(By.className("ico-register"));
        //add your first name
        typeText(By.id("FirstName"), "TestFirstName1");
        //type your last name
        typeText(By.id("LastName"), "TestLastName");
        //type email address
        typeText(By.name("Email"), "testEmail1234@gmail.com");
        //type password
        typeText(By.id("Password"), "Test1234");
        //confirm password
        typeText(By.id("ConfirmPassword"), "Test1234");
        //click on register button
        clickonElement(By.id("register-button"));
        //click on login button
        clickonElement(By.className("ico-login"));
        //type your email address
        typeText(By.id("Email"), "testemail1234@gmail.com");
        //type your password
        typeText(By.id("Password"), "Test1234");
        //click on login
        clickonElement(By.xpath("//button[@class='button-1 login-button']"));
        clickonElement(By.id("pollanswers-2"));
        //click on vote
        clickonElement(By.xpath("//button[@id='vote-poll-1']"));
        String actualResult = getTextFromElement(By.className("poll-total-votes"));
        System.out.println(actualResult);
        assertEquals(actualResult, A, "Your vote has been submitted");
    }
    @Test
    public static void toVerifyNonRegisteredUserShouldNotBeAbleToVote() {
        String A = "Only Registered User can vote ";
        //click on poll answers
        clickonElement(By.id("pollanswers-2"));
        clickonElement(By.xpath("//button[@id='vote-poll-1']"));
        //get text
        String b = getTextFromElement(By.xpath("//div[@class='poll-vote-error']"));
        System.out.println(b);
        assertEquals(b, A, "Registered user can vote");
    }
    @Test
    public static void toVerifyUserShouldBeAbleTodoAddToCartProduct() {
        String A = " Your product has been added";
        //click on the electronics
        clickonElement(By.xpath("(//a[@title='Show products in category Electronics'])[1]"));
        //click on show product camara and photo
        clickonElement(By.xpath("(//a[@title='Show products in category Camera & photo'])[1]"));
        //click on the product to add in cart
        clickonElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]"));
        //click on cart
        clickonElement(By.className("cart-label"));
        String name2 = getTextFromElement(By.className("product-name"));
        System.out.println(name2);
        assertEquals(name2, A, "Only Register user can add ");
    }

}



