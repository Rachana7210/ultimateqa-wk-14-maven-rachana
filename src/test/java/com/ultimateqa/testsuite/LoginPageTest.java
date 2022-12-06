package com.ultimateqa.testsuite;

import com.ultimateqa.pages.HomePage;
import com.ultimateqa.pages.LoginPage;
import com.ultimateqa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homepage = new HomePage();
    LoginPage loginpage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){

        homepage.clickOnSignLink();
        String expectedText = "Welcome Back!";
        String actualText = loginpage.getWelcomeText();
        Assert.assertEquals(actualText,expectedText,"Welcome Back!");
    }

    @Test
    public void verifyTheErrorMessage(){

        homepage.clickOnSignLink();
        loginpage.enterEmailId("Ritzs@gmail.com");
        loginpage.enterPassword("Ritz123");
        loginpage.clickOnSignInButton();

        String expectedText = "Invalid email or password.";
        String actualText = loginpage.verifyErrorMessage();
        Assert.assertEquals(actualText,expectedText,"Invalid email or password.");
    }
}
