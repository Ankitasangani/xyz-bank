package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AddCustomerSteps {
    @Then("I enter First Name {string}")
    public void iEnterFirstName(String firstName) {
        new AddCustomerPage().enterFName(firstName);
    }

    @And("I enter LastName {string}")
    public void iEnterLastName(String lastName) {
        new AddCustomerPage().enterLName(lastName);
    }

    @And("I enter PostCode {string}")
    public void iEnterPostCode(String postcode) {
        new AddCustomerPage().enterPostCode(postcode);
    }

    @And("I click On Add Customer Button")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerBtn();
    }

    @And("I should verify message Customer added successfully")
    public void iShouldVerifyMessageCustomerAddedSuccessfully() {
        Assert.assertEquals(new AddCustomerPage().getAlertSuccessText().substring(0, 27), "Customer added successfully", "Text didn't match!");
    }

    @Then("I click on ok button on popup.")
    public void iClickOnOkButtonOnPopup() {
        new AddCustomerPage().clickOnOKButtonInAlert();
    }
}
