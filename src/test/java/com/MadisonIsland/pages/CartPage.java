package com.MadisonIsland.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//*[contains(text(), ' was added to your shopping cart.')]")
    public WebElement cartPageMessage;
}
