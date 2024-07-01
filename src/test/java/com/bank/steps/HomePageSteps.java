package com.bank.steps;

import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageSteps {
    @Given("I click On Bank Manager Login Tab")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginTab();
    }

    @And("I click On Add Customer Tab")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @Given("I click on Customer Login Tab")
    public void iClickOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLoginTab();
    }

}
