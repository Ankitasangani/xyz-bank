package com.bank.steps;

import com.bank.pages.CustomerLoginPage;
import com.bank.pages.OpenAccountPage;
import io.cucumber.java.en.And;

public class CustomerLoginSteps {
    @And("I Search customer that is created")
    public void iSearchCustomerThatIsCreated() {
        new OpenAccountPage().selectFromCustomerDropdown("Ron Weasly");
    }

    @And("I click on Login Button")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginBtn();
    }
}
