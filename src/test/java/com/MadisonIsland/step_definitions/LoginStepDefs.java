package com.MadisonIsland.step_definitions;

import com.MadisonIsland.pages.LoginPage;
import com.MadisonIsland.utilities.ConfigurationReader;
import com.MadisonIsland.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage= new LoginPage();

    @Given("user should open main page")
    public void user_should_open_main_page() {
        Driver.get().navigate().to(ConfigurationReader.get("url"));
    }

    @Then("user should click ACCOUNT at the top of main page")
    public void user_should_click_account_at_the_top_of_main_page() {
        loginPage.accountMain.click();
    }

    @Then("user should click Log In under submenu")
    public void user_should_click_log_in_under_submenu() {
        loginPage.loginLink.click();
    }

    @Then("user should click My Account under submenu")
    public void user_should_click_my_account_or_log_in_under_submenu() {
        loginPage.getAccountSubLink().click();
    }

    @Then("user should click MY ACCOUNT at the bottom of main page")
    public void user_should_click_my_account_at_the_bottom_of_main_page() {
        loginPage.getAccountBottomLink().click();
    }

    @Then("Customer Login page should appear")
    public void customer_login_page_should_appear() {
        Assert.assertEquals("Customer Login", Driver.get().getTitle());
    }

    @Given("user should login with wrong credentials")
    public void user_should_login_with_wrong_credentials() {
        loginPage.login("w","w");
        loginPage.submitButton.click();
    }

    @Then("user should get Invalid login or password. message")
    public void user_should_get_wrong_creds_message() {
        Assert.assertEquals("Invalid login or password.",loginPage.errorMessageForInvalid.getText());
    }

    @Given("user should login with empty credentials")
    public void user_should_login_with_empty_credentials() {
        loginPage.submitButton.click();
    }

    @Then("user should get This is a required field. message")
    public void user_should_get_required_creds_message() {
        Assert.assertEquals("This is a required field.",loginPage.errorMessageForEmpty.get(0).getText());
    }

    @Given("user should login with right credentials")
    public void user_should_login_with_right_credentials() {
        loginPage.login("r","r");
        loginPage.submitButton.click();
    }

    @Then("user should land on My Account page")
    public void user_should_land_on_my_account_page() {
        Assert.assertEquals("My Account", Driver.get().getTitle());
    }

}
