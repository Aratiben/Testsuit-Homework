package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    // BasePage basePage=new BasePage();
    //DriverManager driverManager=new DriverManager();
    // Utils utils=new Utils();
    VoteOnHopePage voteOnHopePage = new VoteOnHopePage();
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
    public void c_toVeryfyUserShouldBeLoggedInSuccessFully() {
        //click on register button
        homePage.clickOnRegisterButton();
        registrationPage.fillInRegisterDetails();
        registerResultPage.userShouldSeeTheMessage();

    }

    @Test
    public void b_toVeryfyNonRegisteredUserCanNotVote() {
        voteOnHopePage.userCanNotVoteWithoutRegistration();

    }

    @Test
    public void d_toVeryfyRegisteredUserShouldbeAbleToVote() {
        registerToLogin.userShouldBeAbleToLogin();
        loginPage.userLogin();
        //user should be able to vote
        registeredUserVotePage.cliclOnVote();


    }

    @Test
    public void f_toVeryfyusershouldbeableToAddTheProduct() {
        //click on elctronics
        electronicsPage.clcikOnelectronics();
        //clcik ok camara and photo
        cameraAndPhotoPage.clickOnCameraAndPhoto();
        //clcik on camara to add to cart
        productAddToCartPage.clickOnProudct();
        //click on the shopping basket
        addProductResultPage.clickOnShoopingBasket();

    }

    @Test
    public void a_userShouldBeAbletoEmail() {
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