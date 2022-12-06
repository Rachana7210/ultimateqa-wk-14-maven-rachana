package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By signInLink = By.linkText("Sign In");

    public void clickOnSignLink(){
        clickOnElement(signInLink);
    }
}
