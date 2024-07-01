package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {

    private static final Logger log = Logger.getLogger(AccountPage.class);

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement depositTab;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawTab;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amtField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement withdrawBtn;

    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement withdrawSuccessMsg;


    public void clickOnDepositTab() {
        clickOnElement(depositTab);
        log.info("click on " + depositTab.toString());
    }

    public void clickOnWithdrawTab() {
        clickOnElement(withdrawTab);
        log.info("click on " + withdrawTab.toString());
    }

    public void clickOnDepositWithdrawBtn() {
        clickOnElement(withdrawBtn);
        log.info("click on " + withdrawBtn.toString());
    }

    public void enterAmount(String amt) {
        sendTextToElement(amtField, amt);
        log.info("Enter " + amt);
    }

    public String getDepositWithdrawSuccessMsg() {
        log.info("Get text " + withdrawSuccessMsg.toString());
        return getTextFromElement(withdrawSuccessMsg);
    }
}
