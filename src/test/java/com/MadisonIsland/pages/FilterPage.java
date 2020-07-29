package com.MadisonIsland.pages;

import com.MadisonIsland.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilterPage extends BasePage{

    @FindBy(xpath ="//ul/li/div/div/p[@class='special-price']//span[@class='price']")
    public List<WebElement> listOfProducts;

    public void findPriceRange(String minValue, String maxValue){
        if (maxValue.equals("1000")){
            maxValue="";
        }
        Driver.get().
                findElement(By.xpath("//a[@href='http://www.ctqatest.biz/ecom/sale.html?price="+minValue+"-"+maxValue+"']")).click();
    }

    public boolean checkPriceRange(Integer minValue, Integer maxValue){
        Integer minValueActual= new Integer(listOfProducts.get(0).getText().substring(1, 4));
        Integer maxValueActual= new Integer(listOfProducts.get(1).getText().substring(1, 4));

        if (minValueActual>=minValue&maxValueActual<=maxValue){
            return true;
        }  else return false;
    }
}
