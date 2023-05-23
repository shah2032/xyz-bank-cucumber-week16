package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCodeField;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addToCustomer;

    public void enterFirstName() {
        log.info("Enter first name" + firstNameField.toString());
        sendTextToElement(firstNameField, "Hermoine");
    }

    public void enterSecondName() {
        log.info("Enter last name" + lastNameField.toString());
        sendTextToElement(lastNameField, "Granger");
    }

    public void enterPostCode() {
        log.info("Enter Post code" + postCodeField.toString());
        sendTextToElement(postCodeField, "Q123QW");
    }

    public void clickOnAddToCustomer() {
        log.info("Click on Add to Customer" + addToCustomer.toString());
        clickOnElement(addToCustomer);
    }


    public String verifyTextFromAlert() {
        System.out.println(getTextFromAlert());
        return getTextFromAlert();
    }

    public void acceptThatAlert() {
        acceptAlert();
    }
}