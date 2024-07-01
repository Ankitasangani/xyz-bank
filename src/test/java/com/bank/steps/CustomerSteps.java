package com.bank.steps;

import com.bank.pages.CustomerLoginPage;
import com.bank.pages.CustomersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CustomerSteps {
    @Then("I should verify Logout Tab displayed.")
    public void iShouldVerifyLogoutTabDisplayed() {
        Assert.assertEquals(new CustomersPage().getLogoutBtnText(), "Logout", "Text didn't match!");
    }

    @And("I click on Logout")
    public void iClickOnLogout() {
        new CustomersPage().clickOnLogoutBtn();
    }

    @Then("I should verify Name text displayed.")
    public void iShouldVerifyNameTextDisplayed() {
        Assert.assertEquals(new CustomerLoginPage().getYourNameText(), "Your Name :", "Text didn't match!");
    }

}
