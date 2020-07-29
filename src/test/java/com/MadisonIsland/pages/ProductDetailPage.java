package com.MadisonIsland.pages;

import com.MadisonIsland.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailPage extends BasePage {

    @FindBy(id= "qty")
    public WebElement quantity;

    @FindBy(xpath ="//*[@class='add-to-cart-buttons']")
    public WebElement addToCartButton;

    @FindBy(id= "attribute92")
    public WebElement color;

    @FindBy(id= "attribute180")
    public WebElement size;


    public void selectColour(String colorProduct){
        Select colors= new Select(color);
        colors.selectByVisibleText(colorProduct);
    }

    public void selectSize(String sizeProduct){
        Select sizes= new Select(size);
        sizes.selectByVisibleText(sizeProduct);
    }



}
