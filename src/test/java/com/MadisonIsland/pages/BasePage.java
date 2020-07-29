package com.MadisonIsland.pages;

import com.MadisonIsland.utilities.BrowserUtils;
import com.MadisonIsland.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(name="q")
    public WebElement searchbox;

    @FindBy(xpath ="//button[@title='Search']")
    public WebElement searchButton;

    @FindBy(css = "a.skip-link.skip-account")
    public WebElement accountMain;

    @FindBy(xpath = "//a[contains(@href,'http://www.ctqatest.biz/ecom/customer/account/login')]")
    public WebElement loginLink;

    @FindBy(xpath = "//a[contains(@href,'http://www.ctqatest.biz/ecom/customer/account/')][contains(@title,'My Account')]")
    public List<WebElement> accountSubLink_bottomLink;

    public WebElement getAccountSubLink(){
        return accountSubLink_bottomLink.get(0);
    }
    public WebElement getAccountBottomLink(){
        return accountSubLink_bottomLink.get(1);
    }

}
