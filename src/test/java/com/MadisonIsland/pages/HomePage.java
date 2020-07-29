package com.MadisonIsland.pages;

import com.MadisonIsland.utilities.BrowserUtils;
import com.MadisonIsland.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {

    public void navigateToSubMenu(String menu, String sub) {
        String mainMenu = "//*[text()='"+ menu +"'][contains(@class,'level0 has-children')]";
        String subMenu = "//*[text()='"+ sub +"'][contains(@class,'level1')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(mainMenu), 5);
            WebElement menuElement = Driver.get().findElement(By.xpath(mainMenu));
            new Actions(Driver.get()).moveToElement(menuElement).pause(200).doubleClick(menuElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(mainMenu), 5);
        }
    }

}
