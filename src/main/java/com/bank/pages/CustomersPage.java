package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends Utility {

    private static final Logger log = Logger.getLogger(CustomersPage.class);

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement logoutBtn;


    public void clickOnLogoutBtn() {
        clickOnElement(logoutBtn);
        log.info("click on " + logoutBtn.toString());
    }

    public String getLogoutBtnText() {
        log.info("get logout text " + logoutBtn.toString());
        return getTextFromElement(logoutBtn);
    }

}
