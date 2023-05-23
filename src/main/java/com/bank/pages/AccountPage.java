package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement getTextLogOut;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement logOutButton;
    @CacheLookup
    @FindBy(xpath = "(//button[@class='btn btn-lg tab'])[2]")
    WebElement depositButton;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountToDeposit;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Deposit']")
    WebElement deposit;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement getTextDepositSuccessful;
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    WebElement withDrawlButton;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement getTextTransactionSuccessful;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Withdraw']")
    WebElement withDraw;


    public String verifyLogOutText() {
        log.info("Verify text log out" + getTextLogOut.toString());
        return getTextFromElement(getTextLogOut);
    }

    public void clickOnLogOutButton() {
        log.info("Click on logout button" + logOutButton.toString());
        clickOnElement(logOutButton);
    }

    public void clickOnDepositButton() {
        log.info("Click on deposit button" + depositButton.toString());
        clickOnElement(depositButton);
    }

    public void enterAmountToDeposit() {
        log.info("Enter amount to Deposit" + amountToDeposit.toString());
        sendTextToElement(amountToDeposit, "100");
    }

    public void clickOnDeposit() {
        log.info("Click on Deposit" + deposit.toString());
        clickOnElement(deposit);
    }

    public String verifyTextDepositSuccessful() {
        log.info("Verify text Deposit successful" + getTextDepositSuccessful.toString());
        return getTextFromElement(getTextDepositSuccessful);
    }

    public void clickOnWithDrawlButton() {
        log.info("Click on Withdraw button" + withDrawlButton.toString());
        clickOnElement(withDrawlButton);
    }

    public void enterAmountToWithDrawl() {
        log.info("Enter Amount to withdraw" + amountToDeposit.toString());
        sendTextToElement(amountToDeposit, "50");
    }

    public void clickOnWithDrawl() {
        log.info("Click on withdrawal" + withDraw.toString());
        clickOnElement(withDraw);
    }

    public String verifyTransactionSuccessfulText() {
        log.info("Verify text transaction successful" + getTextTransactionSuccessful.toString());
        return getTextFromElement(getTextTransactionSuccessful);
    }
}
