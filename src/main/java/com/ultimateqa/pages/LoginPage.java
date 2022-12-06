package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h2[contains(text(),'Welcome Back!')]");

    By emailField =  By.id("user[email]");

    By passwordField = By.id("user[password]");

    By signInButton = By.xpath("//button[contains(text(),'Sign in')]");

    By errorMessage = By.xpath("//li[@class='form-error__list-item']");
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);

    }
    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickOnSignInButton(){
        clickOnElement(signInButton);

    }
    public String verifyErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
