package com.bank.steps;

import com.bank.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class BankSteps {

    @Given("^I click On Bank Manager Login Tab$")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLogin();
    }


    @And("^I click On Add Customer Tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomer();
    }

    @Then("^I enter First Name$")
    public void iEnterFirstName() {
        new AddCustomerPage().enterFirstName();
    }

    @And("^I enter LastName$")
    public void iEnterLastName() {
        new AddCustomerPage().enterSecondName();
    }

    @And("^I enter PostCode$")
    public void iEnterPostCode() {
        new AddCustomerPage().enterPostCode();
    }

    @And("^I click On Add Customer Button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddToCustomer();
    }

    @And("^I should verify message \"([^\"]*)\"$")
    public void iShouldVerifyMessage(String arg0) {
        Assert.assertEquals(new AddCustomerPage().verifyTextFromAlert(), "Customer added successfully with customer id :6");
    }

    @Then("^I click on ok button on popup\\.$")
    public void iClickOnOkButtonOnPopup() {
        new AddCustomerPage().acceptThatAlert();
    }

    @And("^I click On Open Account Tab$")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccount();
    }

    @Then("^I Search customer that is created first$")
    public void iSearchCustomerThatIsCreatedFirst() {
        new OpenAccountPage().selectCustomerName();
    }

    @And("^I Select currency Pound$")
    public void iSelectCurrencyPound() {
        new OpenAccountPage().selectCurrency();
    }

    @And("^I click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcess();
    }

    @And("^I should verify message Account created successfully$")
    public void iShouldVerifyMessageAccountCreatedSuccessfully() {
        Assert.assertEquals(new OpenAccountPage().verifyTextFromAlert(), "Account created successfully with account Number :1016");
    }

    @Given("^I click on Customer Login Tab$")
    public void iClickOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLogin();
    }

    @And("^I search customer that i created\\.$")
    public void iSearchCustomerThatICreated() {
        new CustomerLoginPage().selectCustomerName();
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("^I should verify Logout Tab displayed\\.$")
    public void iShouldVerifyLogoutTabDisplayed() {
        Assert.assertEquals(new AccountPage().verifyLogOutText(), "Logout");
    }

    @And("^I click on Logout$")
    public void iClickOnLogout() {
        new AccountPage().clickOnLogOutButton();
    }

    @Then("^I should verify Your Name text displayed\\.$")
    public void iShouldVerifyYourNameTextDisplayed() {
        Assert.assertEquals(new CustomerLoginPage().verifyYourName(), "Your Name :");
    }

    @And("^I click on Deposit Tab$")
    public void iClickOnDepositTab() {
        new AccountPage().clickOnDepositButton();
    }

    @Then("^I Enter amount (\\d+)$")
    public void iEnterAmount(int arg0) {
        new AccountPage().enterAmountToDeposit();
    }

    @And("^I click on Deposit Button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDeposit();
    }

    @Then("^I should verify message Deposit Successful$")
    public void iShouldVerifyMessageDepositSuccessful() {
        Assert.assertEquals(new AccountPage().verifyTextDepositSuccessful(), "Deposit Successful");
    }

    @And("^click on Withdrawal Tab$")
    public void clickOnWithdrawalTab() {
        new AccountPage().clickOnWithDrawlButton();
    }

    @Then("^I Enter amount now (\\d+)$")
    public void iEnterAmountNow(int arg0) {
        new AccountPage().enterAmountToWithDrawl();
    }

    @And("^I click on Withdrawal Button$")
    public void iClickOnWithdrawalButton() {
        new AccountPage().clickOnWithDrawl();
    }

    @Then("^I should verify message Transaction Successful$")
    public void iShouldVerifyMessageTransactionSuccessful() {
        Assert.assertEquals(new AccountPage().verifyTransactionSuccessfulText(), "Transaction successful");
}
}