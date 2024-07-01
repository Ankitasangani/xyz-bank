package com.bank.steps;

import com.bank.pages.AccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AccountSteps {
    @And("I click on Deposit Tab")
    public void iClickOnDepositTab() {
        new AccountPage().clickOnDepositTab();
    }

    @Then("I Enter amount {string}")
    public void iEnterAmount(String amount) {
        new AccountPage().enterAmount(amount);
    }

    @And("I click on Deposit Button")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositWithdrawBtn();
    }


    @Then("I should verify message Deposit Successful")
    public void iShouldVerifyMessageDepositSuccessful() {
        Assert.assertEquals(new AccountPage().getDepositWithdrawSuccessMsg(), "Deposit Successful", "Text didn't match!");
    }

    @And("I click on Withdrawl Tab")
    public void iClickOnWithdrawlTab() {
        new AccountPage().clickOnWithdrawTab();
    }

    @And("I click on Withdraw Button")
    public void iClickOnWithdrawButton() {
        new AccountPage().clickOnDepositWithdrawBtn();
    }

    @Then("I should verify message Transaction successful")
    public void iShouldVerifyMessageTransactionSuccessful() {
        Assert.assertEquals(new AccountPage().getDepositWithdrawSuccessMsg(),"Transaction successful", "Text didn't match!");
    }
}
