package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLoginButton;

    public void clickOnBankManagerLogin() {
        log.info("Click on Bank Manager Login Button" + bankManagerLoginButton.toString());
        clickOnElement(bankManagerLoginButton);
    }

    public void clickOnCustomerLogin() {
        log.info("Click on Customer Login Button" + customerLoginButton.toString());
        clickOnElement(customerLoginButton);
    }
}
