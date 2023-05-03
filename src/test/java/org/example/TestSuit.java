package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    // BasePage basePage=new BasePage();
    //DriverManager driverManager=new DriverManager();
    // Utils utils=new Utils();
    VoteOnHomePage voteOnHopePage = new VoteOnHomePage();
    //VoteResultPage voteResultPage=new VoteResultPage();
    LoginPage loginPage = new LoginPage();
    RegisteredUserVotePage registeredUserVotePage = new RegisteredUserVotePage();
    RegisterToLogin registerToLogin = new RegisterToLogin();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    ProductAddToCartPage productAddToCartPage = new ProductAddToCartPage();
    AddProductResultPage addProductResultPage = new AddProductResultPage();
    EmailFriendPage emailFriendPage = new EmailFriendPage();

    MacBook macBook = new MacBook();
    CompareBasket compareBasket = new CompareBasket();

    @Test
    public void c_toVerifyUserShouldBeLoggedInSuccessFully() {
        //click on register button
        homePage.clickOnRegisterButton();
        registrationPage.fillInRegisterDetails();
        registerResultPage.userShouldSeeTheMessage();

    }

    @Test
    public void b_toVerifyNonRegisteredUserCanNotVote() {
        voteOnHopePage.userCanNotVoteWithoutRegistration();

    }

    @Test
    public void d_toVerifyRegisteredUserShouldbeAbleToVote() {
        registerToLogin.userShouldBeAbleToLogin();
        loginPage.userLogin();
        //user should be able to vote
        registeredUserVotePage.clicklOnVote();


    }

    @Test
    public void f_toVerifyUserShouldbeAbleToAddTheProduct() {
        //click on elctronics
        electronicsPage.clcikOnelectronics();
        //clcik ok camara and photo
        cameraAndPhotoPage.clickOnCameraAndPhoto();
        //clcik on camara to add to cart
        productAddToCartPage.clickOnProudct();
        //click on the shopping basket
        addProductResultPage.clickOnShoppingBasket();

    }

    @Test
    public void a_toVerifyUserShouldBeAbleToEmail() {
       //click on product
        homePage.clcikOnMacbook();
        //click on send email
        macBook.clickOnSendEmail();
        //type details
        emailFriendPage.sendEmailToFriend();

    }

    @Test
    public void e_registeredUserShouldBeAbleToReferAProductToAFriend() {
        //register
        registrationPage.fillInRegisterDetails();
        //login
        loginPage.userLogin();
        //click on product
        homePage.clcikOnMacbook();
        macBook.clickOnSendEmail();
        emailFriendPage.registertredUserCanEmail();


    }

    @Test
    public void g_ToVerifyUserCanCompareProduct() {

        homePage.compareItems();
        //clcik on compare basket
        compareBasket.clickOnCompareBasket();
    }
}