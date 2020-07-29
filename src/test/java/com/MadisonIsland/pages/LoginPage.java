package com.MadisonIsland.pages;

import com.MadisonIsland.utilities.ConfigurationReader;
import com.MadisonIsland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends BasePage{


    @FindBy(xpath="//input[@title='Email Address']")
    public WebElement username;

    @FindBy(xpath="//input[@title='Password']")
    public WebElement password;

    @FindBy(xpath="//button[@title='Login']")
    public WebElement submitButton;

    @FindBy(xpath="//*[text()='Invalid login or password.']")
    public WebElement errorMessageForInvalid;

    @FindBy(xpath="//*[text()='This is a required field.']")
    public List<WebElement> errorMessageForEmpty;

    public void login(String usernameTag, String passwordTag ){
        String _username= ConfigurationReader.get(usernameTag+"_username");
        String _password= ConfigurationReader.get(passwordTag+"_password");
        username.sendKeys(_username);
        password.sendKeys(_password);
    }

}
