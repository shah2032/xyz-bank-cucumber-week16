package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement customerNameSelect;
    @CacheLookup
    @FindBy(name = "currency")
    WebElement currencySelect;
    @CacheLookup
    @FindBy(css = "button[type='submit']")
    WebElement processButton;

    public void selectCustomerName() {
        log.info("Select Customer Name" + customerNameSelect.toString());
        selectByVisibleTextFromDropDown(customerNameSelect, "Hermoine Granger");
    }

    public void selectCurrency() {
        log.info("Select Currency" + currencySelect.toString());
        selectByValueFromDropDown(currencySelect, "Pound");
    }

    public void clickOnProcess() {
        log.info("Click on Process" + processButton.toString());
        clickOnElement(processButton);
    }

    public String verifyTextFromAlert() {
        System.out.println(getTextFromAlert());
        return getTextFromAlert();
    }

    public void acceptThatAlert() {
        acceptAlert();
    }
}
