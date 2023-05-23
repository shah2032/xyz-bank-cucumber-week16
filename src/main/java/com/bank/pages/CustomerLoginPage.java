package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerName;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Your Name :']")
    WebElement getTextYourName;

    public void selectCustomerName() {
        log.info("Select Customer" + customerName.toString());
        selectByVisibleTextFromDropDown(customerName, "Hermoine Granger");
    }

    public void clickOnLoginButton() {
        log.info("Click on Login Button" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String verifyYourName() {
        log.info("Verify Text Your Name" + getTextYourName.toString());
        return getTextFromElement(getTextYourName);

    }
}
